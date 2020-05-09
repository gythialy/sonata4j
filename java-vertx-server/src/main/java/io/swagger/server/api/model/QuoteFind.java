package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.QuoteLevel;
import io.swagger.server.api.model.QuoteStateType;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteFind   {
  
  private String description = null;
  private OffsetDateTime effectiveQuoteCompletionDate = null;
  private LocalDate expectedQuoteCompletionDate = null;
  private String externalId = null;
  private String href = null;
  private String id = null;
  private String projectId = null;
  private OffsetDateTime quoteDate = null;
  private QuoteLevel quoteLevel = null;
  private OffsetDateTime requestedQuoteCompletionDate = null;
  private QuoteStateType state = null;

  public QuoteFind () {

  }

  public QuoteFind (String description, OffsetDateTime effectiveQuoteCompletionDate, LocalDate expectedQuoteCompletionDate, String externalId, String href, String id, String projectId, OffsetDateTime quoteDate, QuoteLevel quoteLevel, OffsetDateTime requestedQuoteCompletionDate, QuoteStateType state) {
    this.description = description;
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    this.externalId = externalId;
    this.href = href;
    this.id = id;
    this.projectId = projectId;
    this.quoteDate = quoteDate;
    this.quoteLevel = quoteLevel;
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    this.state = state;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("effectiveQuoteCompletionDate")
  public OffsetDateTime getEffectiveQuoteCompletionDate() {
    return effectiveQuoteCompletionDate;
  }
  public void setEffectiveQuoteCompletionDate(OffsetDateTime effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
  }

    
  @JsonProperty("expectedQuoteCompletionDate")
  public LocalDate getExpectedQuoteCompletionDate() {
    return expectedQuoteCompletionDate;
  }
  public void setExpectedQuoteCompletionDate(LocalDate expectedQuoteCompletionDate) {
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
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

    
  @JsonProperty("quoteDate")
  public OffsetDateTime getQuoteDate() {
    return quoteDate;
  }
  public void setQuoteDate(OffsetDateTime quoteDate) {
    this.quoteDate = quoteDate;
  }

    
  @JsonProperty("quoteLevel")
  public QuoteLevel getQuoteLevel() {
    return quoteLevel;
  }
  public void setQuoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
  }

    
  @JsonProperty("requestedQuoteCompletionDate")
  public OffsetDateTime getRequestedQuoteCompletionDate() {
    return requestedQuoteCompletionDate;
  }
  public void setRequestedQuoteCompletionDate(OffsetDateTime requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
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
    QuoteFind quoteFind = (QuoteFind) o;
    return Objects.equals(description, quoteFind.description) &&
        Objects.equals(effectiveQuoteCompletionDate, quoteFind.effectiveQuoteCompletionDate) &&
        Objects.equals(expectedQuoteCompletionDate, quoteFind.expectedQuoteCompletionDate) &&
        Objects.equals(externalId, quoteFind.externalId) &&
        Objects.equals(href, quoteFind.href) &&
        Objects.equals(id, quoteFind.id) &&
        Objects.equals(projectId, quoteFind.projectId) &&
        Objects.equals(quoteDate, quoteFind.quoteDate) &&
        Objects.equals(quoteLevel, quoteFind.quoteLevel) &&
        Objects.equals(requestedQuoteCompletionDate, quoteFind.requestedQuoteCompletionDate) &&
        Objects.equals(state, quoteFind.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, effectiveQuoteCompletionDate, expectedQuoteCompletionDate, externalId, href, id, projectId, quoteDate, quoteLevel, requestedQuoteCompletionDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteFind {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveQuoteCompletionDate: ").append(toIndentedString(effectiveQuoteCompletionDate)).append("\n");
    sb.append("    expectedQuoteCompletionDate: ").append(toIndentedString(expectedQuoteCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    quoteDate: ").append(toIndentedString(quoteDate)).append("\n");
    sb.append("    quoteLevel: ").append(toIndentedString(quoteLevel)).append("\n");
    sb.append("    requestedQuoteCompletionDate: ").append(toIndentedString(requestedQuoteCompletionDate)).append("\n");
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
