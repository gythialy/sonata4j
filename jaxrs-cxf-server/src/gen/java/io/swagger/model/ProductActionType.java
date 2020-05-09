package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Action to be performed on the Product
 */
public enum ProductActionType {
  
  ADD("add"),
  
  CHANGE("change"),
  
  REMOVE("remove"),
  
  NOCHANGE("noChange");

  private String value;

  ProductActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductActionType fromValue(String text) {
    for (ProductActionType b : ProductActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

