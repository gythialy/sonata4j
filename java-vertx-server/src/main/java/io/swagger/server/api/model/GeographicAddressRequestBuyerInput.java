package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.FieldedAddressRequest;
import io.swagger.server.api.model.FormattedAddressRequest;

/**
 * Structure used by the buyer to request geographic address validation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicAddressRequestBuyerInput   {
  
  private FieldedAddressRequest fieldedAddress = null;
  private FormattedAddressRequest formattedAddress = null;

  public GeographicAddressRequestBuyerInput () {

  }

  public GeographicAddressRequestBuyerInput (FieldedAddressRequest fieldedAddress, FormattedAddressRequest formattedAddress) {
    this.fieldedAddress = fieldedAddress;
    this.formattedAddress = formattedAddress;
  }

    
  @JsonProperty("fieldedAddress")
  public FieldedAddressRequest getFieldedAddress() {
    return fieldedAddress;
  }
  public void setFieldedAddress(FieldedAddressRequest fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

    
  @JsonProperty("formattedAddress")
  public FormattedAddressRequest getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(FormattedAddressRequest formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressRequestBuyerInput geographicAddressRequestBuyerInput = (GeographicAddressRequestBuyerInput) o;
    return Objects.equals(fieldedAddress, geographicAddressRequestBuyerInput.fieldedAddress) &&
        Objects.equals(formattedAddress, geographicAddressRequestBuyerInput.formattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldedAddress, formattedAddress);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
