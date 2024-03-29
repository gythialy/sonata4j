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
  * A geometric point on earth, which can include a latitude, longitude, and elevation in “decimal degrees” format.
 **/
@ApiModel(description="A geometric point on earth, which can include a latitude, longitude, and elevation in “decimal degrees” format.")
public class GeographicPoint  {
  
  @ApiModelProperty(value = "A unique identifier for the geographic point.")
 /**
   * A unique identifier for the geographic point.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "The latitude expressed in decimal degrees format")
 /**
   * The latitude expressed in decimal degrees format
  **/
  private String latitude = null;

  @ApiModelProperty(required = true, value = "The longitude expressed in decimal degrees format")
 /**
   * The longitude expressed in decimal degrees format
  **/
  private String longitude = null;
 /**
   * A unique identifier for the geographic point.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicPoint id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The latitude expressed in decimal degrees format
   * @return latitude
  **/
  @JsonProperty("latitude")
  @NotNull
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicPoint latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * The longitude expressed in decimal degrees format
   * @return longitude
  **/
  @JsonProperty("longitude")
  @NotNull
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public GeographicPoint longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicPoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

