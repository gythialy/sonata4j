package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.GeographicPoint;
import java.util.ArrayList;
import java.util.List;

/**
 * A set of coordinates (typically including latitude and longitude) that describes a particular location on earth.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicLocation   {
  
  private List<GeographicPoint> geographicPoint = new ArrayList<>();
  private String id = null;
  private String spatialRef = null;

  public GeographicLocation () {

  }

  public GeographicLocation (List<GeographicPoint> geographicPoint, String id, String spatialRef) {
    this.geographicPoint = geographicPoint;
    this.id = id;
    this.spatialRef = spatialRef;
  }

    
  @JsonProperty("geographicPoint")
  public List<GeographicPoint> getGeographicPoint() {
    return geographicPoint;
  }
  public void setGeographicPoint(List<GeographicPoint> geographicPoint) {
    this.geographicPoint = geographicPoint;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("spatialRef")
  public String getSpatialRef() {
    return spatialRef;
  }
  public void setSpatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicLocation geographicLocation = (GeographicLocation) o;
    return Objects.equals(geographicPoint, geographicLocation.geographicPoint) &&
        Objects.equals(id, geographicLocation.id) &&
        Objects.equals(spatialRef, geographicLocation.spatialRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicPoint, id, spatialRef);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
