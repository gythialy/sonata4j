package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Place defines the places where the products qualification must be done.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class RelatedPlaceReforValue   {
  
  private String referredType = null;
  private String type = null;
  private String href = null;
  private String id = null;
  private String role = null;

  public RelatedPlaceReforValue () {

  }

  public RelatedPlaceReforValue (String referredType, String type, String href, String id, String role) {
    this.referredType = referredType;
    this.type = type;
    this.href = href;
    this.id = id;
    this.role = role;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
    RelatedPlaceReforValue relatedPlaceReforValue = (RelatedPlaceReforValue) o;
    return Objects.equals(referredType, relatedPlaceReforValue.referredType) &&
        Objects.equals(type, relatedPlaceReforValue.type) &&
        Objects.equals(href, relatedPlaceReforValue.href) &&
        Objects.equals(id, relatedPlaceReforValue.id) &&
        Objects.equals(role, relatedPlaceReforValue.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, type, href, id, role);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
