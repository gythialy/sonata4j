package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ServiceabilityColor fromValue(String text) {
    for (ServiceabilityColor b : ServiceabilityColor.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

