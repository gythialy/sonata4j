package io.swagger.model;

import io.swagger.annotations.ApiModel;
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
  * base / value business entity used to represent money
 **/
@ApiModel(description="base / value business entity used to represent money")
public class Money  {
  
  @ApiModelProperty(required = true, value = "Currency (ISO4217 norm uses 3 letters to define the currency")
 /**
   * Currency (ISO4217 norm uses 3 letters to define the currency
  **/
  private String unit = null;

  @ApiModelProperty(required = true, value = "A positive floating point number")
 /**
   * A positive floating point number
  **/
  private Float value = null;
 /**
   * Currency (ISO4217 norm uses 3 letters to define the currency
   * @return unit
  **/
  @JsonProperty("unit")
  @NotNull
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Money unit(String unit) {
    this.unit = unit;
    return this;
  }

 /**
   * A positive floating point number
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Money value(Float value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Money {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

