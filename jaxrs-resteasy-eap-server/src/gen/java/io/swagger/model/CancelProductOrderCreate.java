package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class CancelProductOrderCreate {

    private String schemaLocation = null;
    private String type = null;
    private String cancellationReason = null;
    private ProductOrderRefCancel productOrder = null;
    private Date requestedCancellationDate = null;

    /**
     * Technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class.")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class.")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
     **/

    @ApiModelProperty(value = "An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.")
    @JsonProperty("cancellationReason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("productOrder")
    @NotNull
    public ProductOrderRefCancel getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrderRefCancel productOrder) {
        this.productOrder = productOrder;
    }

    /**
     * Identifies the date the Seller cancelled the Order.
     **/

    @ApiModelProperty(required = true, value = "Identifies the date the Seller cancelled the Order.")
    @JsonProperty("requestedCancellationDate")
    @NotNull
    public Date getRequestedCancellationDate() {
        return requestedCancellationDate;
    }

    public void setRequestedCancellationDate(Date requestedCancellationDate) {
        this.requestedCancellationDate = requestedCancellationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelProductOrderCreate cancelProductOrderCreate = (CancelProductOrderCreate) o;
        return Objects.equals(schemaLocation, cancelProductOrderCreate.schemaLocation) &&
                Objects.equals(type, cancelProductOrderCreate.type) &&
                Objects.equals(cancellationReason, cancelProductOrderCreate.cancellationReason) &&
                Objects.equals(productOrder, cancelProductOrderCreate.productOrder) &&
                Objects.equals(requestedCancellationDate, cancelProductOrderCreate.requestedCancellationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, cancellationReason, productOrder, requestedCancellationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelProductOrderCreate {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
        sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
        sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
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

