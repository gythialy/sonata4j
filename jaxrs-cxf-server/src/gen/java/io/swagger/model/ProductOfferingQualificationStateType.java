package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * These values represent the valid states through which the product offering qualification can transition
 */
public enum ProductOfferingQualificationStateType {
  
  DONE("done"),
  
  TERMINATEDWITHERROR_UNABLETOPROVIDE("terminatedWithError.unableToProvide"),
  
  TERMINATEDWITHERROR_INSUFFICIENTINFORMATIONPROVIDED("terminatedWithError.insufficientInformationProvided"),
  
  INPROGRESS("inProgress");

  private String value;

  ProductOfferingQualificationStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOfferingQualificationStateType fromValue(String text) {
    for (ProductOfferingQualificationStateType b : ProductOfferingQualificationStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

