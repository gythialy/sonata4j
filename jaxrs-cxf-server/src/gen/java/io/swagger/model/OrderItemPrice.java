package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ChargePeriod;
import io.swagger.model.Price;
import io.swagger.model.PriceType;
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
  * Structure used to define a product price. An order item could have 0-* order item price.
 **/
@ApiModel(description="Structure used to define a product price. An order item could have 0-* order item price.")
public class OrderItemPrice  {
  
  @ApiModelProperty(value = "Technical attribute to extend the class")
 /**
   * Technical attribute to extend the class
  **/
  private String type = null;

  @ApiModelProperty(value = "A narrative that explains in detail the semantics of yhis order item price")
 /**
   * A narrative that explains in detail the semantics of yhis order item price
  **/
  private String description = null;

  @ApiModelProperty(required = true, value = "Name of the product price")
 /**
   * Name of the product price
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Price price = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PriceType priceType = null;

  @ApiModelProperty(value = "")
  @Valid
  private ChargePeriod recurringChargePeriod = null;
 /**
   * Technical attribute to extend the class
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItemPrice type(String type) {
    this.type = type;
    return this;
  }

 /**
   * A narrative that explains in detail the semantics of yhis order item price
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderItemPrice description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Name of the product price
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderItemPrice name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  @NotNull
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public OrderItemPrice price(Price price) {
    this.price = price;
    return this;
  }

 /**
   * Get priceType
   * @return priceType
  **/
  @JsonProperty("priceType")
  @NotNull
  public PriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceType priceType) {
    this.priceType = priceType;
  }

  public OrderItemPrice priceType(PriceType priceType) {
    this.priceType = priceType;
    return this;
  }

 /**
   * Get recurringChargePeriod
   * @return recurringChargePeriod
  **/
  @JsonProperty("recurringChargePeriod")
  public ChargePeriod getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(ChargePeriod recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public OrderItemPrice recurringChargePeriod(ChargePeriod recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemPrice {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
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

