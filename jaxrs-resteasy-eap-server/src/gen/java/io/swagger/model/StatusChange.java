package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Holds the status modification reasons and associated date the status changed, populated by the server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class StatusChange {

    private Date changeDate = null;
    private String changeReason = null;
    private ProductStatus status = null;

    /**
     * Date when the state changed
     **/

    @ApiModelProperty(value = "Date when the state changed")
    @JsonProperty("changeDate")
    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    /**
     * Raison for which the state changed
     **/

    @ApiModelProperty(value = "Raison for which the state changed")
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
    @JsonProperty("status")
    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusChange statusChange = (StatusChange) o;
        return Objects.equals(changeDate, statusChange.changeDate) &&
                Objects.equals(changeReason, statusChange.changeReason) &&
                Objects.equals(status, statusChange.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeDate, changeReason, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusChange {\n");

        sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

