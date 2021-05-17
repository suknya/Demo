package com.testsite.core.models;

public class OfferingPrice{
  public String type;
  public Price price;
  public PriceOption priceOption;
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Price getPrice() {
    return price;
  }
  public void setPrice(Price price) {
    this.price = price;
  }
  public PriceOption getPriceOption() {
    return priceOption;
  }
  public void setPriceOption(PriceOption priceOption) {
    this.priceOption = priceOption;
  }
  
}
