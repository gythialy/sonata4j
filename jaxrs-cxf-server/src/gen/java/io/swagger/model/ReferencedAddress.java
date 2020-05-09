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
  * A globally unique identifier controlled by a generally accepted independent administrative authority that specifies a fixed geographical location.
 **/
@ApiModel(description="A globally unique identifier controlled by a generally accepted independent administrative authority that specifies a fixed geographical location.")
public class ReferencedAddress  {
  
  @ApiModelProperty(value = "Unique identifier of the address")
 /**
   * Unique identifier of the address
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Id of a reference address")
 /**
   * Id of a reference address
  **/
  private String referenceId = null;

  @ApiModelProperty(required = true, value = "Type of a reference address")
 /**
   * Type of a reference address
  **/
  private String referenceType = null;
 /**
   * Unique identifier of the address
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReferencedAddress id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Id of a reference address
   * @return referenceId
  **/
  @JsonProperty("referenceId")
  @NotNull
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public ReferencedAddress referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

 /**
   * Type of a reference address
   * @return referenceType
  **/
  @JsonProperty("referenceType")
  @NotNull
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public ReferencedAddress referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

