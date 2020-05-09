package io.swagger.server.api.model;

import java.util.Objects;

/**
 * POQ item states - The specific states are managed by the Seller based on its processing and/or based on Buyer&#39;s action.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductOfferingQualificationItemStateType fromValue(String text) {
    for (ProductOfferingQualificationItemStateType b : ProductOfferingQualificationItemStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}