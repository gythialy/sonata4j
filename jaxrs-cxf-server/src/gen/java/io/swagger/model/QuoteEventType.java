package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the Event
 */
public enum QuoteEventType {
  
  CREATION_NOTIFICATION("QUOTE_CREATION_NOTIFICATION"),
  
  STATE_CHANGE_NOTIFICATION("QUOTE_STATE_CHANGE_NOTIFICATION"),
  
  INFORMATION_REQUIRED_NOTIFICATION("QUOTE_INFORMATION_REQUIRED_NOTIFICATION"),
  
  ATTRIBUTE_VALUE_CHANGE_NOTIFICATION("QUOTE_ATTRIBUTE_VALUE_CHANGE_NOTIFICATION");

  private String value;

  QuoteEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteEventType fromValue(String text) {
    for (QuoteEventType b : QuoteEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

