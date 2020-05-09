package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "This structure is used only in the POST operation for the request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class QuoteCreate {

    private String baseType = null;
    private String schemaLocation = null;
    private String type = null;
    private List<AgreementRef> agreement = new ArrayList<AgreementRef>();
    private String description = null;
    private Date expectedFulfillmentStartDate = null;
    private String externalId = null;
    private Boolean instantSyncQuoting = false;
    private List<Note> note = new ArrayList<Note>();
    private String projectId = null;
    private List<QuoteItemCreate> quoteItem = new ArrayList<QuoteItemCreate>();
    private QuoteLevel quoteLevel = null;
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private Date requestedQuoteCompletionDate = null;

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
     * Link to the schema describing the REST resource. Technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "Link to the schema describing the REST resource. Technical attribute to extend this class.")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Indicates the (class) type of the quote. Technical attribute to extend this class.
     **/

    @ApiModelProperty(value = "Indicates the (class) type of the quote. Technical attribute to extend this class.")
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
     * If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response
     **/

    @ApiModelProperty(value = "If this flag is set to Yes, Buyer requests to have instant quoting to be provided in operation POST response")
    @JsonProperty("instantSyncQuoting")
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
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("quoteItem")
    @NotNull
    public List<QuoteItemCreate> getQuoteItem() {
        return quoteItem;
    }

    public void setQuoteItem(List<QuoteItemCreate> quoteItem) {
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
    @JsonProperty("relatedParty")
    @NotNull
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * This is the date wished by the requester to have the quote completed (meaning priced). This attribute is not considered when instantSyncQuoting is set to Yes.
     **/

    @ApiModelProperty(required = true, value = "This is the date wished by the requester to have the quote completed (meaning priced). This attribute is not considered when instantSyncQuoting is set to Yes.")
    @JsonProperty("requestedQuoteCompletionDate")
    @NotNull
    public Date getRequestedQuoteCompletionDate() {
        return requestedQuoteCompletionDate;
    }

    public void setRequestedQuoteCompletionDate(Date requestedQuoteCompletionDate) {
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

