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
  * A reference to a productOrder and optionally to an order item.
 **/
@ApiModel(description="A reference to a productOrder and optionally to an order item.")
public class ProductOrderRef  {
  
  @ApiModelProperty(value = "Hyperlink to the productOrder")
 /**
   * Hyperlink to the productOrder
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Identifier of the productOrder(provided by the seller)")
 /**
   * Identifier of the productOrder(provided by the seller)
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
  **/
  private String orderItemId = null;
 /**
   * Hyperlink to the productOrder
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOrderRef href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Identifier of the productOrder(provided by the seller)
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

  public ProductOrderRef id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return orderItemId
  **/
  @JsonProperty("orderItemId")
  @NotNull
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public ProductOrderRef orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderRef {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
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

