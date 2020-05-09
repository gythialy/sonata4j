package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A product has relationships to other products.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductRelationship {

    private ProductRef product = null;
    private String type = null;

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("product")
    @NotNull
    public ProductRef getProduct() {
        return product;
    }

    public void setProduct(ProductRef product) {
        this.product = product;
    }

    /**
     * Indicates whether the type of relationship is \&quot;bundled\&quot;, \&quot;reliesOn\&quot;, or \&quot;comesFrom\&quot;
     **/

    @ApiModelProperty(required = true, value = "Indicates whether the type of relationship is \"bundled\", \"reliesOn\", or \"comesFrom\"")
    @JsonProperty("type")
    @NotNull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductRelationship productRelationship = (ProductRelationship) o;
        return Objects.equals(product, productRelationship.product) &&
                Objects.equals(type, productRelationship.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductRelationship {\n");

        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

