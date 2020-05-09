package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.ProductSpecificationSummary;
import io.swagger.server.api.model.ProductStatus;
import java.time.OffsetDateTime;

/**
 * Class used to provide product overview retrieved in GET (by list) operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductSummary   {
  
  private String buyerProductId = null;
  private String href = null;
  private String id = null;
  private ProductOfferingRef productOffering = null;
  private ProductSpecificationSummary productSpecification = null;
  private OffsetDateTime startDate = null;
  private ProductStatus status = null;

  public ProductSummary () {

  }

  public ProductSummary (String buyerProductId, String href, String id, ProductOfferingRef productOffering, ProductSpecificationSummary productSpecification, OffsetDateTime startDate, ProductStatus status) {
    this.buyerProductId = buyerProductId;
    this.href = href;
    this.id = id;
    this.productOffering = productOffering;
    this.productSpecification = productSpecification;
    this.startDate = startDate;
    this.status = status;
  }

    
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }
  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }
  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

    
  @JsonProperty("productSpecification")
  public ProductSpecificationSummary getProductSpecification() {
    return productSpecification;
  }
  public void setProductSpecification(ProductSpecificationSummary productSpecification) {
    this.productSpecification = productSpecification;
  }

    
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("status")
  public ProductStatus getStatus() {
    return status;
  }
  public void setStatus(ProductStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSummary productSummary = (ProductSummary) o;
    return Objects.equals(buyerProductId, productSummary.buyerProductId) &&
        Objects.equals(href, productSummary.href) &&
        Objects.equals(id, productSummary.id) &&
        Objects.equals(productOffering, productSummary.productOffering) &&
        Objects.equals(productSpecification, productSummary.productSpecification) &&
        Objects.equals(startDate, productSummary.startDate) &&
        Objects.equals(status, productSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerProductId, href, id, productOffering, productSpecification, startDate, status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
