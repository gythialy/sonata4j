package io.swagger.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PriceType
 */
public enum PriceType {
  
  RECURRING("recurring"),
  
  NONRECURRING("nonRecurring");

  private String value;

  PriceType(String value) {
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

  public static PriceType fromValue(String text) {
    for (PriceType b : PriceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}