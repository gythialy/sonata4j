package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Validation Result
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ValidationResult fromValue(String text) {
    for (ValidationResult b : ValidationResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}