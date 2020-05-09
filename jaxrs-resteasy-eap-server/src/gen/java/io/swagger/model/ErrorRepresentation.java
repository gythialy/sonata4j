package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Class used to describe API response error")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ErrorRepresentation {

    private String schemaLocation = null;
    private String type = null;
    private Integer code = null;
    private String message = null;
    private String reason = null;
    private String referenceError = null;
    private String status = null;

    /**
     * it provides a link to the schema describing a REST resource.
     **/

    @ApiModelProperty(value = "it provides a link to the schema describing a REST resource.")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * The class type of a REST resource.
     **/

    @ApiModelProperty(value = "The class type of a REST resource.")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Application related code (as defined in the API or from a common list)
     **/

    @ApiModelProperty(required = true, value = "Application related code (as defined in the API or from a common list)")
    @JsonProperty("code")
    @NotNull
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Text that provide more details and corrective actions related to the error. This can be shown to a client user.
     **/

    @ApiModelProperty(value = "Text that provide more details and corrective actions related to the error. This can be shown to a client user.")
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Text that explains the reason for error. This can be shown to a client user.
     **/

    @ApiModelProperty(required = true, value = "Text that explains the reason for error. This can be shown to a client user.")
    @JsonProperty("reason")
    @NotNull
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * url pointing to documentation describing the error
     **/

    @ApiModelProperty(value = "url pointing to documentation describing the error")
    @JsonProperty("referenceError")
    public String getReferenceError() {
        return referenceError;
    }

    public void setReferenceError(String referenceError) {
        this.referenceError = referenceError;
    }

    /**
     * http error code extension like 400-2
     **/

    @ApiModelProperty(value = "http error code extension like 400-2")
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorRepresentation errorRepresentation = (ErrorRepresentation) o;
        return Objects.equals(schemaLocation, errorRepresentation.schemaLocation) &&
                Objects.equals(type, errorRepresentation.type) &&
                Objects.equals(code, errorRepresentation.code) &&
                Objects.equals(message, errorRepresentation.message) &&
                Objects.equals(reason, errorRepresentation.reason) &&
                Objects.equals(referenceError, errorRepresentation.referenceError) &&
                Objects.equals(status, errorRepresentation.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, code, message, reason, referenceError, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorRepresentation {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

