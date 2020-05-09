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

@ApiModel(description = "A ProductOrder is a type of business interaction that is used to procure a Product based upon a Product Offering.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOrder {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private BillingAccountRef billingAccount = null;
    private Date buyerRequestDate = null;
    private Date cancellationDate = null;
    private String cancellationReason = null;
    private Date completionDate = null;
    private DesiredOrderResponses desiredResponses = null;
    private Date expectedCompletionDate = null;
    private Boolean expeditePriority = null;
    private String externalId = null;
    private String href = null;
    private String id = null;
    private List<Note> note = new ArrayList<Note>();
    private OrderActivity orderActivity = null;
    private Date orderDate = null;
    private List<OrderItem> orderItem = new ArrayList<OrderItem>();
    private List<OrderMessage> orderMessage = new ArrayList<OrderMessage>();
    private String orderVersion = "1";
    private PricingMethod pricingMethod = null;
    private String pricingReference = null;
    private Integer pricingTerm = null;
    private Integer priority = null;
    private String projectId = null;
    private String relatedBuyerPON = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedCompletionDate = null;
    private Date requestedStartDate = null;
    private ProductOrderStateType state = null;
    private List<StateChange> stateChange = new ArrayList<StateChange>();
    private String tspRestorationPriority = null;

    /**
     * Technical attribute to extend the API
     **/

    @ApiModelProperty(value = "Technical attribute to extend the API")
    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    /**
     * Technical attribute to extend the API
     **/

    @ApiModelProperty(value = "Technical attribute to extend the API")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Technical attribute to extend the API
     **/

    @ApiModelProperty(value = "Technical attribute to extend the API")
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
     * Buyer order creation date. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
     **/

    @ApiModelProperty(value = "Buyer order creation date. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)")
    @JsonProperty("buyerRequestDate")
    public Date getBuyerRequestDate() {
        return buyerRequestDate;
    }

    public void setBuyerRequestDate(Date buyerRequestDate) {
        this.buyerRequestDate = buyerRequestDate;
    }

    /**
     * Identifies the date the Seller canceled the Order
     **/

    @ApiModelProperty(value = "Identifies the date the Seller canceled the Order")
    @JsonProperty("cancellationDate")
    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    /**
     * Indicates reason why buyer requested cancellation
     **/

    @ApiModelProperty(value = "Indicates reason why buyer requested cancellation")
    @JsonProperty("cancellationReason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    /**
     * The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
     **/

    @ApiModelProperty(value = "The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)")
    @JsonProperty("completionDate")
    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("desiredResponses")
    @NotNull
    public DesiredOrderResponses getDesiredResponses() {
        return desiredResponses;
    }

    public void setDesiredResponses(DesiredOrderResponses desiredResponses) {
        this.desiredResponses = desiredResponses;
    }

    /**
     * Expected delivery date amended by the provider
     **/

    @ApiModelProperty(value = "Expected delivery date amended by the provider")
    @JsonProperty("expectedCompletionDate")
    public Date getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    public void setExpectedCompletionDate(Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
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
     * A number that uniquely identifies an order within the buyer&#39;s enterprise.
     **/

    @ApiModelProperty(required = true, value = "A number that uniquely identifies an order within the buyer's enterprise.")
    @JsonProperty("externalId")
    @NotNull
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Hyperlink to access the order
     **/

    @ApiModelProperty(required = true, value = "Hyperlink to access the order")
    @JsonProperty("href")
    @NotNull
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted.
     **/

    @ApiModelProperty(required = true, value = "Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted.")
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
     * Date when the order was created by seller. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
     **/

    @ApiModelProperty(required = true, value = "Date when the order was created by seller. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)")
    @JsonProperty("orderDate")
    @NotNull
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("orderItem")
    @NotNull
    @Size(min = 1)
    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("orderMessage")
    public List<OrderMessage> getOrderMessage() {
        return orderMessage;
    }

    public void setOrderMessage(List<OrderMessage> orderMessage) {
        this.orderMessage = orderMessage;
    }

    /**
     * The version number that the Buyer uses to refer to this particular version of the order
     **/

    @ApiModelProperty(required = true, value = "The version number that the Buyer uses to refer to this particular version of the order")
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
     * The length of the contract in months.
     **/

    @ApiModelProperty(value = "The length of the contract in months.")
    @JsonProperty("pricingTerm")
    public Integer getPricingTerm() {
        return pricingTerm;
    }

    public void setPricingTerm(Integer pricingTerm) {
        this.pricingTerm = pricingTerm;
    }

    /**
     * An integer that specifies that expedited treatment is to be provided in a specific priority. This field will be ignored if the Expedite/Priority Indicator is False. The valid values and the business/operational rules for this field will be defined by the Seller as part of the contracting or on-boarding process.
     **/

    @ApiModelProperty(value = "An integer that specifies that expedited treatment is to be provided in a specific priority. This field will be ignored if the Expedite/Priority Indicator is False. The valid values and the business/operational rules for this field will be defined by the Seller as part of the contracting or on-boarding process.")
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together
     **/

    @ApiModelProperty(value = "An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together")
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Related Buyer Purchase Order Number (RPON)
     **/

    @ApiModelProperty(value = "Related Buyer Purchase Order Number (RPON)")
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
     * Identifies the buyer&#39;s desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
     **/

    @ApiModelProperty(required = true, value = "Identifies the buyer's desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).")
    @JsonProperty("requestedCompletionDate")
    @NotNull
    public Date getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    public void setRequestedCompletionDate(Date requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    /**
     * The buyer&#39;s requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
     **/

    @ApiModelProperty(value = "The buyer's requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).")
    @JsonProperty("requestedStartDate")
    public Date getRequestedStartDate() {
        return requestedStartDate;
    }

    public void setRequestedStartDate(Date requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public ProductOrderStateType getState() {
        return state;
    }

    public void setState(ProductOrderStateType state) {
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
     * Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook, The valid values are defined in ATIS OBF document: ATIS-0404001
     **/

    @ApiModelProperty(value = "Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook, The valid values are defined in ATIS OBF document: ATIS-0404001")
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
        ProductOrder productOrder = (ProductOrder) o;
        return Objects.equals(baseType, productOrder.baseType) &&
                Objects.equals(schemaLocation, productOrder.schemaLocation) &&
                Objects.equals(type, productOrder.type) &&
                Objects.equals(billingAccount, productOrder.billingAccount) &&
                Objects.equals(buyerRequestDate, productOrder.buyerRequestDate) &&
                Objects.equals(cancellationDate, productOrder.cancellationDate) &&
                Objects.equals(cancellationReason, productOrder.cancellationReason) &&
                Objects.equals(completionDate, productOrder.completionDate) &&
                Objects.equals(desiredResponses, productOrder.desiredResponses) &&
                Objects.equals(expectedCompletionDate, productOrder.expectedCompletionDate) &&
                Objects.equals(expeditePriority, productOrder.expeditePriority) &&
                Objects.equals(externalId, productOrder.externalId) &&
                Objects.equals(href, productOrder.href) &&
                Objects.equals(id, productOrder.id) &&
                Objects.equals(note, productOrder.note) &&
                Objects.equals(orderActivity, productOrder.orderActivity) &&
                Objects.equals(orderDate, productOrder.orderDate) &&
                Objects.equals(orderItem, productOrder.orderItem) &&
                Objects.equals(orderMessage, productOrder.orderMessage) &&
                Objects.equals(orderVersion, productOrder.orderVersion) &&
                Objects.equals(pricingMethod, productOrder.pricingMethod) &&
                Objects.equals(pricingReference, productOrder.pricingReference) &&
                Objects.equals(pricingTerm, productOrder.pricingTerm) &&
                Objects.equals(priority, productOrder.priority) &&
                Objects.equals(projectId, productOrder.projectId) &&
                Objects.equals(relatedBuyerPON, productOrder.relatedBuyerPON) &&
                Objects.equals(relatedParty, productOrder.relatedParty) &&
                Objects.equals(requestedCompletionDate, productOrder.requestedCompletionDate) &&
                Objects.equals(requestedStartDate, productOrder.requestedStartDate) &&
                Objects.equals(state, productOrder.state) &&
                Objects.equals(stateChange, productOrder.stateChange) &&
                Objects.equals(tspRestorationPriority, productOrder.tspRestorationPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseType, schemaLocation, type, billingAccount, buyerRequestDate, cancellationDate, cancellationReason, completionDate, desiredResponses, expectedCompletionDate, expeditePriority, externalId, href, id, note, orderActivity, orderDate, orderItem, orderMessage, orderVersion, pricingMethod, pricingReference, pricingTerm, priority, projectId, relatedBuyerPON, relatedParty, requestedCompletionDate, requestedStartDate, state, stateChange, tspRestorationPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrder {\n");

        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("    buyerRequestDate: ").append(toIndentedString(buyerRequestDate)).append("\n");
        sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
        sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
        sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
        sb.append("    desiredResponses: ").append(toIndentedString(desiredResponses)).append("\n");
        sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
        sb.append("    expeditePriority: ").append(toIndentedString(expeditePriority)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    orderActivity: ").append(toIndentedString(orderActivity)).append("\n");
        sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
        sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
        sb.append("    orderMessage: ").append(toIndentedString(orderMessage)).append("\n");
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
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
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

