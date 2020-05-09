package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A globally unique identifier controlled by a generally accepted independent administrative authority that specifies a fixed geographical location.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ReferencedAddress {

    private String id = null;
    private String referenceId = null;
    private String referenceType = null;

    /**
     * Unique identifier of the address
     **/

    @ApiModelProperty(value = "Unique identifier of the address")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Id of a reference address
     **/

    @ApiModelProperty(required = true, value = "Id of a reference address")
    @JsonProperty("referenceId")
    @NotNull
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Type of a reference address
     **/

    @ApiModelProperty(required = true, value = "Type of a reference address")
    @JsonProperty("referenceType")
    @NotNull
    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferencedAddress referencedAddress = (ReferencedAddress) o;
        return Objects.equals(id, referencedAddress.id) &&
                Objects.equals(referenceId, referencedAddress.referenceId) &&
                Objects.equals(referenceType, referencedAddress.referenceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, referenceId, referenceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferencedAddress {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
        sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

