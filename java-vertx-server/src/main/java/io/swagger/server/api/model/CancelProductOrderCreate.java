package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOrderRefCancel;
import java.time.OffsetDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class CancelProductOrderCreate   {
  
  private String schemaLocation = null;
  private String type = null;
  private String cancellationReason = null;
  private ProductOrderRefCancel productOrder = null;
  private OffsetDateTime requestedCancellationDate = null;

  public CancelProductOrderCreate () {

  }

  public CancelProductOrderCreate (String schemaLocation, String type, String cancellationReason, ProductOrderRefCancel productOrder, OffsetDateTime requestedCancellationDate) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.cancellationReason = cancellationReason;
    this.productOrder = productOrder;
    this.requestedCancellationDate = requestedCancellationDate;
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

    
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }
  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelProductOrderCreate cancelProductOrderCreate = (CancelProductOrderCreate) o;
    return Objects.equals(schemaLocation, cancelProductOrderCreate.schemaLocation) &&
        Objects.equals(type, cancelProductOrderCreate.type) &&
        Objects.equals(cancellationReason, cancelProductOrderCreate.cancellationReason) &&
        Objects.equals(productOrder, cancelProductOrderCreate.productOrder) &&
        Objects.equals(requestedCancellationDate, cancelProductOrderCreate.requestedCancellationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, cancellationReason, productOrder, requestedCancellationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderCreate {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
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
