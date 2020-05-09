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

@ApiModel(description = "A grouping of POQ Items formulated into a request made by a Buyer to a Seller")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOfferingQualification {

    private String schemaLocation = null;
    private String type = null;
    private Date effectiveQualificationCompletionDate = null;
    private Date expectedResponseDate = null;
    private String href = null;
    private String id = null;
    private Boolean instantSyncQualification = false;
    private List<ProductOfferingQualificationItem> productOfferingQualificationItem = new ArrayList<ProductOfferingQualificationItem>();
    private String projectId = null;
    private Boolean provideAlternative = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedResponseDate = null;
    private ProductOfferingQualificationStateType state = null;
    private List<StateChange> stateChange = new ArrayList<StateChange>();

    /**
     * Technical attribute to extend the class
     **/

    @ApiModelProperty(value = "Technical attribute to extend the class")
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
     * Effective date seller provides qualification result.
     **/

    @ApiModelProperty(value = "Effective date seller provides qualification result.")
    @JsonProperty("effectiveQualificationCompletionDate")
    public Date getEffectiveQualificationCompletionDate() {
        return effectiveQualificationCompletionDate;
    }

    public void setEffectiveQualificationCompletionDate(Date effectiveQualificationCompletionDate) {
        this.effectiveQualificationCompletionDate = effectiveQualificationCompletionDate;
    }

    /**
     * The date the seller is expected to provide qualification result.
     **/

    @ApiModelProperty(value = "The date the seller is expected to provide qualification result.")
    @JsonProperty("expectedResponseDate")
    public Date getExpectedResponseDate() {
        return expectedResponseDate;
    }

    public void setExpectedResponseDate(Date expectedResponseDate) {
        this.expectedResponseDate = expectedResponseDate;
    }

    /**
     * Link to this POQ resource
     **/

    @ApiModelProperty(value = "Link to this POQ resource")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * The Serviceability Request&#39;s unique identifier.
     **/

    @ApiModelProperty(required = true, value = "The Serviceability Request's unique identifier.")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * If this flag is set to Yes, Buyer requests to have instant qualificationto be provided in operation POST response
     **/

    @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant qualificationto be provided in operation POST response")
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
    public List<ProductOfferingQualificationItem> getProductOfferingQualificationItem() {
        return productOfferingQualificationItem;
    }

    public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItem> productOfferingQualificationItem) {
        this.productOfferingQualificationItem = productOfferingQualificationItem;
    }

    /**
     * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
     **/

    @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.")
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

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public ProductOfferingQualificationStateType getState() {
        return state;
    }

    public void setState(ProductOfferingQualificationStateType state) {
        this.state = state;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("stateChange")
    public List<StateChange> getStateChange() {
        return stateChange;
    }

    public void setStateChange(List<StateChange> stateChange) {
        this.stateChange = stateChange;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOfferingQualification productOfferingQualification = (ProductOfferingQualification) o;
        return Objects.equals(schemaLocation, productOfferingQualification.schemaLocation) &&
                Objects.equals(type, productOfferingQualification.type) &&
                Objects.equals(effectiveQualificationCompletionDate, productOfferingQualification.effectiveQualificationCompletionDate) &&
                Objects.equals(expectedResponseDate, productOfferingQualification.expectedResponseDate) &&
                Objects.equals(href, productOfferingQualification.href) &&
                Objects.equals(id, productOfferingQualification.id) &&
                Objects.equals(instantSyncQualification, productOfferingQualification.instantSyncQualification) &&
                Objects.equals(productOfferingQualificationItem, productOfferingQualification.productOfferingQualificationItem) &&
                Objects.equals(projectId, productOfferingQualification.projectId) &&
                Objects.equals(provideAlternative, productOfferingQualification.provideAlternative) &&
                Objects.equals(relatedParty, productOfferingQualification.relatedParty) &&
                Objects.equals(requestedResponseDate, productOfferingQualification.requestedResponseDate) &&
                Objects.equals(state, productOfferingQualification.state) &&
                Objects.equals(stateChange, productOfferingQualification.stateChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, effectiveQualificationCompletionDate, expectedResponseDate, href, id, instantSyncQualification, productOfferingQualificationItem, projectId, provideAlternative, relatedParty, requestedResponseDate, state, stateChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingQualification {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    effectiveQualificationCompletionDate: ").append(toIndentedString(effectiveQualificationCompletionDate)).append("\n");
        sb.append("    expectedResponseDate: ").append(toIndentedString(expectedResponseDate)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instantSyncQualification: ").append(toIndentedString(instantSyncQualification)).append("\n");
        sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    provideAlternative: ").append(toIndentedString(provideAlternative)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
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

