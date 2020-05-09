package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Class used to provide product overview retrieved in GET (by list) operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductSummary {

    private String buyerProductId = null;
    private String href = null;
    private String id = null;
    private ProductOfferingRef productOffering = null;
    private ProductSpecificationSummary productSpecification = null;
    private Date startDate = null;
    private ProductStatus status = null;

    /**
     * This identifier is optionally provided during the product ordering and stored for informative purpose in the seller inventory
     **/

    @ApiModelProperty(value = "This identifier is optionally provided during the product ordering and stored for informative purpose in the seller inventory")
    @JsonProperty("buyerProductId")
    public String getBuyerProductId() {
        return buyerProductId;
    }

    public void setBuyerProductId(String buyerProductId) {
        this.buyerProductId = buyerProductId;
    }

    /**
     * Reference of the product
     **/

    @ApiModelProperty(value = "Reference of the product")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Unique identifier of the product
     **/

    @ApiModelProperty(required = true, value = "Unique identifier of the product")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @JsonProperty("productSpecification")
    public ProductSpecificationSummary getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(ProductSpecificationSummary productSpecification) {
        this.productSpecification = productSpecification;
    }

    /**
     * The date from which the product starts
     **/

    @ApiModelProperty(value = "The date from which the product starts")
    @JsonProperty("startDate")
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

