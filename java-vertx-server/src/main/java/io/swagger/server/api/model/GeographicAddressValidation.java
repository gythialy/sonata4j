package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.GeographicAddressRequestBuyerInput;
import io.swagger.server.api.model.GeographicAddressSellerResponse;
import io.swagger.server.api.model.ValidationResult;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Resource used to support a request for a validation address : check if a geographic address described by values attributes exists) If exist, id is provided if not, alternate address(es) could be provided
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicAddressValidation   {
  
  private String id = null;
  private GeographicAddressRequestBuyerInput requestedAddress = null;
  private OffsetDateTime validationDate = null;
  private ValidationResult validationResult = null;
  private List<GeographicAddressSellerResponse> verifiedAddress = new ArrayList<>();

  public GeographicAddressValidation () {

  }

  public GeographicAddressValidation (String id, GeographicAddressRequestBuyerInput requestedAddress, OffsetDateTime validationDate, ValidationResult validationResult, List<GeographicAddressSellerResponse> verifiedAddress) {
    this.id = id;
    this.requestedAddress = requestedAddress;
    this.validationDate = validationDate;
    this.validationResult = validationResult;
    this.verifiedAddress = verifiedAddress;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("requestedAddress")
  public GeographicAddressRequestBuyerInput getRequestedAddress() {
    return requestedAddress;
  }
  public void setRequestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
  }

    
  @JsonProperty("validationDate")
  public OffsetDateTime getValidationDate() {
    return validationDate;
  }
  public void setValidationDate(OffsetDateTime validationDate) {
    this.validationDate = validationDate;
  }

    
  @JsonProperty("validationResult")
  public ValidationResult getValidationResult() {
    return validationResult;
  }
  public void setValidationResult(ValidationResult validationResult) {
    this.validationResult = validationResult;
  }

    
  @JsonProperty("verifiedAddress")
  public List<GeographicAddressSellerResponse> getVerifiedAddress() {
    return verifiedAddress;
  }
  public void setVerifiedAddress(List<GeographicAddressSellerResponse> verifiedAddress) {
    this.verifiedAddress = verifiedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressValidation geographicAddressValidation = (GeographicAddressValidation) o;
    return Objects.equals(id, geographicAddressValidation.id) &&
        Objects.equals(requestedAddress, geographicAddressValidation.requestedAddress) &&
        Objects.equals(validationDate, geographicAddressValidation.validationDate) &&
        Objects.equals(validationResult, geographicAddressValidation.validationResult) &&
        Objects.equals(verifiedAddress, geographicAddressValidation.verifiedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestedAddress, validationDate, validationResult, verifiedAddress);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
