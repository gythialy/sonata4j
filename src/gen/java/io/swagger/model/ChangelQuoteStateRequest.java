package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Structure used to request quote cancellation/rejection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ChangelQuoteStateRequest {

    private String externalId = null;
    private String id = null;
    private String quoteChangeStateReason = null;
    private QuoteChangeState state = null;

    /**
     * External Id of the quote (buyer quote id). If provided seller will check consistence.
     **/

    @ApiModelProperty(value = "External Id of the quote (buyer quote id). If provided seller will check consistence.")
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
     * Cancellation reason
     **/

    @ApiModelProperty(required = true, value = "Cancellation reason")
    @JsonProperty("quoteChangeStateReason")
    @NotNull
    public String getQuoteChangeStateReason() {
        return quoteChangeStateReason;
    }

    public void setQuoteChangeStateReason(String quoteChangeStateReason) {
        this.quoteChangeStateReason = quoteChangeStateReason;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("state")
    @NotNull
    public QuoteChangeState getState() {
        return state;
    }

    public void setState(QuoteChangeState state) {
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
        ChangelQuoteStateRequest changelQuoteStateRequest = (ChangelQuoteStateRequest) o;
        return Objects.equals(externalId, changelQuoteStateRequest.externalId) &&
                Objects.equals(id, changelQuoteStateRequest.id) &&
                Objects.equals(quoteChangeStateReason, changelQuoteStateRequest.quoteChangeStateReason) &&
                Objects.equals(state, changelQuoteStateRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalId, id, quoteChangeStateReason, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangelQuoteStateRequest {\n");

        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    quoteChangeStateReason: ").append(toIndentedString(quoteChangeStateReason)).append("\n");
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

