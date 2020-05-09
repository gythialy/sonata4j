package io.swagger.model;

import io.swagger.model.ProductOrderRefCancel;
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

public class CancelProductOrderCreate  {
  
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

  @ApiModelProperty(value = "An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.")
 /**
   * An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
  **/
  private String cancellationReason = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderRefCancel productOrder = null;

  @ApiModelProperty(required = true, value = "Identifies the date the Seller cancelled the Order.")
 /**
   * Identifies the date the Seller cancelled the Order.
  **/
  private Date requestedCancellationDate = null;
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

  public CancelProductOrderCreate schemaLocation(String schemaLocation) {
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

  public CancelProductOrderCreate type(String type) {
    this.type = type;
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

  public CancelProductOrderCreate cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
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

  public CancelProductOrderCreate productOrder(ProductOrderRefCancel productOrder) {
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

  public CancelProductOrderCreate requestedCancellationDate(Date requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

