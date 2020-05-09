package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Using to refer a serviceability request previously done
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QualificationRef   {
  
  private String referredType = null;
  private String href = null;
  private String id = null;
  private String qualificationItem = null;

  public QualificationRef () {

  }

  public QualificationRef (String referredType, String href, String id, String qualificationItem) {
    this.referredType = referredType;
    this.href = href;
    this.id = id;
    this.qualificationItem = qualificationItem;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
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

    
  @JsonProperty("qualificationItem")
  public String getQualificationItem() {
    return qualificationItem;
  }
  public void setQualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationRef qualificationRef = (QualificationRef) o;
    return Objects.equals(referredType, qualificationRef.referredType) &&
        Objects.equals(href, qualificationRef.href) &&
        Objects.equals(id, qualificationRef.id) &&
        Objects.equals(qualificationItem, qualificationRef.qualificationItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, href, id, qualificationItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationRef {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    qualificationItem: ").append(toIndentedString(qualificationItem)).append("\n");
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
