package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Severity;

/**
 * An optional array of messages associated with the Order
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderMessage   {
  
  private String code = null;
  private Boolean correctionRequired = false;
  private String field = null;
  private String messageInformation = null;
  private Severity severity = null;

  public OrderMessage () {

  }

  public OrderMessage (String code, Boolean correctionRequired, String field, String messageInformation, Severity severity) {
    this.code = code;
    this.correctionRequired = correctionRequired;
    this.field = field;
    this.messageInformation = messageInformation;
    this.severity = severity;
  }

    
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

    
  @JsonProperty("correctionRequired")
  public Boolean isCorrectionRequired() {
    return correctionRequired;
  }
  public void setCorrectionRequired(Boolean correctionRequired) {
    this.correctionRequired = correctionRequired;
  }

    
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

    
  @JsonProperty("messageInformation")
  public String getMessageInformation() {
    return messageInformation;
  }
  public void setMessageInformation(String messageInformation) {
    this.messageInformation = messageInformation;
  }

    
  @JsonProperty("severity")
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
