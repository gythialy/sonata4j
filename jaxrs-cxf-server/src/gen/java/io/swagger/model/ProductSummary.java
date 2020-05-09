package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductSpecificationSummary;
import io.swagger.model.ProductStatus;
import java.util.Date;
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
  * Class used to provide product overview retrieved in GET (by list) operation
 **/
@ApiModel(description="Class used to provide product overview retrieved in GET (by list) operation")
public class ProductSummary  {
  
  @ApiModelProperty(value = "This identifier is optionally provided during the product ordering and stored for informative purpose in the seller inventory")
 /**
   * This identifier is optionally provided during the product ordering and stored for informative purpose in the seller inventory
  **/
  private String buyerProductId = null;

  @ApiModelProperty(value = "Reference of the product")
 /**
   * Reference of the product
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Unique identifier of the product")
 /**
   * Unique identifier of the product
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingRef productOffering = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductSpecificationSummary productSpecification = null;

  @ApiModelProperty(value = "The date from which the product starts")
 /**
   * The date from which the product starts
  **/
  private Date startDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductStatus status = null;
 /**
   * This identifier is optionally provided during the product ordering and stored for informative purpose in the seller inventory
   * @return buyerProductId
  **/
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

  public ProductSummary buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

 /**
   * Reference of the product
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductSummary href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Unique identifier of the product
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

  public ProductSummary id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get productOffering
   * @return productOffering
  **/
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductSummary productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

 /**
   * Get productSpecification
   * @return productSpecification
  **/
  @JsonProperty("productSpecification")
  public ProductSpecificationSummary getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationSummary productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductSummary productSpecification(ProductSpecificationSummary productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

 /**
   * The date from which the product starts
   * @return startDate
  **/
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public ProductSummary startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public ProductSummary status(ProductStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSummary {\n");
    
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

