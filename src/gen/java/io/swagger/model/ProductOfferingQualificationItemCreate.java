package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "This structure serves as a request for a product offering qualification item An individual article included in a POQ that describes a Product of a particular type (Product Offering) being delivered to a specific geographical location.  The objective is to determine if it is feasible for the Seller to deliver this item as described and for the Seller to inform the Buyer of the estimated time interval to complete this delivery.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOfferingQualificationItemCreate {

    private String type = null;
    private ProductActionType action = null;
    private String id = null;
    private Product product = null;
    private ProductOfferingRef productOffering = null;
    private List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship = new ArrayList<ProductOfferingQualificationItemRelationship>();
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

    /**
     * When sub-classing, this defines the sub-class entity name
     **/

    @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
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
    @JsonProperty("action")
    public ProductActionType getAction() {
        return action;
    }

    public void setAction(ProductActionType action) {
        this.action = action;
    }

    /**
     * Id of the productOfferingQualification item. This id must be unique within POQ create request
     **/

    @ApiModelProperty(required = true, value = "Id of the productOfferingQualification item. This id must be unique within POQ create request")
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

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("product")
    @NotNull
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
    @JsonProperty("productOfferingQualificationItemRelationship")
    public List<ProductOfferingQualificationItemRelationship> getProductOfferingQualificationItemRelationship() {
        return productOfferingQualificationItemRelationship;
    }

    public void setProductOfferingQualificationItemRelationship(List<ProductOfferingQualificationItemRelationship> productOfferingQualificationItemRelationship) {
        this.productOfferingQualificationItemRelationship = productOfferingQualificationItemRelationship;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOfferingQualificationItemCreate productOfferingQualificationItemCreate = (ProductOfferingQualificationItemCreate) o;
        return Objects.equals(type, productOfferingQualificationItemCreate.type) &&
                Objects.equals(action, productOfferingQualificationItemCreate.action) &&
                Objects.equals(id, productOfferingQualificationItemCreate.id) &&
                Objects.equals(product, productOfferingQualificationItemCreate.product) &&
                Objects.equals(productOffering, productOfferingQualificationItemCreate.productOffering) &&
                Objects.equals(productOfferingQualificationItemRelationship, productOfferingQualificationItemCreate.productOfferingQualificationItemRelationship) &&
                Objects.equals(relatedParty, productOfferingQualificationItemCreate.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, action, id, product, productOffering, productOfferingQualificationItemRelationship, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingQualificationItemCreate {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
        sb.append("    productOfferingQualificationItemRelationship: ").append(toIndentedString(productOfferingQualificationItemRelationship)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

