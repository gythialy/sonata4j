package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "This structure serves as a request for a product offering qualification. A POQ is a grouping of POQ Items formulated into a request made by a Buyer to a Seller")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOfferingQualificationCreate {

    private String schemaLocation = null;
    private String type = null;
    private Boolean instantSyncQualification = false;
    private List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem = new ArrayList<ProductOfferingQualificationItemCreate>();
    private String projectId = null;
    private Boolean provideAlternative = false;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedResponseDate = null;

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
     * When sub-classing, this defines the sub-class entity name
     **/

    @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response
     **/

    @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response")
    @JsonProperty("instantSyncQualification")
    public Boolean isInstantSyncQualification() {
        return instantSyncQualification;
    }

    public void setInstantSyncQualification(Boolean instantSyncQualification) {
        this.instantSyncQualification = instantSyncQualification;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("productOfferingQualificationItem")
    @NotNull
    @Size(min = 1)
    public List<ProductOfferingQualificationItemCreate> getProductOfferingQualificationItem() {
        return productOfferingQualificationItem;
    }

    public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem) {
        this.productOfferingQualificationItem = productOfferingQualificationItem;
    }

    /**
     * This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.
     **/

    @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.")
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.
     **/

    @ApiModelProperty(value = "This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.")
    @JsonProperty("provideAlternative")
    public Boolean isProvideAlternative() {
        return provideAlternative;
    }

    public void setProvideAlternative(Boolean provideAlternative) {
        this.provideAlternative = provideAlternative;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("relatedParty")
    @NotNull
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * Corresponds to desiredResponseDate - The date a response for the service request is desired.
     **/

    @ApiModelProperty(value = "Corresponds to desiredResponseDate - The date a response for the service request is desired.")
    @JsonProperty("requestedResponseDate")
    public Date getRequestedResponseDate() {
        return requestedResponseDate;
    }

    public void setRequestedResponseDate(Date requestedResponseDate) {
        this.requestedResponseDate = requestedResponseDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOfferingQualificationCreate productOfferingQualificationCreate = (ProductOfferingQualificationCreate) o;
        return Objects.equals(schemaLocation, productOfferingQualificationCreate.schemaLocation) &&
                Objects.equals(type, productOfferingQualificationCreate.type) &&
                Objects.equals(instantSyncQualification, productOfferingQualificationCreate.instantSyncQualification) &&
                Objects.equals(productOfferingQualificationItem, productOfferingQualificationCreate.productOfferingQualificationItem) &&
                Objects.equals(projectId, productOfferingQualificationCreate.projectId) &&
                Objects.equals(provideAlternative, productOfferingQualificationCreate.provideAlternative) &&
                Objects.equals(relatedParty, productOfferingQualificationCreate.relatedParty) &&
                Objects.equals(requestedResponseDate, productOfferingQualificationCreate.requestedResponseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, instantSyncQualification, productOfferingQualificationItem, projectId, provideAlternative, relatedParty, requestedResponseDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingQualificationCreate {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instantSyncQualification: ").append(toIndentedString(instantSyncQualification)).append("\n");
        sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    provideAlternative: ").append(toIndentedString(provideAlternative)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
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

