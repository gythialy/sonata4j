package io.swagger.model;

import io.swagger.model.Event;
import io.swagger.model.ProductOrderEvent;
import io.swagger.model.ProductOrderEventType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventPlus extends Event {
  
  @ApiModelProperty(required = true, value = "")
  private List<String> fieldPath = new ArrayList<String>();

  @ApiModelProperty(required = true, value = "")
  private String resourcePath = null;
 /**
   * Get fieldPath
   * @return fieldPath
  **/
  @JsonProperty("fieldPath")
  @NotNull
  public List<String> getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(List<String> fieldPath) {
    this.fieldPath = fieldPath;
  }

  public EventPlus fieldPath(List<String> fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  public EventPlus addFieldPathItem(String fieldPathItem) {
    this.fieldPath.add(fieldPathItem);
    return this;
  }

 /**
   * Get resourcePath
   * @return resourcePath
  **/
  @JsonProperty("resourcePath")
  @NotNull
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public EventPlus resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

