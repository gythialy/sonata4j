package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOfferingQualificationStateType;
import java.time.OffsetDateTime;

/**
 * Holds the state notification reasons and associated date the state changed, populated by the server
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class StateChange   {
  
  private OffsetDateTime changeDate = null;
  private String changeReason = null;
  private ProductOfferingQualificationStateType state = null;

  public StateChange () {

  }

  public StateChange (OffsetDateTime changeDate, String changeReason, ProductOfferingQualificationStateType state) {
    this.changeDate = changeDate;
    this.changeReason = changeReason;
    this.state = state;
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
    StateChange stateChange = (StateChange) o;
    return Objects.equals(changeDate, stateChange.changeDate) &&
        Objects.equals(changeReason, stateChange.changeReason) &&
        Objects.equals(state, stateChange.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, changeReason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateChange {\n");
    
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
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
