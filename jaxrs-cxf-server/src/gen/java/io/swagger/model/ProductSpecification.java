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
  * A ProductSpec describes the invariant properties (i.e., features) that a given set of Products MAY have. These properties provide the information needed to plan, construct, allocate, and/or retire the Services and Resources from the operator environment needed to deliver the Product
 **/
@ApiModel(description="A ProductSpec describes the invariant properties (i.e., features) that a given set of Products MAY have. These properties provide the information needed to plan, construct, allocate, and/or retire the Services and Resources from the operator environment needed to deliver the Product")
public class ProductSpecification  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Describing describing = null;

  @ApiModelProperty(value = "A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.")
 /**
   * A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.
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

  public ProductSpecification describing(Describing describing) {
    this.describing = describing;
    return this;
  }

 /**
   * A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecification id(String id) {
    this.id = id;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecification {\n");
    
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

