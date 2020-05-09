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
  * Provides pre tax amount for a product
 **/
@ApiModel(description="Provides pre tax amount for a product")
public class Price  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  @Valid
  private Money dutyFreeAmount = null;

  @ApiModelProperty(value = "")
  @Valid
  private Money taxIncludedAmount = null;

  @ApiModelProperty(value = "Applied tax rate on amount")
 /**
   * Applied tax rate on amount
  **/
  private Float taxRate = null;
 /**
   * Technical attribute to extend this class
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Price type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get dutyFreeAmount
   * @return dutyFreeAmount
  **/
  @JsonProperty("dutyFreeAmount")
  public Money getDutyFreeAmount() {
    return dutyFreeAmount;
  }

  public void setDutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  public Price dutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

 /**
   * Get taxIncludedAmount
   * @return taxIncludedAmount
  **/
  @JsonProperty("taxIncludedAmount")
  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  public Price taxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

 /**
   * Applied tax rate on amount
   * @return taxRate
  **/
  @JsonProperty("taxRate")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public Price taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

