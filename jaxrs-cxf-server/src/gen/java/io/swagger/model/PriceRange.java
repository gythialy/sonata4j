package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Money;
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
  * PriceRange class allows to describe a range of price (Min/Max) for budgetary or indicative quote.
 **/
@ApiModel(description="PriceRange class allows to describe a range of price (Min/Max) for budgetary or indicative quote.")
public class PriceRange  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Money maxPreTaxAmount = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Money minPreTaxAmount = null;
 /**
   * Get maxPreTaxAmount
   * @return maxPreTaxAmount
  **/
  @JsonProperty("maxPreTaxAmount")
  @NotNull
  public Money getMaxPreTaxAmount() {
    return maxPreTaxAmount;
  }

  public void setMaxPreTaxAmount(Money maxPreTaxAmount) {
    this.maxPreTaxAmount = maxPreTaxAmount;
  }

  public PriceRange maxPreTaxAmount(Money maxPreTaxAmount) {
    this.maxPreTaxAmount = maxPreTaxAmount;
    return this;
  }

 /**
   * Get minPreTaxAmount
   * @return minPreTaxAmount
  **/
  @JsonProperty("minPreTaxAmount")
  @NotNull
  public Money getMinPreTaxAmount() {
    return minPreTaxAmount;
  }

  public void setMinPreTaxAmount(Money minPreTaxAmount) {
    this.minPreTaxAmount = minPreTaxAmount;
  }

  public PriceRange minPreTaxAmount(Money minPreTaxAmount) {
    this.minPreTaxAmount = minPreTaxAmount;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

