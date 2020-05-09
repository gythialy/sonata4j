package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.QuoteStateType;
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
  * Structure to response for a quote cancellation/rejection request
 **/
@ApiModel(description="Structure to response for a quote cancellation/rejection request")
public class ChangeQuoteStateResponse  {
  
  @ApiModelProperty(value = "External Id of the quote (buyer quote id). If provided by seller this information is send back in the response.")
 /**
   * External Id of the quote (buyer quote id). If provided by seller this information is send back in the response.
  **/
  private String externalId = null;

  @ApiModelProperty(required = true, value = "id of the quote to be cancelled")
 /**
   * id of the quote to be cancelled
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "Cancellation or rejection date (effective)")
 /**
   * Cancellation or rejection date (effective)
  **/
  private Date quoteEffectiveStateChangeDate = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private QuoteStateType state = null;
 /**
   * External Id of the quote (buyer quote id). If provided by seller this information is send back in the response.
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ChangeQuoteStateResponse externalId(String externalId) {
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

  public ChangeQuoteStateResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Cancellation or rejection date (effective)
   * @return quoteEffectiveStateChangeDate
  **/
  @JsonProperty("quoteEffectiveStateChangeDate")
  @NotNull
  public Date getQuoteEffectiveStateChangeDate() {
    return quoteEffectiveStateChangeDate;
  }

  public void setQuoteEffectiveStateChangeDate(Date quoteEffectiveStateChangeDate) {
    this.quoteEffectiveStateChangeDate = quoteEffectiveStateChangeDate;
  }

  public ChangeQuoteStateResponse quoteEffectiveStateChangeDate(Date quoteEffectiveStateChangeDate) {
    this.quoteEffectiveStateChangeDate = quoteEffectiveStateChangeDate;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  @NotNull
  public QuoteStateType getState() {
    return state;
  }

  public void setState(QuoteStateType state) {
    this.state = state;
  }

  public ChangeQuoteStateResponse state(QuoteStateType state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeQuoteStateResponse {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteEffectiveStateChangeDate: ").append(toIndentedString(quoteEffectiveStateChangeDate)).append("\n");
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

