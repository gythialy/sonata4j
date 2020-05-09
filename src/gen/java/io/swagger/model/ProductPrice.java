package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Price of the product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductPrice {

    private String type = null;
    private String description = null;
    private String name = null;
    private Price price = null;
    private PriceType priceType = null;
    private ChargePeriod recurringChargePeriod = null;
    private String unitOfMeasure = null;

    /**
     * A technical attribute to extend the class
     **/

    @ApiModelProperty(value = "A technical attribute to extend the class")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * A narrative that explains in detail the semantics of this product price
     **/

    @ApiModelProperty(value = "A narrative that explains in detail the semantics of this product price")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short descriptive name such as \&quot;Subscription price\&quot;
     **/

    @ApiModelProperty(required = true, value = "A short descriptive name such as \"Subscription price\"")
    @JsonProperty("name")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("priceType")
    public PriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("recurringChargePeriod")
    public ChargePeriod getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    public void setRecurringChargePeriod(ChargePeriod recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    /**
     * Unit of Measure, if price depends on it (like Gb for example)
     **/

    @ApiModelProperty(value = "Unit of Measure, if price depends on it (like Gb for example)")
    @JsonProperty("unitOfMeasure")
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) o;
        return Objects.equals(type, productPrice.type) &&
                Objects.equals(description, productPrice.description) &&
                Objects.equals(name, productPrice.name) &&
                Objects.equals(price, productPrice.price) &&
                Objects.equals(priceType, productPrice.priceType) &&
                Objects.equals(recurringChargePeriod, productPrice.recurringChargePeriod) &&
                Objects.equals(unitOfMeasure, productPrice.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, name, price, priceType, recurringChargePeriod, unitOfMeasure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductPrice {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
        sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
        sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

