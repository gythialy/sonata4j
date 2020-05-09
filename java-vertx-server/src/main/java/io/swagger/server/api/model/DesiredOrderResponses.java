package io.swagger.server.api.model;

import java.util.Objects;

/**
 * The kind of responses that the buyer expects to receive from the seller.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DesiredOrderResponses fromValue(String text) {
    for (DesiredOrderResponses b : DesiredOrderResponses.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}