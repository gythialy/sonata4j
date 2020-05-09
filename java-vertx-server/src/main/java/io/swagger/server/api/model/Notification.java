package io.swagger.server.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

/**
 * This class is created only to gather Notification data structure. This structure must be send to the callback url provided in the HUB resource.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification   {
  

  public Notification () {

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
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
