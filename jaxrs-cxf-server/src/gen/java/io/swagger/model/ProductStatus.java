package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the product in accordance with the product lifecycle.
 */
public enum ProductStatus {
  
  ACTIVE("active"),
  
  SUSPENDED("suspended"),
  
  ACTIVEPENDINGTERMINATE("activePendingTerminate"),
  
  TERMINATED("terminated"),
  
  PENDINGACTIVE("pendingActive"),
  
  SUSPENDEDPENDINGTERMINATE("suspendedPendingTerminate");

  private String value;

  ProductStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductStatus fromValue(String text) {
    for (ProductStatus b : ProductStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

