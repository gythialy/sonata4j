package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Sub Unit structure is used to describe several subUnits with a geographical subAddress.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class SubUnit {

    private String subUnitIdentifier = null;
    private String subUnitType = null;

    /**
     * The discriminator used for the subunit, often just a simple number but may also be a range.
     **/

    @ApiModelProperty(required = true, value = "The discriminator used for the subunit, often just a simple number but may also be a range.")
    @JsonProperty("subUnitIdentifier")
    @NotNull
    public String getSubUnitIdentifier() {
        return subUnitIdentifier;
    }

    public void setSubUnitIdentifier(String subUnitIdentifier) {
        this.subUnitIdentifier = subUnitIdentifier;
    }

    /**
     * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
     **/

    @ApiModelProperty(required = true, value = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.")
    @JsonProperty("subUnitType")
    @NotNull
    public String getSubUnitType() {
        return subUnitType;
    }

    public void setSubUnitType(String subUnitType) {
        this.subUnitType = subUnitType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubUnit subUnit = (SubUnit) o;
        return Objects.equals(subUnitIdentifier, subUnit.subUnitIdentifier) &&
                Objects.equals(subUnitType, subUnit.subUnitType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subUnitIdentifier, subUnitType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubUnit {\n");

        sb.append("    subUnitIdentifier: ").append(toIndentedString(subUnitIdentifier)).append("\n");
        sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
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

