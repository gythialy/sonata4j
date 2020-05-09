package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Money;

/**
 * Provides pre tax amount for a product
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Price   {
  
  private String type = null;
  private Money dutyFreeAmount = null;
  private Money taxIncludedAmount = null;
  private Float taxRate = null;

  public Price () {

  }

  public Price (String type, Money dutyFreeAmount, Money taxIncludedAmount, Float taxRate) {
    this.type = type;
    this.dutyFreeAmount = dutyFreeAmount;
    this.taxIncludedAmount = taxIncludedAmount;
    this.taxRate = taxRate;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("dutyFreeAmount")
  public Money getDutyFreeAmount() {
    return dutyFreeAmount;
  }
  public void setDutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

    
  @JsonProperty("taxIncludedAmount")
  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }
  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

    
  @JsonProperty("taxRate")
  public Float getTaxRate() {
    return taxRate;
  }
  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(type, price.type) &&
        Objects.equals(dutyFreeAmount, price.dutyFreeAmount) &&
        Objects.equals(taxIncludedAmount, price.taxIncludedAmount) &&
        Objects.equals(taxRate, price.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dutyFreeAmount, taxIncludedAmount, taxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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
