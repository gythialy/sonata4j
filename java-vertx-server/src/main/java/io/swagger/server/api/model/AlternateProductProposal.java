package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.ProductSpecificationRef;
import io.swagger.server.api.model.TimeInterval;
import java.util.ArrayList;
import java.util.List;

/**
 * If in the request the buyer has requested to have alternate product proposals, then this class represents these proposals.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AlternateProductProposal   {
  
  private String type = null;
  private List<ProductOfferingRef> eligibleProductOffering = new ArrayList<>();
  private String id = null;
  private TimeInterval installationInterval = null;
  private ProductSpecificationRef productSpecification = null;

  public AlternateProductProposal () {

  }

  public AlternateProductProposal (String type, List<ProductOfferingRef> eligibleProductOffering, String id, TimeInterval installationInterval, ProductSpecificationRef productSpecification) {
    this.type = type;
    this.eligibleProductOffering = eligibleProductOffering;
    this.id = id;
    this.installationInterval = installationInterval;
    this.productSpecification = productSpecification;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("eligibleProductOffering")
  public List<ProductOfferingRef> getEligibleProductOffering() {
    return eligibleProductOffering;
  }
  public void setEligibleProductOffering(List<ProductOfferingRef> eligibleProductOffering) {
    this.eligibleProductOffering = eligibleProductOffering;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("installationInterval")
  public TimeInterval getInstallationInterval() {
    return installationInterval;
  }
  public void setInstallationInterval(TimeInterval installationInterval) {
    this.installationInterval = installationInterval;
  }

    
  @JsonProperty("productSpecification")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }
  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternateProductProposal alternateProductProposal = (AlternateProductProposal) o;
    return Objects.equals(type, alternateProductProposal.type) &&
        Objects.equals(eligibleProductOffering, alternateProductProposal.eligibleProductOffering) &&
        Objects.equals(id, alternateProductProposal.id) &&
        Objects.equals(installationInterval, alternateProductProposal.installationInterval) &&
        Objects.equals(productSpecification, alternateProductProposal.productSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, eligibleProductOffering, id, installationInterval, productSpecification);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
