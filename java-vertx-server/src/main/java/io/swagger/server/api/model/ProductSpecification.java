package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.Describing;

/**
 * A ProductSpec describes the invariant properties (i.e., features) that a given set of Products MAY have. These properties provide the information needed to plan, construct, allocate, and/or retire the Services and Resources from the operator environment needed to deliver the Product
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductSpecification   {
  
  private Describing describing = null;
  private String id = null;

  public ProductSpecification () {

  }

  public ProductSpecification (Describing describing, String id) {
    this.describing = describing;
    this.id = id;
  }

    
  @JsonProperty("describing")
  public Describing getDescribing() {
    return describing;
  }
  public void setDescribing(Describing describing) {
    this.describing = describing;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecification productSpecification = (ProductSpecification) o;
    return Objects.equals(describing, productSpecification.describing) &&
        Objects.equals(id, productSpecification.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describing, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecification {\n");
    
    sb.append("    describing: ").append(toIndentedString(describing)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
