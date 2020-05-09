package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.DurationUnit;

/**
 * To describe a duration (period of time) with a value and an unit (day, month, etc...)
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Duration   {
  
  private DurationUnit unit = null;
  private Integer value = 12;

  public Duration () {

  }

  public Duration (DurationUnit unit, Integer value) {
    this.unit = unit;
    this.value = value;
  }

    
  @JsonProperty("unit")
  public DurationUnit getUnit() {
    return unit;
  }
  public void setUnit(DurationUnit unit) {
    this.unit = unit;
  }

    
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;
    return Objects.equals(unit, duration.unit) &&
        Objects.equals(value, duration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
