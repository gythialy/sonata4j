package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.FieldedAddress;
import io.swagger.model.FormattedAddress;
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
  * Structure used to describe geographic address in response to GET geographicalSite
 **/
@ApiModel(description="Structure used to describe geographic address in response to GET geographicalSite")
public class GeographicAddressFindResp  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FieldedAddress fieldedAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private FormattedAddress formattedAddress = null;
 /**
   * Get fieldedAddress
   * @return fieldedAddress
  **/
  @JsonProperty("fieldedAddress")
  public FieldedAddress getFieldedAddress() {
    return fieldedAddress;
  }

  public void setFieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

  public GeographicAddressFindResp fieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
    return this;
  }

 /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @JsonProperty("formattedAddress")
  public FormattedAddress getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(FormattedAddress formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GeographicAddressFindResp formattedAddress(FormattedAddress formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressFindResp {\n");
    
    sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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

