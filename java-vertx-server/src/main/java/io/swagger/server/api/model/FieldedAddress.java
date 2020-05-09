package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.GeographicSubAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail. For example “street number” is one field, “street name” is another field, etc.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class FieldedAddress   {
  
  private String city = null;
  private String country = null;
  private List<GeographicSubAddress> geographicSubAddress = new ArrayList<>();
  private String id = null;
  private String locality = null;
  private String postCodeExtension = null;
  private String postcode = null;
  private String stateOrProvince = null;
  private String streetName = null;
  private String streetNr = null;
  private String streetNrLast = null;
  private String streetNrLastSuffix = null;
  private String streetNrSuffix = null;
  private String streetSuffix = null;
  private String streetType = null;

  public FieldedAddress () {

  }

  public FieldedAddress (String city, String country, List<GeographicSubAddress> geographicSubAddress, String id, String locality, String postCodeExtension, String postcode, String stateOrProvince, String streetName, String streetNr, String streetNrLast, String streetNrLastSuffix, String streetNrSuffix, String streetSuffix, String streetType) {
    this.city = city;
    this.country = country;
    this.geographicSubAddress = geographicSubAddress;
    this.id = id;
    this.locality = locality;
    this.postCodeExtension = postCodeExtension;
    this.postcode = postcode;
    this.stateOrProvince = stateOrProvince;
    this.streetName = streetName;
    this.streetNr = streetNr;
    this.streetNrLast = streetNrLast;
    this.streetNrLastSuffix = streetNrLastSuffix;
    this.streetNrSuffix = streetNrSuffix;
    this.streetSuffix = streetSuffix;
    this.streetType = streetType;
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

    
  @JsonProperty("geographicSubAddress")
  public List<GeographicSubAddress> getGeographicSubAddress() {
    return geographicSubAddress;
  }
  public void setGeographicSubAddress(List<GeographicSubAddress> geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
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

    
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

    
  @JsonProperty("streetNr")
  public String getStreetNr() {
    return streetNr;
  }
  public void setStreetNr(String streetNr) {
    this.streetNr = streetNr;
  }

    
  @JsonProperty("streetNrLast")
  public String getStreetNrLast() {
    return streetNrLast;
  }
  public void setStreetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

    
  @JsonProperty("streetNrLastSuffix")
  public String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }
  public void setStreetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

    
  @JsonProperty("streetNrSuffix")
  public String getStreetNrSuffix() {
    return streetNrSuffix;
  }
  public void setStreetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

    
  @JsonProperty("streetSuffix")
  public String getStreetSuffix() {
    return streetSuffix;
  }
  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

    
  @JsonProperty("streetType")
  public String getStreetType() {
    return streetType;
  }
  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldedAddress fieldedAddress = (FieldedAddress) o;
    return Objects.equals(city, fieldedAddress.city) &&
        Objects.equals(country, fieldedAddress.country) &&
        Objects.equals(geographicSubAddress, fieldedAddress.geographicSubAddress) &&
        Objects.equals(id, fieldedAddress.id) &&
        Objects.equals(locality, fieldedAddress.locality) &&
        Objects.equals(postCodeExtension, fieldedAddress.postCodeExtension) &&
        Objects.equals(postcode, fieldedAddress.postcode) &&
        Objects.equals(stateOrProvince, fieldedAddress.stateOrProvince) &&
        Objects.equals(streetName, fieldedAddress.streetName) &&
        Objects.equals(streetNr, fieldedAddress.streetNr) &&
        Objects.equals(streetNrLast, fieldedAddress.streetNrLast) &&
        Objects.equals(streetNrLastSuffix, fieldedAddress.streetNrLastSuffix) &&
        Objects.equals(streetNrSuffix, fieldedAddress.streetNrSuffix) &&
        Objects.equals(streetSuffix, fieldedAddress.streetSuffix) &&
        Objects.equals(streetType, fieldedAddress.streetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, geographicSubAddress, id, locality, postCodeExtension, postcode, stateOrProvince, streetName, streetNr, streetNrLast, streetNrLastSuffix, streetNrSuffix, streetSuffix, streetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldedAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
