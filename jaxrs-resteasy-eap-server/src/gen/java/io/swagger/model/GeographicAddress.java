package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "An address is a structured textual way of describing how to find a Property in an urban area (country properties are often defined differently)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class GeographicAddress {

    private String schemaLocation = null;
    private String type = null;
    private Boolean allowsNewSite = null;
    private FieldedAddress fieldedAddress = null;
    private FormattedAddress formattedAddress = null;
    private GeographicLocation geographicLocation = null;
    private Boolean hasPublicSite = null;
    private String id = null;
    private ReferencedAddress referencedAddress = null;

    /**
     * Technical attribute to extend this class
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Technical attribute to extend this class
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * This attribute specifies if a Buyer must use one of the known existing Service Sites at this location for any Products delivered to this Address.  For example, if a particular building owner mandated that all interconnects be done in a shared Public Meet-Me-Room, this attribute would be set to False for that Address.
     **/

    @ApiModelProperty(value = "This attribute specifies if a Buyer must use one of the known existing Service Sites at this location for any Products delivered to this Address.  For example, if a particular building owner mandated that all interconnects be done in a shared Public Meet-Me-Room, this attribute would be set to False for that Address.")
    @JsonProperty("allowsNewSite")
    public Boolean isAllowsNewSite() {
        return allowsNewSite;
    }

    public void setAllowsNewSite(Boolean allowsNewSite) {
        this.allowsNewSite = allowsNewSite;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("fieldedAddress")
    public FieldedAddress getFieldedAddress() {
        return fieldedAddress;
    }

    public void setFieldedAddress(FieldedAddress fieldedAddress) {
        this.fieldedAddress = fieldedAddress;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("formattedAddress")
    public FormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(FormattedAddress formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("geographicLocation")
    public GeographicLocation getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(GeographicLocation geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    /**
     * This attribute specifies if that Address contains Service Sites that are public such as Meet-Me-Rooms at an interconnect location or a shared telecom room in the basement of a multi-tenant building.
     **/

    @ApiModelProperty(value = "This attribute specifies if that Address contains Service Sites that are public such as Meet-Me-Rooms at an interconnect location or a shared telecom room in the basement of a multi-tenant building.")
    @JsonProperty("hasPublicSite")
    public Boolean isHasPublicSite() {
        return hasPublicSite;
    }

    public void setHasPublicSite(Boolean hasPublicSite) {
        this.hasPublicSite = hasPublicSite;
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
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("referencedAddress")
    public ReferencedAddress getReferencedAddress() {
        return referencedAddress;
    }

    public void setReferencedAddress(ReferencedAddress referencedAddress) {
        this.referencedAddress = referencedAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicAddress geographicAddress = (GeographicAddress) o;
        return Objects.equals(schemaLocation, geographicAddress.schemaLocation) &&
                Objects.equals(type, geographicAddress.type) &&
                Objects.equals(allowsNewSite, geographicAddress.allowsNewSite) &&
                Objects.equals(fieldedAddress, geographicAddress.fieldedAddress) &&
                Objects.equals(formattedAddress, geographicAddress.formattedAddress) &&
                Objects.equals(geographicLocation, geographicAddress.geographicLocation) &&
                Objects.equals(hasPublicSite, geographicAddress.hasPublicSite) &&
                Objects.equals(id, geographicAddress.id) &&
                Objects.equals(referencedAddress, geographicAddress.referencedAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, allowsNewSite, fieldedAddress, formattedAddress, geographicLocation, hasPublicSite, id, referencedAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicAddress {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    allowsNewSite: ").append(toIndentedString(allowsNewSite)).append("\n");
        sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
        sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
        sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
        sb.append("    hasPublicSite: ").append(toIndentedString(hasPublicSite)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    referencedAddress: ").append(toIndentedString(referencedAddress)).append("\n");
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

