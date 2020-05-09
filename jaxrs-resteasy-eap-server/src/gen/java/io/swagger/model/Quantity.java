package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "An amount in a given unit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class Quantity {

    private Float amount = null;
    private String units = null;

    /**
     * Numeric value in a given unit
     **/

    @ApiModelProperty(value = "Numeric value in a given unit")
    @JsonProperty("amount")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    /**
     * Unit
     **/

    @ApiModelProperty(value = "Unit")
    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quantity quantity = (Quantity) o;
        return Objects.equals(amount, quantity.amount) &&
                Objects.equals(units, quantity.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, units);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quantity {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

