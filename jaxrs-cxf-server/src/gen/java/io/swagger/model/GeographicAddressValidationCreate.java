package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.GeographicAddressRequestBuyerInput;
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
  * Structure used to describe a geographic address validation request
 **/
@ApiModel(description="Structure used to describe a geographic address validation request")
public class GeographicAddressValidationCreate  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private GeographicAddressRequestBuyerInput requestedAddress = null;
 /**
   * Get requestedAddress
   * @return requestedAddress
  **/
  @JsonProperty("requestedAddress")
  @NotNull
  public GeographicAddressRequestBuyerInput getRequestedAddress() {
    return requestedAddress;
  }

  public void setRequestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
  }

  public GeographicAddressValidationCreate requestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressValidationCreate {\n");
    
    sb.append("    requestedAddress: ").append(toIndentedString(requestedAddress)).append("\n");
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

