package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * An entity or organization that is involved to the geographical site, such as the Site Contact or Site Alternate Contact.
 **/
@ApiModel(description="An entity or organization that is involved to the geographical site, such as the Site Contact or Site Alternate Contact.")
public class RelatedParty  {
  
  @ApiModelProperty(value = "Allow to specify the party type like Organization or Individual")
 /**
   * Allow to specify the party type like Organization or Individual
  **/
  private String referredType = null;

  @ApiModelProperty(value = "The email address of the related party.")
 /**
   * The email address of the related party.
  **/
  private String emailAddress = null;

  @ApiModelProperty(required = true, value = "An identifier of the related party.")
 /**
   * An identifier of the related party.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "The name of the related party, e.g. \"Jean Pontus\".")
 /**
   * The name of the related party, e.g. \"Jean Pontus\".
  **/
  private String name = null;

  @ApiModelProperty(value = "The telephone number of the related party.")
 /**
   * The telephone number of the related party.
  **/
  private String number = null;

  @ApiModelProperty(value = "Phone number Extension.")
 /**
   * Phone number Extension.
  **/
  private String numberExtension = null;

  @ApiModelProperty(required = true, value = "Role played by this party for this Site as UNISiteContact for example.")
 /**
   * Role played by this party for this Site as UNISiteContact for example.
  **/
  private List<String> role = new ArrayList<String>();
 /**
   * Allow to specify the party type like Organization or Individual
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public RelatedParty referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * The email address of the related party.
   * @return emailAddress
  **/
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public RelatedParty emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

 /**
   * An identifier of the related party.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The name of the related party, e.g. \&quot;Jean Pontus\&quot;.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedParty name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The telephone number of the related party.
   * @return number
  **/
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public RelatedParty number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Phone number Extension.
   * @return numberExtension
  **/
  @JsonProperty("numberExtension")
  public String getNumberExtension() {
    return numberExtension;
  }

  public void setNumberExtension(String numberExtension) {
    this.numberExtension = numberExtension;
  }

  public RelatedParty numberExtension(String numberExtension) {
    this.numberExtension = numberExtension;
    return this;
  }

 /**
   * Role played by this party for this Site as UNISiteContact for example.
   * @return role
  **/
  @JsonProperty("role")
  @NotNull
  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) {
    this.role = role;
  }

  public RelatedParty role(List<String> role) {
    this.role = role;
    return this;
  }

  public RelatedParty addRoleItem(String roleItem) {
    this.role.add(roleItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberExtension: ").append(toIndentedString(numberExtension)).append("\n");
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

