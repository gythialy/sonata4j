package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Money;

/**
 * PriceRange class allows to describe a range of price (Min/Max) for budgetary or indicative quote.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class PriceRange   {
  
  private Money maxPreTaxAmount = null;
  private Money minPreTaxAmount = null;

  public PriceRange () {

  }

  public PriceRange (Money maxPreTaxAmount, Money minPreTaxAmount) {
    this.maxPreTaxAmount = maxPreTaxAmount;
    this.minPreTaxAmount = minPreTaxAmount;
  }

    
  @JsonProperty("maxPreTaxAmount")
  public Money getMaxPreTaxAmount() {
    return maxPreTaxAmount;
  }
  public void setMaxPreTaxAmount(Money maxPreTaxAmount) {
    this.maxPreTaxAmount = maxPreTaxAmount;
  }

    
  @JsonProperty("minPreTaxAmount")
  public Money getMinPreTaxAmount() {
    return minPreTaxAmount;
  }
  public void setMinPreTaxAmount(Money minPreTaxAmount) {
    this.minPreTaxAmount = minPreTaxAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceRange priceRange = (PriceRange) o;
    return Objects.equals(maxPreTaxAmount, priceRange.maxPreTaxAmount) &&
        Objects.equals(minPreTaxAmount, priceRange.minPreTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPreTaxAmount, minPreTaxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRange {\n");
    
    sb.append("    maxPreTaxAmount: ").append(toIndentedString(maxPreTaxAmount)).append("\n");
    sb.append("    minPreTaxAmount: ").append(toIndentedString(minPreTaxAmount)).append("\n");
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
