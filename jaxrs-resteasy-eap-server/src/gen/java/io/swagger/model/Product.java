package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class Product {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private List<Agreement> agreement = new ArrayList<Agreement>();
    private List<BillingAccountRef> billingAccount = new ArrayList<BillingAccountRef>();
    private String buyerProductId = null;
    private String href = null;
    private String id = null;
    private Date lastUpdateDate = null;
    private ProductOfferingRef productOffering = null;
    private List<ProductOrderRef> productOrder = new ArrayList<ProductOrderRef>();
    private List<ProductPrice> productPrice = new ArrayList<ProductPrice>();
    private List<ProductRelationship> productRelationship = new ArrayList<ProductRelationship>();
    private ProductSpecificationRef productSpecification = null;
    private List<ProductTerm> productTerm = new ArrayList<ProductTerm>();
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private List<GeographicSite> site = new ArrayList<GeographicSite>();
    private Date startDate = null;
    private ProductStatus status = null;
    private List<StatusChange> statusChange = new ArrayList<StatusChange>();
    private Date terminationDate = null;

    /**
     * the Base Type of the product if specialization. This is a technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "the Base Type of the product if specialization. This is a technical attribute to extend this class.")
    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    /**
     * A pointer to a file describing extension attributes (if used). This is a technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "A pointer to a file describing extension attributes (if used). This is a technical attribute to extend this class.")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * The type of product if specialization
     **/

    @ApiModelProperty(value = "The type of product if specialization")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("agreement")
    public List<Agreement> getAgreement() {
        return agreement;
    }

    public void setAgreement(List<Agreement> agreement) {
        this.agreement = agreement;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("billingAccount")
    public List<BillingAccountRef> getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(List<BillingAccountRef> billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * This identifier is optionally provided during the Product ordering and stored for informative purpose in the Seller inventory.
     **/

    @ApiModelProperty(value = "This identifier is optionally provided during the Product ordering and stored for informative purpose in the Seller inventory.")
    @JsonProperty("buyerProductId")
    public String getBuyerProductId() {
        return buyerProductId;
    }

    public void setBuyerProductId(String buyerProductId) {
        this.buyerProductId = buyerProductId;
    }

    /**
     * Reference of the product (link)
     **/

    @ApiModelProperty(value = "Reference of the product (link)")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Unique identifier of the product in the product domain.
     **/

    @ApiModelProperty(required = true, value = "Unique identifier of the product in the product domain.")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Latest date when the product has been updated
     **/

    @ApiModelProperty(value = "Latest date when the product has been updated")
    @JsonProperty("lastUpdateDate")
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productOffering")
    public ProductOfferingRef getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(ProductOfferingRef productOffering) {
        this.productOffering = productOffering;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productOrder")
    public List<ProductOrderRef> getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(List<ProductOrderRef> productOrder) {
        this.productOrder = productOrder;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productPrice")
    public List<ProductPrice> getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(List<ProductPrice> productPrice) {
        this.productPrice = productPrice;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productRelationship")
    public List<ProductRelationship> getProductRelationship() {
        return productRelationship;
    }

    public void setProductRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productSpecification")
    public ProductSpecificationRef getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(ProductSpecificationRef productSpecification) {
        this.productSpecification = productSpecification;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productTerm")
    public List<ProductTerm> getProductTerm() {
        return productTerm;
    }

    public void setProductTerm(List<ProductTerm> productTerm) {
        this.productTerm = productTerm;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("site")
    public List<GeographicSite> getSite() {
        return site;
    }

    public void setSite(List<GeographicSite> site) {
        this.site = site;
    }

    /**
     * Start date is when the product is active for the first time (when the install in the product order has been processed).
     **/

    @ApiModelProperty(required = true, value = "Start date is when the product is active for the first time (when the install in the product order has been processed).")
    @JsonProperty("startDate")
    @NotNull
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("status")
    @NotNull
    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("statusChange")
    public List<StatusChange> getStatusChange() {
        return statusChange;
    }

    public void setStatusChange(List<StatusChange> statusChange) {
        this.statusChange = statusChange;
    }

    /**
     * Termination date (commercial) is when the product has been terminated (when the disconnect in the product order has been processed).
     **/

    @ApiModelProperty(value = "Termination date (commercial) is when the product has been terminated (when the disconnect in the product order has been processed).")
    @JsonProperty("terminationDate")
    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
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

