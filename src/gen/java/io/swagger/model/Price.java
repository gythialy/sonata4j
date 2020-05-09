package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "Provides pre tax amount for a product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Price {

    private String type = null;
    private Money dutyFreeAmount = null;
    private Money taxIncludedAmount = null;
    private Float taxRate = null;

    /**
     * Technical attribute to extend this class
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class")
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
    @JsonProperty("dutyFreeAmount")
    public Money getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    public void setDutyFreeAmount(Money dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("taxIncludedAmount")
    public Money getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    public void setTaxIncludedAmount(Money taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    /**
     * Applied tax rate on amount
     **/

    @ApiModelProperty(value = "Applied tax rate on amount")
    @JsonProperty("taxRate")
    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Price price = (Price) o;
        return Objects.equals(type, price.type) &&
                Objects.equals(dutyFreeAmount, price.dutyFreeAmount) &&
                Objects.equals(taxIncludedAmount, price.taxIncludedAmount) &&
                Objects.equals(taxRate, price.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dutyFreeAmount, taxIncludedAmount, taxRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Price {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
        sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

