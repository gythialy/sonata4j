package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.QuoteChangeState;

/**
 * Structure used to request quote cancellation/rejection
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ChangelQuoteStateRequest   {
  
  private String externalId = null;
  private String id = null;
  private String quoteChangeStateReason = null;
  private QuoteChangeState state = null;

  public ChangelQuoteStateRequest () {

  }

  public ChangelQuoteStateRequest (String externalId, String id, String quoteChangeStateReason, QuoteChangeState state) {
    this.externalId = externalId;
    this.id = id;
    this.quoteChangeStateReason = quoteChangeStateReason;
    this.state = state;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("quoteChangeStateReason")
  public String getQuoteChangeStateReason() {
    return quoteChangeStateReason;
  }
  public void setQuoteChangeStateReason(String quoteChangeStateReason) {
    this.quoteChangeStateReason = quoteChangeStateReason;
  }

    
  @JsonProperty("state")
  public QuoteChangeState getState() {
    return state;
  }
  public void setState(QuoteChangeState state) {
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
    ChangelQuoteStateRequest changelQuoteStateRequest = (ChangelQuoteStateRequest) o;
    return Objects.equals(externalId, changelQuoteStateRequest.externalId) &&
        Objects.equals(id, changelQuoteStateRequest.id) &&
        Objects.equals(quoteChangeStateReason, changelQuoteStateRequest.quoteChangeStateReason) &&
        Objects.equals(state, changelQuoteStateRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, quoteChangeStateReason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelQuoteStateRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteChangeStateReason: ").append(toIndentedString(quoteChangeStateReason)).append("\n");
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
