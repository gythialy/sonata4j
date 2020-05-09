package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.RelatedParty;

/**
 * A party role (not a party) playing a role for this quote or quote Item.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class RelatedPartyRole   {
  
  private String referredType = null;
  private String id = null;
  private RelatedParty relatedParty = null;
  private String role = null;

  public RelatedPartyRole () {

  }

  public RelatedPartyRole (String referredType, String id, RelatedParty relatedParty, String role) {
    this.referredType = referredType;
    this.id = id;
    this.relatedParty = relatedParty;
    this.role = role;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("relatedParty")
  public RelatedParty getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("role")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
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
    RelatedPartyRole relatedPartyRole = (RelatedPartyRole) o;
    return Objects.equals(referredType, relatedPartyRole.referredType) &&
        Objects.equals(id, relatedPartyRole.id) &&
        Objects.equals(relatedParty, relatedPartyRole.relatedParty) &&
        Objects.equals(role, relatedPartyRole.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, id, relatedParty, role);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
