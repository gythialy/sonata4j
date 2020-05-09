package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.TimeUnit;

/**
 * A time interval, e.g.  3 hours, or 5 days.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TimeInterval   {
  
  private Integer amount = null;
  private TimeUnit timeUnit = null;

  public TimeInterval () {

  }

  public TimeInterval (Integer amount, TimeUnit timeUnit) {
    this.amount = amount;
    this.timeUnit = timeUnit;
  }

    
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

    
  @JsonProperty("timeUnit")
  public TimeUnit getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeInterval timeInterval = (TimeInterval) o;
    return Objects.equals(amount, timeInterval.amount) &&
        Objects.equals(timeUnit, timeInterval.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, timeUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeInterval {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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
