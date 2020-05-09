package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Contact allow to capture contact information. It is used to capture billing account contact information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Contact {

    private String referredType = null;
    private String contactName = null;
    private String emailAdress = null;
    private String phoneNumber = null;
    private String phoneNumberExtension = null;
    private String streetAdress = null;

    /**
     * Technical attribut to extend API
     **/

    @ApiModelProperty(value = "Technical attribut to extend API")
    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    /**
     * Identifies the name of the person or office to be contacted on billing matters.
     **/

    @ApiModelProperty(required = true, value = "Identifies the name of the person or office to be contacted on billing matters.")
    @JsonProperty("contactName")
    @NotNull
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.
     **/

    @ApiModelProperty(required = true, value = "Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.")
    @JsonProperty("emailAdress")
    @NotNull
    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    /**
     * Identifies the telephone number (excluding extension) of the billing contact
     **/

    @ApiModelProperty(required = true, value = "Identifies the telephone number (excluding extension) of the billing contact")
    @JsonProperty("phoneNumber")
    @NotNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Identifies the telephone number extension of the billing contact
     **/

    @ApiModelProperty(value = "Identifies the telephone number extension of the billing contact")
    @JsonProperty("phoneNumberExtension")
    public String getPhoneNumberExtension() {
        return phoneNumberExtension;
    }

    public void setPhoneNumberExtension(String phoneNumberExtension) {
        this.phoneNumberExtension = phoneNumberExtension;
    }

    /**
     * Identifies the address of the person or office to be contacted on billing matters.
     **/

    @ApiModelProperty(required = true, value = "Identifies the address of the person or office to be contacted on billing matters.")
    @JsonProperty("streetAdress")
    @NotNull
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

