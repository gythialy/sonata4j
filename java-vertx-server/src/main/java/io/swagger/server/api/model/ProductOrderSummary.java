package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOrderStateType;
import java.time.OffsetDateTime;

/**
 * Structure to define GET without id response. A list of productOrder matching request criteria. Provides Product order summary view.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrderSummary   {
  
  private String externalId = null;
  private String id = null;
  private OffsetDateTime orderDate = null;
  private ProductOrderStateType state = null;

  public ProductOrderSummary () {

  }

  public ProductOrderSummary (String externalId, String id, OffsetDateTime orderDate, ProductOrderStateType state) {
    this.externalId = externalId;
    this.id = id;
    this.orderDate = orderDate;
    this.state = state;
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

    
  @JsonProperty("orderDate")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }
  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
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
    ProductOrderSummary productOrderSummary = (ProductOrderSummary) o;
    return Objects.equals(externalId, productOrderSummary.externalId) &&
        Objects.equals(id, productOrderSummary.id) &&
        Objects.equals(orderDate, productOrderSummary.orderDate) &&
        Objects.equals(state, productOrderSummary.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, orderDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderSummary {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
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
