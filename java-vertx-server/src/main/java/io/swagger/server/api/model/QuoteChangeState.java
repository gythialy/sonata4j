package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Quote state change &#39;request able&#39; by buyer
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Quote state change &#39;request able&#39; by buyer
 */
public enum QuoteChangeState {
  
  CANCELLED("CANCELLED"),
  
  REJECTED("REJECTED");

  private String value;

  QuoteChangeState(String value) {
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

  public static QuoteChangeState fromValue(String text) {
    for (QuoteChangeState b : QuoteChangeState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}