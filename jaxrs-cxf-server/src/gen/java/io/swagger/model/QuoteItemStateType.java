package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Valid quote item state enumeration
 */
public enum QuoteItemStateType {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  UNABLE_TO_PROVIDE("UNABLE_TO_PROVIDE"),
  
  READY("READY"),
  
  ABANDONED("ABANDONED"),
  
  INSUFICIENT_INFORMATION_PROVIDED("INSUFICIENT_INFORMATION_PROVIDED");

  private String value;

  QuoteItemStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuoteItemStateType fromValue(String text) {
    for (QuoteItemStateType b : QuoteItemStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

