package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Reference to productOfferingQualification previously done to check requested product serviceability
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationRef   {
  
  private String referredType = null;
  private String href = null;
  private String id = null;
  private String qualificationItem = null;

  public ProductOfferingQualificationRef () {

  }

  public ProductOfferingQualificationRef (String referredType, String href, String id, String qualificationItem) {
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
    ProductOfferingQualificationRef productOfferingQualificationRef = (ProductOfferingQualificationRef) o;
    return Objects.equals(referredType, productOfferingQualificationRef.referredType) &&
        Objects.equals(href, productOfferingQualificationRef.href) &&
        Objects.equals(id, productOfferingQualificationRef.id) &&
        Objects.equals(qualificationItem, productOfferingQualificationRef.qualificationItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, href, id, qualificationItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationRef {\n");
    
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
