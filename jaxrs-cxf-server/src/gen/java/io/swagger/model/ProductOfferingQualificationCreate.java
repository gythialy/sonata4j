package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingQualificationItemCreate;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
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
  * This structure serves as a request for a product offering qualification. A POQ is a grouping of POQ Items formulated into a request made by a Buyer to a Seller
 **/
@ApiModel(description="This structure serves as a request for a product offering qualification. A POQ is a grouping of POQ Items formulated into a request made by a Buyer to a Seller")
public class ProductOfferingQualificationCreate  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
 /**
   * When sub-classing, this defines the sub-class entity name
  **/
  private String type = null;

  @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response")
 /**
   * If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response
  **/
  private Boolean instantSyncQualification = false;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem = new ArrayList<ProductOfferingQualificationItemCreate>();

  @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.")
 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.
  **/
  private String projectId = null;

  @ApiModelProperty(value = "This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.")
 /**
   * This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.
  **/
  private Boolean provideAlternative = false;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @ApiModelProperty(value = "Corresponds to desiredResponseDate - The date a response for the service request is desired.")
 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
  **/
  private LocalDate requestedResponseDate = null;
 /**
   * Technical attribute to extend this class
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductOfferingQualificationCreate schemaLocation(String schemaLocation) {
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

  public ProductOfferingQualificationCreate type(String type) {
    this.type = type;
    return this;
  }

 /**
   * If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response
   * @return instantSyncQualification
  **/
  @JsonProperty("instantSyncQualification")
  public Boolean isInstantSyncQualification() {
    return instantSyncQualification;
  }

  public void setInstantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
  }

  public ProductOfferingQualificationCreate instantSyncQualification(Boolean instantSyncQualification) {
    this.instantSyncQualification = instantSyncQualification;
    return this;
  }

 /**
   * Get productOfferingQualificationItem
   * @return productOfferingQualificationItem
  **/
  @JsonProperty("productOfferingQualificationItem")
  @NotNull
 @Size(min=1)  public List<ProductOfferingQualificationItemCreate> getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }

  public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
  }

  public ProductOfferingQualificationCreate productOfferingQualificationItem(List<ProductOfferingQualificationItemCreate> productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    return this;
  }

  public ProductOfferingQualificationCreate addProductOfferingQualificationItemItem(ProductOfferingQualificationItemCreate productOfferingQualificationItemItem) {
    this.productOfferingQualificationItem.add(productOfferingQualificationItemItem);
    return this;
  }

 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.
   * @return projectId
  **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProductOfferingQualificationCreate projectId(String projectId) {
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

  public ProductOfferingQualificationCreate provideAlternative(Boolean provideAlternative) {
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

  public ProductOfferingQualificationCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOfferingQualificationCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
   * @return requestedResponseDate
  **/
  @JsonProperty("requestedResponseDate")
  public LocalDate getRequestedResponseDate() {
    return requestedResponseDate;
  }

  public void setRequestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }

  public ProductOfferingQualificationCreate requestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

