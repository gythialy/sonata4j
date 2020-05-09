package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.QuoteChangeState;
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
  * Structure used to request quote cancellation/rejection
 **/
@ApiModel(description="Structure used to request quote cancellation/rejection")
public class ChangelQuoteStateRequest  {
  
  @ApiModelProperty(value = "External Id of the quote (buyer quote id). If provided seller will check consistence.")
 /**
   * External Id of the quote (buyer quote id). If provided seller will check consistence.
  **/
  private String externalId = null;

  @ApiModelProperty(required = true, value = "id of the quote to be cancelled")
 /**
   * id of the quote to be cancelled
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Cancellation reason")
 /**
   * Cancellation reason
  **/
  private String quoteChangeStateReason = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QuoteChangeState state = null;
 /**
   * External Id of the quote (buyer quote id). If provided seller will check consistence.
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ChangelQuoteStateRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * id of the quote to be cancelled
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

  public ChangelQuoteStateRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Cancellation reason
   * @return quoteChangeStateReason
  **/
  @JsonProperty("quoteChangeStateReason")
  @NotNull
  public String getQuoteChangeStateReason() {
    return quoteChangeStateReason;
  }

  public void setQuoteChangeStateReason(String quoteChangeStateReason) {
    this.quoteChangeStateReason = quoteChangeStateReason;
  }

  public ChangelQuoteStateRequest quoteChangeStateReason(String quoteChangeStateReason) {
    this.quoteChangeStateReason = quoteChangeStateReason;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public QuoteChangeState getState() {
    return state;
  }

  public void setState(QuoteChangeState state) {
    this.state = state;
  }

  public ChangelQuoteStateRequest state(QuoteChangeState state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelQuoteStateRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteChangeStateReason: ").append(toIndentedString(quoteChangeStateReason)).append("\n");
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

