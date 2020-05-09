package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Agreement;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.GeographicSite;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductOrderRef;
import io.swagger.model.ProductPrice;
import io.swagger.model.ProductRelationship;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.ProductStatus;
import io.swagger.model.ProductTerm;
import io.swagger.model.RelatedParty;
import io.swagger.model.StatusChange;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
  * One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.
 **/
@ApiModel(description="One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.")
public class Product  {
  
  @ApiModelProperty(value = "the Base Type of the product if specialization. This is a technical attribute to extend this class.")
 /**
   * the Base Type of the product if specialization. This is a technical attribute to extend this class.
  **/
  private String baseType = null;

  @ApiModelProperty(value = "A pointer to a file describing extension attributes (if used). This is a technical attribute to extend this class.")
 /**
   * A pointer to a file describing extension attributes (if used). This is a technical attribute to extend this class.
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "The type of product if specialization")
 /**
   * The type of product if specialization
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<Agreement> agreement = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<BillingAccountRef> billingAccount = null;

  @ApiModelProperty(value = "This identifier is optionally provided during the Product ordering and stored for informative purpose in the Seller inventory.")
 /**
   * This identifier is optionally provided during the Product ordering and stored for informative purpose in the Seller inventory.
  **/
  private String buyerProductId = null;

  @ApiModelProperty(value = "Reference of the product (link)")
 /**
   * Reference of the product (link)
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Unique identifier of the product in the product domain.")
 /**
   * Unique identifier of the product in the product domain.
  **/
  private String id = null;

  @ApiModelProperty(value = "Latest date when the product has been updated")
 /**
   * Latest date when the product has been updated
  **/
  private Date lastUpdateDate = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingRef productOffering = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductOrderRef> productOrder = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductPrice> productPrice = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductRelationship> productRelationship = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductSpecificationRef productSpecification = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductTerm> productTerm = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<GeographicSite> site = null;

  @ApiModelProperty(required = true, value = "Start date is when the product is active for the first time (when the install in the product order has been processed).")
 /**
   * Start date is when the product is active for the first time (when the install in the product order has been processed).
  **/
  private Date startDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductStatus status = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<StatusChange> statusChange = null;

  @ApiModelProperty(value = "Termination date (commercial) is when the product has been terminated (when the disconnect in the product order has been processed).")
 /**
   * Termination date (commercial) is when the product has been terminated (when the disconnect in the product order has been processed).
  **/
  private Date terminationDate = null;
 /**
   * the Base Type of the product if specialization. This is a technical attribute to extend this class.
   * @return baseType
  **/
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Product baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

 /**
   * A pointer to a file describing extension attributes (if used). This is a technical attribute to extend this class.
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public Product schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * The type of product if specialization
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Product type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get agreement
   * @return agreement
  **/
  @JsonProperty("agreement")
  public List<Agreement> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<Agreement> agreement) {
    this.agreement = agreement;
  }

  public Product agreement(List<Agreement> agreement) {
    this.agreement = agreement;
    return this;
  }

  public Product addAgreementItem(Agreement agreementItem) {
    this.agreement.add(agreementItem);
    return this;
  }

 /**
   * Get billingAccount
   * @return billingAccount
  **/
  @JsonProperty("billingAccount")
  public List<BillingAccountRef> getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(List<BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
  }

  public Product billingAccount(List<BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  public Product addBillingAccountItem(BillingAccountRef billingAccountItem) {
    this.billingAccount.add(billingAccountItem);
    return this;
  }

 /**
   * This identifier is optionally provided during the Product ordering and stored for informative purpose in the Seller inventory.
   * @return buyerProductId
  **/
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

  public Product buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

 /**
   * Reference of the product (link)
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Product href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Unique identifier of the product in the product domain.
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

  public Product id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Latest date when the product has been updated
   * @return lastUpdateDate
  **/
  @JsonProperty("lastUpdateDate")
  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public Product lastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
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

  public Product productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

 /**
   * Get productOrder
   * @return productOrder
  **/
  @JsonProperty("productOrder")
  public List<ProductOrderRef> getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(List<ProductOrderRef> productOrder) {
    this.productOrder = productOrder;
  }

  public Product productOrder(List<ProductOrderRef> productOrder) {
    this.productOrder = productOrder;
    return this;
  }

  public Product addProductOrderItem(ProductOrderRef productOrderItem) {
    this.productOrder.add(productOrderItem);
    return this;
  }

 /**
   * Get productPrice
   * @return productPrice
  **/
  @JsonProperty("productPrice")
  public List<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public Product productPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public Product addProductPriceItem(ProductPrice productPriceItem) {
    this.productPrice.add(productPriceItem);
    return this;
  }

 /**
   * Get productRelationship
   * @return productRelationship
  **/
  @JsonProperty("productRelationship")
  public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public Product productRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public Product addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

 /**
   * Get productSpecification
   * @return productSpecification
  **/
  @JsonProperty("productSpecification")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public Product productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

 /**
   * Get productTerm
   * @return productTerm
  **/
  @JsonProperty("productTerm")
  public List<ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public Product productTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public Product addProductTermItem(ProductTerm productTermItem) {
    this.productTerm.add(productTermItem);
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Product relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Product addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Get site
   * @return site
  **/
  @JsonProperty("site")
  public List<GeographicSite> getSite() {
    return site;
  }

  public void setSite(List<GeographicSite> site) {
    this.site = site;
  }

  public Product site(List<GeographicSite> site) {
    this.site = site;
    return this;
  }

  public Product addSiteItem(GeographicSite siteItem) {
    this.site.add(siteItem);
    return this;
  }

 /**
   * Start date is when the product is active for the first time (when the install in the product order has been processed).
   * @return startDate
  **/
  @JsonProperty("startDate")
  @NotNull
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Product startDate(Date startDate) {
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

  public Product status(ProductStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get statusChange
   * @return statusChange
  **/
  @JsonProperty("statusChange")
  public List<StatusChange> getStatusChange() {
    return statusChange;
  }

  public void setStatusChange(List<StatusChange> statusChange) {
    this.statusChange = statusChange;
  }

  public Product statusChange(List<StatusChange> statusChange) {
    this.statusChange = statusChange;
    return this;
  }

  public Product addStatusChangeItem(StatusChange statusChangeItem) {
    this.statusChange.add(statusChangeItem);
    return this;
  }

 /**
   * Termination date (commercial) is when the product has been terminated (when the disconnect in the product order has been processed).
   * @return terminationDate
  **/
  @JsonProperty("terminationDate")
  public Date getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  public Product terminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

