package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.QuoteItem;
import io.swagger.server.api.model.QuoteLevel;
import io.swagger.server.api.model.QuoteState;
import io.swagger.server.api.model.RelatedPartyRole;
import io.swagger.server.api.model.TimePeriod;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteSummaryView   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private String category = null;
  private OffsetDateTime effectiveQuoteCompletionDate = null;
  private LocalDate expectedFulfillmentStartDate = null;
  private LocalDate expectedQuoteCompletionDate = null;
  private String externalId = null;
  private String href = null;
  private String id = null;
  private OffsetDateTime quoteDate = null;
  private List<QuoteItem> quoteItem = new ArrayList<>();
  private QuoteLevel quoteLevel = null;
  private List<RelatedPartyRole> relatedPartyRole = new ArrayList<>();
  private OffsetDateTime requestedQuoteCompletionDate = null;
  private QuoteState state = null;
  private TimePeriod validFor = null;

  public QuoteSummaryView () {

  }

  public QuoteSummaryView (String baseType, String schemaLocation, String type, String category, OffsetDateTime effectiveQuoteCompletionDate, LocalDate expectedFulfillmentStartDate, LocalDate expectedQuoteCompletionDate, String externalId, String href, String id, OffsetDateTime quoteDate, List<QuoteItem> quoteItem, QuoteLevel quoteLevel, List<RelatedPartyRole> relatedPartyRole, OffsetDateTime requestedQuoteCompletionDate, QuoteState state, TimePeriod validFor) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.category = category;
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    this.externalId = externalId;
    this.href = href;
    this.id = id;
    this.quoteDate = quoteDate;
    this.quoteItem = quoteItem;
    this.quoteLevel = quoteLevel;
    this.relatedPartyRole = relatedPartyRole;
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    this.state = state;
    this.validFor = validFor;
  }

    
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }
  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
  @JsonProperty("effectiveQuoteCompletionDate")
  public OffsetDateTime getEffectiveQuoteCompletionDate() {
    return effectiveQuoteCompletionDate;
  }
  public void setEffectiveQuoteCompletionDate(OffsetDateTime effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
  }

    
  @JsonProperty("expectedFulfillmentStartDate")
  public LocalDate getExpectedFulfillmentStartDate() {
    return expectedFulfillmentStartDate;
  }
  public void setExpectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
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

    
  @JsonProperty("quoteDate")
  public OffsetDateTime getQuoteDate() {
    return quoteDate;
  }
  public void setQuoteDate(OffsetDateTime quoteDate) {
    this.quoteDate = quoteDate;
  }

    
  @JsonProperty("quoteItem")
  public List<QuoteItem> getQuoteItem() {
    return quoteItem;
  }
  public void setQuoteItem(List<QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

    
  @JsonProperty("quoteLevel")
  public QuoteLevel getQuoteLevel() {
    return quoteLevel;
  }
  public void setQuoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
  }

    
  @JsonProperty("relatedPartyRole")
  public List<RelatedPartyRole> getRelatedPartyRole() {
    return relatedPartyRole;
  }
  public void setRelatedPartyRole(List<RelatedPartyRole> relatedPartyRole) {
    this.relatedPartyRole = relatedPartyRole;
  }

    
  @JsonProperty("requestedQuoteCompletionDate")
  public OffsetDateTime getRequestedQuoteCompletionDate() {
    return requestedQuoteCompletionDate;
  }
  public void setRequestedQuoteCompletionDate(OffsetDateTime requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
  }

    
  @JsonProperty("state")
  public QuoteState getState() {
    return state;
  }
  public void setState(QuoteState state) {
    this.state = state;
  }

    
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSummaryView quoteSummaryView = (QuoteSummaryView) o;
    return Objects.equals(baseType, quoteSummaryView.baseType) &&
        Objects.equals(schemaLocation, quoteSummaryView.schemaLocation) &&
        Objects.equals(type, quoteSummaryView.type) &&
        Objects.equals(category, quoteSummaryView.category) &&
        Objects.equals(effectiveQuoteCompletionDate, quoteSummaryView.effectiveQuoteCompletionDate) &&
        Objects.equals(expectedFulfillmentStartDate, quoteSummaryView.expectedFulfillmentStartDate) &&
        Objects.equals(expectedQuoteCompletionDate, quoteSummaryView.expectedQuoteCompletionDate) &&
        Objects.equals(externalId, quoteSummaryView.externalId) &&
        Objects.equals(href, quoteSummaryView.href) &&
        Objects.equals(id, quoteSummaryView.id) &&
        Objects.equals(quoteDate, quoteSummaryView.quoteDate) &&
        Objects.equals(quoteItem, quoteSummaryView.quoteItem) &&
        Objects.equals(quoteLevel, quoteSummaryView.quoteLevel) &&
        Objects.equals(relatedPartyRole, quoteSummaryView.relatedPartyRole) &&
        Objects.equals(requestedQuoteCompletionDate, quoteSummaryView.requestedQuoteCompletionDate) &&
        Objects.equals(state, quoteSummaryView.state) &&
        Objects.equals(validFor, quoteSummaryView.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, category, effectiveQuoteCompletionDate, expectedFulfillmentStartDate, expectedQuoteCompletionDate, externalId, href, id, quoteDate, quoteItem, quoteLevel, relatedPartyRole, requestedQuoteCompletionDate, state, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSummaryView {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    effectiveQuoteCompletionDate: ").append(toIndentedString(effectiveQuoteCompletionDate)).append("\n");
    sb.append("    expectedFulfillmentStartDate: ").append(toIndentedString(expectedFulfillmentStartDate)).append("\n");
    sb.append("    expectedQuoteCompletionDate: ").append(toIndentedString(expectedQuoteCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteDate: ").append(toIndentedString(quoteDate)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
    sb.append("    quoteLevel: ").append(toIndentedString(quoteLevel)).append("\n");
    sb.append("    relatedPartyRole: ").append(toIndentedString(relatedPartyRole)).append("\n");
    sb.append("    requestedQuoteCompletionDate: ").append(toIndentedString(requestedQuoteCompletionDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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
