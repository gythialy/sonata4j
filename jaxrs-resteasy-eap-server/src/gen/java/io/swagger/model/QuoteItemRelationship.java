package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Used to describe relationship between quote item. These relationships could have an impact on pricing and conditions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteItemRelationship {

    private String id = null;
    private RelationshipType type = null;

    /**
     * ID of the related order item (must be in the same quote).
     **/

    @ApiModelProperty(required = true, value = "ID of the related order item (must be in the same quote).")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("type")
    @NotNull
    public RelationshipType getType() {
        return type;
    }

    public void setType(RelationshipType type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuoteItemRelationship quoteItemRelationship = (QuoteItemRelationship) o;
        return Objects.equals(id, quoteItemRelationship.id) &&
                Objects.equals(type, quoteItemRelationship.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuoteItemRelationship {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

