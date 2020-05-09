package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.GeographicSubAddressRequest;
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
  * A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail. For example “street number” is one field, “street name” is another field, etc. This structure is used in the request addressValidation only
 **/
@ApiModel(description="A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail. For example “street number” is one field, “street name” is another field, etc. This structure is used in the request addressValidation only")
public class FieldedAddressRequest  {
  
  @ApiModelProperty(value = "City that the address is in")
 /**
   * City that the address is in
  **/
  private String city = null;

  @ApiModelProperty(value = "Country that the address is in")
 /**
   * Country that the address is in
  **/
  private String country = null;

  @ApiModelProperty(value = "")
  @Valid
  private GeographicSubAddressRequest geographicSubAddress = null;

  @ApiModelProperty(value = "\"An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi-rural in nature.\" [ANZLIC-STREET], or a suburb \"a bounded locality within a city, town or shire principally of urban character \" [ANZLICSTREET].")
 /**
   * \"An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi-rural in nature.\" [ANZLIC-STREET], or a suburb \"a bounded locality within a city, town or shire principally of urban character \" [ANZLICSTREET].
  **/
  private String locality = null;

  @ApiModelProperty(value = "The four-digit extension on an American postal code, what comes after the hyphen when specified.")
 /**
   * The four-digit extension on an American postal code, what comes after the hyphen when specified.
  **/
  private String postCodeExtension = null;

  @ApiModelProperty(value = "Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)")
 /**
   * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
  **/
  private String postcode = null;

  @ApiModelProperty(value = "The State or Province that the address is in")
 /**
   * The State or Province that the address is in
  **/
  private String stateOrProvince = null;

  @ApiModelProperty(value = "Name of the street or other street type")
 /**
   * Name of the street or other street type
  **/
  private String streetName = null;

  @ApiModelProperty(value = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses")
 /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
  **/
  private String streetNr = null;

  @ApiModelProperty(value = "Last number in a range of street numbers allocated to a property")
 /**
   * Last number in a range of street numbers allocated to a property
  **/
  private String streetNrLast = null;

  @ApiModelProperty(value = "Last street number suffix for a ranged address")
 /**
   * Last street number suffix for a ranged address
  **/
  private String streetNrLastSuffix = null;

  @ApiModelProperty(value = "The first street number suffix")
 /**
   * The first street number suffix
  **/
  private String streetNrSuffix = null;

  @ApiModelProperty(value = "A modifier denoting a relative direction")
 /**
   * A modifier denoting a relative direction
  **/
  private String streetSuffix = null;

  @ApiModelProperty(value = "Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf")
 /**
   * Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
  **/
  private String streetType = null;
 /**
   * City that the address is in
   * @return city
  **/
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public FieldedAddressRequest city(String city) {
    this.city = city;
    return this;
  }

 /**
   * Country that the address is in
   * @return country
  **/
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public FieldedAddressRequest country(String country) {
    this.country = country;
    return this;
  }

 /**
   * Get geographicSubAddress
   * @return geographicSubAddress
  **/
  @JsonProperty("geographicSubAddress")
  public GeographicSubAddressRequest getGeographicSubAddress() {
    return geographicSubAddress;
  }

  public void setGeographicSubAddress(GeographicSubAddressRequest geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
  }

  public FieldedAddressRequest geographicSubAddress(GeographicSubAddressRequest geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
    return this;
  }

 /**
   * \&quot;An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi-rural in nature.\&quot; [ANZLIC-STREET], or a suburb \&quot;a bounded locality within a city, town or shire principally of urban character \&quot; [ANZLICSTREET].
   * @return locality
  **/
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public FieldedAddressRequest locality(String locality) {
    this.locality = locality;
    return this;
  }

 /**
   * The four-digit extension on an American postal code, what comes after the hyphen when specified.
   * @return postCodeExtension
  **/
  @JsonProperty("postCodeExtension")
  public String getPostCodeExtension() {
    return postCodeExtension;
  }

  public void setPostCodeExtension(String postCodeExtension) {
    this.postCodeExtension = postCodeExtension;
  }

  public FieldedAddressRequest postCodeExtension(String postCodeExtension) {
    this.postCodeExtension = postCodeExtension;
    return this;
  }

 /**
   * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
   * @return postcode
  **/
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public FieldedAddressRequest postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

 /**
   * The State or Province that the address is in
   * @return stateOrProvince
  **/
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public FieldedAddressRequest stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

 /**
   * Name of the street or other street type
   * @return streetName
  **/
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public FieldedAddressRequest streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

 /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
   * @return streetNr
  **/
  @JsonProperty("streetNr")
  public String getStreetNr() {
    return streetNr;
  }

  public void setStreetNr(String streetNr) {
    this.streetNr = streetNr;
  }

  public FieldedAddressRequest streetNr(String streetNr) {
    this.streetNr = streetNr;
    return this;
  }

 /**
   * Last number in a range of street numbers allocated to a property
   * @return streetNrLast
  **/
  @JsonProperty("streetNrLast")
  public String getStreetNrLast() {
    return streetNrLast;
  }

  public void setStreetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

  public FieldedAddressRequest streetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
    return this;
  }

 /**
   * Last street number suffix for a ranged address
   * @return streetNrLastSuffix
  **/
  @JsonProperty("streetNrLastSuffix")
  public String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }

  public void setStreetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

  public FieldedAddressRequest streetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
    return this;
  }

 /**
   * The first street number suffix
   * @return streetNrSuffix
  **/
  @JsonProperty("streetNrSuffix")
  public String getStreetNrSuffix() {
    return streetNrSuffix;
  }

  public void setStreetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

  public FieldedAddressRequest streetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
    return this;
  }

 /**
   * A modifier denoting a relative direction
   * @return streetSuffix
  **/
  @JsonProperty("streetSuffix")
  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public FieldedAddressRequest streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

 /**
   * Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
   * @return streetType
  **/
  @JsonProperty("streetType")
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public FieldedAddressRequest streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldedAddressRequest {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postCodeExtension: ").append(toIndentedString(postCodeExtension)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNr: ").append(toIndentedString(streetNr)).append("\n");
    sb.append("    streetNrLast: ").append(toIndentedString(streetNrLast)).append("\n");
    sb.append("    streetNrLastSuffix: ").append(toIndentedString(streetNrLastSuffix)).append("\n");
    sb.append("    streetNrSuffix: ").append(toIndentedString(streetNrSuffix)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
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

