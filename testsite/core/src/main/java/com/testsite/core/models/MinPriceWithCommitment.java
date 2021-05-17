package com.testsite.core.models;

import java.util.List;

public class MinPriceWithCommitment{
  public String type;
  public Price price;
  public List<Condition> condition;
  public int commitmentDuration;
  public String planId;
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
  public List<Condition> getCondition() {
    return condition;
  }
  public void setCondition(List<Condition> condition) {
    this.condition = condition;
  }
  public int getCommitmentDuration() {
    return commitmentDuration;
  }
  public void setCommitmentDuration(int commitmentDuration) {
    this.commitmentDuration = commitmentDuration;
  }
  public String getPlanId() {
    return planId;
  }
  public void setPlanId(String planId) {
    this.planId = planId;
  }
}
