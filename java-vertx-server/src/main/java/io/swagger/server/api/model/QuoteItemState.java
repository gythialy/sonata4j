package io.swagger.server.api.model;

import java.util.Objects;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QuoteItemState fromValue(String text) {
    for (QuoteItemState b : QuoteItemState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}