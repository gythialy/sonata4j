package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.GeographicPoint;
import java.util.ArrayList;
import java.util.List;
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
  * A set of coordinates (typically including latitude and longitude) that describes a particular location on earth.
 **/
@ApiModel(description="A set of coordinates (typically including latitude and longitude) that describes a particular location on earth.")
public class GeographicLocation  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<GeographicPoint> geographicPoint = new ArrayList<GeographicPoint>();

  @ApiModelProperty(value = "Unique Identifier of a GeographicLocation")
 /**
   * Unique Identifier of a GeographicLocation
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "The spatial reference system used to determine the coordinates")
 /**
   * The spatial reference system used to determine the coordinates
  **/
  private String spatialRef = null;
 /**
   * Get geographicPoint
   * @return geographicPoint
  **/
  @JsonProperty("geographicPoint")
  @NotNull
  public List<GeographicPoint> getGeographicPoint() {
    return geographicPoint;
  }

  public void setGeographicPoint(List<GeographicPoint> geographicPoint) {
    this.geographicPoint = geographicPoint;
  }

  public GeographicLocation geographicPoint(List<GeographicPoint> geographicPoint) {
    this.geographicPoint = geographicPoint;
    return this;
  }

  public GeographicLocation addGeographicPointItem(GeographicPoint geographicPointItem) {
    this.geographicPoint.add(geographicPointItem);
    return this;
  }

 /**
   * Unique Identifier of a GeographicLocation
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicLocation id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The spatial reference system used to determine the coordinates
   * @return spatialRef
  **/
  @JsonProperty("spatialRef")
  @NotNull
  public String getSpatialRef() {
    return spatialRef;
  }

  public void setSpatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
  }

  public GeographicLocation spatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicLocation {\n");
    
    sb.append("    geographicPoint: ").append(toIndentedString(geographicPoint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spatialRef: ").append(toIndentedString(spatialRef)).append("\n");
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

