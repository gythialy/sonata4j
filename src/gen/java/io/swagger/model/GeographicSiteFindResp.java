package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "Technical structure to provide site list retrieve in the GET operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class GeographicSiteFindResp {

    private GeographicAddressFindResp geographicAddress = null;
    private String id = null;
    private String siteCompanyName = null;
    private String siteContactName = null;
    private String siteCustomerName = null;
    private String siteDescription = null;
    private String siteName = null;
    private String siteType = null;
    private Status status = null;

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("geographicAddress")
    public GeographicAddressFindResp getGeographicAddress() {
        return geographicAddress;
    }

    public void setGeographicAddress(GeographicAddressFindResp geographicAddress) {
        this.geographicAddress = geographicAddress;
    }

    /**
     * id of the site. This is coud be used in other API as a place
     **/

    @ApiModelProperty(value = "id of the site. This is coud be used in other API as a place")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Name of the relatedParty which has role &#39;Site Contact&#39; in the Site record.
     **/

    @ApiModelProperty(value = "Name of the relatedParty which has role 'Site Contact' in the Site record.")
    @JsonProperty("siteContactName")
    public String getSiteContactName() {
        return siteContactName;
    }

    public void setSiteContactName(String siteContactName) {
        this.siteContactName = siteContactName;
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
     * A textual description of the Service Site.
     **/

    @ApiModelProperty(value = "A textual description of the Service Site.")
    @JsonProperty("siteDescription")
    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
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
     * This defines whether a Service Site is public or private.
     **/

    @ApiModelProperty(value = "This defines whether a Service Site is public or private.")
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
        GeographicSiteFindResp geographicSiteFindResp = (GeographicSiteFindResp) o;
        return Objects.equals(geographicAddress, geographicSiteFindResp.geographicAddress) &&
                Objects.equals(id, geographicSiteFindResp.id) &&
                Objects.equals(siteCompanyName, geographicSiteFindResp.siteCompanyName) &&
                Objects.equals(siteContactName, geographicSiteFindResp.siteContactName) &&
                Objects.equals(siteCustomerName, geographicSiteFindResp.siteCustomerName) &&
                Objects.equals(siteDescription, geographicSiteFindResp.siteDescription) &&
                Objects.equals(siteName, geographicSiteFindResp.siteName) &&
                Objects.equals(siteType, geographicSiteFindResp.siteType) &&
                Objects.equals(status, geographicSiteFindResp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geographicAddress, id, siteCompanyName, siteContactName, siteCustomerName, siteDescription, siteName, siteType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSiteFindResp {\n");

        sb.append("    geographicAddress: ").append(toIndentedString(geographicAddress)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    siteCompanyName: ").append(toIndentedString(siteCompanyName)).append("\n");
        sb.append("    siteContactName: ").append(toIndentedString(siteContactName)).append("\n");
        sb.append("    siteCustomerName: ").append(toIndentedString(siteCustomerName)).append("\n");
        sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
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

