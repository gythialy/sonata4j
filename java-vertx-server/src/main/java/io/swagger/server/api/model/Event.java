package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOrderEvent;
import io.swagger.server.api.model.ProductOrderEventType;
import java.time.OffsetDateTime;

/**
 * Event class is used to describe information structure used for notification.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Event   {
  
  private ProductOrderEvent event = null;
  private String eventId = null;
  private OffsetDateTime eventTime = null;
  private ProductOrderEventType eventType = null;

  public Event () {

  }

  public Event (ProductOrderEvent event, String eventId, OffsetDateTime eventTime, ProductOrderEventType eventType) {
    this.event = event;
    this.eventId = eventId;
    this.eventTime = eventTime;
    this.eventType = eventType;
  }

    
  @JsonProperty("event")
  public ProductOrderEvent getEvent() {
    return event;
  }
  public void setEvent(ProductOrderEvent event) {
    this.event = event;
  }

    
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }
  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

    
  @JsonProperty("eventType")
  public ProductOrderEventType getEventType() {
    return eventType;
  }
  public void setEventType(ProductOrderEventType eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(event, event.event) &&
        Objects.equals(eventId, event.eventId) &&
        Objects.equals(eventTime, event.eventTime) &&
        Objects.equals(eventType, event.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
