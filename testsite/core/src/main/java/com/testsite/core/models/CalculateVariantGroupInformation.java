package com.testsite.core.models;

import java.util.List;

public class CalculateVariantGroupInformation{
  public String name;
  public String displayName;
  public List<Attachment> attachment;
  public List<VariantGroupCharacteristic> variantGroupCharacteristic;
  public List<VariantItem> variantItem;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public List<Attachment> getAttachment() {
    return attachment;
  }
  public void setAttachment(List<Attachment> attachment) {
    this.attachment = attachment;
  }
  public List<VariantGroupCharacteristic> getVariantGroupCharacteristic() {
    return variantGroupCharacteristic;
  }
  public void setVariantGroupCharacteristic(
      List<VariantGroupCharacteristic> variantGroupCharacteristic) {
    this.variantGroupCharacteristic = variantGroupCharacteristic;
  }
  public List<VariantItem> getVariantItem() {
    return variantItem;
  }
  public void setVariantItem(List<VariantItem> variantItem) {
    this.variantItem = variantItem;
  }
  
  
}
