package com.testsite.core.service;

import java.util.HashMap;
import java.util.Map;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = WriteAccessResourceResolverService.class, immediate = true, enabled = true)

public class WriteAccessResourceResolverServiceImpl implements WriteAccessResourceResolverService {

  private Logger logger = LoggerFactory.getLogger(WriteAccessResourceResolverServiceImpl.class);

  @Reference
  private ResourceResolverFactory resourceResolverFactory;


  public ResourceResolver getResourceResolver() {
    ResourceResolver resourceResolver = null;

    Map<String, Object> param = new HashMap<String, Object>();
    try {

      param.put(ResourceResolverFactory.SUBSERVICE, "writeservice");
      resourceResolver = resourceResolverFactory.getServiceResourceResolver(param);
      return resourceResolver;
    } catch (Exception e) {
      logger.error("Error while creating resolver object ", e);
      return resourceResolver;
    }
  }



}

