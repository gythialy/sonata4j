package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Event;
import io.swagger.server.api.model.ProductOrderEvent;
import io.swagger.server.api.model.ProductOrderEventType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class EventPlus extends Event  {
  
  private List<String> fieldPath = new ArrayList<>();
  private String resourcePath = null;

  public EventPlus () {

  }

  public EventPlus (List<String> fieldPath, String resourcePath) {
    this.fieldPath = fieldPath;
    this.resourcePath = resourcePath;
  }

    
  @JsonProperty("fieldPath")
  public List<String> getFieldPath() {
    return fieldPath;
  }
  public void setFieldPath(List<String> fieldPath) {
    this.fieldPath = fieldPath;
  }

    
  @JsonProperty("resourcePath")
  public String getResourcePath() {
    return resourcePath;
  }
  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventPlus eventPlus = (EventPlus) o;
    return Objects.equals(fieldPath, eventPlus.fieldPath) &&
        Objects.equals(resourcePath, eventPlus.resourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPath, resourcePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventPlus {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
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
