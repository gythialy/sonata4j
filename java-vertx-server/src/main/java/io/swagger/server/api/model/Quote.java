package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.AgreementRef;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.QuoteItem;
import io.swagger.server.api.model.QuoteLevel;
import io.swagger.server.api.model.QuoteStateType;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.TimePeriod;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A quote which can be used to negotiate service and product acquisition or modification between a customer and a service provider
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Quote   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private List<AgreementRef> agreement = new ArrayList<>();
  private String description = null;
  private OffsetDateTime effectiveQuoteCompletionDate = null;
  private LocalDate expectedFulfillmentStartDate = null;
  private LocalDate expectedQuoteCompletionDate = null;
  private String externalId = null;
  private String href = null;
  private String id = null;
  private Boolean instantSyncQuoting = false;
  private List<Note> note = new ArrayList<>();
  private String projectId = null;
  private OffsetDateTime quoteDate = null;
  private List<QuoteItem> quoteItem = new ArrayList<>();
  private QuoteLevel quoteLevel = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedQuoteCompletionDate = null;
  private QuoteStateType state = null;
  private TimePeriod validFor = null;

  public Quote () {

  }

  public Quote (String baseType, String schemaLocation, String type, List<AgreementRef> agreement, String description, OffsetDateTime effectiveQuoteCompletionDate, LocalDate expectedFulfillmentStartDate, LocalDate expectedQuoteCompletionDate, String externalId, String href, String id, Boolean instantSyncQuoting, List<Note> note, String projectId, OffsetDateTime quoteDate, List<QuoteItem> quoteItem, QuoteLevel quoteLevel, List<RelatedParty> relatedParty, OffsetDateTime requestedQuoteCompletionDate, QuoteStateType state, TimePeriod validFor) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.agreement = agreement;
    this.description = description;
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    this.externalId = externalId;
    this.href = href;
    this.id = id;
    this.instantSyncQuoting = instantSyncQuoting;
    this.note = note;
    this.projectId = projectId;
    this.quoteDate = quoteDate;
    this.quoteItem = quoteItem;
    this.quoteLevel = quoteLevel;
    this.relatedParty = relatedParty;
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

    
  @JsonProperty("agreement")
  public List<AgreementRef> getAgreement() {
    return agreement;
  }
  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
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

    
  @JsonProperty("instantSyncQuoting")
  public Boolean isInstantSyncQuoting() {
    return instantSyncQuoting;
  }
  public void setInstantSyncQuoting(Boolean instantSyncQuoting) {
    this.instantSyncQuoting = instantSyncQuoting;
  }

    
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }
  public void setNote(List<Note> note) {
    this.note = note;
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

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
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
    Quote quote = (Quote) o;
    return Objects.equals(baseType, quote.baseType) &&
        Objects.equals(schemaLocation, quote.schemaLocation) &&
        Objects.equals(type, quote.type) &&
        Objects.equals(agreement, quote.agreement) &&
        Objects.equals(description, quote.description) &&
        Objects.equals(effectiveQuoteCompletionDate, quote.effectiveQuoteCompletionDate) &&
        Objects.equals(expectedFulfillmentStartDate, quote.expectedFulfillmentStartDate) &&
        Objects.equals(expectedQuoteCompletionDate, quote.expectedQuoteCompletionDate) &&
        Objects.equals(externalId, quote.externalId) &&
        Objects.equals(href, quote.href) &&
        Objects.equals(id, quote.id) &&
        Objects.equals(instantSyncQuoting, quote.instantSyncQuoting) &&
        Objects.equals(note, quote.note) &&
        Objects.equals(projectId, quote.projectId) &&
        Objects.equals(quoteDate, quote.quoteDate) &&
        Objects.equals(quoteItem, quote.quoteItem) &&
        Objects.equals(quoteLevel, quote.quoteLevel) &&
        Objects.equals(relatedParty, quote.relatedParty) &&
        Objects.equals(requestedQuoteCompletionDate, quote.requestedQuoteCompletionDate) &&
        Objects.equals(state, quote.state) &&
        Objects.equals(validFor, quote.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, agreement, description, effectiveQuoteCompletionDate, expectedFulfillmentStartDate, expectedQuoteCompletionDate, externalId, href, id, instantSyncQuoting, note, projectId, quoteDate, quoteItem, quoteLevel, relatedParty, requestedQuoteCompletionDate, state, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveQuoteCompletionDate: ").append(toIndentedString(effectiveQuoteCompletionDate)).append("\n");
    sb.append("    expectedFulfillmentStartDate: ").append(toIndentedString(expectedFulfillmentStartDate)).append("\n");
    sb.append("    expectedQuoteCompletionDate: ").append(toIndentedString(expectedQuoteCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instantSyncQuoting: ").append(toIndentedString(instantSyncQuoting)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    quoteDate: ").append(toIndentedString(quoteDate)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
    sb.append("    quoteLevel: ").append(toIndentedString(quoteLevel)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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
