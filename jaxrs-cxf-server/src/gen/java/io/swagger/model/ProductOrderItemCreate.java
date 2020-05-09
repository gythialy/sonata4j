package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.OrderItemPrice;
import io.swagger.model.OrderItemRelationShip;
import io.swagger.model.PricingMethod;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.QualificationRef;
import io.swagger.model.QuoteRef;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * A ProductOrderItem_Create object is provided as input to the product order item create operation.
 **/
@ApiModel(description="A ProductOrderItem_Create object is provided as input to the product order item create operation.")
public class ProductOrderItemCreate  {
  
  @ApiModelProperty(value = "Technical attribute to extend API")
 /**
   * Technical attribute to extend API
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Technical attribute to extend API")
 /**
   * Technical attribute to extend API
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductActionType action = null;

  @ApiModelProperty(value = "")
  @Valid
  private BillingAccountRef billingAccount = null;

  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OrderItemPrice> orderItemPrice = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<OrderItemRelationShip> orderItemRelationship = null;

  @ApiModelProperty(value = "")
  @Valid
  private PricingMethod pricingMethod = null;

  @ApiModelProperty(value = "The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.")
 /**
   * The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.
  **/
  private String pricingReference = null;

  @ApiModelProperty(value = "The length of the contract in months")
 /**
   * The length of the contract in months
  **/
  private Integer pricingTerm = null;

  @ApiModelProperty(value = "")
  @Valid
  private Product product = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOfferingRef productOffering = null;

  @ApiModelProperty(value = "")
  @Valid
  private QualificationRef qualification = null;

  @ApiModelProperty(value = "")
  @Valid
  private QuoteRef quote = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;
 /**
   * Technical attribute to extend API
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductOrderItemCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Technical attribute to extend API
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductOrderItemCreate type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  @NotNull
  public ProductActionType getAction() {
    return action;
  }

  public void setAction(ProductActionType action) {
    this.action = action;
  }

  public ProductOrderItemCreate action(ProductActionType action) {
    this.action = action;
    return this;
  }

 /**
   * Get billingAccount
   * @return billingAccount
  **/
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductOrderItemCreate billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOrderItemCreate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get orderItemPrice
   * @return orderItemPrice
  **/
  @JsonProperty("orderItemPrice")
 @Size(min=1)  public List<OrderItemPrice> getOrderItemPrice() {
    return orderItemPrice;
  }

  public void setOrderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
  }

  public ProductOrderItemCreate orderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
    return this;
  }

  public ProductOrderItemCreate addOrderItemPriceItem(OrderItemPrice orderItemPriceItem) {
    this.orderItemPrice.add(orderItemPriceItem);
    return this;
  }

 /**
   * Get orderItemRelationship
   * @return orderItemRelationship
  **/
  @JsonProperty("orderItemRelationship")
  public List<OrderItemRelationShip> getOrderItemRelationship() {
    return orderItemRelationship;
  }

  public void setOrderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
  }

  public ProductOrderItemCreate orderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
    return this;
  }

  public ProductOrderItemCreate addOrderItemRelationshipItem(OrderItemRelationShip orderItemRelationshipItem) {
    this.orderItemRelationship.add(orderItemRelationshipItem);
    return this;
  }

 /**
   * Get pricingMethod
   * @return pricingMethod
  **/
  @JsonProperty("pricingMethod")
  public PricingMethod getPricingMethod() {
    return pricingMethod;
  }

  public void setPricingMethod(PricingMethod pricingMethod) {
    this.pricingMethod = pricingMethod;
  }

  public ProductOrderItemCreate pricingMethod(PricingMethod pricingMethod) {
    this.pricingMethod = pricingMethod;
    return this;
  }

 /**
   * The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.
   * @return pricingReference
  **/
  @JsonProperty("pricingReference")
  public String getPricingReference() {
    return pricingReference;
  }

  public void setPricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
  }

  public ProductOrderItemCreate pricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
    return this;
  }

 /**
   * The length of the contract in months
   * minimum: 0
   * @return pricingTerm
  **/
  @JsonProperty("pricingTerm")
 @Min(0)  public Integer getPricingTerm() {
    return pricingTerm;
  }

  public void setPricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
  }

  public ProductOrderItemCreate pricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public ProductOrderItemCreate product(Product product) {
    this.product = product;
    return this;
  }

 /**
   * Get productOffering
   * @return productOffering
  **/
  @JsonProperty("productOffering")
  @NotNull
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductOrderItemCreate productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

 /**
   * Get qualification
   * @return qualification
  **/
  @JsonProperty("qualification")
  public QualificationRef getQualification() {
    return qualification;
  }

  public void setQualification(QualificationRef qualification) {
    this.qualification = qualification;
  }

  public ProductOrderItemCreate qualification(QualificationRef qualification) {
    this.qualification = qualification;
    return this;
  }

 /**
   * Get quote
   * @return quote
  **/
  @JsonProperty("quote")
  public QuoteRef getQuote() {
    return quote;
  }

  public void setQuote(QuoteRef quote) {
    this.quote = quote;
  }

  public ProductOrderItemCreate quote(QuoteRef quote) {
    this.quote = quote;
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductOrderItemCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOrderItemCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

