package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ItemTerm;
import io.swagger.model.Note;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingQualificationRef;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.QuoteItemRelationship;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * This structure is used to describe Quote item only in the POST operation for the request.
 **/
@ApiModel(description="This structure is used to describe Quote item only in the POST operation for the request.")
public class QuoteItemCreate  {
  
  @ApiModelProperty(value = "Link to the schema describing this REST resource")
 /**
   * Link to the schema describing this REST resource
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Indicates the base (class) type of the quote Item.")
 /**
   * Indicates the base (class) type of the quote Item.
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductActionType action = null;

  @ApiModelProperty(required = true, value = "Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...).")
 /**
   * Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...).
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<Note> note = null;

  @ApiModelProperty(value = "")
  @Valid
  private Product product = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingRef productOffering = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductOfferingQualificationRef qualification = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<QuoteItemRelationship> quoteItemRelationship = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @ApiModelProperty(value = "")
  @Valid
  private ItemTerm requestedQuoteItemTerm = null;
 /**
   * Link to the schema describing this REST resource
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public QuoteItemCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Indicates the base (class) type of the quote Item.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QuoteItemCreate type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get action
   * @return action
  **/
  @JsonProperty("action")
  @NotNull
  public ProductActionType getAction() {
    return action;
  }

  public void setAction(ProductActionType action) {
    this.action = action;
  }

  public QuoteItemCreate action(ProductActionType action) {
    this.action = action;
    return this;
  }

 /**
   * Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...).
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteItemCreate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get note
   * @return note
  **/
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public QuoteItemCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public QuoteItemCreate addNoteItem(Note noteItem) {
    this.note.add(noteItem);
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public QuoteItemCreate product(Product product) {
    this.product = product;
    return this;
  }

 /**
   * Get productOffering
   * @return productOffering
  **/
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public QuoteItemCreate productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

 /**
   * Get qualification
   * @return qualification
  **/
  @JsonProperty("qualification")
  public ProductOfferingQualificationRef getQualification() {
    return qualification;
  }

  public void setQualification(ProductOfferingQualificationRef qualification) {
    this.qualification = qualification;
  }

  public QuoteItemCreate qualification(ProductOfferingQualificationRef qualification) {
    this.qualification = qualification;
    return this;
  }

 /**
   * Get quoteItemRelationship
   * @return quoteItemRelationship
  **/
  @JsonProperty("quoteItemRelationship")
  public List<QuoteItemRelationship> getQuoteItemRelationship() {
    return quoteItemRelationship;
  }

  public void setQuoteItemRelationship(List<QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
  }

  public QuoteItemCreate quoteItemRelationship(List<QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
    return this;
  }

  public QuoteItemCreate addQuoteItemRelationshipItem(QuoteItemRelationship quoteItemRelationshipItem) {
    this.quoteItemRelationship.add(quoteItemRelationshipItem);
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public QuoteItemCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public QuoteItemCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

 /**
   * Get requestedQuoteItemTerm
   * @return requestedQuoteItemTerm
  **/
  @JsonProperty("requestedQuoteItemTerm")
  public ItemTerm getRequestedQuoteItemTerm() {
    return requestedQuoteItemTerm;
  }

  public void setRequestedQuoteItemTerm(ItemTerm requestedQuoteItemTerm) {
    this.requestedQuoteItemTerm = requestedQuoteItemTerm;
  }

  public QuoteItemCreate requestedQuoteItemTerm(ItemTerm requestedQuoteItemTerm) {
    this.requestedQuoteItemTerm = requestedQuoteItemTerm;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

