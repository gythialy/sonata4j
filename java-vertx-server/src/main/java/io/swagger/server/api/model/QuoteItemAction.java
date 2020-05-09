package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Quote Item Action
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Quote Item Action
 */
public enum QuoteItemAction {
  
  INSTALL("INSTALL"),
  
  CHANGE("CHANGE"),
  
  DISCONNECT("DISCONNECT"),
  
  NO_CHANGE("NO_CHANGE");

  private String value;

  QuoteItemAction(String value) {
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

  public static QuoteItemAction fromValue(String text) {
    for (QuoteItemAction b : QuoteItemAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}