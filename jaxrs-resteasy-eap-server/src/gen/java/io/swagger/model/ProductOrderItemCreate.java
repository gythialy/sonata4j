package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "A ProductOrderItem_Create object is provided as input to the product order item create operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductOrderItemCreate {

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
    @Size(min = 1)
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
     * minimum: 0
     **/

    @ApiModelProperty(value = "The length of the contract in months")
    @JsonProperty("pricingTerm")
    @Min(0)
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

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("productOffering")
    @NotNull
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOrderItemCreate productOrderItemCreate = (ProductOrderItemCreate) o;
        return Objects.equals(schemaLocation, productOrderItemCreate.schemaLocation) &&
                Objects.equals(type, productOrderItemCreate.type) &&
                Objects.equals(action, productOrderItemCreate.action) &&
                Objects.equals(billingAccount, productOrderItemCreate.billingAccount) &&
                Objects.equals(id, productOrderItemCreate.id) &&
                Objects.equals(orderItemPrice, productOrderItemCreate.orderItemPrice) &&
                Objects.equals(orderItemRelationship, productOrderItemCreate.orderItemRelationship) &&
                Objects.equals(pricingMethod, productOrderItemCreate.pricingMethod) &&
                Objects.equals(pricingReference, productOrderItemCreate.pricingReference) &&
                Objects.equals(pricingTerm, productOrderItemCreate.pricingTerm) &&
                Objects.equals(product, productOrderItemCreate.product) &&
                Objects.equals(productOffering, productOrderItemCreate.productOffering) &&
                Objects.equals(qualification, productOrderItemCreate.qualification) &&
                Objects.equals(quote, productOrderItemCreate.quote) &&
                Objects.equals(relatedParty, productOrderItemCreate.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, action, billingAccount, id, orderItemPrice, orderItemRelationship, pricingMethod, pricingReference, pricingTerm, product, productOffering, qualification, quote, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrderItemCreate {\n");

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

