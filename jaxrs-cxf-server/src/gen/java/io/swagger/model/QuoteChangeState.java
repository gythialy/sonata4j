package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Quote state change &#39;request able&#39; by buyer
 */
public enum QuoteChangeState {
  
  CANCELLED("CANCELLED"),
  
  REJECTED("REJECTED");

  private String value;

  QuoteChangeState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteChangeState fromValue(String text) {
    for (QuoteChangeState b : QuoteChangeState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

