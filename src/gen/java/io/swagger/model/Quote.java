package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "A quote which can be used to negotiate service and product acquisition or modification between a customer and a service provider")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Quote {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private List<AgreementRef> agreement = new ArrayList<AgreementRef>();
    private String description = null;
    private Date effectiveQuoteCompletionDate = null;
    private Date expectedFulfillmentStartDate = null;
    private Date expectedQuoteCompletionDate = null;
    private String externalId = null;
    private String href = null;
    private String id = null;
    private Boolean instantSyncQuoting = false;
    private List<Note> note = new ArrayList<Note>();
    private String projectId = null;
    private Date quoteDate = null;
    private List<QuoteItem> quoteItem = new ArrayList<QuoteItem>();
    private QuoteLevel quoteLevel = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedQuoteCompletionDate = null;
    private QuoteStateType state = null;
    private TimePeriod validFor = null;

    /**
     * Indicates the base (class) type of the quote.
     **/

    @ApiModelProperty(value = "Indicates the base (class) type of the quote.")
    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    /**
     * Link to the schema describing the REST resource.
     **/

    @ApiModelProperty(value = "Link to the schema describing the REST resource.")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Indicates the (class) type of the quote.
     **/

    @ApiModelProperty(value = "Indicates the (class) type of the quote.")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("agreement")
    public List<AgreementRef> getAgreement() {
        return agreement;
    }

    public void setAgreement(List<AgreementRef> agreement) {
        this.agreement = agreement;
    }

    /**
     * Description of the quote
     **/

    @ApiModelProperty(value = "Description of the quote")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Date when the quoted was Cancelled or Rejected or Accepted
     **/

    @ApiModelProperty(value = "Date when the quoted was Cancelled or Rejected or Accepted")
    @JsonProperty("effectiveQuoteCompletionDate")
    public Date getEffectiveQuoteCompletionDate() {
        return effectiveQuoteCompletionDate;
    }

    public void setEffectiveQuoteCompletionDate(Date effectiveQuoteCompletionDate) {
        this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    }

    /**
     * This is the date wished by the requester to have the requested quote item(s) delivered
     **/

    @ApiModelProperty(value = "This is the date wished by the requester to have the requested quote item(s) delivered")
    @JsonProperty("expectedFulfillmentStartDate")
    public Date getExpectedFulfillmentStartDate() {
        return expectedFulfillmentStartDate;
    }

    public void setExpectedFulfillmentStartDate(Date expectedFulfillmentStartDate) {
        this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    }

    /**
     * This is the date filled by the seller to indicate expected quote completion date.
     **/

    @ApiModelProperty(value = "This is the date filled by the seller to indicate expected quote completion date.")
    @JsonProperty("expectedQuoteCompletionDate")
    public Date getExpectedQuoteCompletionDate() {
        return expectedQuoteCompletionDate;
    }

    public void setExpectedQuoteCompletionDate(Date expectedQuoteCompletionDate) {
        this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    }

    /**
     * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
     **/

    @ApiModelProperty(value = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)")
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Hyperlink to access the quote
     **/

    @ApiModelProperty(value = "Hyperlink to access the quote")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Unique (within the quoting domain) identifier for the quote, as attributed by the quoting system
     **/

    @ApiModelProperty(value = "Unique (within the quoting domain) identifier for the quote, as attributed by the quoting system")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response
     **/

    @ApiModelProperty(required = true, value = "If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response")
    @JsonProperty("instantSyncQuoting")
    @NotNull
    public Boolean isInstantSyncQuoting() {
        return instantSyncQuoting;
    }

    public void setInstantSyncQuoting(Boolean instantSyncQuoting) {
        this.instantSyncQuoting = instantSyncQuoting;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    /**
     * This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.
     **/

    @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.")
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Date when the quote was created
     **/

    @ApiModelProperty(value = "Date when the quote was created")
    @JsonProperty("quoteDate")
    public Date getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Date quoteDate) {
        this.quoteDate = quoteDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("quoteItem")
    @NotNull
    public List<QuoteItem> getQuoteItem() {
        return quoteItem;
    }

    public void setQuoteItem(List<QuoteItem> quoteItem) {
        this.quoteItem = quoteItem;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("quoteLevel")
    @NotNull
    public QuoteLevel getQuoteLevel() {
        return quoteLevel;
    }

    public void setQuoteLevel(QuoteLevel quoteLevel) {
        this.quoteLevel = quoteLevel;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("relatedParty")
    @NotNull
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * This is the date wished by the requester to have the quote completed (meaning priced)
     **/

    @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced)")
    @JsonProperty("requestedQuoteCompletionDate")
    @NotNull
    public Date getRequestedQuoteCompletionDate() {
        return requestedQuoteCompletionDate;
    }

    public void setRequestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
        this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public QuoteStateType getState() {
        return state;
    }

    public void setState(QuoteStateType state) {
        this.state = state;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
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

