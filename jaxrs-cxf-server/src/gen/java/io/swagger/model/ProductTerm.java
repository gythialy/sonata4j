package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Quantity;
import io.swagger.model.TimePeriod;
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
  * Indicate a commitment term associated to the product
 **/
@ApiModel(description="Indicate a commitment term associated to the product")
public class ProductTerm  {
  
  @ApiModelProperty(value = "Description of the commitment")
 /**
   * Description of the commitment
  **/
  private String description = null;

  @ApiModelProperty(value = "")
  @Valid
  private Quantity duration = null;

  @ApiModelProperty(value = "Name of the commitment")
 /**
   * Name of the commitment
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  @Valid
  private TimePeriod validFor = null;
 /**
   * Description of the commitment
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductTerm description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get duration
   * @return duration
  **/
  @JsonProperty("duration")
  public Quantity getDuration() {
    return duration;
  }

  public void setDuration(Quantity duration) {
    this.duration = duration;
  }

  public ProductTerm duration(Quantity duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Name of the commitment
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductTerm name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get validFor
   * @return validFor
  **/
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductTerm validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

