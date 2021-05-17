package com.testsite.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * The Interface TestConfig.
 */
@ObjectClassDefinition(name = "Testsite - Settings Configuration",
    description = "Testsite service configuration")
public @interface TestConfig {
  
  /**
   * Gets the url.
   *
   * @return the url
   */
  @AttributeDefinition(name = "Phone data URL", description = "Test Phone data API URL",
      type = AttributeType.STRING)
  String getUrl() default "https://www.three.ie/rp-server/commerce/v1/mobileDeviceOffering?salesChannel=selfService&pricePreference=minPriceWithCommitment&sort=-price&groupByVariantGroup=true&filters=category.id==8449299_8368419&levelOfData=offering&qualificationCriteria=orderingActivity==newSubscription";



}
