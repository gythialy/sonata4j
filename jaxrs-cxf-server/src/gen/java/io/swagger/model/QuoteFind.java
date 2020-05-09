package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.model.QuoteLevel;
import io.swagger.model.QuoteStateType;
import java.util.Date;
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
public class QuoteFind  {
  
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

  @ApiModelProperty(value = "")
  @Valid
  private QuoteLevel quoteLevel = null;

  @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced)")
 /**
   * This is the date wished by the requester to have the quote completed (meaning priced)
  **/
  private Date requestedQuoteCompletionDate = null;

  @ApiModelProperty(value = "")
  @Valid
  private QuoteStateType state = null;
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

  public QuoteFind description(String description) {
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

  public QuoteFind effectiveQuoteCompletionDate(Date effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
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

  public QuoteFind expectedQuoteCompletionDate(LocalDate expectedQuoteCompletionDate) {
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

  public QuoteFind externalId(String externalId) {
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

  public QuoteFind href(String href) {
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

  public QuoteFind id(String id) {
    this.id = id;
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

  public QuoteFind projectId(String projectId) {
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

  public QuoteFind quoteDate(Date quoteDate) {
    this.quoteDate = quoteDate;
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

  public QuoteFind quoteLevel(QuoteLevel quoteLevel) {
    this.quoteLevel = quoteLevel;
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

  public QuoteFind requestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public QuoteStateType getState() {
    return state;
  }

  public void setState(QuoteStateType state) {
    this.state = state;
  }

  public QuoteFind state(QuoteStateType state) {
    this.state = state;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

