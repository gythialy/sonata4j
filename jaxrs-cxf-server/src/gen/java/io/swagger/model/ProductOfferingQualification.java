package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingQualificationItem;
import io.swagger.model.ProductOfferingQualificationStateType;
import io.swagger.model.RelatedParty;
import io.swagger.model.StateChange;
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
  * A grouping of POQ Items formulated into a request made by a Buyer to a Seller
 **/
@ApiModel(description="A grouping of POQ Items formulated into a request made by a Buyer to a Seller")
public class ProductOfferingQualification  {
  
  @ApiModelProperty(value = "Technical attribute to extend the class")
 /**
   * Technical attribute to extend the class
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
 /**
   * When sub-classing, this defines the sub-class entity name
  **/
  private String type = null;

  @ApiModelProperty(value = "Effective date seller provides qualification result.")
 /**
   * Effective date seller provides qualification result.
  **/
  private Date effectiveQualificationCompletionDate = null;

  @ApiModelProperty(value = "The date the seller is expected to provide qualification result.")
 /**
   * The date the seller is expected to provide qualification result.
  **/
  private Date expectedResponseDate = null;

  @ApiModelProperty(value = "Link to this POQ resource")
 /**
   * Link to this POQ resource
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "The Serviceability Request's unique identifier.")
 /**
   * The Serviceability Request's unique identifier.
  **/
  private String id = null;

  @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant qualificationto be provided in operation POST response")
 /**
   * If this flag is set to Yes, Buyer requests to have instant qualificationto be provided in operation POST response
  **/
  private Boolean instantSyncQualification = false;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ProductOfferingQualificationItem> productOfferingQualificationItem = new ArrayList<ProductOfferingQualificationItem>();

  @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.")
 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
  **/
  private String projectId = null;

  @ApiModelProperty(value = "This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.")
 /**
   * This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.
  **/
  private Boolean provideAlternative = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @ApiModelProperty(value = "Corresponds to desiredResponseDate - The date a response for the service request is desired.")
 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
  **/
  private Date requestedResponseDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOfferingQualificationStateType state = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<StateChange> stateChange = null;
 /**
   * Technical attribute to extend the class
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductOfferingQualification schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductOfferingQualification type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Effective date seller provides qualification result.
   * @return effectiveQualificationCompletionDate
  **/
  @JsonProperty("effectiveQualificationCompletionDate")
  public Date getEffectiveQualificationCompletionDate() {
    return effectiveQualificationCompletionDate;
  }

  public void setEffectiveQualificationCompletionDate(Date effectiveQualificationCompletionDate) {
    this.effectiveQualificationCompletionDate = effectiveQualificationCompletionDate;
  }

  public ProductOfferingQualification effectiveQualificationCompletionDate(Date effectiveQualificationCompletionDate) {
    this.effectiveQualificationCompletionDate = effectiveQualificationCompletionDate;
    return this;
  }

 /**
   * The date the seller is expected to provide qualification result.
   * @return expectedResponseDate
  **/
  @JsonProperty("expectedResponseDate")
  public Date getExpectedResponseDate() {
    return expectedResponseDate;
  }

  public void setExpectedResponseDate(Date expectedResponseDate) {
    this.expectedResponseDate = expectedResponseDate;
  }

  public ProductOfferingQualification expectedResponseDate(Date expectedResponseDate) {
    this.expectedResponseDate = expectedResponseDate;
    return this;
  }

 /**
   * Link to this POQ resource
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOfferingQualification href(String href) {
    this.href = href;
    return this;
  }

 /**
   * The Serviceability Request&#39;s unique identifier.
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

  public ProductOfferingQualification id(String id) {
    this.id = id;
    return this;
  }

 /**
   * If this flag is set to Yes, Buyer requests to have instant qualificationto be provided in operation POST response
   * @return instantSyncQualification
  **/
  @JsonProperty("instantSyncQualification")
  public Boolean isInstantSyncQualification() {
    return instantSyncQualification;
  }

  public void setInstantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
  }

  public ProductOfferingQualification instantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
    return this;
  }

 /**
   * Get productOfferingQualificationItem
   * @return productOfferingQualificationItem
  **/
  @JsonProperty("productOfferingQualificationItem")
  @NotNull
 @Size(min=1)  public List<ProductOfferingQualificationItem> getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }

  public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItem> productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
  }

  public ProductOfferingQualification productOfferingQualificationItem(List<ProductOfferingQualificationItem> productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    return this;
  }

  public ProductOfferingQualification addProductOfferingQualificationItemItem(ProductOfferingQualificationItem productOfferingQualificationItemItem) {
    this.productOfferingQualificationItem.add(productOfferingQualificationItemItem);
    return this;
  }

 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
   * @return projectId
  **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProductOfferingQualification projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.
   * @return provideAlternative
  **/
  @JsonProperty("provideAlternative")
  public Boolean isProvideAlternative() {
    return provideAlternative;
  }

  public void setProvideAlternative(Boolean provideAlternative) {
    this.provideAlternative = provideAlternative;
  }

  public ProductOfferingQualification provideAlternative(Boolean provideAlternative) {
    this.provideAlternative = provideAlternative;
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

  public ProductOfferingQualification relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOfferingQualification addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
   * @return requestedResponseDate
  **/
  @JsonProperty("requestedResponseDate")
  public Date getRequestedResponseDate() {
    return requestedResponseDate;
  }

  public void setRequestedResponseDate(Date requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }

  public ProductOfferingQualification requestedResponseDate(Date requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public ProductOfferingQualificationStateType getState() {
    return state;
  }

  public void setState(ProductOfferingQualificationStateType state) {
    this.state = state;
  }

  public ProductOfferingQualification state(ProductOfferingQualificationStateType state) {
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

  public ProductOfferingQualification stateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
    return this;
  }

  public ProductOfferingQualification addStateChangeItem(StateChange stateChangeItem) {
    this.stateChange.add(stateChangeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualification {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    effectiveQualificationCompletionDate: ").append(toIndentedString(effectiveQualificationCompletionDate)).append("\n");
    sb.append("    expectedResponseDate: ").append(toIndentedString(expectedResponseDate)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instantSyncQualification: ").append(toIndentedString(instantSyncQualification)).append("\n");
    sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    provideAlternative: ").append(toIndentedString(provideAlternative)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
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

