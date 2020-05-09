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
  * This class allows the ability to associate one order item to another order item.
 **/
@ApiModel(description="This class allows the ability to associate one order item to another order item.")
public class OrderItemRelationShip  {
  
  @ApiModelProperty(required = true, value = "The id of the targeted order item by the relationship")
 /**
   * The id of the targeted order item by the relationship
  **/
  private String id = null;

  @ApiModelProperty(value = "Id of another product order if this relationship is between two distinct orders.")
 /**
   * Id of another product order if this relationship is between two distinct orders.
  **/
  private String productOrderId = null;

  @ApiModelProperty(required = true, value = "Indicates the type of order item relationship")
 /**
   * Indicates the type of order item relationship
  **/
  private String type = null;
 /**
   * The id of the targeted order item by the relationship
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

  public OrderItemRelationShip id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Id of another product order if this relationship is between two distinct orders.
   * @return productOrderId
  **/
  @JsonProperty("productOrderId")
  public String getProductOrderId() {
    return productOrderId;
  }

  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }

  public OrderItemRelationShip productOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
    return this;
  }

 /**
   * Indicates the type of order item relationship
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

  public OrderItemRelationShip type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRelationShip {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
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

