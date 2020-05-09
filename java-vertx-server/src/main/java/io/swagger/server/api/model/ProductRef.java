package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Product reference used to describe product relationship.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductRef   {
  
  private String buyerProductId = null;
  private String href = null;
  private String id = null;

  public ProductRef () {

  }

  public ProductRef (String buyerProductId, String href, String id) {
    this.buyerProductId = buyerProductId;
    this.href = href;
    this.id = id;
  }

    
  @JsonProperty("buyerProductId")
  public String getBuyerProductId() {
    return buyerProductId;
  }
  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

    
  @JsonProperty("href")
  public String getHref() {
    return href;
  }
  public void setHref(String href) {
    this.href = href;
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
    ProductRef productRef = (ProductRef) o;
    return Objects.equals(buyerProductId, productRef.buyerProductId) &&
        Objects.equals(href, productRef.href) &&
        Objects.equals(id, productRef.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerProductId, href, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRef {\n");
    
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
