package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.BillingAccountRef;
import io.swagger.server.api.model.DesiredOrderResponses;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.OrderActivity;
import io.swagger.server.api.model.OrderItem;
import io.swagger.server.api.model.OrderMessage;
import io.swagger.server.api.model.PricingMethod;
import io.swagger.server.api.model.ProductOrderStateType;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.StateChange;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A ProductOrder is a type of business interaction that is used to procure a Product based upon a Product Offering.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrder   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private BillingAccountRef billingAccount = null;
  private OffsetDateTime buyerRequestDate = null;
  private OffsetDateTime cancellationDate = null;
  private String cancellationReason = null;
  private OffsetDateTime completionDate = null;
  private DesiredOrderResponses desiredResponses = null;
  private OffsetDateTime expectedCompletionDate = null;
  private Boolean expeditePriority = null;
  private String externalId = null;
  private String href = null;
  private String id = null;
  private List<Note> note = new ArrayList<>();
  private OrderActivity orderActivity = null;
  private OffsetDateTime orderDate = null;
  private List<OrderItem> orderItem = new ArrayList<>();
  private List<OrderMessage> orderMessage = new ArrayList<>();
  private String orderVersion = "1";
  private PricingMethod pricingMethod = null;
  private String pricingReference = null;
  private Integer pricingTerm = null;
  private Integer priority = null;
  private String projectId = null;
  private String relatedBuyerPON = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedCompletionDate = null;
  private OffsetDateTime requestedStartDate = null;
  private ProductOrderStateType state = null;
  private List<StateChange> stateChange = new ArrayList<>();
  private String tspRestorationPriority = null;

  public ProductOrder () {

  }

  public ProductOrder (String baseType, String schemaLocation, String type, BillingAccountRef billingAccount, OffsetDateTime buyerRequestDate, OffsetDateTime cancellationDate, String cancellationReason, OffsetDateTime completionDate, DesiredOrderResponses desiredResponses, OffsetDateTime expectedCompletionDate, Boolean expeditePriority, String externalId, String href, String id, List<Note> note, OrderActivity orderActivity, OffsetDateTime orderDate, List<OrderItem> orderItem, List<OrderMessage> orderMessage, String orderVersion, PricingMethod pricingMethod, String pricingReference, Integer pricingTerm, Integer priority, String projectId, String relatedBuyerPON, List<RelatedParty> relatedParty, OffsetDateTime requestedCompletionDate, OffsetDateTime requestedStartDate, ProductOrderStateType state, List<StateChange> stateChange, String tspRestorationPriority) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.billingAccount = billingAccount;
    this.buyerRequestDate = buyerRequestDate;
    this.cancellationDate = cancellationDate;
    this.cancellationReason = cancellationReason;
    this.completionDate = completionDate;
    this.desiredResponses = desiredResponses;
    this.expectedCompletionDate = expectedCompletionDate;
    this.expeditePriority = expeditePriority;
    this.externalId = externalId;
    this.href = href;
    this.id = id;
    this.note = note;
    this.orderActivity = orderActivity;
    this.orderDate = orderDate;
    this.orderItem = orderItem;
    this.orderMessage = orderMessage;
    this.orderVersion = orderVersion;
    this.pricingMethod = pricingMethod;
    this.pricingReference = pricingReference;
    this.pricingTerm = pricingTerm;
    this.priority = priority;
    this.projectId = projectId;
    this.relatedBuyerPON = relatedBuyerPON;
    this.relatedParty = relatedParty;
    this.requestedCompletionDate = requestedCompletionDate;
    this.requestedStartDate = requestedStartDate;
    this.state = state;
    this.stateChange = stateChange;
    this.tspRestorationPriority = tspRestorationPriority;
  }

    
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }
  public void setBaseType(String baseType) {
    this.baseType = baseType;
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

    
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }
  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

    
  @JsonProperty("buyerRequestDate")
  public OffsetDateTime getBuyerRequestDate() {
    return buyerRequestDate;
  }
  public void setBuyerRequestDate(OffsetDateTime buyerRequestDate) {
    this.buyerRequestDate = buyerRequestDate;
  }

    
  @JsonProperty("cancellationDate")
  public OffsetDateTime getCancellationDate() {
    return cancellationDate;
  }
  public void setCancellationDate(OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

    
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }
  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

    
  @JsonProperty("completionDate")
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }
  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

    
  @JsonProperty("desiredResponses")
  public DesiredOrderResponses getDesiredResponses() {
    return desiredResponses;
  }
  public void setDesiredResponses(DesiredOrderResponses desiredResponses) {
    this.desiredResponses = desiredResponses;
  }

    
  @JsonProperty("expectedCompletionDate")
  public OffsetDateTime getExpectedCompletionDate() {
    return expectedCompletionDate;
  }
  public void setExpectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

    
  @JsonProperty("expeditePriority")
  public Boolean isExpeditePriority() {
    return expeditePriority;
  }
  public void setExpeditePriority(Boolean expeditePriority) {
    this.expeditePriority = expeditePriority;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }
  public void setNote(List<Note> note) {
    this.note = note;
  }

    
  @JsonProperty("orderActivity")
  public OrderActivity getOrderActivity() {
    return orderActivity;
  }
  public void setOrderActivity(OrderActivity orderActivity) {
    this.orderActivity = orderActivity;
  }

    
  @JsonProperty("orderDate")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

    
  @JsonProperty("orderItem")
  public List<OrderItem> getOrderItem() {
    return orderItem;
  }
  public void setOrderItem(List<OrderItem> orderItem) {
    this.orderItem = orderItem;
  }

    
  @JsonProperty("orderMessage")
  public List<OrderMessage> getOrderMessage() {
    return orderMessage;
  }
  public void setOrderMessage(List<OrderMessage> orderMessage) {
    this.orderMessage = orderMessage;
  }

    
  @JsonProperty("orderVersion")
  public String getOrderVersion() {
    return orderVersion;
  }
  public void setOrderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
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

    
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

    
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

    
  @JsonProperty("relatedBuyerPON")
  public String getRelatedBuyerPON() {
    return relatedBuyerPON;
  }
  public void setRelatedBuyerPON(String relatedBuyerPON) {
    this.relatedBuyerPON = relatedBuyerPON;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("requestedCompletionDate")
  public OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }
  public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

    
  @JsonProperty("requestedStartDate")
  public OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }
  public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

    
  @JsonProperty("state")
  public ProductOrderStateType getState() {
    return state;
  }
  public void setState(ProductOrderStateType state) {
    this.state = state;
  }

    
  @JsonProperty("stateChange")
  public List<StateChange> getStateChange() {
    return stateChange;
  }
  public void setStateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
  }

    
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
