package io.swagger.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TaskStateType
 */
public enum TaskStateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  INPROGRESS("inProgress"),
  
  DONE("done"),
  
  TERMINATEDWITHERROR("terminatedWithError");

  private String value;

  TaskStateType(String value) {
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

  public static TaskStateType fromValue(String text) {
    for (TaskStateType b : TaskStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}