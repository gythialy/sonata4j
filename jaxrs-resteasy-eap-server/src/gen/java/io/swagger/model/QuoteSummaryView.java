package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteSummaryView {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private String category = null;
    private Date effectiveQuoteCompletionDate = null;
    private Date expectedFulfillmentStartDate = null;
    private Date expectedQuoteCompletionDate = null;
    private String externalId = null;
    private String href = null;
    private String id = null;
    private Date quoteDate = null;
    private List<QuoteItem> quoteItem = new ArrayList<QuoteItem>();
    private QuoteLevel quoteLevel = null;
    private List<RelatedPartyRole> relatedPartyRole = new ArrayList<RelatedPartyRole>();
    private Date requestedQuoteCompletionDate = null;
    private QuoteState state = null;
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
     * Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. “enterprise”, “residential”, ...)
     **/

    @ApiModelProperty(value = "Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. “enterprise”, “residential”, ...)")
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
     * ID attributed by quoting system
     **/

    @ApiModelProperty(value = "ID attributed by quoting system")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @ApiModelProperty(value = "")
    @JsonProperty("quoteLevel")
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
    @JsonProperty("relatedPartyRole")
    @NotNull
    public List<RelatedPartyRole> getRelatedPartyRole() {
        return relatedPartyRole;
    }

    public void setRelatedPartyRole(List<RelatedPartyRole> relatedPartyRole) {
        this.relatedPartyRole = relatedPartyRole;
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

    @ApiModelProperty(value = "")
    @JsonProperty("state")
    public QuoteState getState() {
        return state;
    }

    public void setState(QuoteState state) {
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

