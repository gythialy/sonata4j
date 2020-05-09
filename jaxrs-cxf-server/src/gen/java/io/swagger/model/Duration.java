package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.DurationUnit;
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
  * To describe a duration (period of time) with a value and an unit (day, month, etc...)
 **/
@ApiModel(description="To describe a duration (period of time) with a value and an unit (day, month, etc...)")
public class Duration  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DurationUnit unit = null;

  @ApiModelProperty(required = true, value = "value of the duration")
 /**
   * value of the duration
  **/
  private Integer value = 12;
 /**
   * Get unit
   * @return unit
  **/
  @JsonProperty("unit")
  @NotNull
  public DurationUnit getUnit() {
    return unit;
  }

  public void setUnit(DurationUnit unit) {
    this.unit = unit;
  }

  public Duration unit(DurationUnit unit) {
    this.unit = unit;
    return this;
  }

 /**
   * value of the duration
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Duration value(Integer value) {
    this.value = value;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

