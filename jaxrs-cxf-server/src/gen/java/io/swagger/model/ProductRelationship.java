package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductRef;
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
  * A product has relationships to other products.
 **/
@ApiModel(description="A product has relationships to other products.")
public class ProductRelationship  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductRef product = null;

  @ApiModelProperty(required = true, value = "Indicates whether the type of relationship is \"bundled\", \"reliesOn\", or \"comesFrom\"")
 /**
   * Indicates whether the type of relationship is \"bundled\", \"reliesOn\", or \"comesFrom\"
  **/
  private String type = null;
 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  @NotNull
  public ProductRef getProduct() {
    return product;
  }

  public void setProduct(ProductRef product) {
    this.product = product;
  }

  public ProductRelationship product(ProductRef product) {
    this.product = product;
    return this;
  }

 /**
   * Indicates whether the type of relationship is \&quot;bundled\&quot;, \&quot;reliesOn\&quot;, or \&quot;comesFrom\&quot;
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductRelationship type(String type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

