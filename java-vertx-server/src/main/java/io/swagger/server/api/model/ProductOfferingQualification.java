package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingQualificationItem;
import io.swagger.server.api.model.ProductOfferingQualificationStateType;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.StateChange;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A grouping of POQ Items formulated into a request made by a Buyer to a Seller
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualification   {
  
  private String schemaLocation = null;
  private String type = null;
  private OffsetDateTime effectiveQualificationCompletionDate = null;
  private OffsetDateTime expectedResponseDate = null;
  private String href = null;
  private String id = null;
  private Boolean instantSyncQualification = false;
  private List<ProductOfferingQualificationItem> productOfferingQualificationItem = new ArrayList<>();
  private String projectId = null;
  private Boolean provideAlternative = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedResponseDate = null;
  private ProductOfferingQualificationStateType state = null;
  private List<StateChange> stateChange = new ArrayList<>();

  public ProductOfferingQualification () {

  }

  public ProductOfferingQualification (String schemaLocation, String type, OffsetDateTime effectiveQualificationCompletionDate, OffsetDateTime expectedResponseDate, String href, String id, Boolean instantSyncQualification, List<ProductOfferingQualificationItem> productOfferingQualificationItem, String projectId, Boolean provideAlternative, List<RelatedParty> relatedParty, OffsetDateTime requestedResponseDate, ProductOfferingQualificationStateType state, List<StateChange> stateChange) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.effectiveQualificationCompletionDate = effectiveQualificationCompletionDate;
    this.expectedResponseDate = expectedResponseDate;
    this.href = href;
    this.id = id;
    this.instantSyncQualification = instantSyncQualification;
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    this.projectId = projectId;
    this.provideAlternative = provideAlternative;
    this.relatedParty = relatedParty;
    this.requestedResponseDate = requestedResponseDate;
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

    
  @JsonProperty("effectiveQualificationCompletionDate")
  public OffsetDateTime getEffectiveQualificationCompletionDate() {
    return effectiveQualificationCompletionDate;
  }
  public void setEffectiveQualificationCompletionDate(OffsetDateTime effectiveQualificationCompletionDate) {
    this.effectiveQualificationCompletionDate = effectiveQualificationCompletionDate;
  }

    
  @JsonProperty("expectedResponseDate")
  public OffsetDateTime getExpectedResponseDate() {
    return expectedResponseDate;
  }
  public void setExpectedResponseDate(OffsetDateTime expectedResponseDate) {
    this.expectedResponseDate = expectedResponseDate;
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

    
  @JsonProperty("instantSyncQualification")
  public Boolean isInstantSyncQualification() {
    return instantSyncQualification;
  }
  public void setInstantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
  }

    
  @JsonProperty("productOfferingQualificationItem")
  public List<ProductOfferingQualificationItem> getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }
  public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItem> productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
  }

    
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

    
  @JsonProperty("provideAlternative")
  public Boolean isProvideAlternative() {
    return provideAlternative;
  }
  public void setProvideAlternative(Boolean provideAlternative) {
    this.provideAlternative = provideAlternative;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("requestedResponseDate")
  public OffsetDateTime getRequestedResponseDate() {
    return requestedResponseDate;
  }
  public void setRequestedResponseDate(OffsetDateTime requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }

    
  @JsonProperty("state")
  public ProductOfferingQualificationStateType getState() {
    return state;
  }
  public void setState(ProductOfferingQualificationStateType state) {
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
    ProductOfferingQualification productOfferingQualification = (ProductOfferingQualification) o;
    return Objects.equals(schemaLocation, productOfferingQualification.schemaLocation) &&
        Objects.equals(type, productOfferingQualification.type) &&
        Objects.equals(effectiveQualificationCompletionDate, productOfferingQualification.effectiveQualificationCompletionDate) &&
        Objects.equals(expectedResponseDate, productOfferingQualification.expectedResponseDate) &&
        Objects.equals(href, productOfferingQualification.href) &&
        Objects.equals(id, productOfferingQualification.id) &&
        Objects.equals(instantSyncQualification, productOfferingQualification.instantSyncQualification) &&
        Objects.equals(productOfferingQualificationItem, productOfferingQualification.productOfferingQualificationItem) &&
        Objects.equals(projectId, productOfferingQualification.projectId) &&
        Objects.equals(provideAlternative, productOfferingQualification.provideAlternative) &&
        Objects.equals(relatedParty, productOfferingQualification.relatedParty) &&
        Objects.equals(requestedResponseDate, productOfferingQualification.requestedResponseDate) &&
        Objects.equals(state, productOfferingQualification.state) &&
        Objects.equals(stateChange, productOfferingQualification.stateChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, effectiveQualificationCompletionDate, expectedResponseDate, href, id, instantSyncQualification, productOfferingQualificationItem, projectId, provideAlternative, relatedParty, requestedResponseDate, state, stateChange);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
