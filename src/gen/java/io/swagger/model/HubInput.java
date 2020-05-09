package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "This class is used to request a HUB creation - Used in the POST operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class HubInput {

    private String callback = null;
    private String query = null;

    /**
     * This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event
     **/

    @ApiModelProperty(required = true, value = "This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event")
    @JsonProperty("callback")
    @NotNull
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
     * This attribute is used to define notification type. Example: \&quot;,\&quot;query\&quot;:”eventType &#x3D; ProductOfferingQualificationStateChangeNotification”}
     **/

    @ApiModelProperty(required = true, value = "This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOfferingQualificationStateChangeNotification”}")
    @JsonProperty("query")
    @NotNull
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HubInput hubInput = (HubInput) o;
        return Objects.equals(callback, hubInput.callback) &&
                Objects.equals(query, hubInput.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callback, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HubInput {\n");

        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

