package com.testsite.core.service;

import java.util.List;
import com.testsite.core.models.PhoneDirectoryModel;

/**
 * The Interface PhoneDirectoryInterface.
 */
public interface PhoneDirectoryInterface {
  
  /**
   * Gets the phone details.
   *
   * @return the phone details
   */
  List<PhoneDirectoryModel> getPhoneDetails();

}
