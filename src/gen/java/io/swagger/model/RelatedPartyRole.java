package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "A party role (not a party) playing a role for this quote or quote Item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class RelatedPartyRole {

    private String referredType = null;
    private String id = null;
    private RelatedParty relatedParty = null;
    private String role = null;

    /**
     * Referred type for this party role Technical attribute
     **/

    @ApiModelProperty(value = "Referred type for this party role Technical attribute")
    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    /**
     * id of the party role
     **/

    @ApiModelProperty(value = "id of the party role")
    @JsonProperty("id")
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
    @JsonProperty("relatedParty")
    @NotNull
    public RelatedParty getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(RelatedParty relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * Role played for this party role. Could be &#39;buyer’, ‘seller’ for example.
     **/

    @ApiModelProperty(required = true, value = "Role played for this party role. Could be 'buyer’, ‘seller’ for example.")
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
        RelatedPartyRole relatedPartyRole = (RelatedPartyRole) o;
        return Objects.equals(referredType, relatedPartyRole.referredType) &&
                Objects.equals(id, relatedPartyRole.id) &&
                Objects.equals(relatedParty, relatedPartyRole.relatedParty) &&
                Objects.equals(role, relatedPartyRole.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referredType, id, relatedParty, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedPartyRole {\n");

        sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

