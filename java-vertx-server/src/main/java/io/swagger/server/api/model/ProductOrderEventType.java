package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Product Order event type
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductOrderEventType fromValue(String text) {
    for (ProductOrderEventType b : ProductOrderEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}