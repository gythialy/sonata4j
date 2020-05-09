package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.SubUnit;
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
  * It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.
 **/
@ApiModel(description="It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.")
public class GeographicSubAddress  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String type = null;

  @ApiModelProperty(value = "Allows for buildings that have well-known names")
 /**
   * Allows for buildings that have well-known names
  **/
  private String buildingName = null;

  @ApiModelProperty(value = "Unique Identifier of the subAddress")
 /**
   * Unique Identifier of the subAddress
  **/
  private String id = null;

  @ApiModelProperty(value = "Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2")
 /**
   * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
  **/
  private String levelNumber = null;

  @ApiModelProperty(value = "Describes level types within a building")
 /**
   * Describes level types within a building
  **/
  private String levelType = null;

  @ApiModelProperty(value = "Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office")
 /**
   * Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
  **/
  private String privateStreetName = null;

  @ApiModelProperty(value = "Private streets numbers internal to a private street")
 /**
   * Private streets numbers internal to a private street
  **/
  private String privateStreetNumber = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<SubUnit> subUnit = null;
 /**
   * Technical attribute to extend this class
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public GeographicSubAddress schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Technical attribute to extend this class
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeographicSubAddress type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Allows for buildings that have well-known names
   * @return buildingName
  **/
  @JsonProperty("buildingName")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public GeographicSubAddress buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

 /**
   * Unique Identifier of the subAddress
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicSubAddress id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
   * @return levelNumber
  **/
  @JsonProperty("levelNumber")
  public String getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GeographicSubAddress levelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

 /**
   * Describes level types within a building
   * @return levelType
  **/
  @JsonProperty("levelType")
  public String getLevelType() {
    return levelType;
  }

  public void setLevelType(String levelType) {
    this.levelType = levelType;
  }

  public GeographicSubAddress levelType(String levelType) {
    this.levelType = levelType;
    return this;
  }

 /**
   * Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
   * @return privateStreetName
  **/
  @JsonProperty("privateStreetName")
  public String getPrivateStreetName() {
    return privateStreetName;
  }

  public void setPrivateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
  }

  public GeographicSubAddress privateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
    return this;
  }

 /**
   * Private streets numbers internal to a private street
   * @return privateStreetNumber
  **/
  @JsonProperty("privateStreetNumber")
  public String getPrivateStreetNumber() {
    return privateStreetNumber;
  }

  public void setPrivateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
  }

  public GeographicSubAddress privateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
    return this;
  }

 /**
   * Get subUnit
   * @return subUnit
  **/
  @JsonProperty("subUnit")
  public List<SubUnit> getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(List<SubUnit> subUnit) {
    this.subUnit = subUnit;
  }

  public GeographicSubAddress subUnit(List<SubUnit> subUnit) {
    this.subUnit = subUnit;
    return this;
  }

  public GeographicSubAddress addSubUnitItem(SubUnit subUnitItem) {
    this.subUnit.add(subUnitItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

