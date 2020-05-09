package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail. For example “street number” is one field, “street name” is another field, etc. This structure is used in the request addressValidation only")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class FieldedAddressRequest {

    private String city = null;
    private String country = null;
    private GeographicSubAddressRequest geographicSubAddress = null;
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

    /**
     * City that the address is in
     **/

    @ApiModelProperty(value = "City that the address is in")
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Country that the address is in
     **/

    @ApiModelProperty(value = "Country that the address is in")
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("geographicSubAddress")
    public GeographicSubAddressRequest getGeographicSubAddress() {
        return geographicSubAddress;
    }

    public void setGeographicSubAddress(GeographicSubAddressRequest geographicSubAddress) {
        this.geographicSubAddress = geographicSubAddress;
    }

    /**
     * \&quot;An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi-rural in nature.\&quot; [ANZLIC-STREET], or a suburb \&quot;a bounded locality within a city, town or shire principally of urban character \&quot; [ANZLICSTREET].
     **/

    @ApiModelProperty(value = "\"An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi-rural in nature.\" [ANZLIC-STREET], or a suburb \"a bounded locality within a city, town or shire principally of urban character \" [ANZLICSTREET].")
    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * The four-digit extension on an American postal code, what comes after the hyphen when specified.
     **/

    @ApiModelProperty(value = "The four-digit extension on an American postal code, what comes after the hyphen when specified.")
    @JsonProperty("postCodeExtension")
    public String getPostCodeExtension() {
        return postCodeExtension;
    }

    public void setPostCodeExtension(String postCodeExtension) {
        this.postCodeExtension = postCodeExtension;
    }

    /**
     * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
     **/

    @ApiModelProperty(value = "Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)")
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * The State or Province that the address is in
     **/

    @ApiModelProperty(value = "The State or Province that the address is in")
    @JsonProperty("stateOrProvince")
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * Name of the street or other street type
     **/

    @ApiModelProperty(value = "Name of the street or other street type")
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
     **/

    @ApiModelProperty(value = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses")
    @JsonProperty("streetNr")
    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    /**
     * Last number in a range of street numbers allocated to a property
     **/

    @ApiModelProperty(value = "Last number in a range of street numbers allocated to a property")
    @JsonProperty("streetNrLast")
    public String getStreetNrLast() {
        return streetNrLast;
    }

    public void setStreetNrLast(String streetNrLast) {
        this.streetNrLast = streetNrLast;
    }

    /**
     * Last street number suffix for a ranged address
     **/

    @ApiModelProperty(value = "Last street number suffix for a ranged address")
    @JsonProperty("streetNrLastSuffix")
    public String getStreetNrLastSuffix() {
        return streetNrLastSuffix;
    }

    public void setStreetNrLastSuffix(String streetNrLastSuffix) {
        this.streetNrLastSuffix = streetNrLastSuffix;
    }

    /**
     * The first street number suffix
     **/

    @ApiModelProperty(value = "The first street number suffix")
    @JsonProperty("streetNrSuffix")
    public String getStreetNrSuffix() {
        return streetNrSuffix;
    }

    public void setStreetNrSuffix(String streetNrSuffix) {
        this.streetNrSuffix = streetNrSuffix;
    }

    /**
     * A modifier denoting a relative direction
     **/

    @ApiModelProperty(value = "A modifier denoting a relative direction")
    @JsonProperty("streetSuffix")
    public String getStreetSuffix() {
        return streetSuffix;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    /**
     * Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
     **/

    @ApiModelProperty(value = "Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf")
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
        FieldedAddressRequest fieldedAddressRequest = (FieldedAddressRequest) o;
        return Objects.equals(city, fieldedAddressRequest.city) &&
                Objects.equals(country, fieldedAddressRequest.country) &&
                Objects.equals(geographicSubAddress, fieldedAddressRequest.geographicSubAddress) &&
                Objects.equals(locality, fieldedAddressRequest.locality) &&
                Objects.equals(postCodeExtension, fieldedAddressRequest.postCodeExtension) &&
                Objects.equals(postcode, fieldedAddressRequest.postcode) &&
                Objects.equals(stateOrProvince, fieldedAddressRequest.stateOrProvince) &&
                Objects.equals(streetName, fieldedAddressRequest.streetName) &&
                Objects.equals(streetNr, fieldedAddressRequest.streetNr) &&
                Objects.equals(streetNrLast, fieldedAddressRequest.streetNrLast) &&
                Objects.equals(streetNrLastSuffix, fieldedAddressRequest.streetNrLastSuffix) &&
                Objects.equals(streetNrSuffix, fieldedAddressRequest.streetNrSuffix) &&
                Objects.equals(streetSuffix, fieldedAddressRequest.streetSuffix) &&
                Objects.equals(streetType, fieldedAddressRequest.streetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, geographicSubAddress, locality, postCodeExtension, postcode, stateOrProvince, streetName, streetNr, streetNrLast, streetNrLastSuffix, streetNrSuffix, streetSuffix, streetType);
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

