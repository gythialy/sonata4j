package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "An entity or organization that is involved to the geographical site, such as the Site Contact or Site Alternate Contact.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class RelatedParty {

    private String referredType = null;
    private String emailAddress = null;
    private String id = null;
    private String name = null;
    private String number = null;
    private String numberExtension = null;
    private List<String> role = new ArrayList<String>();

    /**
     * Allow to specify the party type like Organization or Individual
     **/

    @ApiModelProperty(value = "Allow to specify the party type like Organization or Individual")
    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    /**
     * The email address of the related party.
     **/

    @ApiModelProperty(value = "The email address of the related party.")
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * An identifier of the related party.
     **/

    @ApiModelProperty(required = true, value = "An identifier of the related party.")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the related party, e.g. \&quot;Jean Pontus\&quot;.
     **/

    @ApiModelProperty(required = true, value = "The name of the related party, e.g. \"Jean Pontus\".")
    @JsonProperty("name")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The telephone number of the related party.
     **/

    @ApiModelProperty(value = "The telephone number of the related party.")
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Phone number Extension.
     **/

    @ApiModelProperty(value = "Phone number Extension.")
    @JsonProperty("numberExtension")
    public String getNumberExtension() {
        return numberExtension;
    }

    public void setNumberExtension(String numberExtension) {
        this.numberExtension = numberExtension;
    }

    /**
     * Role played by this party for this Site as UNISiteContact for example.
     **/

    @ApiModelProperty(required = true, value = "Role played by this party for this Site as UNISiteContact for example.")
    @JsonProperty("role")
    @NotNull
    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
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
        RelatedParty relatedParty = (RelatedParty) o;
        return Objects.equals(referredType, relatedParty.referredType) &&
                Objects.equals(emailAddress, relatedParty.emailAddress) &&
                Objects.equals(id, relatedParty.id) &&
                Objects.equals(name, relatedParty.name) &&
                Objects.equals(number, relatedParty.number) &&
                Objects.equals(numberExtension, relatedParty.numberExtension) &&
                Objects.equals(role, relatedParty.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referredType, emailAddress, id, name, number, numberExtension, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedParty {\n");

        sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    numberExtension: ").append(toIndentedString(numberExtension)).append("\n");
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

