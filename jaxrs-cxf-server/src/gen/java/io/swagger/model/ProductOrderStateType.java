package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOrderStateType fromValue(String text) {
    for (ProductOrderStateType b : ProductOrderStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

