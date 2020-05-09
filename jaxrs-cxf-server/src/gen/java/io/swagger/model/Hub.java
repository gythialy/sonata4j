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
  * This resource is used to manage notification subscription.
 **/
@ApiModel(description="This resource is used to manage notification subscription.")
public class Hub  {
  
  @ApiModelProperty(required = true, value = "This callback address is an url. the norification will be sent to this url address")
 /**
   * This callback address is an url. the norification will be sent to this url address
  **/
  private String callback = null;

  @ApiModelProperty(required = true, value = "id of the Hub")
 /**
   * id of the Hub
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOfferingQualificationStateChangeNotification”}")
 /**
   * This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOfferingQualificationStateChangeNotification”}
  **/
  private String query = null;
 /**
   * This callback address is an url. the norification will be sent to this url address
   * @return callback
  **/
  @JsonProperty("callback")
  @NotNull
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public Hub callback(String callback) {
    this.callback = callback;
    return this;
  }

 /**
   * id of the Hub
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

  public Hub id(String id) {
    this.id = id;
    return this;
  }

 /**
   * This attribute is used to define notification type. Example: \&quot;,\&quot;query\&quot;:”eventType &#x3D; ProductOfferingQualificationStateChangeNotification”}
   * @return query
  **/
  @JsonProperty("query")
  @NotNull
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Hub query(String query) {
    this.query = query;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hub {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

