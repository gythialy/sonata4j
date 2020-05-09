package io.swagger.server.api.model;

import java.util.Objects;

/**
 * These values represent the valid states through which the product offering qualification can transition
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductOfferingQualificationStateType fromValue(String text) {
    for (ProductOfferingQualificationStateType b : ProductOfferingQualificationStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}