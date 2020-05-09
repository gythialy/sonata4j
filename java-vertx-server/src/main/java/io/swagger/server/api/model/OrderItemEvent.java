package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.BillingAccountRef;
import io.swagger.server.api.model.ProductActionType;
import io.swagger.server.api.model.ProductEvent;
import io.swagger.server.api.model.ProductOrderItemStateType;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrderItemEvent   {
  
  private String schemaLocation = null;
  private String type = null;
  private ProductActionType action = null;
  private BillingAccountRef billingAccount = null;
  private String id = null;
  private ProductEvent product = null;
  private ProductOrderItemStateType state = null;

  public OrderItemEvent () {

  }

  public OrderItemEvent (String schemaLocation, String type, ProductActionType action, BillingAccountRef billingAccount, String id, ProductEvent product, ProductOrderItemStateType state) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.action = action;
    this.billingAccount = billingAccount;
    this.id = id;
    this.product = product;
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

    
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }
  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("product")
  public ProductEvent getProduct() {
    return product;
  }
  public void setProduct(ProductEvent product) {
    this.product = product;
  }

    
  @JsonProperty("state")
  public ProductOrderItemStateType getState() {
    return state;
  }
  public void setState(ProductOrderItemStateType state) {
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
    OrderItemEvent orderItemEvent = (OrderItemEvent) o;
    return Objects.equals(schemaLocation, orderItemEvent.schemaLocation) &&
        Objects.equals(type, orderItemEvent.type) &&
        Objects.equals(action, orderItemEvent.action) &&
        Objects.equals(billingAccount, orderItemEvent.billingAccount) &&
        Objects.equals(id, orderItemEvent.id) &&
        Objects.equals(product, orderItemEvent.product) &&
        Objects.equals(state, orderItemEvent.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, action, billingAccount, id, product, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemEvent {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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
