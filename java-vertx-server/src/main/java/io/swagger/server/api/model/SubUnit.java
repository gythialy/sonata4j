package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sub Unit structure is used to describe several subUnits with a geographical subAddress.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class SubUnit   {
  
  private String subUnitIdentifier = null;
  private String subUnitType = null;

  public SubUnit () {

  }

  public SubUnit (String subUnitIdentifier, String subUnitType) {
    this.subUnitIdentifier = subUnitIdentifier;
    this.subUnitType = subUnitType;
  }

    
  @JsonProperty("subUnitIdentifier")
  public String getSubUnitIdentifier() {
    return subUnitIdentifier;
  }
  public void setSubUnitIdentifier(String subUnitIdentifier) {
    this.subUnitIdentifier = subUnitIdentifier;
  }

    
  @JsonProperty("subUnitType")
  public String getSubUnitType() {
    return subUnitType;
  }
  public void setSubUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubUnit subUnit = (SubUnit) o;
    return Objects.equals(subUnitIdentifier, subUnit.subUnitIdentifier) &&
        Objects.equals(subUnitType, subUnit.subUnitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subUnitIdentifier, subUnitType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
