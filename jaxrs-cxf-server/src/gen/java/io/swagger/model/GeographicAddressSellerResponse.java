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
  * An address is a structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)
 **/
@ApiModel(description="An address is a structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)")
public class GeographicAddressSellerResponse  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String type = null;

  @ApiModelProperty(value = "This attribute specifies if a Buyer must use one of the known existing Service Sites at this location for any Products delivered to this Address.  For example, if a particular building owner mandated that all interconnects be done in a shared Public Meet-Me-Room, this attribute would be set to False for that Address.")
 /**
   * This attribute specifies if a Buyer must use one of the known existing Service Sites at this location for any Products delivered to this Address.  For example, if a particular building owner mandated that all interconnects be done in a shared Public Meet-Me-Room, this attribute would be set to False for that Address.
  **/
  private Boolean allowsNewSite = null;

  @ApiModelProperty(value = "")
  @Valid
  private FieldedAddress fieldedAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private FormattedAddress formattedAddress = null;

  @ApiModelProperty(value = "This attribute specifies if that Address contains Service Sites that are public such as Meet-Me-Rooms at an interconnect location or a shared telecom room in the basement of a multi-tenant building")
 /**
   * This attribute specifies if that Address contains Service Sites that are public such as Meet-Me-Rooms at an interconnect location or a shared telecom room in the basement of a multi-tenant building
  **/
  private Boolean hasPublicSite = null;

  @ApiModelProperty(value = "Unique identifier of the address")
 /**
   * Unique identifier of the address
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "For each Address returned, this attribute specifies if the Seller believes this is the best match to the Buyer specified Address.  Setting this to TRUE also represents that the Seller believes this is likely a direct match to the Buyer Specified Address.")
 /**
   * For each Address returned, this attribute specifies if the Seller believes this is the best match to the Buyer specified Address.  Setting this to TRUE also represents that the Seller believes this is likely a direct match to the Buyer Specified Address.
  **/
  private Boolean isBestMatch = null;
 /**
   * Technical attribute to extend this class
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public GeographicAddressSellerResponse schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Technical attribute to extend this class
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeographicAddressSellerResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * This attribute specifies if a Buyer must use one of the known existing Service Sites at this location for any Products delivered to this Address.  For example, if a particular building owner mandated that all interconnects be done in a shared Public Meet-Me-Room, this attribute would be set to False for that Address.
   * @return allowsNewSite
  **/
  @JsonProperty("allowsNewSite")
  public Boolean isAllowsNewSite() {
    return allowsNewSite;
  }

  public void setAllowsNewSite(Boolean allowsNewSite) {
    this.allowsNewSite = allowsNewSite;
  }

  public GeographicAddressSellerResponse allowsNewSite(Boolean allowsNewSite) {
    this.allowsNewSite = allowsNewSite;
    return this;
  }

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

  public GeographicAddressSellerResponse fieldedAddress(FieldedAddress fieldedAddress) {
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

  public GeographicAddressSellerResponse formattedAddress(FormattedAddress formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

 /**
   * This attribute specifies if that Address contains Service Sites that are public such as Meet-Me-Rooms at an interconnect location or a shared telecom room in the basement of a multi-tenant building
   * @return hasPublicSite
  **/
  @JsonProperty("hasPublicSite")
  public Boolean isHasPublicSite() {
    return hasPublicSite;
  }

  public void setHasPublicSite(Boolean hasPublicSite) {
    this.hasPublicSite = hasPublicSite;
  }

  public GeographicAddressSellerResponse hasPublicSite(Boolean hasPublicSite) {
    this.hasPublicSite = hasPublicSite;
    return this;
  }

 /**
   * Unique identifier of the address
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicAddressSellerResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * For each Address returned, this attribute specifies if the Seller believes this is the best match to the Buyer specified Address.  Setting this to TRUE also represents that the Seller believes this is likely a direct match to the Buyer Specified Address.
   * @return isBestMatch
  **/
  @JsonProperty("isBestMatch")
  @NotNull
  public Boolean isIsBestMatch() {
    return isBestMatch;
  }

  public void setIsBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
  }

  public GeographicAddressSellerResponse isBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

