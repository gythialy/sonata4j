package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class used to describe API response error
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ErrorRepresentation   {
  
  private String schemaLocation = null;
  private String type = null;
  private Integer code = null;
  private String message = null;
  private String reason = null;
  private String referenceError = null;
  private String status = null;

  public ErrorRepresentation () {

  }

  public ErrorRepresentation (String schemaLocation, String type, Integer code, String message, String reason, String referenceError, String status) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.code = code;
    this.message = message;
    this.reason = reason;
    this.referenceError = referenceError;
    this.status = status;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

    
  @JsonProperty("referenceError")
  public String getReferenceError() {
    return referenceError;
  }
  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

    
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
