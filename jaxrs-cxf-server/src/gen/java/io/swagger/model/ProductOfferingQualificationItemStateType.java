package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * POQ item states - The specific states are managed by the Seller based on its processing and/or based on Buyer&#39;s action.
 */
public enum ProductOfferingQualificationItemStateType {
  
  DONE("done"),
  
  TERMINATEDWITHERROR_UNABLETOPROVIDE("terminatedWithError.unableToProvide"),
  
  TERMINATEDWITHERROR_INSUFFICIENTINFORMATIONPROVIDED("terminatedWithError.insufficientInformationProvided"),
  
  INPROGRESS("inProgress");

  private String value;

  ProductOfferingQualificationItemStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOfferingQualificationItemStateType fromValue(String text) {
    for (ProductOfferingQualificationItemStateType b : ProductOfferingQualificationItemStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

