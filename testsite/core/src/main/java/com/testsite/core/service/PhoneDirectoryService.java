package com.testsite.core.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.jcr.Node;
import javax.jcr.Session;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.testsite.core.models.PhoneDirectoryModel;

/**
 * The purpose of this class is to invoke get request and fetch phone details from api url.
 */
@Component(service = PhoneDirectoryInterface.class, immediate = true, enabled = true)
public class PhoneDirectoryService implements PhoneDirectoryInterface {

  private static final String THREE_URL = "https://www.three.ie";

  /** The config. */
  @Reference
  ConfigManager config;

  @Reference
  WriteAccessResourceResolverService rr;

  /** The Constant log. */
  private static final Logger log = LoggerFactory.getLogger(PhoneDirectoryService.class);


  /**
   * Gets the phone details.
   *
   * @return the phone details
   */
  @Override
  public List<PhoneDirectoryModel> getPhoneDetails() {
    log.info("---Inside getPhoneDetails--");

    ResourceResolver resolver = rr.getResourceResolver();


    List<PhoneDirectoryModel> phmodel = new ArrayList<PhoneDirectoryModel>();

    String url = config.getApiUrl();

    String reqUrl = "?salesChannel=selfService" + "&pricePreference=minPriceWithCommitment"
        + "&sort=-price" + "&groupByVariantGroup=true" + "&filters=category.id==8449299_8368419"
        + "&levelOfData=offering" + "&qualificationCriteria=orderingActivity==newSubscription";
    StringBuilder sb = new StringBuilder();
    sb.append(url);
    sb.append(reqUrl);

    log.debug("---Api Url--" + sb);


    try {

      Session session = resolver.adaptTo(Session.class);
      Node root = session.getRootNode();
      Node usergenerated = root.getNode("content/usergenerated");
      if (!usergenerated.hasNode("treemobiles")) {


        URL urlForGetRequest = new URL(sb.toString());
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        // conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();

        log.debug("responseCode----------" + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
          BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
          StringBuffer response = new StringBuffer();
          while ((readLine = in.readLine()) != null) {
            response.append(readLine);
          }
          in.close();


          Node mobNode = usergenerated.addNode("treemobiles", "nt:unstructured");

          Gson gson = new Gson();
          JsonArray jsonArray = (JsonArray) new JsonParser().parse(response.toString());
          for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement str = jsonArray.get(i);
            PhoneDirectoryModel obj = gson.fromJson(str, PhoneDirectoryModel.class);
            String imageurl = THREE_URL + obj.getAttachment().get(1).getUrl();
            Node mob = mobNode.addNode("mob" + i, "nt:unstructured");
            mob.setProperty("displayname", obj.getDisplayName());
            mob.setProperty("imageurl", imageurl);
            phmodel.add(obj);
          }
          session.save();

          return phmodel;


        } else {
          log.debug("GET NOT WORKED");
        }
      } else {
        log.debug("node already exists");
        return null;
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      log.error("Error while invoking phone API -- " + e);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      log.error("Error while invoking phone API -- " + e);
    }

    return null;

  }



}
