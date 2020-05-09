package io.swagger.server.api.model;

import java.util.Objects;

/**
 * An enumeration of valid pricing methods for ordered items
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration of valid pricing methods for ordered items
 */
public enum PricingMethod {
  
  TARIFF("tariff"),
  
  CONTRACT("contract"),
  
  INDIVIDUALCASEBASIS("individualCaseBasis"),
  
  OTHER("other");

  private String value;

  PricingMethod(String value) {
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

  public static PricingMethod fromValue(String text) {
    for (PricingMethod b : PricingMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}