package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PricingMethod fromValue(String text) {
    for (PricingMethod b : PricingMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

