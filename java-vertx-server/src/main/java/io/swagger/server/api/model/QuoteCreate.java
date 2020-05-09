package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.AgreementRef;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.QuoteItemCreate;
import io.swagger.server.api.model.QuoteLevel;
import io.swagger.server.api.model.RelatedParty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This structure is used only in the POST operation for the request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteCreate   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private List<AgreementRef> agreement = new ArrayList<>();
  private String description = null;
  private LocalDate expectedFulfillmentStartDate = null;
  private String externalId = null;
  private Boolean instantSyncQuoting = false;
  private List<Note> note = new ArrayList<>();
  private String projectId = null;
  private List<QuoteItemCreate> quoteItem = new ArrayList<>();
  private QuoteLevel quoteLevel = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedQuoteCompletionDate = null;

  public QuoteCreate () {

  }

  public QuoteCreate (String baseType, String schemaLocation, String type, List<AgreementRef> agreement, String description, LocalDate expectedFulfillmentStartDate, String externalId, Boolean instantSyncQuoting, List<Note> note, String projectId, List<QuoteItemCreate> quoteItem, QuoteLevel quoteLevel, List<RelatedParty> relatedParty, OffsetDateTime requestedQuoteCompletionDate) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.agreement = agreement;
    this.description = description;
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    this.externalId = externalId;
    this.instantSyncQuoting = instantSyncQuoting;
    this.note = note;
    this.projectId = projectId;
    this.quoteItem = quoteItem;
    this.quoteLevel = quoteLevel;
    this.relatedParty = relatedParty;
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
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

    
  @JsonProperty("expectedFulfillmentStartDate")
  public LocalDate getExpectedFulfillmentStartDate() {
    return expectedFulfillmentStartDate;
  }
  public void setExpectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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

    
  @JsonProperty("quoteItem")
  public List<QuoteItemCreate> getQuoteItem() {
    return quoteItem;
  }
  public void setQuoteItem(List<QuoteItemCreate> quoteItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteCreate quoteCreate = (QuoteCreate) o;
    return Objects.equals(baseType, quoteCreate.baseType) &&
        Objects.equals(schemaLocation, quoteCreate.schemaLocation) &&
        Objects.equals(type, quoteCreate.type) &&
        Objects.equals(agreement, quoteCreate.agreement) &&
        Objects.equals(description, quoteCreate.description) &&
        Objects.equals(expectedFulfillmentStartDate, quoteCreate.expectedFulfillmentStartDate) &&
        Objects.equals(externalId, quoteCreate.externalId) &&
        Objects.equals(instantSyncQuoting, quoteCreate.instantSyncQuoting) &&
        Objects.equals(note, quoteCreate.note) &&
        Objects.equals(projectId, quoteCreate.projectId) &&
        Objects.equals(quoteItem, quoteCreate.quoteItem) &&
        Objects.equals(quoteLevel, quoteCreate.quoteLevel) &&
        Objects.equals(relatedParty, quoteCreate.relatedParty) &&
        Objects.equals(requestedQuoteCompletionDate, quoteCreate.requestedQuoteCompletionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, agreement, description, expectedFulfillmentStartDate, externalId, instantSyncQuoting, note, projectId, quoteItem, quoteLevel, relatedParty, requestedQuoteCompletionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteCreate {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedFulfillmentStartDate: ").append(toIndentedString(expectedFulfillmentStartDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    instantSyncQuoting: ").append(toIndentedString(instantSyncQuoting)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
    sb.append("    quoteLevel: ").append(toIndentedString(quoteLevel)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedQuoteCompletionDate: ").append(toIndentedString(requestedQuoteCompletionDate)).append("\n");
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
