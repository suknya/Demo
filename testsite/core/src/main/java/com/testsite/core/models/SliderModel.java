package com.testsite.core.models;

import java.util.List;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.cq.sightly.WCMUsePojo;
import com.testsite.core.service.PhoneDirectoryInterface;

/**
 * The Class SliderModel.
 */
public class SliderModel extends WCMUsePojo {
  Logger logger = LoggerFactory.getLogger(SliderModel.class);

  protected List<PhoneDirectoryModel> detail = null;
  String name = null;

  @Override
  public void activate() {

    PhoneDirectoryInterface service =
        getSlingScriptHelper().getService(PhoneDirectoryInterface.class);
    detail = service.getPhoneDetails();
  }


  public Resource getMobResource() {
    String path = "/content/usergenerated/treemobiles";
    Resource mobResource = getResourceResolver().getResource(path);
    return mobResource;

  }


}
