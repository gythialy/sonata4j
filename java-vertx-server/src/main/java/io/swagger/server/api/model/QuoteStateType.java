package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Valid quote state enumeration
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Valid quote state enumeration
 */
public enum QuoteStateType {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  READY("READY"),
  
  CANCELLED("CANCELLED"),
  
  REJECTED("REJECTED"),
  
  ACCEPTED("ACCEPTED"),
  
  EXPIRED("EXPIRED"),
  
  UNABLE_TO_PROVIDE("UNABLE_TO_PROVIDE"),
  
  INSUFICIENT_INFORMATION_PROVIDED("INSUFICIENT_INFORMATION_PROVIDED");

  private String value;

  QuoteStateType(String value) {
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

  public static QuoteStateType fromValue(String text) {
    for (QuoteStateType b : QuoteStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}