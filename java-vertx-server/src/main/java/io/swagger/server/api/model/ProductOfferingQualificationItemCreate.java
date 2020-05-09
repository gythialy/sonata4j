package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductActionType;
import io.swagger.server.api.model.ProductOfferingQualificationItemRelationship;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;

/**
 * This structure serves as a request for a product offering qualification item An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationItemCreate   {
  
  private String type = null;
  private ProductActionType action = null;
  private String id = null;
  private Product product = null;
  private ProductOfferingRef productOffering = null;
  private List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship = new ArrayList<>();
  private List<RelatedParty> relatedParty = new ArrayList<>();

  public ProductOfferingQualificationItemCreate () {

  }

  public ProductOfferingQualificationItemCreate (String type, ProductActionType action, String id, Product product, ProductOfferingRef productOffering, List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship, List<RelatedParty> relatedParty) {
    this.type = type;
    this.action = action;
    this.id = id;
    this.product = product;
    this.productOffering = productOffering;
    this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
    this.relatedParty = relatedParty;
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationItemCreate productOfferingQualificationItemCreate = (ProductOfferingQualificationItemCreate) o;
    return Objects.equals(type, productOfferingQualificationItemCreate.type) &&
        Objects.equals(action, productOfferingQualificationItemCreate.action) &&
        Objects.equals(id, productOfferingQualificationItemCreate.id) &&
        Objects.equals(product, productOfferingQualificationItemCreate.product) &&
        Objects.equals(productOffering, productOfferingQualificationItemCreate.productOffering) &&
        Objects.equals(productOfferingQualificationItemRelationship, productOfferingQualificationItemCreate.productOfferingQualificationItemRelationship) &&
        Objects.equals(relatedParty, productOfferingQualificationItemCreate.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, id, product, productOffering, productOfferingQualificationItemRelationship, relatedParty);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
