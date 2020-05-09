package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductStatus;
import java.time.OffsetDateTime;

/**
 * Holds the status modification reasons and associated date the status changed, populated by the server
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class StatusChange   {
  
  private OffsetDateTime changeDate = null;
  private String changeReason = null;
  private ProductStatus status = null;

  public StatusChange () {

  }

  public StatusChange (OffsetDateTime changeDate, String changeReason, ProductStatus status) {
    this.changeDate = changeDate;
    this.changeReason = changeReason;
    this.status = status;
  }

    
  @JsonProperty("changeDate")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }
  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

    
  @JsonProperty("changeReason")
  public String getChangeReason() {
    return changeReason;
  }
  public void setChangeReason(String changeReason) {
    this.changeReason = changeReason;
  }

    
  @JsonProperty("status")
  public ProductStatus getStatus() {
    return status;
  }
  public void setStatus(ProductStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusChange statusChange = (StatusChange) o;
    return Objects.equals(changeDate, statusChange.changeDate) &&
        Objects.equals(changeReason, statusChange.changeReason) &&
        Objects.equals(status, statusChange.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, changeReason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
