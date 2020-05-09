package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductStatus;
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
  * Holds the status modification reasons and associated date the status changed, populated by the server
 **/
@ApiModel(description="Holds the status modification reasons and associated date the status changed, populated by the server")
public class StatusChange  {
  
  @ApiModelProperty(value = "Date when the state changed")
 /**
   * Date when the state changed
  **/
  private Date changeDate = null;

  @ApiModelProperty(value = "Raison for which the state changed")
 /**
   * Raison for which the state changed
  **/
  private String changeReason = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductStatus status = null;
 /**
   * Date when the state changed
   * @return changeDate
  **/
  @JsonProperty("changeDate")
  public Date getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(Date changeDate) {
    this.changeDate = changeDate;
  }

  public StatusChange changeDate(Date changeDate) {
    this.changeDate = changeDate;
    return this;
  }

 /**
   * Raison for which the state changed
   * @return changeReason
  **/
  @JsonProperty("changeReason")
  public String getChangeReason() {
    return changeReason;
  }

  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

  public StatusChange changeReason(String changeReason) {
    this.changeReason = changeReason;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public StatusChange status(ProductStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

