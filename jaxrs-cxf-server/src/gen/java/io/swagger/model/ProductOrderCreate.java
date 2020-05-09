package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.DesiredOrderResponses;
import io.swagger.model.Note;
import io.swagger.model.OrderActivity;
import io.swagger.model.PricingMethod;
import io.swagger.model.ProductOrderItemCreate;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.Date;
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
  * A CreateProductOrder object is provided as input to the product order create operation.
 **/
@ApiModel(description="A CreateProductOrder object is provided as input to the product order create operation.")
public class ProductOrderCreate  {
  
  @ApiModelProperty(value = "Technical attribute to extend API")
 /**
   * Technical attribute to extend API
  **/
  private String baseType = null;

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

  @ApiModelProperty(value = "")
  @Valid
  private BillingAccountRef billingAccount = null;

  @ApiModelProperty(required = true, value = "Date when the order was submitted by the Buyer to the Seller")
 /**
   * Date when the order was submitted by the Buyer to the Seller
  **/
  private Date buyerRequestDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private DesiredOrderResponses desiredResponse = null;

  @ApiModelProperty(value = "Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.")
 /**
   * Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.
  **/
  private Boolean expeditePriority = null;

  @ApiModelProperty(required = true, value = "Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer's enterprise")
 /**
   * Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer's enterprise
  **/
  private String externalId = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<Note> note = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OrderActivity orderActivity = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ProductOrderItemCreate> orderItem = new ArrayList<ProductOrderItemCreate>();

  @ApiModelProperty(required = true, value = "Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.")
 /**
   * Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.
  **/
  private String orderVersion = null;

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

  @ApiModelProperty(value = "An integer that specifies that expedited treatment is to be provided in a specific priority.")
 /**
   * An integer that specifies that expedited treatment is to be provided in a specific priority.
  **/
  private Integer priority = null;

  @ApiModelProperty(value = "An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.")
 /**
   * An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.
  **/
  private String projectId = null;

  @ApiModelProperty(value = "Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.")
 /**
   * Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.
  **/
  private String relatedBuyerPON = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @ApiModelProperty(required = true, value = "Identifies the Buyer's desired due date (requested delivery date)")
 /**
   * Identifies the Buyer's desired due date (requested delivery date)
  **/
  private Date requestedCompletionDate = null;

  @ApiModelProperty(value = "If specified, identifies the Buyer's desired date for order processing to start")
 /**
   * If specified, identifies the Buyer's desired date for order processing to start
  **/
  private Date requestedStartDate = null;

  @ApiModelProperty(value = "Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.")
 /**
   * Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.
  **/
  private String tspRestorationPriority = null;
 /**
   * Technical attribute to extend API
   * @return baseType
  **/
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductOrderCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

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

