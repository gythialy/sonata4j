package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Holds the state notification reasons and associated date the state changed, populated by the server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class StateChange {

    private Date changeDate = null;
    private String changeReason = null;
    private ProductOfferingQualificationStateType state = null;

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("changeDate")
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("changeReason")
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("state")
    public ProductOfferingQualificationStateType getState() {
        return state;
    }

    public void setState(ProductOfferingQualificationStateType state) {
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
        StateChange stateChange = (StateChange) o;
        return Objects.equals(changeDate, stateChange.changeDate) &&
                Objects.equals(changeReason, stateChange.changeReason) &&
                Objects.equals(state, stateChange.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeDate, changeReason, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StateChange {\n");

        sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
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

