package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "A ProductSpec describes the invariant properties (i.e., features) that a given set of Products MAY have. These properties provide the information needed to plan, construct, allocate, and/or retire the Services and Resources from the operator environment needed to deliver the Product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductSpecification {

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
     * A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.
     **/

    @ApiModelProperty(value = "A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.")
    @JsonProperty("id")
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
        ProductSpecification productSpecification = (ProductSpecification) o;
        return Objects.equals(describing, productSpecification.describing) &&
                Objects.equals(id, productSpecification.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(describing, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductSpecification {\n");

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

