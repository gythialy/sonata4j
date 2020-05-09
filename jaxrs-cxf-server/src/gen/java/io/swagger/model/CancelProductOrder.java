package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOrderRefCancel;
import io.swagger.model.TaskStateType;
import java.util.Date;
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
  * Structure to allow Seller to answer to a cancel order request
 **/
@ApiModel(description="Structure to allow Seller to answer to a cancel order request")
public class CancelProductOrder  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class.")
 /**
   * Technical attribute to extend this class.
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Technical attribute to extend this class.")
 /**
   * Technical attribute to extend this class.
  **/
  private String type = null;

  @ApiModelProperty(value = "If seller denied cancellation request he could here provide reason for this denial")
 /**
   * If seller denied cancellation request he could here provide reason for this denial
  **/
  private String cancellationDeniedReason = null;

  @ApiModelProperty(value = "An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.")
 /**
   * An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
  **/
  private String cancellationReason = null;

  @ApiModelProperty(value = "Hyperlink to access order cancellation request.This is not a product order href.")
 /**
   * Hyperlink to access order cancellation request.This is not a product order href.
  **/
  private String href = null;

  @ApiModelProperty(required = true, value = "Unique identifier for the order cancellation request that is generated by the Seller when the order cancellation is accepted via an API. This is not the order id.")
 /**
   * Unique identifier for the order cancellation request that is generated by the Seller when the order cancellation is accepted via an API. This is not the order id.
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderRefCancel productOrder = null;

  @ApiModelProperty(required = true, value = "Identifies the date the Seller cancelled the Order.")
 /**
   * Identifies the date the Seller cancelled the Order.
  **/
  private Date requestedCancellationDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private TaskStateType state = null;
 /**
   * Technical attribute to extend this class.
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public CancelProductOrder schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Technical attribute to extend this class.
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CancelProductOrder type(String type) {
    this.type = type;
    return this;
  }

 /**
   * If seller denied cancellation request he could here provide reason for this denial
   * @return cancellationDeniedReason
  **/
  @JsonProperty("cancellationDeniedReason")
  public String getCancellationDeniedReason() {
    return cancellationDeniedReason;
  }

  public void setCancellationDeniedReason(String cancellationDeniedReason) {
    this.cancellationDeniedReason = cancellationDeniedReason;
  }

  public CancelProductOrder cancellationDeniedReason(String cancellationDeniedReason) {
    this.cancellationDeniedReason = cancellationDeniedReason;
    return this;
  }

 /**
   * An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
   * @return cancellationReason
  **/
  @JsonProperty("cancellationReason")
  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelProductOrder cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

 /**
   * Hyperlink to access order cancellation request.This is not a product order href.
   * @return href
  **/
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CancelProductOrder href(String href) {
    this.href = href;
    return this;
  }

 /**
   * Unique identifier for the order cancellation request that is generated by the Seller when the order cancellation is accepted via an API. This is not the order id.
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

  public CancelProductOrder id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get productOrder
   * @return productOrder
  **/
  @JsonProperty("productOrder")
  @NotNull
  public ProductOrderRefCancel getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(ProductOrderRefCancel productOrder) {
    this.productOrder = productOrder;
  }

  public CancelProductOrder productOrder(ProductOrderRefCancel productOrder) {
    this.productOrder = productOrder;
    return this;
  }

 /**
   * Identifies the date the Seller cancelled the Order.
   * @return requestedCancellationDate
  **/
  @JsonProperty("requestedCancellationDate")
  @NotNull
  public Date getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  public void setRequestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  public CancelProductOrder requestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public TaskStateType getState() {
    return state;
  }

  public void setState(TaskStateType state) {
    this.state = state;
  }

  public CancelProductOrder state(TaskStateType state) {
    this.state = state;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
