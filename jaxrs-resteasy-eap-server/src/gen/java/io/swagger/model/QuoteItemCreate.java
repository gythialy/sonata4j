package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "This structure is used to describe Quote item only in the POST operation for the request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteItemCreate {

    private String schemaLocation = null;
    private String type = null;
    private ProductActionType action = null;
    private String id = null;
    private List<Note> note = new ArrayList<Note>();
    private Product product = null;
    private ProductOfferingRef productOffering = null;
    private ProductOfferingQualificationRef qualification = null;
    private List<QuoteItemRelationship> quoteItemRelationship = new ArrayList<QuoteItemRelationship>();
    private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();
    private ItemTerm requestedQuoteItemTerm = null;

    /**
     * Link to the schema describing this REST resource
     **/

    @ApiModelProperty(value = "Link to the schema describing this REST resource")
    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    /**
     * Indicates the base (class) type of the quote Item.
     **/

    @ApiModelProperty(value = "Indicates the base (class) type of the quote Item.")
    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     **/

    @ApiModelProperty(required = true, value = "")
    @JsonProperty("action")
    @NotNull
    public ProductActionType getAction() {
        return action;
    }

    public void setAction(ProductActionType action) {
        this.action = action;
    }

    /**
     * Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...).
     **/

    @ApiModelProperty(required = true, value = "Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...).")
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

    @ApiModelProperty(value = "")
    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("productOffering")
    public ProductOfferingRef getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(ProductOfferingRef productOffering) {
        this.productOffering = productOffering;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("qualification")
    public ProductOfferingQualificationRef getQualification() {
        return qualification;
    }

    public void setQualification(ProductOfferingQualificationRef qualification) {
        this.qualification = qualification;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("quoteItemRelationship")
    public List<QuoteItemRelationship> getQuoteItemRelationship() {
        return quoteItemRelationship;
    }

    public void setQuoteItemRelationship(List<QuoteItemRelationship> quoteItemRelationship) {
        this.quoteItemRelationship = quoteItemRelationship;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     *
     **/

    @ApiModelProperty(value = "")
    @JsonProperty("requestedQuoteItemTerm")
    public ItemTerm getRequestedQuoteItemTerm() {
        return requestedQuoteItemTerm;
    }

    public void setRequestedQuoteItemTerm(ItemTerm requestedQuoteItemTerm) {
        this.requestedQuoteItemTerm = requestedQuoteItemTerm;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuoteItemCreate quoteItemCreate = (QuoteItemCreate) o;
        return Objects.equals(schemaLocation, quoteItemCreate.schemaLocation) &&
                Objects.equals(type, quoteItemCreate.type) &&
                Objects.equals(action, quoteItemCreate.action) &&
                Objects.equals(id, quoteItemCreate.id) &&
                Objects.equals(note, quoteItemCreate.note) &&
                Objects.equals(product, quoteItemCreate.product) &&
                Objects.equals(productOffering, quoteItemCreate.productOffering) &&
                Objects.equals(qualification, quoteItemCreate.qualification) &&
                Objects.equals(quoteItemRelationship, quoteItemCreate.quoteItemRelationship) &&
                Objects.equals(relatedParty, quoteItemCreate.relatedParty) &&
                Objects.equals(requestedQuoteItemTerm, quoteItemCreate.requestedQuoteItemTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaLocation, type, action, id, note, product, productOffering, qualification, quoteItemRelationship, relatedParty, requestedQuoteItemTerm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuoteItemCreate {\n");

        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
        sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
        sb.append("    quoteItemRelationship: ").append(toIndentedString(quoteItemRelationship)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    requestedQuoteItemTerm: ").append(toIndentedString(requestedQuoteItemTerm)).append("\n");
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

