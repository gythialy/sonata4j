package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "Designated as Service Site in TS. A fixed physical location at which a Product can be installed.  Its location can be described either with geocodes (Lat/Long information) or by association with an Address or Address Reference.  This association may include a Sub-address describing where within that Address or Address Reference, this particular Service Site is located.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class GeographicSite {

    private String schemaLocation = null;
    private String type = null;
    private String additionnalSiteInformation = null;
    private String description = null;
    private FieldedAddress fieldedAddress = null;
    private FormattedAddress formattedAdress = null;
    private GeographicLocation geographicLocation = null;
    private String id = null;
    private ReferencedAddress referencedAddress = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private String siteCompanyName = null;
    private String siteCustomerName = null;
    private String siteName = null;
    private String siteType = null;
    private Status status = null;

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
     * Additional site information
     **/

    @ApiModelProperty(value = "Additional site information")
    @JsonProperty("additionnalSiteInformation")
    public String getAdditionnalSiteInformation() {
        return additionnalSiteInformation;
    }

    public void setAdditionnalSiteInformation(String additionnalSiteInformation) {
        this.additionnalSiteInformation = additionnalSiteInformation;
    }

    /**
     * A textual description of the Service Site.
     **/

    @ApiModelProperty(value = "A textual description of the Service Site.")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @JsonProperty("formattedAdress")
    public FormattedAddress getFormattedAdress() {
        return formattedAdress;
    }

    public void setFormattedAdress(FormattedAddress formattedAdress) {
        this.formattedAdress = formattedAdress;
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
     * Identifier of the Service Site unique within the Seller.
     **/

    @ApiModelProperty(value = "Identifier of the Service Site unique within the Seller.")
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

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)
     **/

    @ApiModelProperty(value = "The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)")
    @JsonProperty("siteCompanyName")
    public String getSiteCompanyName() {
        return siteCompanyName;
    }

    public void setSiteCompanyName(String siteCompanyName) {
        this.siteCompanyName = siteCompanyName;
    }

    /**
     * The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
     **/

    @ApiModelProperty(value = "The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).")
    @JsonProperty("siteCustomerName")
    public String getSiteCustomerName() {
        return siteCustomerName;
    }

    public void setSiteCustomerName(String siteCustomerName) {
        this.siteCustomerName = siteCustomerName;
    }

    /**
     * A name commonly used by people to refer to this Service Site.
     **/

    @ApiModelProperty(value = "A name commonly used by people to refer to this Service Site.")
    @JsonProperty("siteName")
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.
     **/

    @ApiModelProperty(value = "This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.")
    @JsonProperty("siteType")
    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicSite geographicSite = (GeographicSite) o;
        return Objects.equals(schemaLocation, geographicSite.schemaLocation) &&
                Objects.equals(type, geographicSite.type) &&
                Objects.equals(additionnalSiteInformation, geographicSite.additionnalSiteInformation) &&
                Objects.equals(description, geographicSite.description) &&
                Objects.equals(fieldedAddress, geographicSite.fieldedAddress) &&
                Objects.equals(formattedAdress, geographicSite.formattedAdress) &&
                Objects.equals(geographicLocation, geographicSite.geographicLocation) &&
                Objects.equals(id, geographicSite.id) &&
                Objects.equals(referencedAddress, geographicSite.referencedAddress) &&
                Objects.equals(relatedParty, geographicSite.relatedParty) &&
                Objects.equals(siteCompanyName, geographicSite.siteCompanyName) &&
                Objects.equals(siteCustomerName, geographicSite.siteCustomerName) &&
                Objects.equals(siteName, geographicSite.siteName) &&
                Objects.equals(siteType, geographicSite.siteType) &&
                Objects.equals(status, geographicSite.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, additionnalSiteInformation, description, fieldedAddress, formattedAdress, geographicLocation, id, referencedAddress, relatedParty, siteCompanyName, siteCustomerName, siteName, siteType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSite {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    additionnalSiteInformation: ").append(toIndentedString(additionnalSiteInformation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
        sb.append("    formattedAdress: ").append(toIndentedString(formattedAdress)).append("\n");
        sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    referencedAddress: ").append(toIndentedString(referencedAddress)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    siteCompanyName: ").append(toIndentedString(siteCompanyName)).append("\n");
        sb.append("    siteCustomerName: ").append(toIndentedString(siteCustomerName)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

