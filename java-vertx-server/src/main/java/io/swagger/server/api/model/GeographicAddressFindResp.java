package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.FieldedAddress;
import io.swagger.server.api.model.FormattedAddress;

/**
 * Structure used to describe geographic address in response to GET geographicalSite
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicAddressFindResp   {
  
  private FieldedAddress fieldedAddress = null;
  private FormattedAddress formattedAddress = null;

  public GeographicAddressFindResp () {

  }

  public GeographicAddressFindResp (FieldedAddress fieldedAddress, FormattedAddress formattedAddress) {
    this.fieldedAddress = fieldedAddress;
    this.formattedAddress = formattedAddress;
  }

    
  @JsonProperty("fieldedAddress")
  public FieldedAddress getFieldedAddress() {
    return fieldedAddress;
  }
  public void setFieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

    
  @JsonProperty("formattedAddress")
  public FormattedAddress getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(FormattedAddress formattedAddress) {
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
    GeographicAddressFindResp geographicAddressFindResp = (GeographicAddressFindResp) o;
    return Objects.equals(fieldedAddress, geographicAddressFindResp.fieldedAddress) &&
        Objects.equals(formattedAddress, geographicAddressFindResp.formattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldedAddress, formattedAddress);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
