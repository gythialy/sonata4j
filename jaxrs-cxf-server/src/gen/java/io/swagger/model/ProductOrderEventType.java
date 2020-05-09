package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Product Order event type
 */
public enum ProductOrderEventType {
  
  PRODUCTORDERCREATIONNOTIFICATION("productOrderCreationNotification"),
  
  PRODUCTORDERATTRIBUTEVALUECHANGENOTIFICATION("productOrderAttributeValueChangeNotification"),
  
  PRODUCTORDERSTATECHANGENOTIFICATION("productOrderStateChangeNotification"),
  
  PRODUCTORDERINFORMATIONREQUIREDNOTIFICATION("productOrderInformationRequiredNotification");

  private String value;

  ProductOrderEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOrderEventType fromValue(String text) {
    for (ProductOrderEventType b : ProductOrderEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

