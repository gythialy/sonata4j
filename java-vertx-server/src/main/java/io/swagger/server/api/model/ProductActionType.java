package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Action to be performed on the Product
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductActionType fromValue(String text) {
    for (ProductActionType b : ProductActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}