package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Note;
import io.swagger.server.api.model.OrderItemEvent;
import io.swagger.server.api.model.OrderMessage;
import io.swagger.server.api.model.ProductOrderStateType;
import io.swagger.server.api.model.RelatedParty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductOrder structure used for notification
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrderEvent   {
  
  private String baseType = null;
  private String schemaLocation = null;
  private String type = null;
  private OffsetDateTime completionDate = null;
  private OffsetDateTime expectedCompletionDate = null;
  private String externalId = null;
  private String id = null;
  private List<Note> note = new ArrayList<>();
  private List<OrderItemEvent> orderItem = new ArrayList<>();
  private List<OrderMessage> orderMessage = new ArrayList<>();
  private String orderVersion = "1";
  private String projectId = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private OffsetDateTime requestedCompletionDate = null;
  private OffsetDateTime requestedStartDate = null;
  private ProductOrderStateType state = null;

  public ProductOrderEvent () {

  }

  public ProductOrderEvent (String baseType, String schemaLocation, String type, OffsetDateTime completionDate, OffsetDateTime expectedCompletionDate, String externalId, String id, List<Note> note, List<OrderItemEvent> orderItem, List<OrderMessage> orderMessage, String orderVersion, String projectId, List<RelatedParty> relatedParty, OffsetDateTime requestedCompletionDate, OffsetDateTime requestedStartDate, ProductOrderStateType state) {
    this.baseType = baseType;
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.completionDate = completionDate;
    this.expectedCompletionDate = expectedCompletionDate;
    this.externalId = externalId;
    this.id = id;
    this.note = note;
    this.orderItem = orderItem;
    this.orderMessage = orderMessage;
    this.orderVersion = orderVersion;
    this.projectId = projectId;
    this.relatedParty = relatedParty;
    this.requestedCompletionDate = requestedCompletionDate;
    this.requestedStartDate = requestedStartDate;
    this.state = state;
  }

    
  @JsonProperty("@baseType")
  public String getBaseType() {
    return baseType;
  }
  public void setBaseType(String baseType) {
    this.baseType = baseType;
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

    
  @JsonProperty("completionDate")
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }
  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

    
  @JsonProperty("expectedCompletionDate")
  public OffsetDateTime getExpectedCompletionDate() {
    return expectedCompletionDate;
  }
  public void setExpectedCompletionDate(OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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

    
  @JsonProperty("orderItem")
  public List<OrderItemEvent> getOrderItem() {
    return orderItem;
  }
  public void setOrderItem(List<OrderItemEvent> orderItem) {
    this.orderItem = orderItem;
  }

    
  @JsonProperty("orderMessage")
  public List<OrderMessage> getOrderMessage() {
    return orderMessage;
  }
  public void setOrderMessage(List<OrderMessage> orderMessage) {
    this.orderMessage = orderMessage;
  }

    
  @JsonProperty("orderVersion")
  public String getOrderVersion() {
    return orderVersion;
  }
  public void setOrderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
  }

    
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("requestedCompletionDate")
  public OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }
  public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

    
  @JsonProperty("requestedStartDate")
  public OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }
  public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

    
  @JsonProperty("state")
  public ProductOrderStateType getState() {
    return state;
  }
  public void setState(ProductOrderStateType state) {
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
    ProductOrderEvent productOrderEvent = (ProductOrderEvent) o;
    return Objects.equals(baseType, productOrderEvent.baseType) &&
        Objects.equals(schemaLocation, productOrderEvent.schemaLocation) &&
        Objects.equals(type, productOrderEvent.type) &&
        Objects.equals(completionDate, productOrderEvent.completionDate) &&
        Objects.equals(expectedCompletionDate, productOrderEvent.expectedCompletionDate) &&
        Objects.equals(externalId, productOrderEvent.externalId) &&
        Objects.equals(id, productOrderEvent.id) &&
        Objects.equals(note, productOrderEvent.note) &&
        Objects.equals(orderItem, productOrderEvent.orderItem) &&
        Objects.equals(orderMessage, productOrderEvent.orderMessage) &&
        Objects.equals(orderVersion, productOrderEvent.orderVersion) &&
        Objects.equals(projectId, productOrderEvent.projectId) &&
        Objects.equals(relatedParty, productOrderEvent.relatedParty) &&
        Objects.equals(requestedCompletionDate, productOrderEvent.requestedCompletionDate) &&
        Objects.equals(requestedStartDate, productOrderEvent.requestedStartDate) &&
        Objects.equals(state, productOrderEvent.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseType, schemaLocation, type, completionDate, expectedCompletionDate, externalId, id, note, orderItem, orderMessage, orderVersion, projectId, relatedParty, requestedCompletionDate, requestedStartDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderEvent {\n");
    
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
    sb.append("    orderMessage: ").append(toIndentedString(orderMessage)).append("\n");
    sb.append("    orderVersion: ").append(toIndentedString(orderVersion)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
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
