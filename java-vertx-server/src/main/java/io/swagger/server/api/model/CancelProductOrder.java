package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOrderRefCancel;
import io.swagger.server.api.model.TaskStateType;
import java.time.OffsetDateTime;

/**
 * Structure to allow Seller to answer to a cancel order request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class CancelProductOrder   {
  
  private String schemaLocation = null;
  private String type = null;
  private String cancellationDeniedReason = null;
  private String cancellationReason = null;
  private String href = null;
  private String id = null;
  private ProductOrderRefCancel productOrder = null;
  private OffsetDateTime requestedCancellationDate = null;
  private TaskStateType state = null;

  public CancelProductOrder () {

  }

  public CancelProductOrder (String schemaLocation, String type, String cancellationDeniedReason, String cancellationReason, String href, String id, ProductOrderRefCancel productOrder, OffsetDateTime requestedCancellationDate, TaskStateType state) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.cancellationDeniedReason = cancellationDeniedReason;
    this.cancellationReason = cancellationReason;
    this.href = href;
    this.id = id;
    this.productOrder = productOrder;
    this.requestedCancellationDate = requestedCancellationDate;
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

    
  @JsonProperty("cancellationDeniedReason")
  public String getCancellationDeniedReason() {
    return cancellationDeniedReason;
  }
  public void setCancellationDeniedReason(String cancellationDeniedReason) {
    this.cancellationDeniedReason = cancellationDeniedReason;
  }

    
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }
  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("productOrder")
  public ProductOrderRefCancel getProductOrder() {
    return productOrder;
  }
  public void setProductOrder(ProductOrderRefCancel productOrder) {
    this.productOrder = productOrder;
  }

    
  @JsonProperty("requestedCancellationDate")
  public OffsetDateTime getRequestedCancellationDate() {
    return requestedCancellationDate;
  }
  public void setRequestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

    
  @JsonProperty("state")
  public TaskStateType getState() {
    return state;
  }
  public void setState(TaskStateType state) {
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
    CancelProductOrder cancelProductOrder = (CancelProductOrder) o;
    return Objects.equals(schemaLocation, cancelProductOrder.schemaLocation) &&
        Objects.equals(type, cancelProductOrder.type) &&
        Objects.equals(cancellationDeniedReason, cancelProductOrder.cancellationDeniedReason) &&
        Objects.equals(cancellationReason, cancelProductOrder.cancellationReason) &&
        Objects.equals(href, cancelProductOrder.href) &&
        Objects.equals(id, cancelProductOrder.id) &&
        Objects.equals(productOrder, cancelProductOrder.productOrder) &&
        Objects.equals(requestedCancellationDate, cancelProductOrder.requestedCancellationDate) &&
        Objects.equals(state, cancelProductOrder.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, cancellationDeniedReason, cancellationReason, href, id, productOrder, requestedCancellationDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrder {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cancellationDeniedReason: ").append(toIndentedString(cancellationDeniedReason)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
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
