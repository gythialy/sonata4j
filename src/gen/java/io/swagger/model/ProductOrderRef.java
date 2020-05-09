package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A reference to a productOrder and optionally to an order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOrderRef {

    private String href = null;
    private String id = null;
    private String orderItemId = null;

    /**
     * Hyperlink to the productOrder
     **/

    @ApiModelProperty(value = "Hyperlink to the productOrder")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Identifier of the productOrder(provided by the seller)
     **/

    @ApiModelProperty(required = true, value = "Identifier of the productOrder(provided by the seller)")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
     **/

    @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
    @JsonProperty("orderItemId")
    @NotNull
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOrderRef productOrderRef = (ProductOrderRef) o;
        return Objects.equals(href, productOrderRef.href) &&
                Objects.equals(id, productOrderRef.id) &&
                Objects.equals(orderItemId, productOrderRef.orderItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, orderItemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrderRef {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
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

