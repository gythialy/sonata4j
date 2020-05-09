package io.swagger.server.api.model;

import java.util.Objects;

/**
 * An enumeration of valid order states
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration of valid order states
 */
public enum ProductOrderStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  INPROGRESS("inProgress"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  ASSESSINGCANCELLATION("assessingCancellation"),
  
  PENDINGCANCELLATION("pendingCancellation"),
  
  CANCELLED("cancelled"),
  
  INPROGRESS_CONFIGURED("inProgress.configured"),
  
  INPROGRESS_CONFIRMED("inProgress.confirmed"),
  
  INPROGRESS_JEOPARDY("inProgress.jeopardy"),
  
  FAILED("failed"),
  
  PARTIAL("partial"),
  
  COMPLETED("completed");

  private String value;

  ProductOrderStateType(String value) {
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

  public static ProductOrderStateType fromValue(String text) {
    for (ProductOrderStateType b : ProductOrderStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}