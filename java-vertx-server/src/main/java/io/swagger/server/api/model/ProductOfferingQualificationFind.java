package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingQualificationStateType;
import java.time.LocalDate;

/**
 * This class is used to describe attribute to be used for requesting POQ list (used in the GET by list)
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationFind   {
  
  private String id = null;
  private String projectId = null;
  private LocalDate requestedResponseDate = null;
  private ProductOfferingQualificationStateType state = null;

  public ProductOfferingQualificationFind () {

  }

  public ProductOfferingQualificationFind (String id, String projectId, LocalDate requestedResponseDate, ProductOfferingQualificationStateType state) {
    this.id = id;
    this.projectId = projectId;
    this.requestedResponseDate = requestedResponseDate;
    this.state = state;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

    
  @JsonProperty("requestedResponseDate")
  public LocalDate getRequestedResponseDate() {
    return requestedResponseDate;
  }
  public void setRequestedResponseDate(LocalDate requestedResponseDate) {
    this.requestedResponseDate = requestedResponseDate;
  }

    
  @JsonProperty("state")
  public ProductOfferingQualificationStateType getState() {
    return state;
  }
  public void setState(ProductOfferingQualificationStateType state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationFind productOfferingQualificationFind = (ProductOfferingQualificationFind) o;
    return Objects.equals(id, productOfferingQualificationFind.id) &&
        Objects.equals(projectId, productOfferingQualificationFind.projectId) &&
        Objects.equals(requestedResponseDate, productOfferingQualificationFind.requestedResponseDate) &&
        Objects.equals(state, productOfferingQualificationFind.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectId, requestedResponseDate, state);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
