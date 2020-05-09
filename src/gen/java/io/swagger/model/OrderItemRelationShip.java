package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "This class allows the ability to associate one order item to another order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class OrderItemRelationShip {

    private String id = null;
    private String productOrderId = null;
    private String type = null;

    /**
     * The id of the targeted order item by the relationship
     **/

    @ApiModelProperty(required = true, value = "The id of the targeted order item by the relationship")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Id of another product order if this relationship is between two distinct orders.
     **/

    @ApiModelProperty(value = "Id of another product order if this relationship is between two distinct orders.")
    @JsonProperty("productOrderId")
    public String getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(String productOrderId) {
        this.productOrderId = productOrderId;
    }

    /**
     * Indicates the type of order item relationship
     **/

    @ApiModelProperty(required = true, value = "Indicates the type of order item relationship")
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
        OrderItemRelationShip orderItemRelationShip = (OrderItemRelationShip) o;
        return Objects.equals(id, orderItemRelationShip.id) &&
                Objects.equals(productOrderId, orderItemRelationShip.productOrderId) &&
                Objects.equals(type, orderItemRelationShip.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productOrderId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemRelationShip {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
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

