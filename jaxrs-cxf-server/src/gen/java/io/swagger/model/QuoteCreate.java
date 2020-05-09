package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AgreementRef;
import io.swagger.model.Note;
import io.swagger.model.QuoteItemCreate;
import io.swagger.model.QuoteLevel;
import io.swagger.model.RelatedParty;
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
  * This structure is used only in the POST operation for the request.
 **/
@ApiModel(description="This structure is used only in the POST operation for the request.")
public class QuoteCreate  {
  
  @ApiModelProperty(value = "Indicates the base (class) type of the quote.")
 /**
   * Indicates the base (class) type of the quote.
  **/
  private String baseType = null;

  @ApiModelProperty(value = "Link to the schema describing the REST resource. Technical attribute to extend this class.")
 /**
   * Link to the schema describing the REST resource. Technical attribute to extend this class.
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Indicates the (class) type of the quote. Technical attribute to extend this class.")
 /**
   * Indicates the (class) type of the quote. Technical attribute to extend this class.
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

  @ApiModelProperty(value = "This is the date wished by the requester to have the requested quote item(s) delivered")
 /**
   * This is the date wished by the requester to have the requested quote item(s) delivered
  **/
  private LocalDate expectedFulfillmentStartDate = null;

  @ApiModelProperty(value = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)")
 /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
  **/
  private String externalId = null;

  @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response")
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

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<QuoteItemCreate> quoteItem = new ArrayList<QuoteItemCreate>();

  @ApiModelProperty(value = "")
  @Valid
  private QuoteLevel quoteLevel = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced). This attribute is not considered when instantSyncQuoting is set to Yes.")
 /**
   * This is the date wished by the requester to have the quote completed (meaning priced). This attribute is not considered when instantSyncQuoting is set to Yes.
  **/
  private Date requestedQuoteCompletionDate = null;
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

  public QuoteCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

 /**
   * Link to the schema describing the REST resource. Technical attribute to extend this class.
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public QuoteCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Indicates the (class) type of the quote. Technical attribute to extend this class.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QuoteCreate type(String type) {
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

  public QuoteCreate agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public QuoteCreate addAgreementItem(AgreementRef agreementItem) {
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

  public QuoteCreate description(String description) {
    this.description = description;
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

  public QuoteCreate expectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
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

  public QuoteCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response
   * @return instantSyncQuoting
  **/
  @JsonProperty("instantSyncQuoting")
  public Boolean isInstantSyncQuoting() {
    return instantSyncQuoting;
  }

  public void setInstantSyncQuoting(Boolean instantSyncQuoting) {
    this.instantSyncQuoting = instantSyncQuoting;
  }

  public QuoteCreate instantSyncQuoting(Boolean instantSyncQuoting) {
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

  public QuoteCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public QuoteCreate addNoteItem(Note noteItem) {
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

  public QuoteCreate projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

 /**
   * Get quoteItem
   * @return quoteItem
  **/
  @JsonProperty("quoteItem")
  @NotNull
  public List<QuoteItemCreate> getQuoteItem() {
    return quoteItem;
  }

  public void setQuoteItem(List<QuoteItemCreate> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteCreate quoteItem(List<QuoteItemCreate> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public QuoteCreate addQuoteItemItem(QuoteItemCreate quoteItemItem) {
    this.quoteItem.add(quoteItemItem);
    return this;
  }

 /**
   * Get quoteLevel
   * @return quoteLevel
  **/
  @JsonProperty("quoteLevel")
  public QuoteLevel getQuoteLevel() {
    return quoteLevel;
  }

  public void setQuoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
  }

  public QuoteCreate quoteLevel(QuoteLevel quoteLevel) {
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

  public QuoteCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public QuoteCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * This is the date wished by the requester to have the quote completed (meaning priced). This attribute is not considered when instantSyncQuoting is set to Yes.
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

  public QuoteCreate requestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

