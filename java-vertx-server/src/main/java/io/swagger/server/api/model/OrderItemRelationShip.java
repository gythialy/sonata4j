package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class allows the ability to associate one order item to another order item.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderItemRelationShip   {
  
  private String id = null;
  private String productOrderId = null;
  private String type = null;

  public OrderItemRelationShip () {

  }

  public OrderItemRelationShip (String id, String productOrderId, String type) {
    this.id = id;
    this.productOrderId = productOrderId;
    this.type = type;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("productOrderId")
  public String getProductOrderId() {
    return productOrderId;
  }
  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRelationShip orderItemRelationShip = (OrderItemRelationShip) o;
    return Objects.equals(id, orderItemRelationShip.id) &&
        Objects.equals(productOrderId, orderItemRelationShip.productOrderId) &&
        Objects.equals(type, orderItemRelationShip.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productOrderId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRelationShip {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
