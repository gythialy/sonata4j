package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.AlternateProductProposal;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductActionType;
import io.swagger.server.api.model.ProductOfferingQualificationItemRelationship;
import io.swagger.server.api.model.ProductOfferingQualificationItemStateType;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.ServiceabilityColor;
import io.swagger.server.api.model.StateChange;
import io.swagger.server.api.model.TerminationError;
import io.swagger.server.api.model.TimeInterval;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationItem   {
  
  private String type = null;
  private ProductActionType action = null;
  private List<AlternateProductProposal> alternateProductProposal = new ArrayList<>();
  private List<ProductOfferingRef> eligibleProductOffering = new ArrayList<>();
  private OffsetDateTime guaranteedUntilDate = null;
  private String id = null;
  private TimeInterval installationInterval = null;
  private Product product = null;
  private ProductOfferingRef productOffering = null;
  private List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship = new ArrayList<>();
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private String serviceConfidenceReason = null;
  private ServiceabilityColor serviceabilityConfidence = null;
  private ProductOfferingQualificationItemStateType state = null;
  private List<StateChange> stateChange = new ArrayList<>();
  private List<TerminationError> terminationError = new ArrayList<>();

  public ProductOfferingQualificationItem () {

  }

  public ProductOfferingQualificationItem (String type, ProductActionType action, List<AlternateProductProposal> alternateProductProposal, List<ProductOfferingRef> eligibleProductOffering, OffsetDateTime guaranteedUntilDate, String id, TimeInterval installationInterval, Product product, ProductOfferingRef productOffering, List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship, List<RelatedParty> relatedParty, String serviceConfidenceReason, ServiceabilityColor serviceabilityConfidence, ProductOfferingQualificationItemStateType state, List<StateChange> stateChange, List<TerminationError> terminationError) {
    this.type = type;
    this.action = action;
    this.alternateProductProposal = alternateProductProposal;
    this.eligibleProductOffering = eligibleProductOffering;
    this.guaranteedUntilDate = guaranteedUntilDate;
    this.id = id;
    this.installationInterval = installationInterval;
    this.product = product;
    this.productOffering = productOffering;
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
    this.relatedParty = relatedParty;
    this.serviceConfidenceReason = serviceConfidenceReason;
    this.serviceabilityConfidence = serviceabilityConfidence;
    this.state = state;
    this.stateChange = stateChange;
    this.terminationError = terminationError;
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

    
  @JsonProperty("alternateProductProposal")
  public List<AlternateProductProposal> getAlternateProductProposal() {
    return alternateProductProposal;
  }
  public void setAlternateProductProposal(List<AlternateProductProposal> alternateProductProposal) {
    this.alternateProductProposal = alternateProductProposal;
  }

    
  @JsonProperty("eligibleProductOffering")
  public List<ProductOfferingRef> getEligibleProductOffering() {
    return eligibleProductOffering;
  }
  public void setEligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
  }

    
  @JsonProperty("guaranteedUntilDate")
  public OffsetDateTime getGuaranteedUntilDate() {
    return guaranteedUntilDate;
  }
  public void setGuaranteedUntilDate(OffsetDateTime guaranteedUntilDate) {
    this.guaranteedUntilDate = guaranteedUntilDate;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("installationInterval")
  public TimeInterval getInstallationInterval() {
    return installationInterval;
  }
  public void setInstallationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
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

    
  @JsonProperty("productOfferingQualificationItemRelationship")
  public List<ProductOfferingQualificationItemRelationship> getProductOfferingQualificationItemRelationship() {
    return productOfferingQualificationItemRelationship;
  }
  public void setProductOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("serviceConfidenceReason")
  public String getServiceConfidenceReason() {
    return serviceConfidenceReason;
  }
  public void setServiceConfidenceReason(String serviceConfidenceReason) {
    this.serviceConfidenceReason = serviceConfidenceReason;
  }

    
  @JsonProperty("serviceabilityConfidence")
  public ServiceabilityColor getServiceabilityConfidence() {
    return serviceabilityConfidence;
  }
  public void setServiceabilityConfidence(ServiceabilityColor serviceabilityConfidence) {
    this.serviceabilityConfidence = serviceabilityConfidence;
  }

    
  @JsonProperty("state")
  public ProductOfferingQualificationItemStateType getState() {
    return state;
  }
  public void setState(ProductOfferingQualificationItemStateType state) {
    this.state = state;
  }

    
  @JsonProperty("stateChange")
  public List<StateChange> getStateChange() {
    return stateChange;
  }
  public void setStateChange(List<StateChange> stateChange) {
    this.stateChange = stateChange;
  }

    
  @JsonProperty("terminationError")
  public List<TerminationError> getTerminationError() {
    return terminationError;
  }
  public void setTerminationError(List<TerminationError> terminationError) {
    this.terminationError = terminationError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationItem productOfferingQualificationItem = (ProductOfferingQualificationItem) o;
    return Objects.equals(type, productOfferingQualificationItem.type) &&
        Objects.equals(action, productOfferingQualificationItem.action) &&
        Objects.equals(alternateProductProposal, productOfferingQualificationItem.alternateProductProposal) &&
        Objects.equals(eligibleProductOffering, productOfferingQualificationItem.eligibleProductOffering) &&
        Objects.equals(guaranteedUntilDate, productOfferingQualificationItem.guaranteedUntilDate) &&
        Objects.equals(id, productOfferingQualificationItem.id) &&
        Objects.equals(installationInterval, productOfferingQualificationItem.installationInterval) &&
        Objects.equals(product, productOfferingQualificationItem.product) &&
        Objects.equals(productOffering, productOfferingQualificationItem.productOffering) &&
        Objects.equals(productOfferingQualificationItemRelationship, productOfferingQualificationItem.productOfferingQualificationItemRelationship) &&
        Objects.equals(relatedParty, productOfferingQualificationItem.relatedParty) &&
        Objects.equals(serviceConfidenceReason, productOfferingQualificationItem.serviceConfidenceReason) &&
        Objects.equals(serviceabilityConfidence, productOfferingQualificationItem.serviceabilityConfidence) &&
        Objects.equals(state, productOfferingQualificationItem.state) &&
        Objects.equals(stateChange, productOfferingQualificationItem.stateChange) &&
        Objects.equals(terminationError, productOfferingQualificationItem.terminationError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, alternateProductProposal, eligibleProductOffering, guaranteedUntilDate, id, installationInterval, product, productOffering, productOfferingQualificationItemRelationship, relatedParty, serviceConfidenceReason, serviceabilityConfidence, state, stateChange, terminationError);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
