package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.GeographicAddressRequestBuyerInput;

/**
 * Structure used to describe a geographic address validation request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicAddressValidationCreate   {
  
  private GeographicAddressRequestBuyerInput requestedAddress = null;

  public GeographicAddressValidationCreate () {

  }

  public GeographicAddressValidationCreate (GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
  }

    
  @JsonProperty("requestedAddress")
  public GeographicAddressRequestBuyerInput getRequestedAddress() {
    return requestedAddress;
  }
  public void setRequestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
    this.requestedAddress = requestedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressValidationCreate geographicAddressValidationCreate = (GeographicAddressValidationCreate) o;
    return Objects.equals(requestedAddress, geographicAddressValidationCreate.requestedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedAddress);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
