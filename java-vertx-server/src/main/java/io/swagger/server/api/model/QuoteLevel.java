package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Quote level
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Quote level
 */
public enum QuoteLevel {
  
  BUDGETARY("BUDGETARY"),
  
  INDICATIVE("INDICATIVE"),
  
  FIRM("FIRM");

  private String value;

  QuoteLevel(String value) {
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

  public static QuoteLevel fromValue(String text) {
    for (QuoteLevel b : QuoteLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}