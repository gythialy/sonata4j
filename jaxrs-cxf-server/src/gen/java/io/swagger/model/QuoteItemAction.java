package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteItemAction fromValue(String text) {
    for (QuoteItemAction b : QuoteItemAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

