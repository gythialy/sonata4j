package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.BillingAccountRef;
import io.swagger.server.api.model.DesiredOrderResponses;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.OrderActivity;
import io.swagger.server.api.model.PricingMethod;
import io.swagger.server.api.model.ProductOrderItemCreate;
import io.swagger.server.api.model.RelatedParty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A CreateProductOrder object is provided as input to the product order create operation.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrderCreate   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private BillingAccountRef billingAccount = null;
  private OffsetDateTime buyerRequestDate = null;
  private DesiredOrderResponses desiredResponse = null;
  private Boolean expeditePriority = null;
  private String externalId = null;
  private List<Note> note = new ArrayList<>();
  private OrderActivity orderActivity = null;
  private List<ProductOrderItemCreate> orderItem = new ArrayList<>();
  private String orderVersion = null;
  private PricingMethod pricingMethod = null;
  private String pricingReference = null;
  private Integer pricingTerm = null;
  private Integer priority = null;
  private String projectId = null;
  private String relatedBuyerPON = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedCompletionDate = null;
  private OffsetDateTime requestedStartDate = null;
  private String tspRestorationPriority = null;

  public ProductOrderCreate () {

  }

  public ProductOrderCreate (String baseType, String schemaLocation, String type, BillingAccountRef billingAccount, OffsetDateTime buyerRequestDate, DesiredOrderResponses desiredResponse, Boolean expeditePriority, String externalId, List<Note> note, OrderActivity orderActivity, List<ProductOrderItemCreate> orderItem, String orderVersion, PricingMethod pricingMethod, String pricingReference, Integer pricingTerm, Integer priority, String projectId, String relatedBuyerPON, List<RelatedParty> relatedParty, OffsetDateTime requestedCompletionDate, OffsetDateTime requestedStartDate, String tspRestorationPriority) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.billingAccount = billingAccount;
    this.buyerRequestDate = buyerRequestDate;
    this.desiredResponse = desiredResponse;
    this.expeditePriority = expeditePriority;
    this.externalId = externalId;
    this.note = note;
    this.orderActivity = orderActivity;
    this.orderItem = orderItem;
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

    
  @JsonProperty("desiredResponse")
  public DesiredOrderResponses getDesiredResponse() {
    return desiredResponse;
  }
  public void setDesiredResponse(DesiredOrderResponses desiredResponse) {
    this.desiredResponse = desiredResponse;
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

    
  @JsonProperty("orderItem")
  public List<ProductOrderItemCreate> getOrderItem() {
    return orderItem;
  }
  public void setOrderItem(List<ProductOrderItemCreate> orderItem) {
    this.orderItem = orderItem;
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
