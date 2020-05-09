package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Price;
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
  * Is an amount, usually of money, that modifies the price charged for an order item
 **/
@ApiModel(description="Is an amount, usually of money, that modifies the price charged for an order item")
public class PriceAlteration  {
  
  @ApiModelProperty(value = "Link to the schema describing this REST resource")
 /**
   * Link to the schema describing this REST resource
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Indicates the (class) type of the price alteration")
 /**
   * Indicates the (class) type of the price alteration
  **/
  private String type = null;

  @ApiModelProperty(value = "Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge).")
 /**
   * Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge).
  **/
  private Integer applicationDuration = null;

  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price alteration.")
 /**
   * A narrative that explains in detail the semantics of this order item price alteration.
  **/
  private String description = null;

  @ApiModelProperty(value = "A short descriptive name such as \"Monthly discount\".")
 /**
   * A short descriptive name such as \"Monthly discount\".
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private Float percentage = null;

  @ApiModelProperty(value = "")
  @Valid
  private Price price = null;

  @ApiModelProperty(required = true, value = "A category that describes the price such as recurring, one time and usage.")
 /**
   * A category that describes the price such as recurring, one time and usage.
  **/
  private String priceType = null;

  @ApiModelProperty(value = "Priority level for applying this alteration among all the defined alterations on the order item price")
 /**
   * Priority level for applying this alteration among all the defined alterations on the order item price
  **/
  private Integer priority = null;

  @ApiModelProperty(value = "Could be month, week...")
 /**
   * Could be month, week...
  **/
  private String recurringChargePeriod = null;

  @ApiModelProperty(value = "Could be minutes, GB...")
 /**
   * Could be minutes, GB...
  **/
  private String unitOfMeasure = null;
 /**
   * Link to the schema describing this REST resource
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public PriceAlteration schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Indicates the (class) type of the price alteration
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PriceAlteration type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge).
   * @return applicationDuration
  **/
  @JsonProperty("applicationDuration")
  public Integer getApplicationDuration() {
    return applicationDuration;
  }

  public void setApplicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  public PriceAlteration applicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

 /**
   * A narrative that explains in detail the semantics of this order item price alteration.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PriceAlteration description(String description) {
    this.description = description;
    return this;
  }

 /**
   * A short descriptive name such as \&quot;Monthly discount\&quot;.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PriceAlteration name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get percentage
   * @return percentage
  **/
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public PriceAlteration percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

 /**
   * Get price
   * @return price
  **/
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public PriceAlteration price(Price price) {
    this.price = price;
    return this;
  }

 /**
   * A category that describes the price such as recurring, one time and usage.
   * @return priceType
  **/
  @JsonProperty("priceType")
  @NotNull
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public PriceAlteration priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

 /**
   * Priority level for applying this alteration among all the defined alterations on the order item price
   * @return priority
  **/
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PriceAlteration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

 /**
   * Could be month, week...
   * @return recurringChargePeriod
  **/
  @JsonProperty("recurringChargePeriod")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public PriceAlteration recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

 /**
   * Could be minutes, GB...
   * @return unitOfMeasure
  **/
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public PriceAlteration unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAlteration {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

