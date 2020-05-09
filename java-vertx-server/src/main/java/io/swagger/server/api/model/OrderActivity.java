package io.swagger.server.api.model;

import java.util.Objects;

/**
 * The type of order as defined by the business.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of order as defined by the business.
 */
public enum OrderActivity {
  
  INSTALL("install"),
  
  CHANGE("change"),
  
  DISCONNECT("disconnect");

  private String value;

  OrderActivity(String value) {
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

  public static OrderActivity fromValue(String text) {
    for (OrderActivity b : OrderActivity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}