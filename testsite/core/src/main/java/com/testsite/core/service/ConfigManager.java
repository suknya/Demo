package com.testsite.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ConfigManager.
 */
@Component(service = ConfigManager.class, immediate = true, enabled = true)
@Designate(ocd = TestConfig.class)
public class ConfigManager {
  
  /** The Constant log. */
  private static final Logger log = LoggerFactory.getLogger(ConfigManager.class);

  /** The url. */
  private String url;

  /**
   * Activate.
   *
   * @param config the config
   */
  @Activate
  protected void activate(TestConfig config) {
    log.info("In activate");
    refresh(config);
  }


  /**
   * Modified.
   *
   * @param config the config
   */
  @Modified
  private void modified(TestConfig config) {
    log.info("In modified");
    refresh(config);
  }

  /**
   * Refresh.
   *
   * @param config the config
   */
  private void refresh(TestConfig config) {
    this.url = config.getUrl();

  }

  /**
   * Gets the api url.
   *
   * @return the api url
   */
  public String getApiUrl() {
    return this.url;
  }



}
