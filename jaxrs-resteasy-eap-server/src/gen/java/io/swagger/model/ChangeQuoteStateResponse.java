package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Structure to response for a quote cancellation/rejection request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ChangeQuoteStateResponse {

    private String externalId = null;
    private String id = null;
    private Date quoteEffectiveStateChangeDate = null;
    private QuoteStateType state = null;

    /**
     * External Id of the quote (buyer quote id). If provided by seller this information is send back in the response.
     **/

    @ApiModelProperty(value = "External Id of the quote (buyer quote id). If provided by seller this information is send back in the response.")
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * id of the quote to be cancelled
     **/

    @ApiModelProperty(required = true, value = "id of the quote to be cancelled")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Cancellation or rejection date (effective)
     **/

    @ApiModelProperty(required = true, value = "Cancellation or rejection date (effective)")
    @JsonProperty("quoteEffectiveStateChangeDate")
    @NotNull
    public Date getQuoteEffectiveStateChangeDate() {
        return quoteEffectiveStateChangeDate;
    }

    public void setQuoteEffectiveStateChangeDate(Date quoteEffectiveStateChangeDate) {
        this.quoteEffectiveStateChangeDate = quoteEffectiveStateChangeDate;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeQuoteStateResponse changeQuoteStateResponse = (ChangeQuoteStateResponse) o;
        return Objects.equals(externalId, changeQuoteStateResponse.externalId) &&
                Objects.equals(id, changeQuoteStateResponse.id) &&
                Objects.equals(quoteEffectiveStateChangeDate, changeQuoteStateResponse.quoteEffectiveStateChangeDate) &&
                Objects.equals(state, changeQuoteStateResponse.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, id, quoteEffectiveStateChangeDate, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeQuoteStateResponse {\n");

        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    quoteEffectiveStateChangeDate: ").append(toIndentedString(quoteEffectiveStateChangeDate)).append("\n");
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

