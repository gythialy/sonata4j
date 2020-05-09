package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductRef;

/**
 * A product has relationships to other products.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductRelationship   {
  
  private ProductRef product = null;
  private String type = null;

  public ProductRelationship () {

  }

  public ProductRelationship (ProductRef product, String type) {
    this.product = product;
    this.type = type;
  }

    
  @JsonProperty("product")
  public ProductRef getProduct() {
    return product;
  }
  public void setProduct(ProductRef product) {
    this.product = product;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRelationship productRelationship = (ProductRelationship) o;
    return Objects.equals(product, productRelationship.product) &&
        Objects.equals(type, productRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRelationship {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
