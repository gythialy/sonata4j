package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact allow to capture contact information. It is used to capture billing account contact information
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Contact   {
  
  private String referredType = null;
  private String contactName = null;
  private String emailAdress = null;
  private String phoneNumber = null;
  private String phoneNumberExtension = null;
  private String streetAdress = null;

  public Contact () {

  }

  public Contact (String referredType, String contactName, String emailAdress, String phoneNumber, String phoneNumberExtension, String streetAdress) {
    this.referredType = referredType;
    this.contactName = contactName;
    this.emailAdress = emailAdress;
    this.phoneNumber = phoneNumber;
    this.phoneNumberExtension = phoneNumberExtension;
    this.streetAdress = streetAdress;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

    
  @JsonProperty("contactName")
  public String getContactName() {
    return contactName;
  }
  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

    
  @JsonProperty("emailAdress")
  public String getEmailAdress() {
    return emailAdress;
  }
  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

    
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

    
  @JsonProperty("phoneNumberExtension")
  public String getPhoneNumberExtension() {
    return phoneNumberExtension;
  }
  public void setPhoneNumberExtension(String phoneNumberExtension) {
    this.phoneNumberExtension = phoneNumberExtension;
  }

    
  @JsonProperty("streetAdress")
  public String getStreetAdress() {
    return streetAdress;
  }
  public void setStreetAdress(String streetAdress) {
    this.streetAdress = streetAdress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(referredType, contact.referredType) &&
        Objects.equals(contactName, contact.contactName) &&
        Objects.equals(emailAdress, contact.emailAdress) &&
        Objects.equals(phoneNumber, contact.phoneNumber) &&
        Objects.equals(phoneNumberExtension, contact.phoneNumberExtension) &&
        Objects.equals(streetAdress, contact.streetAdress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, contactName, emailAdress, phoneNumber, phoneNumberExtension, streetAdress);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
