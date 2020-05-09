package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductSpecificationRef {

    private Describing describing = null;
    private String id = null;

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("describing")
    public Describing getDescribing() {
        return describing;
    }

    public void setDescribing(Describing describing) {
        this.describing = describing;
    }

    /**
     * A unique identifier of the product spec.
     **/

    @ApiModelProperty(required = true, value = "A unique identifier of the product spec.")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
        return Objects.equals(describing, productSpecificationRef.describing) &&
                Objects.equals(id, productSpecificationRef.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(describing, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductSpecificationRef {\n");

        sb.append("    describing: ").append(toIndentedString(describing)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

