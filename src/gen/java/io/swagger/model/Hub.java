package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "This resource is used to manage notification subscription.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Hub {

    private String callback = null;
    private String id = null;
    private String query = null;

    /**
     * This callback address is an url. the norification will be sent to this url address
     **/

    @ApiModelProperty(required = true, value = "This callback address is an url. the norification will be sent to this url address")
    @JsonProperty("callback")
    @NotNull
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
     * id of the Hub
     **/

    @ApiModelProperty(required = true, value = "id of the Hub")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        Hub hub = (Hub) o;
        return Objects.equals(callback, hub.callback) &&
                Objects.equals(id, hub.id) &&
                Objects.equals(query, hub.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callback, id, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hub {\n");

        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

