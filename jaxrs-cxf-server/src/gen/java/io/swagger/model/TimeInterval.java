package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TimeUnit;
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
  * A time interval, e.g.  3 hours, or 5 days.
 **/
@ApiModel(description="A time interval, e.g.  3 hours, or 5 days.")
public class TimeInterval  {
  
  @ApiModelProperty(required = true, value = "Amount")
 /**
   * Amount
  **/
  private Integer amount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private TimeUnit timeUnit = null;
 /**
   * Amount
   * @return amount
  **/
  @JsonProperty("amount")
  @NotNull
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public TimeInterval amount(Integer amount) {
    this.amount = amount;
    return this;
  }

 /**
   * Get timeUnit
   * @return timeUnit
  **/
  @JsonProperty("timeUnit")
  @NotNull
  public TimeUnit getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
  }

  public TimeInterval timeUnit(TimeUnit timeUnit) {
    this.timeUnit = timeUnit;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

