package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteState fromValue(String text) {
    for (QuoteState b : QuoteState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

