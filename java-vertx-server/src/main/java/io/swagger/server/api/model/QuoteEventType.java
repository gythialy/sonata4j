package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Type of the Event
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QuoteEventType fromValue(String text) {
    for (QuoteEventType b : QuoteEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}