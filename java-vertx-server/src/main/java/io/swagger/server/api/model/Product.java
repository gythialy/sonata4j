package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Agreement;
import io.swagger.server.api.model.BillingAccountRef;
import io.swagger.server.api.model.GeographicSite;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.ProductOrderRef;
import io.swagger.server.api.model.ProductPrice;
import io.swagger.server.api.model.ProductRelationship;
import io.swagger.server.api.model.ProductSpecificationRef;
import io.swagger.server.api.model.ProductStatus;
import io.swagger.server.api.model.ProductTerm;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.StatusChange;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Product   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private List<Agreement> agreement = new ArrayList<>();
  private List<BillingAccountRef> billingAccount = new ArrayList<>();
  private String buyerProductId = null;
  private String href = null;
  private String id = null;
  private OffsetDateTime lastUpdateDate = null;
  private ProductOfferingRef productOffering = null;
  private List<ProductOrderRef> productOrder = new ArrayList<>();
  private List<ProductPrice> productPrice = new ArrayList<>();
  private List<ProductRelationship> productRelationship = new ArrayList<>();
  private ProductSpecificationRef productSpecification = null;
  private List<ProductTerm> productTerm = new ArrayList<>();
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private List<GeographicSite> site = new ArrayList<>();
  private OffsetDateTime startDate = null;
  private ProductStatus status = null;
  private List<StatusChange> statusChange = new ArrayList<>();
  private OffsetDateTime terminationDate = null;

  public Product () {

  }

  public Product (String baseType, String schemaLocation, String type, List<Agreement> agreement, List<BillingAccountRef> billingAccount, String buyerProductId, String href, String id, OffsetDateTime lastUpdateDate, ProductOfferingRef productOffering, List<ProductOrderRef> productOrder, List<ProductPrice> productPrice, List<ProductRelationship> productRelationship, ProductSpecificationRef productSpecification, List<ProductTerm> productTerm, List<RelatedParty> relatedParty, List<GeographicSite> site, OffsetDateTime startDate, ProductStatus status, List<StatusChange> statusChange, OffsetDateTime terminationDate) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.agreement = agreement;
    this.billingAccount = billingAccount;
    this.buyerProductId = buyerProductId;
    this.href = href;
    this.id = id;
    this.lastUpdateDate = lastUpdateDate;
    this.productOffering = productOffering;
    this.productOrder = productOrder;
    this.productPrice = productPrice;
    this.productRelationship = productRelationship;
    this.productSpecification = productSpecification;
    this.productTerm = productTerm;
    this.relatedParty = relatedParty;
    this.site = site;
    this.startDate = startDate;
    this.status = status;
    this.statusChange = statusChange;
    this.terminationDate = terminationDate;
  }

    
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }
  public void setBaseType(String baseType) {
    this.baseType = baseType;
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

    
  @JsonProperty("agreement")
  public List<Agreement> getAgreement() {
    return agreement;
  }
  public void setAgreement(List<Agreement> agreement) {
    this.agreement = agreement;
  }

    
  @JsonProperty("billingAccount")
  public List<BillingAccountRef> getBillingAccount() {
    return billingAccount;
  }
  public void setBillingAccount(List<BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
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

    
  @JsonProperty("lastUpdateDate")
  public OffsetDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }
  public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

    
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }
  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

    
  @JsonProperty("productOrder")
  public List<ProductOrderRef> getProductOrder() {
    return productOrder;
  }
  public void setProductOrder(List<ProductOrderRef> productOrder) {
    this.productOrder = productOrder;
  }

    
  @JsonProperty("productPrice")
  public List<ProductPrice> getProductPrice() {
    return productPrice;
  }
  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

    
  @JsonProperty("productRelationship")
  public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }
  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

    
  @JsonProperty("productSpecification")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }
  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

    
  @JsonProperty("productTerm")
  public List<ProductTerm> getProductTerm() {
    return productTerm;
  }
  public void setProductTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("site")
  public List<GeographicSite> getSite() {
    return site;
  }
  public void setSite(List<GeographicSite> site) {
    this.site = site;
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

    
  @JsonProperty("statusChange")
  public List<StatusChange> getStatusChange() {
    return statusChange;
  }
  public void setStatusChange(List<StatusChange> statusChange) {
    this.statusChange = statusChange;
  }

    
  @JsonProperty("terminationDate")
  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }
  public void setTerminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(baseType, product.baseType) &&
        Objects.equals(schemaLocation, product.schemaLocation) &&
        Objects.equals(type, product.type) &&
        Objects.equals(agreement, product.agreement) &&
        Objects.equals(billingAccount, product.billingAccount) &&
        Objects.equals(buyerProductId, product.buyerProductId) &&
        Objects.equals(href, product.href) &&
        Objects.equals(id, product.id) &&
        Objects.equals(lastUpdateDate, product.lastUpdateDate) &&
        Objects.equals(productOffering, product.productOffering) &&
        Objects.equals(productOrder, product.productOrder) &&
        Objects.equals(productPrice, product.productPrice) &&
        Objects.equals(productRelationship, product.productRelationship) &&
        Objects.equals(productSpecification, product.productSpecification) &&
        Objects.equals(productTerm, product.productTerm) &&
        Objects.equals(relatedParty, product.relatedParty) &&
        Objects.equals(site, product.site) &&
        Objects.equals(startDate, product.startDate) &&
        Objects.equals(status, product.status) &&
        Objects.equals(statusChange, product.statusChange) &&
        Objects.equals(terminationDate, product.terminationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, agreement, billingAccount, buyerProductId, href, id, lastUpdateDate, productOffering, productOrder, productPrice, productRelationship, productSpecification, productTerm, relatedParty, site, startDate, status, statusChange, terminationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusChange: ").append(toIndentedString(statusChange)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
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
