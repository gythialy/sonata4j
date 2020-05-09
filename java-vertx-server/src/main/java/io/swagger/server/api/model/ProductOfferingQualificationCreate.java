package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingQualificationItemCreate;
import io.swagger.server.api.model.RelatedParty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This structure serves as a request for a product offering qualification. A POQ is a grouping of POQ Items formulated into a request made by a Buyer to a Seller
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationCreate   {
  
  private String schemaLocation = null;
  private String type = null;
  private Boolean instantSyncQualification = false;
  private List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem = new ArrayList<>();
  private String projectId = null;
  private Boolean provideAlternative = false;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private LocalDate requestedResponseDate = null;

  public ProductOfferingQualificationCreate () {

  }

  public ProductOfferingQualificationCreate (String schemaLocation, String type, Boolean instantSyncQualification, List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem, String projectId, Boolean provideAlternative, List<RelatedParty> relatedParty, LocalDate requestedResponseDate) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.instantSyncQualification = instantSyncQualification;
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    this.projectId = projectId;
    this.provideAlternative = provideAlternative;
    this.relatedParty = relatedParty;
    this.requestedResponseDate = requestedResponseDate;
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

    
  @JsonProperty("instantSyncQualification")
  public Boolean isInstantSyncQualification() {
    return instantSyncQualification;
  }
  public void setInstantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
  }

    
  @JsonProperty("productOfferingQualificationItem")
  public List<ProductOfferingQualificationItemCreate> getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }
  public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem) {
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
  public LocalDate getRequestedResponseDate() {
    return requestedResponseDate;
  }
  public void setRequestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationCreate productOfferingQualificationCreate = (ProductOfferingQualificationCreate) o;
    return Objects.equals(schemaLocation, productOfferingQualificationCreate.schemaLocation) &&
        Objects.equals(type, productOfferingQualificationCreate.type) &&
        Objects.equals(instantSyncQualification, productOfferingQualificationCreate.instantSyncQualification) &&
        Objects.equals(productOfferingQualificationItem, productOfferingQualificationCreate.productOfferingQualificationItem) &&
        Objects.equals(projectId, productOfferingQualificationCreate.projectId) &&
        Objects.equals(provideAlternative, productOfferingQualificationCreate.provideAlternative) &&
        Objects.equals(relatedParty, productOfferingQualificationCreate.relatedParty) &&
        Objects.equals(requestedResponseDate, productOfferingQualificationCreate.requestedResponseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, instantSyncQualification, productOfferingQualificationItem, projectId, provideAlternative, relatedParty, requestedResponseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationCreate {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    instantSyncQualification: ").append(toIndentedString(instantSyncQualification)).append("\n");
    sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    provideAlternative: ").append(toIndentedString(provideAlternative)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
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
