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
  * Sub Unit structure is used to describe several subUnits with a geographical subAddress.
 **/
@ApiModel(description="Sub Unit structure is used to describe several subUnits with a geographical subAddress.")
public class SubUnit  {
  
  @ApiModelProperty(required = true, value = "The discriminator used for the subunit, often just a simple number but may also be a range.")
 /**
   * The discriminator used for the subunit, often just a simple number but may also be a range.
  **/
  private String subUnitIdentifier = null;

  @ApiModelProperty(required = true, value = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.")
 /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
  **/
  private String subUnitType = null;
 /**
   * The discriminator used for the subunit, often just a simple number but may also be a range.
   * @return subUnitIdentifier
  **/
  @JsonProperty("subUnitIdentifier")
  @NotNull
  public String getSubUnitIdentifier() {
    return subUnitIdentifier;
  }

  public void setSubUnitIdentifier(String subUnitIdentifier) {
    this.subUnitIdentifier = subUnitIdentifier;
  }

  public SubUnit subUnitIdentifier(String subUnitIdentifier) {
    this.subUnitIdentifier = subUnitIdentifier;
    return this;
  }

 /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
   * @return subUnitType
  **/
  @JsonProperty("subUnitType")
  @NotNull
  public String getSubUnitType() {
    return subUnitType;
  }

  public void setSubUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
  }

  public SubUnit subUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubUnit {\n");
    
    sb.append("    subUnitIdentifier: ").append(toIndentedString(subUnitIdentifier)).append("\n");
    sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
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

