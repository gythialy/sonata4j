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
  * This class is used to request a HUB creation - Used in the POST operation.
 **/
@ApiModel(description="This class is used to request a HUB creation - Used in the POST operation.")
public class HubInput  {
  
  @ApiModelProperty(required = true, value = "This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event")
 /**
   * This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event
  **/
  private String callback = null;

  @ApiModelProperty(required = true, value = "This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOfferingQualificationStateChangeNotification”}")
 /**
   * This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOfferingQualificationStateChangeNotification”}
  **/
  private String query = null;
 /**
   * This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event
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

  public HubInput callback(String callback) {
    this.callback = callback;
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

  public HubInput query(String query) {
    this.query = query;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HubInput {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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

