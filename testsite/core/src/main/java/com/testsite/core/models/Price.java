package com.testsite.core.models;

public class Price{
  public String currencyCode;
  public double taxRate;
  public double taxIncludedAmount;
  public double amount;
  public double taxAmount;
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }
  public double getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }
  public double getTaxIncludedAmount() {
    return taxIncludedAmount;
  }
  public void setTaxIncludedAmount(double taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }
  public double getAmount() {
    return amount;
  }
  public void setAmount(double amount) {
    this.amount = amount;
  }
  public double getTaxAmount() {
    return taxAmount;
  }
  public void setTaxAmount(double taxAmount) {
    this.taxAmount = taxAmount;
  }
  
}
