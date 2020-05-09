package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class FormattedAddress {

    private String addrLine1 = null;
    private String addrLine2 = null;
    private String city = null;
    private String country = null;
    private String id = null;
    private String locality = null;
    private String postCodeExtension = null;
    private String postcode = null;
    private String stateOrProvince = null;

    /**
     * The first address line in a formatted address
     **/

    @ApiModelProperty(required = true, value = "The first address line in a formatted address")
    @JsonProperty("addrLine1")
    @NotNull
    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    /**
     * The second address line in a formatted address
     **/

    @ApiModelProperty(value = "The second address line in a formatted address")
    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

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
     * Unique identifier of the address
     **/

    @ApiModelProperty(value = "Unique identifier of the address")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

