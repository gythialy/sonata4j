package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AlternateProductProposal;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingQualificationItemRelationship;
import io.swagger.model.ProductOfferingQualificationItemStateType;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.ServiceabilityColor;
import io.swagger.model.StateChange;
import io.swagger.model.TerminationError;
import io.swagger.model.TimeInterval;
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
  * An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.
 **/
@ApiModel(description="An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.")
public class ProductOfferingQualificationItem  {
  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
 /**
   * When sub-classing, this defines the sub-class entity name
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductActionType action = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<AlternateProductProposal> alternateProductProposal = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductOfferingRef> eligibleProductOffering = null;

  @ApiModelProperty(value = "Date until seller is guaranted the qualification result.")
 /**
   * Date until seller is guaranted the qualification result.
  **/
  private Date guaranteedUntilDate = null;

  @ApiModelProperty(required = true, value = "Id of this POQ item")
 /**
   * Id of this POQ item
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private TimeInterval installationInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private Product product = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingRef productOffering = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @ApiModelProperty(value = "A description of the reason a particular color is being provided. This may include a specific standard reason codes and descriptions.")
 /**
   * A description of the reason a particular color is being provided. This may include a specific standard reason codes and descriptions.
  **/
  private String serviceConfidenceReason = null;

  @ApiModelProperty(value = "")
  @Valid
  private ServiceabilityColor serviceabilityConfidence = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOfferingQualificationItemStateType state = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<StateChange> stateChange = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<TerminationError> terminationError = null;
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

  public ProductOfferingQualificationItem type(String type) {
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

  public ProductOfferingQualificationItem action(ProductActionType action) {
    this.action = action;
    return this;
  }

 /**
   * Get alternateProductProposal
   * @return alternateProductProposal
  **/
  @JsonProperty("alternateProductProposal")
  public List<AlternateProductProposal> getAlternateProductProposal() {
    return alternateProductProposal;
  }

  public void setAlternateProductProposal(List<AlternateProductProposal> alternateProductProposal) {
    this.alternateProductProposal = alternateProductProposal;
  }

  public ProductOfferingQualificationItem alternateProductProposal(List<AlternateProductProposal> alternateProductProposal) {
    this.alternateProductProposal = alternateProductProposal;
    return this;
  }

  public ProductOfferingQualificationItem addAlternateProductProposalItem(AlternateProductProposal alternateProductProposalItem) {
    this.alternateProductProposal.add(alternateProductProposalItem);
    return this;
  }

 /**
   * Get eligibleProductOffering
   * @return eligibleProductOffering
  **/
  @JsonProperty("eligibleProductOffering")
  public List<ProductOfferingRef> getEligibleProductOffering() {
    return eligibleProductOffering;
  }

  public void setEligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
  }

