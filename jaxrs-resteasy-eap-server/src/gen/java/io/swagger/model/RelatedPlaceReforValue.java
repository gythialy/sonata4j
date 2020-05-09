package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel(description = "Place defines the places where the products qualification must be done.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class RelatedPlaceReforValue {

    private String referredType = null;
    private String type = null;
    private String href = null;
    private String id = null;
    private String role = null;

    /**
     * The actual type of the target instance when needed for disambiguation. Used when place is described by reference @referredType could be valued to FormattedAddress, FieldedAddress, GeographicSite, GeographicLocation or ReferencedAddress
     **/

    @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation. Used when place is described by reference @referredType could be valued to FormattedAddress, FieldedAddress, GeographicSite, GeographicLocation or ReferencedAddress")
    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    /**
     * When sub-classing, this defines the sub-class entity name. Used when place is described by value (litterally) Could be valued to FormattedAddress, FieldedAddress,  GeographicLocation or ReferencedAddress
     **/

    @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name. Used when place is described by value (litterally) Could be valued to FormattedAddress, FieldedAddress,  GeographicLocation or ReferencedAddress")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * href to this place resource
     **/

    @ApiModelProperty(value = "href to this place resource")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * id of this place
     **/

    @ApiModelProperty(value = "id of this place")
    @JsonProperty("id")
    @Size(max = 45)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Role of this place
     **/

    @ApiModelProperty(required = true, value = "Role of this place")
    @JsonProperty("role")
    @NotNull
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedPlaceReforValue relatedPlaceReforValue = (RelatedPlaceReforValue) o;
        return Objects.equals(referredType, relatedPlaceReforValue.referredType) &&
                Objects.equals(type, relatedPlaceReforValue.type) &&
                Objects.equals(href, relatedPlaceReforValue.href) &&
                Objects.equals(id, relatedPlaceReforValue.id) &&
                Objects.equals(role, relatedPlaceReforValue.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referredType, type, href, id, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedPlaceReforValue {\n");

        sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

