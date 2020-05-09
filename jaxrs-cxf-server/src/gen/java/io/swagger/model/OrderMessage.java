package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Severity;
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
  * An optional array of messages associated with the Order
 **/
@ApiModel(description="An optional array of messages associated with the Order")
public class OrderMessage  {
  
  @ApiModelProperty(value = "The code associated with the Message")
 /**
   * The code associated with the Message
  **/
  private String code = null;

  @ApiModelProperty(value = "Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.")
 /**
   * Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.
  **/
  private Boolean correctionRequired = false;

  @ApiModelProperty(value = "The field/attribute on the Order associated with message")
 /**
   * The field/attribute on the Order associated with message
  **/
  private String field = null;

  @ApiModelProperty(required = true, value = "A description of the error condition or information to be conveyed to the Buyer")
 /**
   * A description of the error condition or information to be conveyed to the Buyer
  **/
  private String messageInformation = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Severity severity = null;
 /**
   * The code associated with the Message
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderMessage code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.
   * @return correctionRequired
  **/
  @JsonProperty("correctionRequired")
  public Boolean isCorrectionRequired() {
    return correctionRequired;
  }

  public void setCorrectionRequired(Boolean correctionRequired) {
    this.correctionRequired = correctionRequired;
  }

  public OrderMessage correctionRequired(Boolean correctionRequired) {
    this.correctionRequired = correctionRequired;
    return this;
  }

 /**
   * The field/attribute on the Order associated with message
   * @return field
  **/
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public OrderMessage field(String field) {
    this.field = field;
    return this;
  }

 /**
   * A description of the error condition or information to be conveyed to the Buyer
   * @return messageInformation
  **/
  @JsonProperty("messageInformation")
  @NotNull
  public String getMessageInformation() {
    return messageInformation;
  }

  public void setMessageInformation(String messageInformation) {
    this.messageInformation = messageInformation;
  }

  public OrderMessage messageInformation(String messageInformation) {
    this.messageInformation = messageInformation;
    return this;
  }

 /**
   * Get severity
   * @return severity
  **/
  @JsonProperty("severity")
  @NotNull
  public Severity getSeverity() {
    return severity;
  }

  public void setSeverity(Severity severity) {
    this.severity = severity;
  }

  public OrderMessage severity(Severity severity) {
    this.severity = severity;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

