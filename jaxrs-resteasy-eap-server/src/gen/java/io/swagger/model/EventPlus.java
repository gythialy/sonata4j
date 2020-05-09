package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class EventPlus extends Event {

    private List<String> fieldPath = new ArrayList<String>();
    private String resourcePath = null;

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("fieldPath")
    @NotNull
    public List<String> getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(List<String> fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("resourcePath")
    @NotNull
    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventPlus eventPlus = (EventPlus) o;
        return Objects.equals(fieldPath, eventPlus.fieldPath) &&
                Objects.equals(resourcePath, eventPlus.resourcePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldPath, resourcePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventPlus {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
        sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
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

