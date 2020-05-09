package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to a productOrder and optionally to an order item.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrderRef   {
  
  private String href = null;
  private String id = null;
  private String orderItemId = null;

  public ProductOrderRef () {

  }

  public ProductOrderRef (String href, String id, String orderItemId) {
    this.href = href;
    this.id = id;
    this.orderItemId = orderItemId;
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

    
  @JsonProperty("orderItemId")
  public String getOrderItemId() {
    return orderItemId;
  }
  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderRef productOrderRef = (ProductOrderRef) o;
    return Objects.equals(href, productOrderRef.href) &&
        Objects.equals(id, productOrderRef.id) &&
        Objects.equals(orderItemId, productOrderRef.orderItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, id, orderItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderRef {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
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
