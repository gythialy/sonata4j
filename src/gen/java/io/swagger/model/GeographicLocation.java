package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "A set of coordinates (typically including latitude and longitude) that describes a particular location on earth.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class GeographicLocation {

    private List<GeographicPoint> geographicPoint = new ArrayList<GeographicPoint>();
    private String id = null;
    private String spatialRef = null;

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("geographicPoint")
    @NotNull
    public List<GeographicPoint> getGeographicPoint() {
        return geographicPoint;
    }

    public void setGeographicPoint(List<GeographicPoint> geographicPoint) {
        this.geographicPoint = geographicPoint;
    }

    /**
     * Unique Identifier of a GeographicLocation
     **/

    @ApiModelProperty(value = "Unique Identifier of a GeographicLocation")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The spatial reference system used to determine the coordinates
     **/

    @ApiModelProperty(required = true, value = "The spatial reference system used to determine the coordinates")
    @JsonProperty("spatialRef")
    @NotNull
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

