package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.GeographicAddressRequestBuyerInput;
import io.swagger.model.GeographicAddressSellerResponse;
import io.swagger.model.ValidationResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
  * Resource used to support a request for a validation address : check if a geographic address described by values attributes exists) If exist, id is provided if not, alternate address(es) could be provided
 **/
@ApiModel(description="Resource used to support a request for a validation address : check if a geographic address described by values attributes exists) If exist, id is provided if not, alternate address(es) could be provided")
public class GeographicAddressValidation  {
  
  @ApiModelProperty(value = "Unique identifier of the Address Validation (Not an address id !!)")
 /**
   * Unique identifier of the Address Validation (Not an address id !!)
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private GeographicAddressRequestBuyerInput requestedAddress = null;

  @ApiModelProperty(value = "Date when the address validation is performed")
 /**
   * Date when the address validation is performed
  **/
  private Date validationDate = null;

  @ApiModelProperty(value = "")
  @Valid
  private ValidationResult validationResult = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<GeographicAddressSellerResponse> verifiedAddress = null;
 /**
   * Unique identifier of the Address Validation (Not an address id !!)
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicAddressValidation id(String id) {
    this.id = id;
    return this;
  }

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

  public GeographicAddressValidation requestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
    return this;
  }

 /**
   * Date when the address validation is performed
   * @return validationDate
  **/
  @JsonProperty("validationDate")
  public Date getValidationDate() {
    return validationDate;
  }

  public void setValidationDate(Date validationDate) {
    this.validationDate = validationDate;
  }

  public GeographicAddressValidation validationDate(Date validationDate) {
    this.validationDate = validationDate;
    return this;
  }

 /**
   * Get validationResult
   * @return validationResult
  **/
  @JsonProperty("validationResult")
  public ValidationResult getValidationResult() {
    return validationResult;
  }

  public void setValidationResult(ValidationResult validationResult) {
    this.validationResult = validationResult;
  }

  public GeographicAddressValidation validationResult(ValidationResult validationResult) {
    this.validationResult = validationResult;
    return this;
  }

 /**
   * Get verifiedAddress
   * @return verifiedAddress
  **/
  @JsonProperty("verifiedAddress")
  public List<GeographicAddressSellerResponse> getVerifiedAddress() {
    return verifiedAddress;
  }

  public void setVerifiedAddress(List<GeographicAddressSellerResponse> verifiedAddress) {
    this.verifiedAddress = verifiedAddress;
  }

  public GeographicAddressValidation verifiedAddress(List<GeographicAddressSellerResponse> verifiedAddress) {
    this.verifiedAddress = verifiedAddress;
    return this;
  }

  public GeographicAddressValidation addVerifiedAddressItem(GeographicAddressSellerResponse verifiedAddressItem) {
    this.verifiedAddress.add(verifiedAddressItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressValidation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestedAddress: ").append(toIndentedString(requestedAddress)).append("\n");
    sb.append("    validationDate: ").append(toIndentedString(validationDate)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
    sb.append("    verifiedAddress: ").append(toIndentedString(verifiedAddress)).append("\n");
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

