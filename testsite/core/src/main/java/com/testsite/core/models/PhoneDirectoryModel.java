package com.testsite.core.models;

import java.util.List;

public class PhoneDirectoryModel {
  
    public String href;
    public String rel;
    public String id;
    public String type;
    public String name;
    public String displayName;
    public String description;
    public boolean isTopItem;
    public boolean isBundle;
    public List<Attachment> attachment;
    public List<OfferingPrice> offeringPrice;
    public boolean hasVariantGroup;
    public CalculateVariantGroupInformation calculateVariantGroupInformation;
    public ProductSpecification productSpecification;
    public boolean isSellable;
    public DeviceEnrichedAttributes deviceEnrichedAttributes;
    public String getHref() {
      return href;
    }
    public void setHref(String href) {
      this.href = href;
    }
    public String getRel() {
      return rel;
    }
    public void setRel(String rel) {
      this.rel = rel;
    }
    public String getId() {
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getType() {
      return type;
    }
    public void setType(String type) {
      this.type = type;
    }
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
    public String getDescription() {
      return description;
    }
    public void setDescription(String description) {
      this.description = description;
    }
    public boolean isTopItem() {
      return isTopItem;
    }
    public void setTopItem(boolean isTopItem) {
      this.isTopItem = isTopItem;
    }
    public boolean isBundle() {
      return isBundle;
    }
    public void setBundle(boolean isBundle) {
      this.isBundle = isBundle;
    }
    public List<Attachment> getAttachment() {
      return attachment;
    }
    public void setAttachment(List<Attachment> attachment) {
      this.attachment = attachment;
    }
    public List<OfferingPrice> getOfferingPrice() {
      return offeringPrice;
    }
    public void setOfferingPrice(List<OfferingPrice> offeringPrice) {
      this.offeringPrice = offeringPrice;
    }
    public boolean isHasVariantGroup() {
      return hasVariantGroup;
    }
    public void setHasVariantGroup(boolean hasVariantGroup) {
      this.hasVariantGroup = hasVariantGroup;
    }
    public CalculateVariantGroupInformation getCalculateVariantGroupInformation() {
      return calculateVariantGroupInformation;
    }
    public void setCalculateVariantGroupInformation(
        CalculateVariantGroupInformation calculateVariantGroupInformation) {
      this.calculateVariantGroupInformation = calculateVariantGroupInformation;
    }
    public ProductSpecification getProductSpecification() {
      return productSpecification;
    }
    public void setProductSpecification(ProductSpecification productSpecification) {
      this.productSpecification = productSpecification;
    }
    public boolean isSellable() {
      return isSellable;
    }
    public void setSellable(boolean isSellable) {
      this.isSellable = isSellable;
    }
    public DeviceEnrichedAttributes getDeviceEnrichedAttributes() {
      return deviceEnrichedAttributes;
    }
    public void setDeviceEnrichedAttributes(DeviceEnrichedAttributes deviceEnrichedAttributes) {
      this.deviceEnrichedAttributes = deviceEnrichedAttributes;
    }
    


}
