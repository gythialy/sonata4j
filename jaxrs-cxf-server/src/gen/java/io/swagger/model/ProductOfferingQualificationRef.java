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
  * Reference to productOfferingQualification previously done to check requested product serviceability
 **/
@ApiModel(description="Reference to productOfferingQualification previously done to check requested product serviceability")
public class ProductOfferingQualificationRef  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String referredType = null;

  @ApiModelProperty(value = "Link to the productOfferingQualification")
 /**
   * Link to the productOfferingQualification
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Id of the productOfferingQualification")
 /**
   * Id of the productOfferingQualification
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Id of the item of the productOfferingQualification")
 /**
   * Id of the item of the productOfferingQualification
  **/
  private String qualificationItem = null;
 /**
   * Technical attribute to extend this class
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public ProductOfferingQualificationRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * Link to the productOfferingQualification
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOfferingQualificationRef href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Id of the productOfferingQualification
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

  public ProductOfferingQualificationRef id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Id of the item of the productOfferingQualification
   * @return qualificationItem
  **/
  @JsonProperty("qualificationItem")
  @NotNull
  public String getQualificationItem() {
    return qualificationItem;
  }

  public void setQualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
  }

  public ProductOfferingQualificationRef qualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

