package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteFind {

    private String description = null;
    private Date effectiveQuoteCompletionDate = null;
    private Date expectedQuoteCompletionDate = null;
    private String externalId = null;
    private String href = null;
    private String id = null;
    private String projectId = null;
    private Date quoteDate = null;
    private QuoteLevel quoteLevel = null;
    private Date requestedQuoteCompletionDate = null;
    private QuoteStateType state = null;

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

    @ApiModelProperty(value = "")
    @JsonProperty("quoteLevel")
    public QuoteLevel getQuoteLevel() {
        return quoteLevel;
    }

    public void setQuoteLevel(QuoteLevel quoteLevel) {
        this.quoteLevel = quoteLevel;
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

