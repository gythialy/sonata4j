package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

@ApiModel(description = "This class is used to describe attribute to be used for requesting POQ list (used in the GET by list)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductOfferingQualificationFind {

    private String id = null;
    private String projectId = null;
    private Date requestedResponseDate = null;
    private ProductOfferingQualificationStateType state = null;

    /**
     * The Serviceability Request&#39;s unique identifier.
     **/

    @ApiModelProperty(value = "The Serviceability Request's unique identifier.")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.
     **/

    @ApiModelProperty(value = "This value MAY be assigned by the Buyer/Seller to identify a project the serviceability request is associated with.")
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Corresponds to desiredResponseDate - The date a response for the service request is desired.
     **/

    @ApiModelProperty(value = "Corresponds to desiredResponseDate - The date a response for the service request is desired.")
    @JsonProperty("requestedResponseDate")
    public Date getRequestedResponseDate() {
        return requestedResponseDate;
    }

    public void setRequestedResponseDate(Date requestedResponseDate) {
        this.requestedResponseDate = requestedResponseDate;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("state")
    public ProductOfferingQualificationStateType getState() {
        return state;
    }

    public void setState(ProductOfferingQualificationStateType state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOfferingQualificationFind productOfferingQualificationFind = (ProductOfferingQualificationFind) o;
        return Objects.equals(id, productOfferingQualificationFind.id) &&
                Objects.equals(projectId, productOfferingQualificationFind.projectId) &&
                Objects.equals(requestedResponseDate, productOfferingQualificationFind.requestedResponseDate) &&
                Objects.equals(state, productOfferingQualificationFind.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, requestedResponseDate, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingQualificationFind {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    requestedResponseDate: ").append(toIndentedString(requestedResponseDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

