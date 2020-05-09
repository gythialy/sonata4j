package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class FormattedAddress   {
  
  private String addrLine1 = null;
  private String addrLine2 = null;
  private String city = null;
  private String country = null;
  private String id = null;
  private String locality = null;
  private String postCodeExtension = null;
  private String postcode = null;
  private String stateOrProvince = null;

  public FormattedAddress () {

  }

  public FormattedAddress (String addrLine1, String addrLine2, String city, String country, String id, String locality, String postCodeExtension, String postcode, String stateOrProvince) {
    this.addrLine1 = addrLine1;
    this.addrLine2 = addrLine2;
    this.city = city;
    this.country = country;
    this.id = id;
    this.locality = locality;
    this.postCodeExtension = postCodeExtension;
    this.postcode = postcode;
    this.stateOrProvince = stateOrProvince;
  }

    
  @JsonProperty("addrLine1")
  public String getAddrLine1() {
    return addrLine1;
  }
  public void setAddrLine1(String addrLine1) {
    this.addrLine1 = addrLine1;
  }

    
  @JsonProperty("addrLine2")
  public String getAddrLine2() {
    return addrLine2;
  }
  public void setAddrLine2(String addrLine2) {
    this.addrLine2 = addrLine2;
  }

    
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

    
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }
  public void setLocality(String locality) {
    this.locality = locality;
  }

    
  @JsonProperty("postCodeExtension")
  public String getPostCodeExtension() {
    return postCodeExtension;
  }
  public void setPostCodeExtension(String postCodeExtension) {
    this.postCodeExtension = postCodeExtension;
  }

    
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }
  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

    
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormattedAddress formattedAddress = (FormattedAddress) o;
    return Objects.equals(addrLine1, formattedAddress.addrLine1) &&
        Objects.equals(addrLine2, formattedAddress.addrLine2) &&
        Objects.equals(city, formattedAddress.city) &&
        Objects.equals(country, formattedAddress.country) &&
        Objects.equals(id, formattedAddress.id) &&
        Objects.equals(locality, formattedAddress.locality) &&
        Objects.equals(postCodeExtension, formattedAddress.postCodeExtension) &&
        Objects.equals(postcode, formattedAddress.postcode) &&
        Objects.equals(stateOrProvince, formattedAddress.stateOrProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrLine1, addrLine2, city, country, id, locality, postCodeExtension, postcode, stateOrProvince);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
