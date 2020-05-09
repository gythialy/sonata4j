package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration of valid order item statuses.
 */
public enum ProductOrderItemStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  REJECTED("rejected"),
  
  INPROGRESS("inProgress"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  ASSESSSINGCANCELLATION("assesssingCancellation"),
  
  PENDINGCANCELLATION("pendingCancellation"),
  
  CANCELLED("cancelled"),
  
  INPROGRESS_CONFIGURED("inProgress.configured"),
  
  FAILED("failed"),
  
  COMPLETED("completed");

  private String value;

  ProductOrderItemStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOrderItemStateType fromValue(String text) {
    for (ProductOrderItemStateType b : ProductOrderItemStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

