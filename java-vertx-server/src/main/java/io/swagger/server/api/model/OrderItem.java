package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.BillingAccountRef;
import io.swagger.server.api.model.OrderItemPrice;
import io.swagger.server.api.model.OrderItemRelationShip;
import io.swagger.server.api.model.PricingMethod;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductActionType;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.ProductOrderItemStateType;
import io.swagger.server.api.model.QualificationRef;
import io.swagger.server.api.model.QuoteRef;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.StateChange;
import java.util.ArrayList;
import java.util.List;

/**
 * An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderItem   {
  
  private String schemaLocation = null;
  private String type = null;
  private ProductActionType action = null;
  private BillingAccountRef billingAccount = null;
  private String id = null;
  private List<OrderItemPrice> orderItemPrice = new ArrayList<>();
  private List<OrderItemRelationShip> orderItemRelationship = new ArrayList<>();
  private PricingMethod pricingMethod = null;
  private String pricingReference = null;
  private Integer pricingTerm = null;
  private Product product = null;
  private ProductOfferingRef productOffering = null;
  private QualificationRef qualification = null;
  private QuoteRef quote = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private ProductOrderItemStateType state = null;
  private List<StateChange> stateChange = new ArrayList<>();

  public OrderItem () {

  }

  public OrderItem (String schemaLocation, String type, ProductActionType action, BillingAccountRef billingAccount, String id, List<OrderItemPrice> orderItemPrice, List<OrderItemRelationShip> orderItemRelationship, PricingMethod pricingMethod, String pricingReference, Integer pricingTerm, Product product, ProductOfferingRef productOffering, QualificationRef qualification, QuoteRef quote, List<RelatedParty> relatedParty, ProductOrderItemStateType state, List<StateChange> stateChange) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.action = action;
    this.billingAccount = billingAccount;
    this.id = id;
    this.orderItemPrice = orderItemPrice;
    this.orderItemRelationship = orderItemRelationship;
    this.pricingMethod = pricingMethod;
    this.pricingReference = pricingReference;
    this.pricingTerm = pricingTerm;
    this.product = product;
    this.productOffering = productOffering;
    this.qualification = qualification;
    this.quote = quote;
    this.relatedParty = relatedParty;
    this.state = state;
    this.stateChange = stateChange;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("action")
  public ProductActionType getAction() {
    return action;
  }
  public void setAction(ProductActionType action) {
    this.action = action;
  }

    
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }
  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("orderItemPrice")
  public List<OrderItemPrice> getOrderItemPrice() {
    return orderItemPrice;
  }
  public void setOrderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
  }

    
  @JsonProperty("orderItemRelationship")
  public List<OrderItemRelationShip> getOrderItemRelationship() {
    return orderItemRelationship;
  }
  public void setOrderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
  }

    
  @JsonProperty("pricingMethod")
  public PricingMethod getPricingMethod() {
    return pricingMethod;
  }
  public void setPricingMethod(PricingMethod pricingMethod) {
    this.pricingMethod = pricingMethod;
  }

    
  @JsonProperty("pricingReference")
  public String getPricingReference() {
    return pricingReference;
  }
  public void setPricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
  }

    
  @JsonProperty("pricingTerm")
  public Integer getPricingTerm() {
    return pricingTerm;
  }
  public void setPricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
  }

    
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }

    
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }
  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

    
  @JsonProperty("qualification")
  public QualificationRef getQualification() {
    return qualification;
  }
  public void setQualification(QualificationRef qualification) {
    this.qualification = qualification;
  }

    
  @JsonProperty("quote")
  public QuoteRef getQuote() {
    return quote;
  }
  public void setQuote(QuoteRef quote) {
    this.quote = quote;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("state")
  public ProductOrderItemStateType getState() {
    return state;
  }
  public void setState(ProductOrderItemStateType state) {
    this.state = state;
  }

    
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
