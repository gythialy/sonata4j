package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Duration;

/**
 * Used to describe a term (also know as commitment) for a quote item
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ItemTerm   {
  
  private String description = null;
  private Duration duration = null;
  private String name = null;

  public ItemTerm () {

  }

  public ItemTerm (String description, Duration duration, String name) {
    this.description = description;
    this.duration = duration;
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("duration")
  public Duration getDuration() {
    return duration;
  }
  public void setDuration(Duration duration) {
    this.duration = duration;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemTerm itemTerm = (ItemTerm) o;
    return Objects.equals(description, itemTerm.description) &&
        Objects.equals(duration, itemTerm.duration) &&
        Objects.equals(name, itemTerm.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
