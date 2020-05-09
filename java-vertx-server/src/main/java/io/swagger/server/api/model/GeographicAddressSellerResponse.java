package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.FieldedAddress;
import io.swagger.server.api.model.FormattedAddress;

/**
 * An address is a structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicAddressSellerResponse   {
  
  private String schemaLocation = null;
  private String type = null;
  private Boolean allowsNewSite = null;
  private FieldedAddress fieldedAddress = null;
  private FormattedAddress formattedAddress = null;
  private Boolean hasPublicSite = null;
  private String id = null;
  private Boolean isBestMatch = null;

  public GeographicAddressSellerResponse () {

  }

  public GeographicAddressSellerResponse (String schemaLocation, String type, Boolean allowsNewSite, FieldedAddress fieldedAddress, FormattedAddress formattedAddress, Boolean hasPublicSite, String id, Boolean isBestMatch) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.allowsNewSite = allowsNewSite;
    this.fieldedAddress = fieldedAddress;
    this.formattedAddress = formattedAddress;
    this.hasPublicSite = hasPublicSite;
    this.id = id;
    this.isBestMatch = isBestMatch;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("allowsNewSite")
  public Boolean isAllowsNewSite() {
    return allowsNewSite;
  }
  public void setAllowsNewSite(Boolean allowsNewSite) {
    this.allowsNewSite = allowsNewSite;
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

    
  @JsonProperty("hasPublicSite")
  public Boolean isHasPublicSite() {
    return hasPublicSite;
  }
  public void setHasPublicSite(Boolean hasPublicSite) {
    this.hasPublicSite = hasPublicSite;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("isBestMatch")
  public Boolean isIsBestMatch() {
    return isBestMatch;
  }
  public void setIsBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicAddressSellerResponse geographicAddressSellerResponse = (GeographicAddressSellerResponse) o;
    return Objects.equals(schemaLocation, geographicAddressSellerResponse.schemaLocation) &&
        Objects.equals(type, geographicAddressSellerResponse.type) &&
        Objects.equals(allowsNewSite, geographicAddressSellerResponse.allowsNewSite) &&
        Objects.equals(fieldedAddress, geographicAddressSellerResponse.fieldedAddress) &&
        Objects.equals(formattedAddress, geographicAddressSellerResponse.formattedAddress) &&
        Objects.equals(hasPublicSite, geographicAddressSellerResponse.hasPublicSite) &&
        Objects.equals(id, geographicAddressSellerResponse.id) &&
        Objects.equals(isBestMatch, geographicAddressSellerResponse.isBestMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, allowsNewSite, fieldedAddress, formattedAddress, hasPublicSite, id, isBestMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressSellerResponse {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowsNewSite: ").append(toIndentedString(allowsNewSite)).append("\n");
    sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    hasPublicSite: ").append(toIndentedString(hasPublicSite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBestMatch: ").append(toIndentedString(isBestMatch)).append("\n");
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
