package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingQualificationItemRelationship;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
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
  * This structure serves as a request for a product offering qualification item An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.
 **/
@ApiModel(description="This structure serves as a request for a product offering qualification item An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.")
public class ProductOfferingQualificationItemCreate  {
  
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
 /**
   * When sub-classing, this defines the sub-class entity name
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductActionType action = null;

  @ApiModelProperty(required = true, value = "Id of the productOfferingQualification item. This id must be unique within POQ create request")
 /**
   * Id of the productOfferingQualification item. This id must be unique within POQ create request
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
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

  public ProductOfferingQualificationItemCreate type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  public ProductActionType getAction() {
    return action;
  }

  public void setAction(ProductActionType action) {
    this.action = action;
  }

  public ProductOfferingQualificationItemCreate action(ProductActionType action) {
    this.action = action;
    return this;
  }

 /**
   * Id of the productOfferingQualification item. This id must be unique within POQ create request
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

  public ProductOfferingQualificationItemCreate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  @NotNull
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public ProductOfferingQualificationItemCreate product(Product product) {
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

  public ProductOfferingQualificationItemCreate productOffering(ProductOfferingRef productOffering) {
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

  public ProductOfferingQualificationItemCreate productOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
    return this;
  }

  public ProductOfferingQualificationItemCreate addProductOfferingQualificationItemRelationshipItem(ProductOfferingQualificationItemRelationship productOfferingQualificationItemRelationshipItem) {
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

  public ProductOfferingQualificationItemCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOfferingQualificationItemCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationItemCreate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOfferingQualificationItemRelationship: ").append(toIndentedString(productOfferingQualificationItemRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

