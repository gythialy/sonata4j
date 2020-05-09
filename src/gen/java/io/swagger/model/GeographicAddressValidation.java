package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "Resource used to support a request for a validation address : check if a geographic address described by values attributes exists) If exist, id is provided if not, alternate address(es) could be provided")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class GeographicAddressValidation {

    private String id = null;
    private GeographicAddressRequestBuyerInput requestedAddress = null;
    private Date validationDate = null;
    private ValidationResult validationResult = null;
    private List<GeographicAddressSellerResponse> verifiedAddress = new ArrayList<GeographicAddressSellerResponse>();

    /**
     * Unique identifier of the Address Validation (Not an address id !!)
     **/

    @ApiModelProperty(value = "Unique identifier of the Address Validation (Not an address id !!)")
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
    @JsonProperty("requestedAddress")
    @NotNull
    public GeographicAddressRequestBuyerInput getRequestedAddress() {
        return requestedAddress;
    }

    public void setRequestedAddress(GeographicAddressRequestBuyerInput requestedAddress) {
        this.requestedAddress = requestedAddress;
    }

    /**
     * Date when the address validation is performed
     **/

    @ApiModelProperty(value = "Date when the address validation is performed")
    @JsonProperty("validationDate")
    public Date getValidationDate() {
        return validationDate;
    }

    public void setValidationDate(Date validationDate) {
        this.validationDate = validationDate;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("validationResult")
    public ValidationResult getValidationResult() {
        return validationResult;
    }

    public void setValidationResult(ValidationResult validationResult) {
        this.validationResult = validationResult;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("verifiedAddress")
    public List<GeographicAddressSellerResponse> getVerifiedAddress() {
        return verifiedAddress;
    }

    public void setVerifiedAddress(List<GeographicAddressSellerResponse> verifiedAddress) {
        this.verifiedAddress = verifiedAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeographicAddressValidation geographicAddressValidation = (GeographicAddressValidation) o;
        return Objects.equals(id, geographicAddressValidation.id) &&
                Objects.equals(requestedAddress, geographicAddressValidation.requestedAddress) &&
                Objects.equals(validationDate, geographicAddressValidation.validationDate) &&
                Objects.equals(validationResult, geographicAddressValidation.validationResult) &&
                Objects.equals(verifiedAddress, geographicAddressValidation.verifiedAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestedAddress, validationDate, validationResult, verifiedAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeographicAddressValidation {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    requestedAddress: ").append(toIndentedString(requestedAddress)).append("\n");
        sb.append("    validationDate: ").append(toIndentedString(validationDate)).append("\n");
        sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
        sb.append("    verifiedAddress: ").append(toIndentedString(verifiedAddress)).append("\n");
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

