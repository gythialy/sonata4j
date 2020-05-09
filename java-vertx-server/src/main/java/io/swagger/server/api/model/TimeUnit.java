package io.swagger.server.api.model;

import java.util.Objects;

/**
 * Represents a unit of time.
 **/
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeUnit fromValue(String text) {
    for (TimeUnit b : TimeUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}