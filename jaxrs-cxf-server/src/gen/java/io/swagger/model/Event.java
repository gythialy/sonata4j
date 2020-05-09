package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.model.ProductOrderEvent;
import io.swagger.model.ProductOrderEventType;
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
  * Event class is used to describe information structure used for notification.
 **/
@ApiModel(description="Event class is used to describe information structure used for notification.")
public class Event  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderEvent event = null;

  @ApiModelProperty(required = true, value = "")
  private String eventId = null;

  @ApiModelProperty(required = true, value = "")
  private Date eventTime = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ProductOrderEventType eventType = null;
 /**
   * Get event
   * @return event
  **/
  @JsonProperty("event")
  @NotNull
  public ProductOrderEvent getEvent() {
    return event;
  }

  public void setEvent(ProductOrderEvent event) {
    this.event = event;
  }

  public Event event(ProductOrderEvent event) {
    this.event = event;
    return this;
  }

 /**
   * Get eventId
   * @return eventId
  **/
  @JsonProperty("eventId")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Event eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * Get eventTime
   * @return eventTime
  **/
  @JsonProperty("eventTime")
  @NotNull
  public Date getEventTime() {
    return eventTime;
  }

  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }

  public Event eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }

 /**
   * Get eventType
   * @return eventType
  **/
  @JsonProperty("eventType")
  @NotNull
  public ProductOrderEventType getEventType() {
    return eventType;
  }

  public void setEventType(ProductOrderEventType eventType) {
    this.eventType = eventType;
  }

  public Event eventType(ProductOrderEventType eventType) {
    this.eventType = eventType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

