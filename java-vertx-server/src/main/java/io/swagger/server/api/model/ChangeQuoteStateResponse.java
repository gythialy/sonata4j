package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.QuoteStateType;
import java.time.OffsetDateTime;

/**
 * Structure to response for a quote cancellation/rejection request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ChangeQuoteStateResponse   {
  
  private String externalId = null;
  private String id = null;
  private OffsetDateTime quoteEffectiveStateChangeDate = null;
  private QuoteStateType state = null;

  public ChangeQuoteStateResponse () {

  }

  public ChangeQuoteStateResponse (String externalId, String id, OffsetDateTime quoteEffectiveStateChangeDate, QuoteStateType state) {
    this.externalId = externalId;
    this.id = id;
    this.quoteEffectiveStateChangeDate = quoteEffectiveStateChangeDate;
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

    
  @JsonProperty("quoteEffectiveStateChangeDate")
  public OffsetDateTime getQuoteEffectiveStateChangeDate() {
    return quoteEffectiveStateChangeDate;
  }
  public void setQuoteEffectiveStateChangeDate(OffsetDateTime quoteEffectiveStateChangeDate) {
    this.quoteEffectiveStateChangeDate = quoteEffectiveStateChangeDate;
  }

    
  @JsonProperty("state")
  public QuoteStateType getState() {
    return state;
  }
  public void setState(QuoteStateType state) {
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
    ChangeQuoteStateResponse changeQuoteStateResponse = (ChangeQuoteStateResponse) o;
    return Objects.equals(externalId, changeQuoteStateResponse.externalId) &&
        Objects.equals(id, changeQuoteStateResponse.id) &&
        Objects.equals(quoteEffectiveStateChangeDate, changeQuoteStateResponse.quoteEffectiveStateChangeDate) &&
        Objects.equals(state, changeQuoteStateResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, quoteEffectiveStateChangeDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeQuoteStateResponse {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteEffectiveStateChangeDate: ").append(toIndentedString(quoteEffectiveStateChangeDate)).append("\n");
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
