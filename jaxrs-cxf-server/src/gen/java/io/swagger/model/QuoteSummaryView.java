package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.model.QuoteItem;
import io.swagger.model.QuoteLevel;
import io.swagger.model.QuoteState;
import io.swagger.model.RelatedPartyRole;
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
  * Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.
 **/
@ApiModel(description="Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.")
public class QuoteSummaryView  {
  
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

  @ApiModelProperty(value = "Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. “enterprise”, “residential”, ...)")
 /**
   * Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. “enterprise”, “residential”, ...)
  **/
  private String category = null;

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

  @ApiModelProperty(value = "ID attributed by quoting system")
 /**
   * ID attributed by quoting system
  **/
  private String id = null;

  @ApiModelProperty(value = "Date when the quote was created")
 /**
   * Date when the quote was created
  **/
  private Date quoteDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<QuoteItem> quoteItem = new ArrayList<QuoteItem>();

  @ApiModelProperty(value = "")
  @Valid
  private QuoteLevel quoteLevel = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<RelatedPartyRole> relatedPartyRole = new ArrayList<RelatedPartyRole>();

  @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced)")
 /**
   * This is the date wished by the requester to have the quote completed (meaning priced)
  **/
  private Date requestedQuoteCompletionDate = null;

  @ApiModelProperty(value = "")
  @Valid
  private QuoteState state = null;

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

  public QuoteSummaryView baseType(String baseType) {
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

  public QuoteSummaryView schemaLocation(String schemaLocation) {
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

  public QuoteSummaryView type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. “enterprise”, “residential”, ...)
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public QuoteSummaryView category(String category) {
    this.category = category;
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

  public QuoteSummaryView effectiveQuoteCompletionDate(Date effectiveQuoteCompletionDate) {
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

  public QuoteSummaryView expectedFulfillmentStartDate(LocalDate expectedFulfillmentStartDate) {
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

  public QuoteSummaryView expectedQuoteCompletionDate(LocalDate expectedQuoteCompletionDate) {
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

  public QuoteSummaryView externalId(String externalId) {
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

  public QuoteSummaryView href(String href) {
    this.href = href;
    return this;
  }

 /**
   * ID attributed by quoting system
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteSummaryView id(String id) {
    this.id = id;
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

  public QuoteSummaryView quoteDate(Date quoteDate) {
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

  public QuoteSummaryView quoteItem(List<QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public QuoteSummaryView addQuoteItemItem(QuoteItem quoteItemItem) {
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

  public QuoteSummaryView quoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
    return this;
  }

 /**
   * Get relatedPartyRole
   * @return relatedPartyRole
  **/
  @JsonProperty("relatedPartyRole")
  @NotNull
  public List<RelatedPartyRole> getRelatedPartyRole() {
    return relatedPartyRole;
  }

  public void setRelatedPartyRole(List<RelatedPartyRole> relatedPartyRole) {
    this.relatedPartyRole = relatedPartyRole;
  }

  public QuoteSummaryView relatedPartyRole(List<RelatedPartyRole> relatedPartyRole) {
    this.relatedPartyRole = relatedPartyRole;
    return this;
  }

  public QuoteSummaryView addRelatedPartyRoleItem(RelatedPartyRole relatedPartyRoleItem) {
    this.relatedPartyRole.add(relatedPartyRoleItem);
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

  public QuoteSummaryView requestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public QuoteState getState() {
    return state;
  }

  public void setState(QuoteState state) {
    this.state = state;
  }

  public QuoteSummaryView state(QuoteState state) {
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

  public QuoteSummaryView validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

