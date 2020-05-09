package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Indicates a time period for validity.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TimePeriod   {
  
  private OffsetDateTime endDateTime = null;
  private OffsetDateTime startDateTime = null;

  public TimePeriod () {

  }

  public TimePeriod (OffsetDateTime endDateTime, OffsetDateTime startDateTime) {
    this.endDateTime = endDateTime;
    this.startDateTime = startDateTime;
  }

    
  @JsonProperty("endDateTime")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

    
  @JsonProperty("startDateTime")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(endDateTime, timePeriod.endDateTime) &&
        Objects.equals(startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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
