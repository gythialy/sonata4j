package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.RelationshipType;

/**
 * The relationship between product offering qualification items that can be used to validate business rules between POQ Items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOfferingQualificationItemRelationship   {
  
  private String id = null;
  private RelationshipType type = null;

  public ProductOfferingQualificationItemRelationship () {

  }

  public ProductOfferingQualificationItemRelationship (String id, RelationshipType type) {
    this.id = id;
    this.type = type;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public RelationshipType getType() {
    return type;
  }
  public void setType(RelationshipType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingQualificationItemRelationship productOfferingQualificationItemRelationship = (ProductOfferingQualificationItemRelationship) o;
    return Objects.equals(id, productOfferingQualificationItemRelationship.id) &&
        Objects.equals(type, productOfferingQualificationItemRelationship.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingQualificationItemRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
