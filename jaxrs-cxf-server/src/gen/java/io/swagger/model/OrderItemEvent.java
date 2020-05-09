package io.swagger.model;

import io.swagger.model.BillingAccountRef;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductEvent;
import io.swagger.model.ProductOrderItemStateType;
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

public class OrderItemEvent  {
  
  @ApiModelProperty(value = "Target a description file of productOrder extension")
 /**
   * Target a description file of productOrder extension
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Type of productOrder")
 /**
   * Type of productOrder
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductActionType action = null;

  @ApiModelProperty(value = "")
  @Valid
  private BillingAccountRef billingAccount = null;

  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private ProductEvent product = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderItemStateType state = null;
 /**
   * Target a description file of productOrder extension
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public OrderItemEvent schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Type of productOrder
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItemEvent type(String type) {
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

  public OrderItemEvent action(ProductActionType action) {
    this.action = action;
    return this;
  }

 /**
   * Get billingAccount
   * @return billingAccount
  **/
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public OrderItemEvent billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

 /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
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

  public OrderItemEvent id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public ProductEvent getProduct() {
    return product;
  }

  public void setProduct(ProductEvent product) {
    this.product = product;
  }

  public OrderItemEvent product(ProductEvent product) {
    this.product = product;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public ProductOrderItemStateType getState() {
    return state;
  }

  public void setState(ProductOrderItemStateType state) {
    this.state = state;
  }

  public OrderItemEvent state(ProductOrderItemStateType state) {
    this.state = state;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

