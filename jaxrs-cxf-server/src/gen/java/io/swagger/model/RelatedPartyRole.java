package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.RelatedParty;
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
  * A party role (not a party) playing a role for this quote or quote Item.
 **/
@ApiModel(description="A party role (not a party) playing a role for this quote or quote Item.")
public class RelatedPartyRole  {
  
  @ApiModelProperty(value = "Referred type for this party role Technical attribute")
 /**
   * Referred type for this party role Technical attribute
  **/
  private String referredType = null;

  @ApiModelProperty(value = "id of the party role")
 /**
   * id of the party role
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RelatedParty relatedParty = null;

  @ApiModelProperty(required = true, value = "Role played for this party role. Could be 'buyer’, ‘seller’ for example.")
 /**
   * Role played for this party role. Could be 'buyer’, ‘seller’ for example.
  **/
  private String role = null;
 /**
   * Referred type for this party role Technical attribute
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RelatedPartyRole referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * id of the party role
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPartyRole id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  @NotNull
  public RelatedParty getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
  }

  public RelatedPartyRole relatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

 /**
   * Role played for this party role. Could be &#39;buyer’, ‘seller’ for example.
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

  public RelatedPartyRole role(String role) {
    this.role = role;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRole {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

