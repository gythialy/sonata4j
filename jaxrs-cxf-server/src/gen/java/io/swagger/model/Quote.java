package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.model.AgreementRef;
import io.swagger.model.Note;
import io.swagger.model.QuoteItem;
import io.swagger.model.QuoteLevel;
import io.swagger.model.QuoteStateType;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
  * A quote which can be used to negotiate service and product acquisition or modification between a customer and a service provider
 **/
@ApiModel(description="A quote which can be used to negotiate service and product acquisition or modification between a customer and a service provider")
public class Quote  {
  
  @ApiModelProperty(value = "Indicates the base (class) type of the quote.")
 /**
   * Indicates the base (class) type of the quote.
  **/
  private String baseType = null;

  @ApiModelProperty(value = "Link to the schema describing the REST resource.")
 /**
   * Link to the schema describing the REST resource.
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Indicates the (class) type of the quote.")
 /**
   * Indicates the (class) type of the quote.
  **/
  private String type = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<AgreementRef> agreement = null;

  @ApiModelProperty(value = "Description of the quote")
 /**
   * Description of the quote
  **/
  private String description = null;

  @ApiModelProperty(value = "Date when the quoted was Cancelled or Rejected or Accepted")
 /**
   * Date when the quoted was Cancelled or Rejected or Accepted
  **/
  private Date effectiveQuoteCompletionDate = null;

  @ApiModelProperty(value = "This is the date wished by the requester to have the requested quote item(s) delivered")
 /**
   * This is the date wished by the requester to have the requested quote item(s) delivered
  **/
  private LocalDate expectedFulfillmentStartDate = null;

  @ApiModelProperty(value = "This is the date filled by the seller to indicate expected quote completion date.")
 /**
   * This is the date filled by the seller to indicate expected quote completion date.
  **/
  private LocalDate expectedQuoteCompletionDate = null;

  @ApiModelProperty(value = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)")
 /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
  **/
  private String externalId = null;

  @ApiModelProperty(value = "Hyperlink to access the quote")
 /**
   * Hyperlink to access the quote
  **/
  private String href = null;

  @ApiModelProperty(value = "Unique (within the quoting domain) identifier for the quote, as attributed by the quoting system")
 /**
   * Unique (within the quoting domain) identifier for the quote, as attributed by the quoting system
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response")
 /**
   * If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response
  **/
  private Boolean instantSyncQuoting = false;

  @ApiModelProperty(value = "")
  @Valid
  private List<Note> note = null;

  @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.")
 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.
  **/
  private String projectId = null;

  @ApiModelProperty(value = "Date when the quote was created")
 /**
   * Date when the quote was created
  **/
  private Date quoteDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<QuoteItem> quoteItem = new ArrayList<QuoteItem>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QuoteLevel quoteLevel = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced)")
 /**
   * This is the date wished by the requester to have the quote completed (meaning priced)
  **/
  private Date requestedQuoteCompletionDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QuoteStateType state = null;

  @ApiModelProperty(value = "")
  @Valid
  private TimePeriod validFor = null;
 /**
   * Indicates the base (class) type of the quote.
   * @return baseType
  **/
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Quote baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

 /**
   * Link to the schema describing the REST resource.
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public Quote schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Indicates the (class) type of the quote.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Quote type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get agreement
   * @return agreement
  **/
  @JsonProperty("agreement")
  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public Quote agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public Quote addAgreementItem(AgreementRef agreementItem) {
    this.agreement.add(agreementItem);
    return this;
  }

 /**
   * Description of the quote
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Quote description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Date when the quoted was Cancelled or Rejected or Accepted
   * @return effectiveQuoteCompletionDate
  **/
  @JsonProperty("effectiveQuoteCompletionDate")
  public Date getEffectiveQuoteCompletionDate() {
    return effectiveQuoteCompletionDate;
  }

  public void setEffectiveQuoteCompletionDate(Date effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
  }

  public Quote effectiveQuoteCompletionDate(Date effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    return this;
  }

 /**
   * This is the date wished by the requester to have the requested quote item(s) delivered
   * @return expectedFulfillmentStartDate
  **/
  @JsonProperty("expectedFulfillmentStartDate")
  public LocalDate getExpectedFulfillmentStartDate() {
    return expectedFulfillmentStartDate;
  }

  public void setExpectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
  }

  public Quote expectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    return this;
  }

 /**
   * This is the date filled by the seller to indicate expected quote completion date.
   * @return expectedQuoteCompletionDate
  **/
  @JsonProperty("expectedQuoteCompletionDate")
  public LocalDate getExpectedQuoteCompletionDate() {
    return expectedQuoteCompletionDate;
  }

  public void setExpectedQuoteCompletionDate(LocalDate expectedQuoteCompletionDate) {
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
  }

  public Quote expectedQuoteCompletionDate(LocalDate expectedQuoteCompletionDate) {
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    return this;
  }

 /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Quote externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Hyperlink to access the quote
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Quote href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Unique (within the quoting domain) identifier for the quote, as attributed by the quoting system
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Quote id(String id) {
    this.id = id;
    return this;
  }

 /**
   * If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response
   * @return instantSyncQuoting
  **/
  @JsonProperty("instantSyncQuoting")
  @NotNull
  public Boolean isInstantSyncQuoting() {
    return instantSyncQuoting;
  }

  public void setInstantSyncQuoting(Boolean instantSyncQuoting) {
    this.instantSyncQuoting = instantSyncQuoting;
  }

  public Quote instantSyncQuoting(Boolean instantSyncQuoting) {
    this.instantSyncQuoting = instantSyncQuoting;
    return this;
  }

 /**
   * Get note
   * @return note
  **/
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public Quote note(List<Note> note) {
    this.note = note;
    return this;
  }

  public Quote addNoteItem(Note noteItem) {
    this.note.add(noteItem);
    return this;
  }

 /**
   * This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.
   * @return projectId
  **/
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Quote projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * Date when the quote was created
   * @return quoteDate
  **/
  @JsonProperty("quoteDate")
  public Date getQuoteDate() {
    return quoteDate;
  }

  public void setQuoteDate(Date quoteDate) {
    this.quoteDate = quoteDate;
  }

  public Quote quoteDate(Date quoteDate) {
    this.quoteDate = quoteDate;
    return this;
  }

 /**
   * Get quoteItem
   * @return quoteItem
  **/
  @JsonProperty("quoteItem")
  @NotNull
  public List<QuoteItem> getQuoteItem() {
    return quoteItem;
  }

  public void setQuoteItem(List<QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public Quote quoteItem(List<QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public Quote addQuoteItemItem(QuoteItem quoteItemItem) {
    this.quoteItem.add(quoteItemItem);
    return this;
  }

 /**
   * Get quoteLevel
   * @return quoteLevel
  **/
  @JsonProperty("quoteLevel")
  @NotNull
  public QuoteLevel getQuoteLevel() {
    return quoteLevel;
  }

  public void setQuoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
  }

  public Quote quoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  @NotNull
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Quote relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Quote addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * This is the date wished by the requester to have the quote completed (meaning priced)
   * @return requestedQuoteCompletionDate
  **/
  @JsonProperty("requestedQuoteCompletionDate")
  @NotNull
  public Date getRequestedQuoteCompletionDate() {
    return requestedQuoteCompletionDate;
  }

  public void setRequestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
  }

  public Quote requestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public QuoteStateType getState() {
    return state;
  }

  public void setState(QuoteStateType state) {
    this.state = state;
  }

  public Quote state(QuoteStateType state) {
    this.state = state;
    return this;
  }

 /**
   * Get validFor
   * @return validFor
  **/
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public Quote validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

