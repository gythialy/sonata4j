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
  * Using to refer a serviceability request previously done
 **/
@ApiModel(description="Using to refer a serviceability request previously done")
public class QualificationRef  {
  
  @ApiModelProperty(value = "Technical attribute to extend the API")
 /**
   * Technical attribute to extend the API
  **/
  private String referredType = null;

  @ApiModelProperty(value = "Hyperlink to the qualification previously done for this item")
 /**
   * Hyperlink to the qualification previously done for this item
  **/
  private String href = null;

  @ApiModelProperty(value = "id of the qualification previously done for this item")
 /**
   * id of the qualification previously done for this item
  **/
  private String id = null;

  @ApiModelProperty(value = "item id of the qualification previously done for this item")
 /**
   * item id of the qualification previously done for this item
  **/
  private String qualificationItem = null;
 /**
   * Technical attribute to extend the API
   * @return referredType
  **/
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public QualificationRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

 /**
   * Hyperlink to the qualification previously done for this item
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public QualificationRef href(String href) {
    this.href = href;
    return this;
  }

 /**
   * id of the qualification previously done for this item
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QualificationRef id(String id) {
    this.id = id;
    return this;
  }

 /**
   * item id of the qualification previously done for this item
   * @return qualificationItem
  **/
  @JsonProperty("qualificationItem")
  public String getQualificationItem() {
    return qualificationItem;
  }

  public void setQualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
  }

  public QualificationRef qualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