  public ProductOrderCreate schemaLocation(String schemaLocation) {
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

  public ProductOrderCreate type(String type) {
    this.type = type;
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

  public ProductOrderCreate billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

 /**
   * Date when the order was submitted by the Buyer to the Seller
   * @return buyerRequestDate
  **/
  @JsonProperty("buyerRequestDate")
  @NotNull
  public Date getBuyerRequestDate() {
    return buyerRequestDate;
  }

  public void setBuyerRequestDate(Date buyerRequestDate) {
    this.buyerRequestDate = buyerRequestDate;
  }

  public ProductOrderCreate buyerRequestDate(Date buyerRequestDate) {
    this.buyerRequestDate = buyerRequestDate;
    return this;
  }

 /**
   * Get desiredResponse
   * @return desiredResponse
  **/
  @JsonProperty("desiredResponse")
  @NotNull
  public DesiredOrderResponses getDesiredResponse() {
    return desiredResponse;
  }

  public void setDesiredResponse(DesiredOrderResponses desiredResponse) {
    this.desiredResponse = desiredResponse;
  }

  public ProductOrderCreate desiredResponse(DesiredOrderResponses desiredResponse) {
    this.desiredResponse = desiredResponse;
    return this;
  }

 /**
   * Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.
   * @return expeditePriority
  **/
  @JsonProperty("expeditePriority")
  public Boolean isExpeditePriority() {
    return expeditePriority;
  }

  public void setExpeditePriority(Boolean expeditePriority) {
    this.expeditePriority = expeditePriority;
  }

  public ProductOrderCreate expeditePriority(Boolean expeditePriority) {
    this.expeditePriority = expeditePriority;
    return this;
  }

 /**
   * Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer&#39;s enterprise
   * @return externalId
  **/
  @JsonProperty("externalId")
  @NotNull
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ProductOrderCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get note
   * @return note
  **/
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ProductOrderCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ProductOrderCreate addNoteItem(Note noteItem) {
    this.note.add(noteItem);
    return this;
  }

 /**
   * Get orderActivity
   * @return orderActivity
  **/
  @JsonProperty("orderActivity")
  @NotNull
  public OrderActivity getOrderActivity() {
    return orderActivity;
  }

  public void setOrderActivity(OrderActivity orderActivity) {
    this.orderActivity = orderActivity;
  }

  public ProductOrderCreate orderActivity(OrderActivity orderActivity) {
    this.orderActivity = orderActivity;
    return this;
  }

 /**
   * Get orderItem
   * @return orderItem
  **/
  @JsonProperty("orderItem")
  @NotNull
 @Size(min=1)  public List<ProductOrderItemCreate> getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(List<ProductOrderItemCreate> orderItem) {
    this.orderItem = orderItem;
  }

  public ProductOrderCreate orderItem(List<ProductOrderItemCreate> orderItem) {
    this.orderItem = orderItem;
    return this;
  }

  public ProductOrderCreate addOrderItemItem(ProductOrderItemCreate orderItemItem) {
    this.orderItem.add(orderItemItem);
    return this;
  }

 /**
   * Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.
   * @return orderVersion
  **/
  @JsonProperty("orderVersion")
  @NotNull
  public String getOrderVersion() {
    return orderVersion;
  }

  public void setOrderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
  }

  public ProductOrderCreate orderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
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

  public ProductOrderCreate pricingMethod(PricingMethod pricingMethod) {
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

  public ProductOrderCreate pricingReference(String pricingReference) {
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

  public ProductOrderCreate pricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
    return this;
  }

 /**
   * An integer that specifies that expedited treatment is to be provided in a specific priority.
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProductOrderCreate priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.
   * @return projectId
  **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProductOrderCreate projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.
   * @return relatedBuyerPON
  **/
  @JsonProperty("relatedBuyerPON")
  public String getRelatedBuyerPON() {
    return relatedBuyerPON;
  }

  public void setRelatedBuyerPON(String relatedBuyerPON) {
    this.relatedBuyerPON = relatedBuyerPON;
  }

  public ProductOrderCreate relatedBuyerPON(String relatedBuyerPON) {
    this.relatedBuyerPON = relatedBuyerPON;
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  @NotNull
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductOrderCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOrderCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Identifies the Buyer&#39;s desired due date (requested delivery date)
   * @return requestedCompletionDate
  **/
  @JsonProperty("requestedCompletionDate")
  @NotNull
  public Date getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public ProductOrderCreate requestedCompletionDate(Date requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

 /**
   * If specified, identifies the Buyer&#39;s desired date for order processing to start
   * @return requestedStartDate
  **/
  @JsonProperty("requestedStartDate")
  public Date getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public ProductOrderCreate requestedStartDate(Date requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

 /**
   * Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.
   * @return tspRestorationPriority
  **/
  @JsonProperty("tspRestorationPriority")
  public String getTspRestorationPriority() {
    return tspRestorationPriority;
  }

  public void setTspRestorationPriority(String tspRestorationPriority) {
    this.tspRestorationPriority = tspRestorationPriority;
  }

  public ProductOrderCreate tspRestorationPriority(String tspRestorationPriority) {
    this.tspRestorationPriority = tspRestorationPriority;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

