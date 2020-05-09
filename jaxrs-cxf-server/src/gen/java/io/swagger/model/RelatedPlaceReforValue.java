package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
  * Place defines the places where the products qualification must be done.
 **/
@ApiModel(description="Place defines the places where the products qualification must be done.")
public class RelatedPlaceReforValue  {
  
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation. Used when place is described by reference @referredType could be valued to FormattedAddress, FieldedAddress, GeographicSite, GeographicLocation or ReferencedAddress")
 /**
   * The actual type of the target instance when needed for disambiguation. Used when place is described by reference @referredType could be valued to FormattedAddress, FieldedAddress, GeographicSite, GeographicLocation or ReferencedAddress
  **/
  private String referredType = null;

  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name. Used when place is described by value (litterally) Could be valued to FormattedAddress, FieldedAddress,  GeographicLocation or ReferencedAddress")
 /**
   * When sub-classing, this defines the sub-class entity name. Used when place is described by value (litterally) Could be valued to FormattedAddress, FieldedAddress,  GeographicLocation or ReferencedAddress
  **/
  private String type = null;

  @ApiModelProperty(value = "href to this place resource")
 /**
   * href to this place resource
  **/
  private String href = null;

  @ApiModelProperty(value = "id of this place")
 /**
   * id of this place
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Role of this place")
 /**
   * Role of this place
  **/
  private String role = null;
 /**
   * The actual type of the target instance when needed for disambiguation. Used when place is described by reference @referredType could be valued to FormattedAddress, FieldedAddress, GeographicSite, GeographicLocation or ReferencedAddress
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RelatedPlaceReforValue referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * When sub-classing, this defines the sub-class entity name. Used when place is described by value (litterally) Could be valued to FormattedAddress, FieldedAddress,  GeographicLocation or ReferencedAddress
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelatedPlaceReforValue type(String type) {
    this.type = type;
    return this;
  }

 /**
   * href to this place resource
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedPlaceReforValue href(String href) {
    this.href = href;
    return this;
  }

 /**
   * id of this place
   * @return id
  **/
  @JsonProperty("id")
 @Size(max=45)  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPlaceReforValue id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Role of this place
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPlaceReforValue role(String role) {
    this.role = role;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPlaceReforValue {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

