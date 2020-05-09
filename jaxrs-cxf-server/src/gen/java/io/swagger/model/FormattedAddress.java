package io.swagger.model;

import io.swagger.annotations.ApiModel;
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
  * A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions
 **/
@ApiModel(description="A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions")
public class FormattedAddress  {
  
  @ApiModelProperty(required = true, value = "The first address line in a formatted address")
 /**
   * The first address line in a formatted address
  **/
  private String addrLine1 = null;

  @ApiModelProperty(value = "The second address line in a formatted address")
 /**
   * The second address line in a formatted address
  **/
  private String addrLine2 = null;

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

  @ApiModelProperty(value = "Unique identifier of the address")
 /**
   * Unique identifier of the address
  **/
  private String id = null;

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
 /**
   * The first address line in a formatted address
   * @return addrLine1
  **/
  @JsonProperty("addrLine1")
  @NotNull
  public String getAddrLine1() {
    return addrLine1;
  }

  public void setAddrLine1(String addrLine1) {
    this.addrLine1 = addrLine1;
  }

  public FormattedAddress addrLine1(String addrLine1) {
    this.addrLine1 = addrLine1;
    return this;
  }

 /**
   * The second address line in a formatted address
   * @return addrLine2
  **/
  @JsonProperty("addrLine2")
  public String getAddrLine2() {
    return addrLine2;
  }

  public void setAddrLine2(String addrLine2) {
    this.addrLine2 = addrLine2;
  }

  public FormattedAddress addrLine2(String addrLine2) {
    this.addrLine2 = addrLine2;
    return this;
  }

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

  public FormattedAddress city(String city) {
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

  public FormattedAddress country(String country) {
    this.country = country;
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

  public FormattedAddress id(String id) {
    this.id = id;
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

  public FormattedAddress locality(String locality) {
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

  public FormattedAddress postCodeExtension(String postCodeExtension) {
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

  public FormattedAddress postcode(String postcode) {
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

  public FormattedAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormattedAddress {\n");
    
    sb.append("    addrLine1: ").append(toIndentedString(addrLine1)).append("\n");
    sb.append("    addrLine2: ").append(toIndentedString(addrLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postCodeExtension: ").append(toIndentedString(postCodeExtension)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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

