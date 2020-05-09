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
import io.swagger.server.api.model.QuoteItemStateType;
import io.swagger.server.api.model.QuotePrice;
import io.swagger.server.api.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;

/**
 * A quote items describe an action to be performed on a productOffering or a product in order to get pricing elements and condition
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteItem   {
  
  private String schemaLocation = null;
  private String type = null;
  private ProductActionType action = null;
  private String id = null;
  private List<Note> note = new ArrayList<>();
  private Product product = null;
  private ProductOfferingRef productOffering = null;
  private List<ProductOfferingQualificationRef> qualification = new ArrayList<>();
  private List<QuotePrice> quoteItemPrice = new ArrayList<>();
  private List<QuoteItemRelationship> quoteItemRelationship = new ArrayList<>();
  private ItemTerm quoteItemTerm = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private ItemTerm requestedQuoteItemTerm = null;
  private QuoteItemStateType state = null;

  public QuoteItem () {

  }

  public QuoteItem (String schemaLocation, String type, ProductActionType action, String id, List<Note> note, Product product, ProductOfferingRef productOffering, List<ProductOfferingQualificationRef> qualification, List<QuotePrice> quoteItemPrice, List<QuoteItemRelationship> quoteItemRelationship, ItemTerm quoteItemTerm, List<RelatedParty> relatedParty, ItemTerm requestedQuoteItemTerm, QuoteItemStateType state) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.action = action;
    this.id = id;
    this.note = note;
    this.product = product;
    this.productOffering = productOffering;
    this.qualification = qualification;
    this.quoteItemPrice = quoteItemPrice;
    this.quoteItemRelationship = quoteItemRelationship;
    this.quoteItemTerm = quoteItemTerm;
    this.relatedParty = relatedParty;
    this.requestedQuoteItemTerm = requestedQuoteItemTerm;
    this.state = state;
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
  public List<ProductOfferingQualificationRef> getQualification() {
    return qualification;
  }
  public void setQualification(List<ProductOfferingQualificationRef> qualification) {
    this.qualification = qualification;
  }

    
  @JsonProperty("quoteItemPrice")
  public List<QuotePrice> getQuoteItemPrice() {
    return quoteItemPrice;
  }
  public void setQuoteItemPrice(List<QuotePrice> quoteItemPrice) {
    this.quoteItemPrice = quoteItemPrice;
  }

    
  @JsonProperty("quoteItemRelationship")
  public List<QuoteItemRelationship> getQuoteItemRelationship() {
    return quoteItemRelationship;
  }
  public void setQuoteItemRelationship(List<QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
  }

    
  @JsonProperty("quoteItemTerm")
  public ItemTerm getQuoteItemTerm() {
    return quoteItemTerm;
  }
  public void setQuoteItemTerm(ItemTerm quoteItemTerm) {
    this.quoteItemTerm = quoteItemTerm;
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

    
  @JsonProperty("state")
  public QuoteItemStateType getState() {
    return state;
  }
  public void setState(QuoteItemStateType state) {
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
    QuoteItem quoteItem = (QuoteItem) o;
    return Objects.equals(schemaLocation, quoteItem.schemaLocation) &&
        Objects.equals(type, quoteItem.type) &&
        Objects.equals(action, quoteItem.action) &&
        Objects.equals(id, quoteItem.id) &&
        Objects.equals(note, quoteItem.note) &&
        Objects.equals(product, quoteItem.product) &&
        Objects.equals(productOffering, quoteItem.productOffering) &&
        Objects.equals(qualification, quoteItem.qualification) &&
        Objects.equals(quoteItemPrice, quoteItem.quoteItemPrice) &&
        Objects.equals(quoteItemRelationship, quoteItem.quoteItemRelationship) &&
        Objects.equals(quoteItemTerm, quoteItem.quoteItemTerm) &&
        Objects.equals(relatedParty, quoteItem.relatedParty) &&
        Objects.equals(requestedQuoteItemTerm, quoteItem.requestedQuoteItemTerm) &&
        Objects.equals(state, quoteItem.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, action, id, note, product, productOffering, qualification, quoteItemPrice, quoteItemRelationship, quoteItemTerm, relatedParty, requestedQuoteItemTerm, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteItem {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    quoteItemPrice: ").append(toIndentedString(quoteItemPrice)).append("\n");
    sb.append("    quoteItemRelationship: ").append(toIndentedString(quoteItemRelationship)).append("\n");
    sb.append("    quoteItemTerm: ").append(toIndentedString(quoteItemTerm)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedQuoteItemTerm: ").append(toIndentedString(requestedQuoteItemTerm)).append("\n");
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
