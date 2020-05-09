package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "To describe a duration (period of time) with a value and an unit (day, month, etc...)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Duration {

    private DurationUnit unit = null;
    private Integer value = 12;

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("unit")
    @NotNull
    public DurationUnit getUnit() {
        return unit;
    }

    public void setUnit(DurationUnit unit) {
        this.unit = unit;
    }

    /**
     * value of the duration
     **/

    @ApiModelProperty(required = true, value = "value of the duration")
    @JsonProperty("value")
    @NotNull
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Duration duration = (Duration) o;
        return Objects.equals(unit, duration.unit) &&
                Objects.equals(value, duration.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Duration {\n");

        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

