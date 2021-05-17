package com.testsite.core.models;

import java.util.List;

public class VariantItem{
  public String offerId;
  public boolean isDefault;
  public List<Attachment> attachment;
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }
  public boolean isDefault() {
    return isDefault;
  }
  public void setDefault(boolean isDefault) {
    this.isDefault = isDefault;
  }
  public List<Attachment> getAttachment() {
    return attachment;
  }
  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }
  
  
}
