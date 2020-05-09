package io.swagger.model;

import io.swagger.annotations.ApiModel;
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
  * Product reference used to describe product relationship.
 **/
@ApiModel(description="Product reference used to describe product relationship.")
public class ProductRef  {
  
  @ApiModelProperty(value = "Targeted Buyer product id - Informative")
 /**
   * Targeted Buyer product id - Informative
  **/
  private String buyerProductId = null;

  @ApiModelProperty(value = "Reference of the product")
 /**
   * Reference of the product
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Unique identifier of the product")
 /**
   * Unique identifier of the product
  **/
  private String id = null;
 /**
   * Targeted Buyer product id - Informative
   * @return buyerProductId
  **/
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

  public ProductRef buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

 /**
   * Reference of the product
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductRef href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Unique identifier of the product
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

  public ProductRef id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRef {\n");
    
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

