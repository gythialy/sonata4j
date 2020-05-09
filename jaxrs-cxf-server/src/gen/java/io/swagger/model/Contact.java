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
  * Contact allow to capture contact information. It is used to capture billing account contact information
 **/
@ApiModel(description="Contact allow to capture contact information. It is used to capture billing account contact information")
public class Contact  {
  
  @ApiModelProperty(value = "Technical attribut to extend API")
 /**
   * Technical attribut to extend API
  **/
  private String referredType = null;

  @ApiModelProperty(required = true, value = "Identifies the name of the person or office to be contacted on billing matters.")
 /**
   * Identifies the name of the person or office to be contacted on billing matters.
  **/
  private String contactName = null;

  @ApiModelProperty(required = true, value = "Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.")
 /**
   * Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.
  **/
  private String emailAdress = null;

  @ApiModelProperty(required = true, value = "Identifies the telephone number (excluding extension) of the billing contact")
 /**
   * Identifies the telephone number (excluding extension) of the billing contact
  **/
  private String phoneNumber = null;

  @ApiModelProperty(value = "Identifies the telephone number extension of the billing contact")
 /**
   * Identifies the telephone number extension of the billing contact
  **/
  private String phoneNumberExtension = null;

  @ApiModelProperty(required = true, value = "Identifies the address of the person or office to be contacted on billing matters.")
 /**
   * Identifies the address of the person or office to be contacted on billing matters.
  **/
  private String streetAdress = null;
 /**
   * Technical attribut to extend API
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public Contact referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * Identifies the name of the person or office to be contacted on billing matters.
   * @return contactName
  **/
  @JsonProperty("contactName")
  @NotNull
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Contact contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

 /**
   * Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.
   * @return emailAdress
  **/
  @JsonProperty("emailAdress")
  @NotNull
  public String getEmailAdress() {
    return emailAdress;
  }

  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

  public Contact emailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
    return this;
  }

 /**
   * Identifies the telephone number (excluding extension) of the billing contact
   * @return phoneNumber
  **/
  @JsonProperty("phoneNumber")
  @NotNull
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Contact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

 /**
   * Identifies the telephone number extension of the billing contact
   * @return phoneNumberExtension
  **/
  @JsonProperty("phoneNumberExtension")
  public String getPhoneNumberExtension() {
    return phoneNumberExtension;
  }

  public void setPhoneNumberExtension(String phoneNumberExtension) {
    this.phoneNumberExtension = phoneNumberExtension;
  }

  public Contact phoneNumberExtension(String phoneNumberExtension) {
    this.phoneNumberExtension = phoneNumberExtension;
    return this;
  }

 /**
   * Identifies the address of the person or office to be contacted on billing matters.
   * @return streetAdress
  **/
  @JsonProperty("streetAdress")
  @NotNull
  public String getStreetAdress() {
    return streetAdress;
  }

  public void setStreetAdress(String streetAdress) {
    this.streetAdress = streetAdress;
  }

  public Contact streetAdress(String streetAdress) {
    this.streetAdress = streetAdress;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    emailAdress: ").append(toIndentedString(emailAdress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberExtension: ").append(toIndentedString(phoneNumberExtension)).append("\n");
    sb.append("    streetAdress: ").append(toIndentedString(streetAdress)).append("\n");
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

