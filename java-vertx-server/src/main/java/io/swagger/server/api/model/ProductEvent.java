package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductSpecification;
import io.swagger.server.api.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;

/**
 * Product structure used for notification
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductEvent   {
  
  private String buyerProductId = null;
  private String id = null;
  private ProductSpecification productSpecification = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();

  public ProductEvent () {

  }

  public ProductEvent (String buyerProductId, String id, ProductSpecification productSpecification, List<RelatedParty> relatedParty) {
    this.buyerProductId = buyerProductId;
    this.id = id;
    this.productSpecification = productSpecification;
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }
  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("productSpecification")
  public ProductSpecification getProductSpecification() {
    return productSpecification;
  }
  public void setProductSpecification(ProductSpecification productSpecification) {
    this.productSpecification = productSpecification;
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
    ProductEvent productEvent = (ProductEvent) o;
    return Objects.equals(buyerProductId, productEvent.buyerProductId) &&
        Objects.equals(id, productEvent.id) &&
        Objects.equals(productSpecification, productEvent.productSpecification) &&
        Objects.equals(relatedParty, productEvent.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerProductId, id, productSpecification, relatedParty);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
