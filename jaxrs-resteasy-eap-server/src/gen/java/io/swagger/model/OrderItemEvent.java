package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class OrderItemEvent {

    private String schemaLocation = null;
    private String type = null;
    private ProductActionType action = null;
    private BillingAccountRef billingAccount = null;
    private String id = null;
    private ProductEvent product = null;
    private ProductOrderItemStateType state = null;

    /**
     * Target a description file of productOrder extension
     **/

    @ApiModelProperty(value = "Target a description file of productOrder extension")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Type of productOrder
     **/

    @ApiModelProperty(value = "Type of productOrder")
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

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("action")
    @NotNull
    public ProductActionType getAction() {
        return action;
    }

    public void setAction(ProductActionType action) {
        this.action = action;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("billingAccount")
    public BillingAccountRef getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
     **/

    @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
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
    @JsonProperty("product")
    public ProductEvent getProduct() {
        return product;
    }

    public void setProduct(ProductEvent product) {
        this.product = product;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public ProductOrderItemStateType getState() {
        return state;
    }

    public void setState(ProductOrderItemStateType state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItemEvent orderItemEvent = (OrderItemEvent) o;
        return Objects.equals(schemaLocation, orderItemEvent.schemaLocation) &&
                Objects.equals(type, orderItemEvent.type) &&
                Objects.equals(action, orderItemEvent.action) &&
                Objects.equals(billingAccount, orderItemEvent.billingAccount) &&
                Objects.equals(id, orderItemEvent.id) &&
                Objects.equals(product, orderItemEvent.product) &&
                Objects.equals(state, orderItemEvent.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, action, billingAccount, id, product, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemEvent {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

