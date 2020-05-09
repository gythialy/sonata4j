package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class PriceAlteration {

    private String schemaLocation = null;
    private String type = null;
    private Integer applicationDuration = null;
    private String description = null;
    private String name = null;
    private Float percentage = null;
    private Price price = null;
    private String priceType = null;
    private Integer priority = null;
    private String recurringChargePeriod = null;
    private String unitOfMeasure = null;

    /**
     * Link to the schema describing this REST resource
     **/

    @ApiModelProperty(value = "Link to the schema describing this REST resource")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Indicates the (class) type of the price alteration
     **/

    @ApiModelProperty(value = "Indicates the (class) type of the price alteration")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge).
     **/

    @ApiModelProperty(value = "Duration during which the alteration applies on the order item price (for instance 2 months free of charge for the recurring charge).")
    @JsonProperty("applicationDuration")
    public Integer getApplicationDuration() {
        return applicationDuration;
    }

    public void setApplicationDuration(Integer applicationDuration) {
        this.applicationDuration = applicationDuration;
    }

    /**
     * A narrative that explains in detail the semantics of this order item price alteration.
     **/

    @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price alteration.")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short descriptive name such as \&quot;Monthly discount\&quot;.
     **/

    @ApiModelProperty(value = "A short descriptive name such as \"Monthly discount\".")
    @JsonProperty("name")
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
    @JsonProperty("percentage")
    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
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
     * A category that describes the price such as recurring, one time and usage.
     **/

    @ApiModelProperty(required = true, value = "A category that describes the price such as recurring, one time and usage.")
    @JsonProperty("priceType")
    @NotNull
    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     * Priority level for applying this alteration among all the defined alterations on the order item price
     **/

    @ApiModelProperty(value = "Priority level for applying this alteration among all the defined alterations on the order item price")
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Could be month, week...
     **/

    @ApiModelProperty(value = "Could be month, week...")
    @JsonProperty("recurringChargePeriod")
    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    /**
     * Could be minutes, GB...
     **/

    @ApiModelProperty(value = "Could be minutes, GB...")
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
        PriceAlteration priceAlteration = (PriceAlteration) o;
        return Objects.equals(schemaLocation, priceAlteration.schemaLocation) &&
                Objects.equals(type, priceAlteration.type) &&
                Objects.equals(applicationDuration, priceAlteration.applicationDuration) &&
                Objects.equals(description, priceAlteration.description) &&
                Objects.equals(name, priceAlteration.name) &&
                Objects.equals(percentage, priceAlteration.percentage) &&
                Objects.equals(price, priceAlteration.price) &&
                Objects.equals(priceType, priceAlteration.priceType) &&
                Objects.equals(priority, priceAlteration.priority) &&
                Objects.equals(recurringChargePeriod, priceAlteration.recurringChargePeriod) &&
                Objects.equals(unitOfMeasure, priceAlteration.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, applicationDuration, description, name, percentage, price, priceType, priority, recurringChargePeriod, unitOfMeasure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceAlteration {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

