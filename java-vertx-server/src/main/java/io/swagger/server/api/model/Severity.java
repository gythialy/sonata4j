package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Severity of the order message
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Severity of the order message
 */
public enum Severity {
  
  ERROR("error"),
  
  INFORMATION("information");

  private String value;

  Severity(String value) {
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

  public static Severity fromValue(String text) {
    for (Severity b : Severity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}