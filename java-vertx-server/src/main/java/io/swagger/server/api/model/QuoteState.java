package io.swagger.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QuoteState
 */
public enum QuoteState {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  READY("READY"),
  
  CANCELLED("CANCELLED"),
  
  REJECTED("REJECTED"),
  
  ACCEPTED("ACCEPTED"),
  
  EXPIRED("EXPIRED"),
  
  UNABLE_TO_PROVIDE("UNABLE_TO_PROVIDE");

  private String value;

  QuoteState(String value) {
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

  public static QuoteState fromValue(String text) {
    for (QuoteState b : QuoteState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}