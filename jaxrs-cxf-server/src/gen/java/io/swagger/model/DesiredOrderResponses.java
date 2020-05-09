package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The kind of responses that the buyer expects to receive from the seller.
 */
public enum DesiredOrderResponses {
  
  CONFIRMATIONANDENGINEERINGDESIGN("confirmationAndEngineeringDesign"),
  
  CONFIRMATIONONLY("confirmationOnly"),
  
  NONE("none");

  private String value;

  DesiredOrderResponses(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DesiredOrderResponses fromValue(String text) {
    for (DesiredOrderResponses b : DesiredOrderResponses.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

