package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents a unit of time.
 */
public enum TimeUnit {
  
  CALENDARDAYS("calendarDays"),
  
  CALENDARHOURS("calendarHours"),
  
  CALENDARMINUTES("calendarMinutes"),
  
  BUSINESSDAYS("businessDays"),
  
  BUSINESSHOURS("businessHours"),
  
  BUSINESSMINUTES("businessMinutes");

  private String value;

  TimeUnit(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TimeUnit fromValue(String text) {
    for (TimeUnit b : TimeUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

