package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteLevel fromValue(String text) {
    for (QuoteLevel b : QuoteLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

