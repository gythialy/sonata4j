package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets QuoteItemState
 */
public enum QuoteItemState {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  UNABLE_TO_PROVIDE("UNABLE_TO_PROVIDE"),
  
  READY("READY"),
  
  ABANDONED("ABANDONED");

  private String value;

  QuoteItemState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteItemState fromValue(String text) {
    for (QuoteItemState b : QuoteItemState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

