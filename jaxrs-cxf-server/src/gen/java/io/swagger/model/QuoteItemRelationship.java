package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.RelationshipType;
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
  * Used to describe relationship between quote item. These relationships could have an impact on pricing and conditions.
 **/
@ApiModel(description="Used to describe relationship between quote item. These relationships could have an impact on pricing and conditions.")
public class QuoteItemRelationship  {
  
  @ApiModelProperty(required = true, value = "ID of the related order item (must be in the same quote).")
 /**
   * ID of the related order item (must be in the same quote).
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RelationshipType type = null;
 /**
   * ID of the related order item (must be in the same quote).
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteItemRelationship id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public RelationshipType getType() {
    return type;
  }

  public void setType(RelationshipType type) {
    this.type = type;
  }

  public QuoteItemRelationship type(RelationshipType type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteItemRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

