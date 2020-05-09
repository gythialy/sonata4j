package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.TimeInterval;
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
  * If in the request the buyer has requested to have alternate product proposals, then this class represents these proposals.
 **/
@ApiModel(description="If in the request the buyer has requested to have alternate product proposals, then this class represents these proposals.")
public class AlternateProductProposal  {
  
  @ApiModelProperty(value = "Technical attribute to extend the class.")
 /**
   * Technical attribute to extend the class.
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProductOfferingRef> eligibleProductOffering = null;

  @ApiModelProperty(required = true, value = "Identifier of the Product Offering Qualification alternate proposal")
 /**
   * Identifier of the Product Offering Qualification alternate proposal
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private TimeInterval installationInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductSpecificationRef productSpecification = null;
 /**
   * Technical attribute to extend the class.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AlternateProductProposal type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get eligibleProductOffering
   * @return eligibleProductOffering
  **/
  @JsonProperty("eligibleProductOffering")
  public List<ProductOfferingRef> getEligibleProductOffering() {
    return eligibleProductOffering;
  }

  public void setEligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
  }

  public AlternateProductProposal eligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
    return this;
  }

  public AlternateProductProposal addEligibleProductOfferingItem(ProductOfferingRef eligibleProductOfferingItem) {
    this.eligibleProductOffering.add(eligibleProductOfferingItem);
    return this;
  }

 /**
   * Identifier of the Product Offering Qualification alternate proposal
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

  public AlternateProductProposal id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get installationInterval
   * @return installationInterval
  **/
  @JsonProperty("installationInterval")
  public TimeInterval getInstallationInterval() {
    return installationInterval;
  }

  public void setInstallationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
  }

  public AlternateProductProposal installationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
    return this;
  }

 /**
   * Get productSpecification
   * @return productSpecification
  **/
  @JsonProperty("productSpecification")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public AlternateProductProposal productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternateProductProposal {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eligibleProductOffering: ").append(toIndentedString(eligibleProductOffering)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationInterval: ").append(toIndentedString(installationInterval)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

