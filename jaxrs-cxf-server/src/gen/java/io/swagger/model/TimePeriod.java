package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
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
  * Indicates a time period for validity.
 **/
@ApiModel(description="Indicates a time period for validity.")
public class TimePeriod  {
  
  @ApiModelProperty(value = "")
  private Date endDateTime = null;

  @ApiModelProperty(value = "")
  private Date startDateTime = null;
 /**
   * Get endDateTime
   * @return endDateTime
  **/
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  public TimePeriod endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

 /**
   * Get startDateTime
   * @return startDateTime
  **/
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }

  public TimePeriod startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

