package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Price;

/**
 * Is an amount, usually of money, that modifies the price charged for an order item
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PriceAlteration   {
  
  private String schemaLocation = null;
  private String type = null;
  private Integer applicationDuration = null;
  private String description = null;
  private String name = null;
  private Float percentage = null;
  private Price price = null;
  private String priceType = null;
  private Integer priority = null;
  private String recurringChargePeriod = null;
  private String unitOfMeasure = null;

  public PriceAlteration () {

  }

  public PriceAlteration (String schemaLocation, String type, Integer applicationDuration, String description, String name, Float percentage, Price price, String priceType, Integer priority, String recurringChargePeriod, String unitOfMeasure) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.applicationDuration = applicationDuration;
    this.description = description;
    this.name = name;
    this.percentage = percentage;
    this.price = price;
    this.priceType = priceType;
    this.priority = priority;
    this.recurringChargePeriod = recurringChargePeriod;
    this.unitOfMeasure = unitOfMeasure;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("applicationDuration")
  public Integer getApplicationDuration() {
    return applicationDuration;
  }
  public void setApplicationDuration(Integer applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }
  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

    
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }
  public void setPrice(Price price) {
    this.price = price;
  }

    
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }
  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

    
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

    
  @JsonProperty("recurringChargePeriod")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }
  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

    
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAlteration priceAlteration = (PriceAlteration) o;
    return Objects.equals(schemaLocation, priceAlteration.schemaLocation) &&
        Objects.equals(type, priceAlteration.type) &&
        Objects.equals(applicationDuration, priceAlteration.applicationDuration) &&
        Objects.equals(description, priceAlteration.description) &&
        Objects.equals(name, priceAlteration.name) &&
        Objects.equals(percentage, priceAlteration.percentage) &&
        Objects.equals(price, priceAlteration.price) &&
        Objects.equals(priceType, priceAlteration.priceType) &&
        Objects.equals(priority, priceAlteration.priority) &&
        Objects.equals(recurringChargePeriod, priceAlteration.recurringChargePeriod) &&
        Objects.equals(unitOfMeasure, priceAlteration.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, applicationDuration, description, name, percentage, price, priceType, priority, recurringChargePeriod, unitOfMeasure);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
