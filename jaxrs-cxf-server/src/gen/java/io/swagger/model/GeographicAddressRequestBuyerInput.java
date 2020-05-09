package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.FieldedAddressRequest;
import io.swagger.model.FormattedAddressRequest;
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
  * Structure used by the buyer to request geographic address validation
 **/
@ApiModel(description="Structure used by the buyer to request geographic address validation")
public class GeographicAddressRequestBuyerInput  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FieldedAddressRequest fieldedAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private FormattedAddressRequest formattedAddress = null;
 /**
   * Get fieldedAddress
   * @return fieldedAddress
  **/
  @JsonProperty("fieldedAddress")
  public FieldedAddressRequest getFieldedAddress() {
    return fieldedAddress;
  }

  public void setFieldedAddress(FieldedAddressRequest fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

  public GeographicAddressRequestBuyerInput fieldedAddress(FieldedAddressRequest fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
    return this;
  }

 /**
   * Get formattedAddress
   * @return formattedAddress
  **/
  @JsonProperty("formattedAddress")
  public FormattedAddressRequest getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(FormattedAddressRequest formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GeographicAddressRequestBuyerInput formattedAddress(FormattedAddressRequest formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressRequestBuyerInput {\n");
    
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

