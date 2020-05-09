package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOfferingQualificationItem {

    private String type = null;
    private ProductActionType action = null;
    private List<AlternateProductProposal> alternateProductProposal = new ArrayList<AlternateProductProposal>();
    private List<ProductOfferingRef> eligibleProductOffering = new ArrayList<ProductOfferingRef>();
    private Date guaranteedUntilDate = null;
    private String id = null;
    private TimeInterval installationInterval = null;
    private Product product = null;
    private ProductOfferingRef productOffering = null;
    private List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship = new ArrayList<ProductOfferingQualificationItemRelationship>();
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private String serviceConfidenceReason = null;
    private ServiceabilityColor serviceabilityConfidence = null;
    private ProductOfferingQualificationItemStateType state = null;
    private List<StateChange> stateChange = new ArrayList<StateChange>();
    private List<TerminationError> terminationError = new ArrayList<TerminationError>();

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
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("action")
    @NotNull
    public ProductActionType getAction() {
        return action;
    }

    public void setAction(ProductActionType action) {
        this.action = action;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("alternateProductProposal")
    public List<AlternateProductProposal> getAlternateProductProposal() {
        return alternateProductProposal;
    }

    public void setAlternateProductProposal(List<AlternateProductProposal> alternateProductProposal) {
        this.alternateProductProposal = alternateProductProposal;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("eligibleProductOffering")
    public List<ProductOfferingRef> getEligibleProductOffering() {
        return eligibleProductOffering;
    }

    public void setEligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
        this.eligibleProductOffering = eligibleProductOffering;
    }

    /**
     * Date until seller is guaranted the qualification result.
     **/

    @ApiModelProperty(value = "Date until seller is guaranted the qualification result.")
    @JsonProperty("guaranteedUntilDate")
    public Date getGuaranteedUntilDate() {
        return guaranteedUntilDate;
    }

    public void setGuaranteedUntilDate(Date guaranteedUntilDate) {
        this.guaranteedUntilDate = guaranteedUntilDate;
    }

    /**
     * Id of this POQ item
     **/

    @ApiModelProperty(required = true, value = "Id of this POQ item")
    @JsonProperty("id")
    @NotNull
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
    @JsonProperty("installationInterval")
    public TimeInterval getInstallationInterval() {
        return installationInterval;
    }

    public void setInstallationInterval(TimeInterval installationInterval) {
        this.installationInterval = installationInterval;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productOffering")
    public ProductOfferingRef getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(ProductOfferingRef productOffering) {
        this.productOffering = productOffering;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productOfferingQualificationItemRelationship")
    public List<ProductOfferingQualificationItemRelationship> getProductOfferingQualificationItemRelationship() {
        return productOfferingQualificationItemRelationship;
    }

    public void setProductOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
        this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
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
     * A description of the reason a particular color is being provided. This may include a specific standard reason codes and descriptions.
     **/

    @ApiModelProperty(value = "A description of the reason a particular color is being provided. This may include a specific standard reason codes and descriptions.")
    @JsonProperty("serviceConfidenceReason")
    public String getServiceConfidenceReason() {
        return serviceConfidenceReason;
    }

    public void setServiceConfidenceReason(String serviceConfidenceReason) {
        this.serviceConfidenceReason = serviceConfidenceReason;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("serviceabilityConfidence")
    public ServiceabilityColor getServiceabilityConfidence() {
        return serviceabilityConfidence;
    }

    public void setServiceabilityConfidence(ServiceabilityColor serviceabilityConfidence) {
        this.serviceabilityConfidence = serviceabilityConfidence;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public ProductOfferingQualificationItemStateType getState() {
        return state;
    }

    public void setState(ProductOfferingQualificationItemStateType state) {
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

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("terminationError")
    public List<TerminationError> getTerminationError() {
        return terminationError;
    }

    public void setTerminationError(List<TerminationError> terminationError) {
        this.terminationError = terminationError;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOfferingQualificationItem productOfferingQualificationItem = (ProductOfferingQualificationItem) o;
        return Objects.equals(type, productOfferingQualificationItem.type) &&
                Objects.equals(action, productOfferingQualificationItem.action) &&
                Objects.equals(alternateProductProposal, productOfferingQualificationItem.alternateProductProposal) &&
                Objects.equals(eligibleProductOffering, productOfferingQualificationItem.eligibleProductOffering) &&
                Objects.equals(guaranteedUntilDate, productOfferingQualificationItem.guaranteedUntilDate) &&
                Objects.equals(id, productOfferingQualificationItem.id) &&
                Objects.equals(installationInterval, productOfferingQualificationItem.installationInterval) &&
                Objects.equals(product, productOfferingQualificationItem.product) &&
                Objects.equals(productOffering, productOfferingQualificationItem.productOffering) &&
                Objects.equals(productOfferingQualificationItemRelationship, productOfferingQualificationItem.productOfferingQualificationItemRelationship) &&
                Objects.equals(relatedParty, productOfferingQualificationItem.relatedParty) &&
                Objects.equals(serviceConfidenceReason, productOfferingQualificationItem.serviceConfidenceReason) &&
                Objects.equals(serviceabilityConfidence, productOfferingQualificationItem.serviceabilityConfidence) &&
                Objects.equals(state, productOfferingQualificationItem.state) &&
                Objects.equals(stateChange, productOfferingQualificationItem.stateChange) &&
                Objects.equals(terminationError, productOfferingQualificationItem.terminationError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, action, alternateProductProposal, eligibleProductOffering, guaranteedUntilDate, id, installationInterval, product, productOffering, productOfferingQualificationItemRelationship, relatedParty, serviceConfidenceReason, serviceabilityConfidence, state, stateChange, terminationError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingQualificationItem {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    alternateProductProposal: ").append(toIndentedString(alternateProductProposal)).append("\n");
        sb.append("    eligibleProductOffering: ").append(toIndentedString(eligibleProductOffering)).append("\n");
        sb.append("    guaranteedUntilDate: ").append(toIndentedString(guaranteedUntilDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    installationInterval: ").append(toIndentedString(installationInterval)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
        sb.append("    productOfferingQualificationItemRelationship: ").append(toIndentedString(productOfferingQualificationItemRelationship)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    serviceConfidenceReason: ").append(toIndentedString(serviceConfidenceReason)).append("\n");
        sb.append("    serviceabilityConfidence: ").append(toIndentedString(serviceabilityConfidence)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
        sb.append("    terminationError: ").append(toIndentedString(terminationError)).append("\n");
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

