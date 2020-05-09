package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A geometric point on earth, which can include a latitude, longitude, and elevation in “decimal degrees” format.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class GeographicPoint {

    private String id = null;
    private String latitude = null;
    private String longitude = null;

    /**
     * A unique identifier for the geographic point.
     **/

    @ApiModelProperty(value = "A unique identifier for the geographic point.")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The latitude expressed in decimal degrees format
     **/

    @ApiModelProperty(required = true, value = "The latitude expressed in decimal degrees format")
    @JsonProperty("latitude")
    @NotNull
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * The longitude expressed in decimal degrees format
     **/

    @ApiModelProperty(required = true, value = "The longitude expressed in decimal degrees format")
    @JsonProperty("longitude")
    @NotNull
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

