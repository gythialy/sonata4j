package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Validation Result
 */
public enum ValidationResult {
  
  SUCCESS("success"),
  
  FAILS("fails"),
  
  PARTIAL("partial");

  private String value;

  ValidationResult(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ValidationResult fromValue(String text) {
    for (ValidationResult b : ValidationResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

