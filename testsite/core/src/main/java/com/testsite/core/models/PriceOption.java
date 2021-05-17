package com.testsite.core.models;

public class PriceOption{
  public String type;
  public MinPriceWithCommitment minPriceWithCommitment;
  public MinPriceWithoutCommitment minPriceWithoutCommitment;
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public MinPriceWithCommitment getMinPriceWithCommitment() {
    return minPriceWithCommitment;
  }
  public void setMinPriceWithCommitment(MinPriceWithCommitment minPriceWithCommitment) {
    this.minPriceWithCommitment = minPriceWithCommitment;
  }
  public MinPriceWithoutCommitment getMinPriceWithoutCommitment() {
    return minPriceWithoutCommitment;
  }
  public void setMinPriceWithoutCommitment(MinPriceWithoutCommitment minPriceWithoutCommitment) {
    this.minPriceWithoutCommitment = minPriceWithoutCommitment;
  }
  
}
