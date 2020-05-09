package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "An optional array of messages associated with the Order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class OrderMessage {

    private String code = null;
    private Boolean correctionRequired = false;
    private String field = null;
    private String messageInformation = null;
    private Severity severity = null;

    /**
     * The code associated with the Message
     **/

    @ApiModelProperty(value = "The code associated with the Message")
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.
     **/

    @ApiModelProperty(value = "Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.")
    @JsonProperty("correctionRequired")
    public Boolean isCorrectionRequired() {
        return correctionRequired;
    }

    public void setCorrectionRequired(Boolean correctionRequired) {
        this.correctionRequired = correctionRequired;
    }

    /**
     * The field/attribute on the Order associated with message
     **/

    @ApiModelProperty(value = "The field/attribute on the Order associated with message")
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * A description of the error condition or information to be conveyed to the Buyer
     **/

    @ApiModelProperty(required = true, value = "A description of the error condition or information to be conveyed to the Buyer")
    @JsonProperty("messageInformation")
    @NotNull
    public String getMessageInformation() {
        return messageInformation;
    }

    public void setMessageInformation(String messageInformation) {
        this.messageInformation = messageInformation;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("severity")
    @NotNull
    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderMessage orderMessage = (OrderMessage) o;
        return Objects.equals(code, orderMessage.code) &&
                Objects.equals(correctionRequired, orderMessage.correctionRequired) &&
                Objects.equals(field, orderMessage.field) &&
                Objects.equals(messageInformation, orderMessage.messageInformation) &&
                Objects.equals(severity, orderMessage.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, correctionRequired, field, messageInformation, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderMessage {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    correctionRequired: ").append(toIndentedString(correctionRequired)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    messageInformation: ").append(toIndentedString(messageInformation)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

