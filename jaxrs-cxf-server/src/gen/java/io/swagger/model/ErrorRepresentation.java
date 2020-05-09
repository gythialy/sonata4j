package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Class used to describe API response error
 **/
@ApiModel(description="Class used to describe API response error")
public class ErrorRepresentation  {
  
  @ApiModelProperty(value = "it provides a link to the schema describing a REST resource.")
 /**
   * it provides a link to the schema describing a REST resource.
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "The class type of a REST resource.")
 /**
   * The class type of a REST resource.
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "Application related code (as defined in the API or from a common list)")
 /**
   * Application related code (as defined in the API or from a common list)
  **/
  private Integer code = null;

  @ApiModelProperty(value = "Text that provide more details and corrective actions related to the error. This can be shown to a client user.")
 /**
   * Text that provide more details and corrective actions related to the error. This can be shown to a client user.
  **/
  private String message = null;

  @ApiModelProperty(required = true, value = "Text that explains the reason for error. This can be shown to a client user.")
 /**
   * Text that explains the reason for error. This can be shown to a client user.
  **/
  private String reason = null;

  @ApiModelProperty(value = "url pointing to documentation describing the error")
 /**
   * url pointing to documentation describing the error
  **/
  private String referenceError = null;

  @ApiModelProperty(value = "http error code extension like 400-2")
 /**
   * http error code extension like 400-2
  **/
  private String status = null;
 /**
   * it provides a link to the schema describing a REST resource.
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ErrorRepresentation schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * The class type of a REST resource.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ErrorRepresentation type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Application related code (as defined in the API or from a common list)
   * @return code
  **/
  @JsonProperty("code")
  @NotNull
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorRepresentation code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Text that provide more details and corrective actions related to the error. This can be shown to a client user.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorRepresentation message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Text that explains the reason for error. This can be shown to a client user.
   * @return reason
  **/
  @JsonProperty("reason")
  @NotNull
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorRepresentation reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * url pointing to documentation describing the error
   * @return referenceError
  **/
  @JsonProperty("referenceError")
  public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  public ErrorRepresentation referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

 /**
   * http error code extension like 400-2
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorRepresentation status(String status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

