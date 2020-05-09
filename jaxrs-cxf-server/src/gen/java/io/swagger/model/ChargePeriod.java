package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChargePeriod fromValue(String text) {
    for (ChargePeriod b : ChargePeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

