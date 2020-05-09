package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaskStateType fromValue(String text) {
    for (TaskStateType b : TaskStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

