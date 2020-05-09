package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.OrderItemPrice;
import io.swagger.model.OrderItemRelationShip;
import io.swagger.model.PricingMethod;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductOrderItemStateType;
import io.swagger.model.QualificationRef;
import io.swagger.model.QuoteRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.StateChange;
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
  * An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).
 **/
@ApiModel(description="An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).")
public class OrderItem  {
  
  @ApiModelProperty(value = "Target a description file of productOrder extension")
 /**
   * Target a description file of productOrder extension
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Type of productOrder")
 /**
   * Type of productOrder
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

  @ApiModelProperty(value = "")
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderItemStateType state = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<StateChange> stateChange = null;
 /**
   * Target a description file of productOrder extension
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public OrderItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Type of productOrder
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItem type(String type) {
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

  public OrderItem action(ProductActionType action) {
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

  public OrderItem billingAccount(BillingAccountRef billingAccount) {
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

  public OrderItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get orderItemPrice
   * @return orderItemPrice
  **/
  @JsonProperty("orderItemPrice")
  public List<OrderItemPrice> getOrderItemPrice() {
    return orderItemPrice;
  }

  public void setOrderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
  }

  public OrderItem orderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
    return this;
  }

  public OrderItem addOrderItemPriceItem(OrderItemPrice orderItemPriceItem) {
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

  public OrderItem orderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
    return this;
  }

  public OrderItem addOrderItemRelationshipItem(OrderItemRelationShip orderItemRelationshipItem) {
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

  public OrderItem pricingMethod(PricingMethod pricingMethod) {
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

  public OrderItem pricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
    return this;
  }

 /**
   * The length of the contract in months
   * @return pricingTerm
  **/
  @JsonProperty("pricingTerm")
  public Integer getPricingTerm() {
    return pricingTerm;
  }

  public void setPricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
  }

  public OrderItem pricingTerm(Integer pricingTerm) {
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

  public OrderItem product(Product product) {
    this.product = product;
    return this;
  }

 /**
   * Get productOffering
   * @return productOffering
  **/
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public OrderItem productOffering(ProductOfferingRef productOffering) {
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

  public OrderItem qualification(QualificationRef qualification) {
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

  public OrderItem quote(QuoteRef quote) {
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

  public OrderItem relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public OrderItem addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public ProductOrderItemStateType getState() {
    return state;
  }

  public void setState(ProductOrderItemStateType state) {
    this.state = state;
  }

  public OrderItem state(ProductOrderItemStateType state) {
    this.state = state;
    return this;
  }

 /**
   * Get stateChange
   * @return stateChange
  **/
  @JsonProperty("stateChange")
  public List<StateChange> getStateChange() {
    return stateChange;
  }

  public void setStateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
  }

  public OrderItem stateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
    return this;
  }

  public OrderItem addStateChangeItem(StateChange stateChangeItem) {
    this.stateChange.add(stateChangeItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

