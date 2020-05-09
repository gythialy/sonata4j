package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "Structure used to describe geographic address in response to GET geographicalSite")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class GeographicAddressFindResp {

    private FieldedAddress fieldedAddress = null;
    private FormattedAddress formattedAddress = null;

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("fieldedAddress")
    public FieldedAddress getFieldedAddress() {
        return fieldedAddress;
    }

    public void setFieldedAddress(FieldedAddress fieldedAddress) {
        this.fieldedAddress = fieldedAddress;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("formattedAddress")
    public FormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(FormattedAddress formattedAddress) {
        this.formattedAddress = formattedAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicAddressFindResp geographicAddressFindResp = (GeographicAddressFindResp) o;
        return Objects.equals(fieldedAddress, geographicAddressFindResp.fieldedAddress) &&
                Objects.equals(formattedAddress, geographicAddressFindResp.formattedAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldedAddress, formattedAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicAddressFindResp {\n");

        sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
        sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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

