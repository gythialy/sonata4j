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

@ApiModel(description = "A CreateProductOrder object is provided as input to the product order create operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductOrderCreate {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private BillingAccountRef billingAccount = null;
    private Date buyerRequestDate = null;
    private DesiredOrderResponses desiredResponse = null;
    private Boolean expeditePriority = null;
    private String externalId = null;
    private List<Note> note = new ArrayList<Note>();
    private OrderActivity orderActivity = null;
    private List<ProductOrderItemCreate> orderItem = new ArrayList<ProductOrderItemCreate>();
    private String orderVersion = null;
    private PricingMethod pricingMethod = null;
    private String pricingReference = null;
    private Integer pricingTerm = null;
    private Integer priority = null;
    private String projectId = null;
    private String relatedBuyerPON = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedCompletionDate = null;
    private Date requestedStartDate = null;
    private String tspRestorationPriority = null;

    /**
     * Technical attribute to extend API
     **/

    @ApiModelProperty(value = "Technical attribute to extend API")
    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    /**
     * Technical attribute to extend API
     **/

    @ApiModelProperty(value = "Technical attribute to extend API")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Technical attribute to extend API
     **/

    @ApiModelProperty(value = "Technical attribute to extend API")
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

    @ApiModelProperty(value = "")
    @JsonProperty("billingAccount")
    public BillingAccountRef getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * Date when the order was submitted by the Buyer to the Seller
     **/

    @ApiModelProperty(required = true, value = "Date when the order was submitted by the Buyer to the Seller")
    @JsonProperty("buyerRequestDate")
    @NotNull
    public Date getBuyerRequestDate() {
        return buyerRequestDate;
    }

    public void setBuyerRequestDate(Date buyerRequestDate) {
        this.buyerRequestDate = buyerRequestDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("desiredResponse")
    @NotNull
    public DesiredOrderResponses getDesiredResponse() {
        return desiredResponse;
    }

    public void setDesiredResponse(DesiredOrderResponses desiredResponse) {
        this.desiredResponse = desiredResponse;
    }

    /**
     * Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.
     **/

    @ApiModelProperty(value = "Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.")
    @JsonProperty("expeditePriority")
    public Boolean isExpeditePriority() {
        return expeditePriority;
    }

    public void setExpeditePriority(Boolean expeditePriority) {
        this.expeditePriority = expeditePriority;
    }

    /**
     * Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer&#39;s enterprise
     **/

    @ApiModelProperty(required = true, value = "Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer's enterprise")
    @JsonProperty("externalId")
    @NotNull
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("orderActivity")
    @NotNull
    public OrderActivity getOrderActivity() {
        return orderActivity;
    }

    public void setOrderActivity(OrderActivity orderActivity) {
        this.orderActivity = orderActivity;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("orderItem")
    @NotNull
    @Size(min = 1)
    public List<ProductOrderItemCreate> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<ProductOrderItemCreate> orderItem) {
        this.orderItem = orderItem;
    }

    /**
     * Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.
     **/

    @ApiModelProperty(required = true, value = "Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.")
    @JsonProperty("orderVersion")
    @NotNull
    public String getOrderVersion() {
        return orderVersion;
    }

    public void setOrderVersion(String orderVersion) {
        this.orderVersion = orderVersion;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("pricingMethod")
    public PricingMethod getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(PricingMethod pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    /**
     * The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.
     **/

    @ApiModelProperty(value = "The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.")
    @JsonProperty("pricingReference")
    public String getPricingReference() {
        return pricingReference;
    }

    public void setPricingReference(String pricingReference) {
        this.pricingReference = pricingReference;
    }

    /**
     * The length of the contract in months
     **/

    @ApiModelProperty(value = "The length of the contract in months")
    @JsonProperty("pricingTerm")
    public Integer getPricingTerm() {
        return pricingTerm;
    }

    public void setPricingTerm(Integer pricingTerm) {
        this.pricingTerm = pricingTerm;
    }

    /**
     * An integer that specifies that expedited treatment is to be provided in a specific priority.
     **/

    @ApiModelProperty(value = "An integer that specifies that expedited treatment is to be provided in a specific priority.")
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.
     **/

    @ApiModelProperty(value = "An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.")
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.
     **/

    @ApiModelProperty(value = "Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.")
    @JsonProperty("relatedBuyerPON")
    public String getRelatedBuyerPON() {
        return relatedBuyerPON;
    }

    public void setRelatedBuyerPON(String relatedBuyerPON) {
        this.relatedBuyerPON = relatedBuyerPON;
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
     * Identifies the Buyer&#39;s desired due date (requested delivery date)
     **/

    @ApiModelProperty(required = true, value = "Identifies the Buyer's desired due date (requested delivery date)")
    @JsonProperty("requestedCompletionDate")
    @NotNull
    public Date getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    public void setRequestedCompletionDate(Date requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    /**
     * If specified, identifies the Buyer&#39;s desired date for order processing to start
     **/

    @ApiModelProperty(value = "If specified, identifies the Buyer's desired date for order processing to start")
    @JsonProperty("requestedStartDate")
    public Date getRequestedStartDate() {
        return requestedStartDate;
    }

    public void setRequestedStartDate(Date requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    /**
     * Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.
     **/

    @ApiModelProperty(value = "Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.")
    @JsonProperty("tspRestorationPriority")
    public String getTspRestorationPriority() {
        return tspRestorationPriority;
    }

    public void setTspRestorationPriority(String tspRestorationPriority) {
        this.tspRestorationPriority = tspRestorationPriority;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOrderCreate productOrderCreate = (ProductOrderCreate) o;
        return Objects.equals(baseType, productOrderCreate.baseType) &&
                Objects.equals(schemaLocation, productOrderCreate.schemaLocation) &&
                Objects.equals(type, productOrderCreate.type) &&
                Objects.equals(billingAccount, productOrderCreate.billingAccount) &&
                Objects.equals(buyerRequestDate, productOrderCreate.buyerRequestDate) &&
                Objects.equals(desiredResponse, productOrderCreate.desiredResponse) &&
                Objects.equals(expeditePriority, productOrderCreate.expeditePriority) &&
                Objects.equals(externalId, productOrderCreate.externalId) &&
                Objects.equals(note, productOrderCreate.note) &&
                Objects.equals(orderActivity, productOrderCreate.orderActivity) &&
                Objects.equals(orderItem, productOrderCreate.orderItem) &&
                Objects.equals(orderVersion, productOrderCreate.orderVersion) &&
                Objects.equals(pricingMethod, productOrderCreate.pricingMethod) &&
                Objects.equals(pricingReference, productOrderCreate.pricingReference) &&
                Objects.equals(pricingTerm, productOrderCreate.pricingTerm) &&
                Objects.equals(priority, productOrderCreate.priority) &&
                Objects.equals(projectId, productOrderCreate.projectId) &&
                Objects.equals(relatedBuyerPON, productOrderCreate.relatedBuyerPON) &&
                Objects.equals(relatedParty, productOrderCreate.relatedParty) &&
                Objects.equals(requestedCompletionDate, productOrderCreate.requestedCompletionDate) &&
                Objects.equals(requestedStartDate, productOrderCreate.requestedStartDate) &&
                Objects.equals(tspRestorationPriority, productOrderCreate.tspRestorationPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseType, schemaLocation, type, billingAccount, buyerRequestDate, desiredResponse, expeditePriority, externalId, note, orderActivity, orderItem, orderVersion, pricingMethod, pricingReference, pricingTerm, priority, projectId, relatedBuyerPON, relatedParty, requestedCompletionDate, requestedStartDate, tspRestorationPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrderCreate {\n");

        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("    buyerRequestDate: ").append(toIndentedString(buyerRequestDate)).append("\n");
        sb.append("    desiredResponse: ").append(toIndentedString(desiredResponse)).append("\n");
        sb.append("    expeditePriority: ").append(toIndentedString(expeditePriority)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    orderActivity: ").append(toIndentedString(orderActivity)).append("\n");
        sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
        sb.append("    orderVersion: ").append(toIndentedString(orderVersion)).append("\n");
        sb.append("    pricingMethod: ").append(toIndentedString(pricingMethod)).append("\n");
        sb.append("    pricingReference: ").append(toIndentedString(pricingReference)).append("\n");
        sb.append("    pricingTerm: ").append(toIndentedString(pricingTerm)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    relatedBuyerPON: ").append(toIndentedString(relatedBuyerPON)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
        sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
        sb.append("    tspRestorationPriority: ").append(toIndentedString(tspRestorationPriority)).append("\n");
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