  public ProductOfferingQualificationItem eligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
    return this;
  }

  public ProductOfferingQualificationItem addEligibleProductOfferingItem(ProductOfferingRef eligibleProductOfferingItem) {
    this.eligibleProductOffering.add(eligibleProductOfferingItem);
    return this;
  }

 /**
   * Date until seller is guaranted the qualification result.
   * @return guaranteedUntilDate
  **/
  @JsonProperty("guaranteedUntilDate")
  public Date getGuaranteedUntilDate() {
    return guaranteedUntilDate;
  }

  public void setGuaranteedUntilDate(Date guaranteedUntilDate) {
    this.guaranteedUntilDate = guaranteedUntilDate;
  }

  public ProductOfferingQualificationItem guaranteedUntilDate(Date guaranteedUntilDate) {
    this.guaranteedUntilDate = guaranteedUntilDate;
    return this;
  }

 /**
   * Id of this POQ item
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

  public ProductOfferingQualificationItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get installationInterval
   * @return installationInterval
  **/
  @JsonProperty("installationInterval")
  public TimeInterval getInstallationInterval() {
    return installationInterval;
  }

  public void setInstallationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
  }

  public ProductOfferingQualificationItem installationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
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

  public ProductOfferingQualificationItem product(Product product) {
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

  public ProductOfferingQualificationItem productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

 /**
   * Get productOfferingQualificationItemRelationship
   * @return productOfferingQualificationItemRelationship
  **/
  @JsonProperty("productOfferingQualificationItemRelationship")
  public List<ProductOfferingQualificationItemRelationship> getProductOfferingQualificationItemRelationship() {
    return productOfferingQualificationItemRelationship;
  }

  public void setProductOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
  }

  public ProductOfferingQualificationItem productOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
    return this;
  }

  public ProductOfferingQualificationItem addProductOfferingQualificationItemRelationshipItem(ProductOfferingQualificationItemRelationship productOfferingQualificationItemRelationshipItem) {
    this.productOfferingQualificationItemRelationship.add(productOfferingQualificationItemRelationshipItem);
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

  public ProductOfferingQualificationItem relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOfferingQualificationItem addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * A description of the reason a particular color is being provided. This may include a specific standard reason codes and descriptions.
   * @return serviceConfidenceReason
  **/
  @JsonProperty("serviceConfidenceReason")
  public String getServiceConfidenceReason() {
    return serviceConfidenceReason;
  }

  public void setServiceConfidenceReason(String serviceConfidenceReason) {
    this.serviceConfidenceReason = serviceConfidenceReason;
  }

  public ProductOfferingQualificationItem serviceConfidenceReason(String serviceConfidenceReason) {
    this.serviceConfidenceReason = serviceConfidenceReason;
    return this;
  }

 /**
   * Get serviceabilityConfidence
   * @return serviceabilityConfidence
  **/
  @JsonProperty("serviceabilityConfidence")
  public ServiceabilityColor getServiceabilityConfidence() {
    return serviceabilityConfidence;
  }

  public void setServiceabilityConfidence(ServiceabilityColor serviceabilityConfidence) {
    this.serviceabilityConfidence = serviceabilityConfidence;
  }

  public ProductOfferingQualificationItem serviceabilityConfidence(ServiceabilityColor serviceabilityConfidence) {
    this.serviceabilityConfidence = serviceabilityConfidence;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public ProductOfferingQualificationItemStateType getState() {
    return state;
  }

  public void setState(ProductOfferingQualificationItemStateType state) {
    this.state = state;
  }

  public ProductOfferingQualificationItem state(ProductOfferingQualificationItemStateType state) {
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

  public ProductOfferingQualificationItem stateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
    return this;
  }

  public ProductOfferingQualificationItem addStateChangeItem(StateChange stateChangeItem) {
    this.stateChange.add(stateChangeItem);
    return this;
  }

 /**
   * Get terminationError
   * @return terminationError
  **/
  @JsonProperty("terminationError")
  public List<TerminationError> getTerminationError() {
    return terminationError;
  }

  public void setTerminationError(List<TerminationError> terminationError) {
    this.terminationError = terminationError;
  }

  public ProductOfferingQualificationItem terminationError(List<TerminationError> terminationError) {
    this.terminationError = terminationError;
    return this;
  }

  public ProductOfferingQualificationItem addTerminationErrorItem(TerminationError terminationErrorItem) {
    this.terminationError.add(terminationErrorItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    alternateProductProposal: ").append(toIndentedString(alternateProductProposal)).append("\n");
    sb.append("    eligibleProductOffering: ").append(toIndentedString(eligibleProductOffering)).append("\n");
    sb.append("    guaranteedUntilDate: ").append(toIndentedString(guaranteedUntilDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationInterval: ").append(toIndentedString(installationInterval)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOfferingQualificationItemRelationship: ").append(toIndentedString(productOfferingQualificationItemRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceConfidenceReason: ").append(toIndentedString(serviceConfidenceReason)).append("\n");
    sb.append("    serviceabilityConfidence: ").append(toIndentedString(serviceabilityConfidence)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
    sb.append("    terminationError: ").append(toIndentedString(terminationError)).append("\n");
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

