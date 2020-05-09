package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderActivity fromValue(String text) {
    for (OrderActivity b : OrderActivity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

