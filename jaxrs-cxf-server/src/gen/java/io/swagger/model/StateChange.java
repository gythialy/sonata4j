package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingQualificationStateType;
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
  * Holds the state notification reasons and associated date the state changed, populated by the server
 **/
@ApiModel(description="Holds the state notification reasons and associated date the state changed, populated by the server")
public class StateChange  {
  
  @ApiModelProperty(value = "")
  private Date changeDate = null;

  @ApiModelProperty(value = "")
  private String changeReason = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingQualificationStateType state = null;
 /**
   * Get changeDate
   * @return changeDate
  **/
  @JsonProperty("changeDate")
  public Date getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(Date changeDate) {
    this.changeDate = changeDate;
  }

  public StateChange changeDate(Date changeDate) {
    this.changeDate = changeDate;
    return this;
  }

 /**
   * Get changeReason
   * @return changeReason
  **/
  @JsonProperty("changeReason")
  public String getChangeReason() {
    return changeReason;
  }

  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

  public StateChange changeReason(String changeReason) {
    this.changeReason = changeReason;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public ProductOfferingQualificationStateType getState() {
    return state;
  }

  public void setState(ProductOfferingQualificationStateType state) {
    this.state = state;
  }

  public StateChange state(ProductOfferingQualificationStateType state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateChange {\n");
    
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

