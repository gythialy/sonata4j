package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOfferingQualificationStateType;
import org.joda.time.LocalDate;
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
  * This class is used to describe attribute to be used for requesting POQ list (used in the GET by list)
 **/
@ApiModel(description="This class is used to describe attribute to be used for requesting POQ list (used in the GET by list)")
public class ProductOfferingQualificationFind  {
  
  @ApiModelProperty(value = "The Serviceability Request's unique identifier.")
 /**
   * The Serviceability Request's unique identifier.
  **/
  private String id = null;

  @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.")
 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
  **/
  private String projectId = null;

  @ApiModelProperty(value = "Corresponds to desiredResponseDate - The date a response for the service request is desired.")
 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
  **/
  private LocalDate requestedResponseDate = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingQualificationStateType state = null;
 /**
   * The Serviceability Request&#39;s unique identifier.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOfferingQualificationFind id(String id) {
    this.id = id;
    return this;
  }

 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
   * @return projectId
  **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProductOfferingQualificationFind projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * Corresponds to desiredResponseDate - The date a response for the service request is desired.
   * @return requestedResponseDate
  **/
  @JsonProperty("requestedResponseDate")
  public LocalDate getRequestedResponseDate() {
    return requestedResponseDate;
  }

  public void setRequestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }

  public ProductOfferingQualificationFind requestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public ProductOfferingQualificationStateType getState() {
    return state;
  }

  public void setState(ProductOfferingQualificationStateType state) {
    this.state = state;
  }

  public ProductOfferingQualificationFind state(ProductOfferingQualificationStateType state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationFind {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

