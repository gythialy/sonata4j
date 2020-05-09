package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Describing;
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
  * A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.
 **/
@ApiModel(description="A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.")
public class ProductSpecificationRef  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Describing describing = null;

  @ApiModelProperty(required = true, value = "A unique identifier of the product spec.")
 /**
   * A unique identifier of the product spec.
  **/
  private String id = null;
 /**
   * Get describing
   * @return describing
  **/
  @JsonProperty("describing")
  public Describing getDescribing() {
    return describing;
  }

  public void setDescribing(Describing describing) {
    this.describing = describing;
  }

  public ProductSpecificationRef describing(Describing describing) {
    this.describing = describing;
    return this;
  }

 /**
   * A unique identifier of the product spec.
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

  public ProductSpecificationRef id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRef {\n");
    
    sb.append("    describing: ").append(toIndentedString(describing)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

