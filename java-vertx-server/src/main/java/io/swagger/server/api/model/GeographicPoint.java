package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A geometric point on earth, which can include a latitude, longitude, and elevation in “decimal degrees” format.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicPoint   {
  
  private String id = null;
  private String latitude = null;
  private String longitude = null;

  public GeographicPoint () {

  }

  public GeographicPoint (String id, String latitude, String longitude) {
    this.id = id;
    this.latitude = latitude;
    this.longitude = longitude;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicPoint geographicPoint = (GeographicPoint) o;
    return Objects.equals(id, geographicPoint.id) &&
        Objects.equals(latitude, geographicPoint.latitude) &&
        Objects.equals(longitude, geographicPoint.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latitude, longitude);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
