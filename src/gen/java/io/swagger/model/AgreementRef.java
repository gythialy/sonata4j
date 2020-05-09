package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class AgreementRef {

    private String href = null;
    private String id = null;
    private String name = null;
    private String path = null;

    /**
     * Reference of the agreement
     **/

    @ApiModelProperty(value = "Reference of the agreement")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Id of the agreement
     **/

    @ApiModelProperty(required = true, value = "Id of the agreement")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Name of the agreement
     **/

    @ApiModelProperty(required = true, value = "Name of the agreement")
    @JsonProperty("name")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A URI/URL providing the path to where an agreement resides.
     **/

    @ApiModelProperty(required = true, value = "A URI/URL providing the path to where an agreement resides.")
    @JsonProperty("path")
    @NotNull
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgreementRef agreementRef = (AgreementRef) o;
        return Objects.equals(href, agreementRef.href) &&
                Objects.equals(id, agreementRef.id) &&
                Objects.equals(name, agreementRef.name) &&
                Objects.equals(path, agreementRef.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, name, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgreementRef {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

