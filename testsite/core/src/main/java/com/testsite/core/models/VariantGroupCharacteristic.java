package com.testsite.core.models;

import java.util.List;

public class VariantGroupCharacteristic{
  public String id;
  public String displayName;
  public List<Value> value;
  public String name;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  public List<Value> getValue() {
    return value;
  }
  public void setValue(List<Value> value) {
    this.value = value;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  
}
