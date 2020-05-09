package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Quantity;
import io.swagger.server.api.model.TimePeriod;

/**
 * Indicate a commitment term associated to the product
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductTerm   {
  
  private String description = null;
  private Quantity duration = null;
  private String name = null;
  private TimePeriod validFor = null;

  public ProductTerm () {

  }

  public ProductTerm (String description, Quantity duration, String name, TimePeriod validFor) {
    this.description = description;
    this.duration = duration;
    this.name = name;
    this.validFor = validFor;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("duration")
  public Quantity getDuration() {
    return duration;
  }
  public void setDuration(Quantity duration) {
    this.duration = duration;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }
  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTerm productTerm = (ProductTerm) o;
    return Objects.equals(description, productTerm.description) &&
        Objects.equals(duration, productTerm.duration) &&
        Objects.equals(name, productTerm.name) &&
        Objects.equals(validFor, productTerm.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTerm {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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
