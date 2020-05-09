package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Indicates a time period for validity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class TimePeriod {

    private Date endDateTime = null;
    private Date startDateTime = null;

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("endDateTime")
    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("startDateTime")
    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimePeriod timePeriod = (TimePeriod) o;
        return Objects.equals(endDateTime, timePeriod.endDateTime) &&
                Objects.equals(startDateTime, timePeriod.startDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDateTime, startDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimePeriod {\n");

        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

