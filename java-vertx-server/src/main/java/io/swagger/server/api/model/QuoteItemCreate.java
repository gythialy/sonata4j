package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ItemTerm;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductActionType;
import io.swagger.server.api.model.ProductOfferingQualificationRef;
import io.swagger.server.api.model.ProductOfferingRef;
import io.swagger.server.api.model.QuoteItemRelationship;
import io.swagger.server.api.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;

/**
 * This structure is used to describe Quote item only in the POST operation for the request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteItemCreate   {
  
  private String schemaLocation = null;
  private String type = null;
  private ProductActionType action = null;
  private String id = null;
  private List<Note> note = new ArrayList<>();
  private Product product = null;
  private ProductOfferingRef productOffering = null;
  private ProductOfferingQualificationRef qualification = null;
  private List<QuoteItemRelationship> quoteItemRelationship = new ArrayList<>();
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private ItemTerm requestedQuoteItemTerm = null;

  public QuoteItemCreate () {

  }

  public QuoteItemCreate (String schemaLocation, String type, ProductActionType action, String id, List<Note> note, Product product, ProductOfferingRef productOffering, ProductOfferingQualificationRef qualification, List<QuoteItemRelationship> quoteItemRelationship, List<RelatedParty> relatedParty, ItemTerm requestedQuoteItemTerm) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.action = action;
    this.id = id;
    this.note = note;
    this.product = product;
    this.productOffering = productOffering;
    this.qualification = qualification;
    this.quoteItemRelationship = quoteItemRelationship;
    this.relatedParty = relatedParty;
    this.requestedQuoteItemTerm = requestedQuoteItemTerm;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("action")
  public ProductActionType getAction() {
    return action;
  }
  public void setAction(ProductActionType action) {
    this.action = action;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }
  public void setNote(List<Note> note) {
    this.note = note;
  }

    
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }

    
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }
  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

    
  @JsonProperty("qualification")
  public ProductOfferingQualificationRef getQualification() {
    return qualification;
  }
  public void setQualification(ProductOfferingQualificationRef qualification) {
    this.qualification = qualification;
  }

    
  @JsonProperty("quoteItemRelationship")
  public List<QuoteItemRelationship> getQuoteItemRelationship() {
    return quoteItemRelationship;
  }
  public void setQuoteItemRelationship(List<QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
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
