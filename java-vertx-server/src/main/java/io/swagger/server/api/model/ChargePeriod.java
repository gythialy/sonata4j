package io.swagger.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ChargePeriod
 */
public enum ChargePeriod {
  
  DAY("day"),
  
  WEEK("week"),
  
  MONTH("month"),
  
  YEAR("year");

  private String value;

  ChargePeriod(String value) {
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

  public static ChargePeriod fromValue(String text) {
    for (ChargePeriod b : ChargePeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}