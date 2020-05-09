package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.SubUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicSubAddressRequest   {
  
  private String schemaLocation = null;
  private String type = null;
  private String buildingName = null;
  private String levelNumber = null;
  private String levelType = null;
  private String privateStreetName = null;
  private String privateStreetNumber = null;
  private List<SubUnit> subUnit = new ArrayList<>();

  public GeographicSubAddressRequest () {

  }

  public GeographicSubAddressRequest (String schemaLocation, String type, String buildingName, String levelNumber, String levelType, String privateStreetName, String privateStreetNumber, List<SubUnit> subUnit) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.buildingName = buildingName;
    this.levelNumber = levelNumber;
    this.levelType = levelType;
    this.privateStreetName = privateStreetName;
    this.privateStreetNumber = privateStreetNumber;
    this.subUnit = subUnit;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("buildingName")
  public String getBuildingName() {
    return buildingName;
  }
  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

    
  @JsonProperty("levelNumber")
  public String getLevelNumber() {
    return levelNumber;
  }
  public void setLevelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
  }

    
  @JsonProperty("levelType")
  public String getLevelType() {
    return levelType;
  }
  public void setLevelType(String levelType) {
    this.levelType = levelType;
  }

    
  @JsonProperty("privateStreetName")
  public String getPrivateStreetName() {
    return privateStreetName;
  }
  public void setPrivateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
  }

    
  @JsonProperty("privateStreetNumber")
  public String getPrivateStreetNumber() {
    return privateStreetNumber;
  }
  public void setPrivateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
  }

    
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
    GeographicSubAddressRequest geographicSubAddressRequest = (GeographicSubAddressRequest) o;
    return Objects.equals(schemaLocation, geographicSubAddressRequest.schemaLocation) &&
        Objects.equals(type, geographicSubAddressRequest.type) &&
        Objects.equals(buildingName, geographicSubAddressRequest.buildingName) &&
        Objects.equals(levelNumber, geographicSubAddressRequest.levelNumber) &&
        Objects.equals(levelType, geographicSubAddressRequest.levelType) &&
        Objects.equals(privateStreetName, geographicSubAddressRequest.privateStreetName) &&
        Objects.equals(privateStreetNumber, geographicSubAddressRequest.privateStreetNumber) &&
        Objects.equals(subUnit, geographicSubAddressRequest.subUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, buildingName, levelNumber, levelType, privateStreetName, privateStreetNumber, subUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSubAddressRequest {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
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
