package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Duration;
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

/**
  * Used to describe a term (also know as commitment) for a quote item
 **/
@ApiModel(description="Used to describe a term (also know as commitment) for a quote item")
public class ItemTerm  {
  
  @ApiModelProperty(value = "Description of the term")
 /**
   * Description of the term
  **/
  private String description = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Duration duration = null;

  @ApiModelProperty(value = "Name of the term")
 /**
   * Name of the term
  **/
  private String name = null;
 /**
   * Description of the term
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemTerm description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  @NotNull
  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public ItemTerm duration(Duration duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Name of the term
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemTerm name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

