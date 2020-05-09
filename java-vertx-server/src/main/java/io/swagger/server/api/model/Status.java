package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Status of a geographical site
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of a geographical site
 */
public enum Status {
  
  PLANNED("planned"),
  
  CANCELLED("cancelled"),
  
  UNDERCONSTRUCTION("underConstruction"),
  
  EXISTING("existing"),
  
  FORMER("former");

  private String value;

  Status(String value) {
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

  public static Status fromValue(String text) {
    for (Status b : Status.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}