package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ChargePeriod;
import io.swagger.server.api.model.Price;
import io.swagger.server.api.model.PriceType;

/**
 * Description of price and discount awarded.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuotePrice   {
  
  private String type = null;
  private String description = null;
  private String name = null;
  private Price price = null;
  private PriceType priceType = null;
  private ChargePeriod recurringChargePeriod = null;

  public QuotePrice () {

  }

  public QuotePrice (String type, String description, String name, Price price, PriceType priceType, ChargePeriod recurringChargePeriod) {
    this.type = type;
    this.description = description;
    this.name = name;
    this.price = price;
    this.priceType = priceType;
    this.recurringChargePeriod = recurringChargePeriod;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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

    
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }
  public void setPrice(Price price) {
    this.price = price;
  }

    
  @JsonProperty("priceType")
  public PriceType getPriceType() {
    return priceType;
  }
  public void setPriceType(PriceType priceType) {
    this.priceType = priceType;
  }

    
  @JsonProperty("recurringChargePeriod")
  public ChargePeriod getRecurringChargePeriod() {
    return recurringChargePeriod;
  }
  public void setRecurringChargePeriod(ChargePeriod recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotePrice quotePrice = (QuotePrice) o;
    return Objects.equals(type, quotePrice.type) &&
        Objects.equals(description, quotePrice.description) &&
        Objects.equals(name, quotePrice.name) &&
        Objects.equals(price, quotePrice.price) &&
        Objects.equals(priceType, quotePrice.priceType) &&
        Objects.equals(recurringChargePeriod, quotePrice.recurringChargePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, name, price, priceType, recurringChargePeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotePrice {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
