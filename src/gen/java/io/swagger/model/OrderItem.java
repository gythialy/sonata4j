package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class OrderItem {

    private String schemaLocation = null;
    private String type = null;
    private ProductActionType action = null;
    private BillingAccountRef billingAccount = null;
    private String id = null;
    private List<OrderItemPrice> orderItemPrice = new ArrayList<OrderItemPrice>();
    private List<OrderItemRelationShip> orderItemRelationship = new ArrayList<OrderItemRelationShip>();
    private PricingMethod pricingMethod = null;
    private String pricingReference = null;
    private Integer pricingTerm = null;
    private Product product = null;
    private ProductOfferingRef productOffering = null;
    private QualificationRef qualification = null;
    private QuoteRef quote = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private ProductOrderItemStateType state = null;
    private List<StateChange> stateChange = new ArrayList<StateChange>();

    /**
     * Target a description file of productOrder extension
     **/

    @ApiModelProperty(value = "Target a description file of productOrder extension")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Type of productOrder
     **/

    @ApiModelProperty(value = "Type of productOrder")
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
    @JsonProperty("billingAccount")
    public BillingAccountRef getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
     **/

    @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
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
    @JsonProperty("orderItemPrice")
    public List<OrderItemPrice> getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(List<OrderItemPrice> orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("orderItemRelationship")
    public List<OrderItemRelationShip> getOrderItemRelationship() {
        return orderItemRelationship;
    }

    public void setOrderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
        this.orderItemRelationship = orderItemRelationship;
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
    @JsonProperty("qualification")
    public QualificationRef getQualification() {
        return qualification;
    }

    public void setQualification(QualificationRef qualification) {
        this.qualification = qualification;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("quote")
    public QuoteRef getQuote() {
        return quote;
    }

    public void setQuote(QuoteRef quote) {
        this.quote = quote;
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
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public ProductOrderItemStateType getState() {
        return state;
    }

    public void setState(ProductOrderItemStateType state) {
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
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(schemaLocation, orderItem.schemaLocation) &&
                Objects.equals(type, orderItem.type) &&
                Objects.equals(action, orderItem.action) &&
                Objects.equals(billingAccount, orderItem.billingAccount) &&
                Objects.equals(id, orderItem.id) &&
                Objects.equals(orderItemPrice, orderItem.orderItemPrice) &&
                Objects.equals(orderItemRelationship, orderItem.orderItemRelationship) &&
                Objects.equals(pricingMethod, orderItem.pricingMethod) &&
                Objects.equals(pricingReference, orderItem.pricingReference) &&
                Objects.equals(pricingTerm, orderItem.pricingTerm) &&
                Objects.equals(product, orderItem.product) &&
                Objects.equals(productOffering, orderItem.productOffering) &&
                Objects.equals(qualification, orderItem.qualification) &&
                Objects.equals(quote, orderItem.quote) &&
                Objects.equals(relatedParty, orderItem.relatedParty) &&
                Objects.equals(state, orderItem.state) &&
                Objects.equals(stateChange, orderItem.stateChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, action, billingAccount, id, orderItemPrice, orderItemRelationship, pricingMethod, pricingReference, pricingTerm, product, productOffering, qualification, quote, relatedParty, state, stateChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItem {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderItemPrice: ").append(toIndentedString(orderItemPrice)).append("\n");
        sb.append("    orderItemRelationship: ").append(toIndentedString(orderItemRelationship)).append("\n");
        sb.append("    pricingMethod: ").append(toIndentedString(pricingMethod)).append("\n");
        sb.append("    pricingReference: ").append(toIndentedString(pricingReference)).append("\n");
        sb.append("    pricingTerm: ").append(toIndentedString(pricingTerm)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
        sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

