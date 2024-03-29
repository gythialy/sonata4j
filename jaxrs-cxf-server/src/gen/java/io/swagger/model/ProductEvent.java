package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductSpecification;
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
  * Product structure used for notification
 **/
@ApiModel(description="Product structure used for notification")
public class ProductEvent  {
  
  @ApiModelProperty(value = "Buyer product Id - informative information")
 /**
   * Buyer product Id - informative information
  **/
  private String buyerProductId = null;

  @ApiModelProperty(value = "Unique (within the product domain) identifier for the product that is generated by the seller when the product is instantiated.")
 /**
   * Unique (within the product domain) identifier for the product that is generated by the seller when the product is instantiated.
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductSpecification productSpecification = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;
 /**
   * Buyer product Id - informative information
   * @return buyerProductId
  **/
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

  public ProductEvent buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

 /**
   * Unique (within the product domain) identifier for the product that is generated by the seller when the product is instantiated.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductEvent id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get productSpecification
   * @return productSpecification
  **/
  @JsonProperty("productSpecification")
  public ProductSpecification getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecification productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductEvent productSpecification(ProductSpecification productSpecification) {
    this.productSpecification = productSpecification;
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

  public ProductEvent relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductEvent addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEvent {\n");
    
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

