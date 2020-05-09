package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * An entity or organization that is involved to the geographical site, such as the Site Contact or Site Alternate Contact.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class RelatedParty   {
  
  private String referredType = null;
  private String emailAddress = null;
  private String id = null;
  private String name = null;
  private String number = null;
  private String numberExtension = null;
  private List<String> role = new ArrayList<>();

  public RelatedParty () {

  }

  public RelatedParty (String referredType, String emailAddress, String id, String name, String number, String numberExtension, List<String> role) {
    this.referredType = referredType;
    this.emailAddress = emailAddress;
    this.id = id;
    this.name = name;
    this.number = number;
    this.numberExtension = numberExtension;
    this.role = role;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

    
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

    
  @JsonProperty("numberExtension")
  public String getNumberExtension() {
    return numberExtension;
  }
  public void setNumberExtension(String numberExtension) {
    this.numberExtension = numberExtension;
  }

    
  @JsonProperty("role")
  public List<String> getRole() {
    return role;
  }
  public void setRole(List<String> role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(referredType, relatedParty.referredType) &&
        Objects.equals(emailAddress, relatedParty.emailAddress) &&
        Objects.equals(id, relatedParty.id) &&
        Objects.equals(name, relatedParty.name) &&
        Objects.equals(number, relatedParty.number) &&
        Objects.equals(numberExtension, relatedParty.numberExtension) &&
        Objects.equals(role, relatedParty.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, emailAddress, id, name, number, numberExtension, role);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
