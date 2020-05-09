package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class GeographicSubAddress {

    private String schemaLocation = null;
    private String type = null;
    private String buildingName = null;
    private String id = null;
    private String levelNumber = null;
    private String levelType = null;
    private String privateStreetName = null;
    private String privateStreetNumber = null;
    private List<SubUnit> subUnit = new ArrayList<SubUnit>();

    /**
     * Technical attribute to extend this class
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Technical attribute to extend this class
     **/

    @ApiModelProperty(value = "Technical attribute to extend this class")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Allows for buildings that have well-known names
     **/

    @ApiModelProperty(value = "Allows for buildings that have well-known names")
    @JsonProperty("buildingName")
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Unique Identifier of the subAddress
     **/

    @ApiModelProperty(value = "Unique Identifier of the subAddress")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
     **/

    @ApiModelProperty(value = "Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2")
    @JsonProperty("levelNumber")
    public String getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(String levelNumber) {
        this.levelNumber = levelNumber;
    }

    /**
     * Describes level types within a building
     **/

    @ApiModelProperty(value = "Describes level types within a building")
    @JsonProperty("levelType")
    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    /**
     * Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
     **/

    @ApiModelProperty(value = "Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office")
    @JsonProperty("privateStreetName")
    public String getPrivateStreetName() {
        return privateStreetName;
    }

    public void setPrivateStreetName(String privateStreetName) {
        this.privateStreetName = privateStreetName;
    }

    /**
     * Private streets numbers internal to a private street
     **/

    @ApiModelProperty(value = "Private streets numbers internal to a private street")
    @JsonProperty("privateStreetNumber")
    public String getPrivateStreetNumber() {
        return privateStreetNumber;
    }

    public void setPrivateStreetNumber(String privateStreetNumber) {
        this.privateStreetNumber = privateStreetNumber;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("subUnit")
    public List<SubUnit> getSubUnit() {
        return subUnit;
    }

    public void setSubUnit(List<SubUnit> subUnit) {
        this.subUnit = subUnit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicSubAddress geographicSubAddress = (GeographicSubAddress) o;
        return Objects.equals(schemaLocation, geographicSubAddress.schemaLocation) &&
                Objects.equals(type, geographicSubAddress.type) &&
                Objects.equals(buildingName, geographicSubAddress.buildingName) &&
                Objects.equals(id, geographicSubAddress.id) &&
                Objects.equals(levelNumber, geographicSubAddress.levelNumber) &&
                Objects.equals(levelType, geographicSubAddress.levelType) &&
                Objects.equals(privateStreetName, geographicSubAddress.privateStreetName) &&
                Objects.equals(privateStreetNumber, geographicSubAddress.privateStreetNumber) &&
                Objects.equals(subUnit, geographicSubAddress.subUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, buildingName, id, levelNumber, levelType, privateStreetName, privateStreetNumber, subUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicSubAddress {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
        sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
        sb.append("    privateStreetName: ").append(toIndentedString(privateStreetName)).append("\n");
        sb.append("    privateStreetNumber: ").append(toIndentedString(privateStreetNumber)).append("\n");
        sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
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

