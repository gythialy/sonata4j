package io.swagger.server.api.model;

import java.util.Objects;

/**
 * A color that indicates confidence to service the request.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A color that indicates confidence to service the request.
 */
public enum ServiceabilityColor {
  
  GREEN("green"),
  
  RED("red"),
  
  YELLOW("yellow");

  private String value;

  ServiceabilityColor(String value) {
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

  public static ServiceabilityColor fromValue(String text) {
    for (ServiceabilityColor b : ServiceabilityColor.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}