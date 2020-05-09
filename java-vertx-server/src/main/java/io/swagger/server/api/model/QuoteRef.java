package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quote used before this order to define pricing terms
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class QuoteRef   {
  
  private String referredType = null;
  private String href = null;
  private String id = null;
  private String quoteItem = null;

  public QuoteRef () {

  }

  public QuoteRef (String referredType, String href, String id, String quoteItem) {
    this.referredType = referredType;
    this.href = href;
    this.id = id;
    this.quoteItem = quoteItem;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
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

    
  @JsonProperty("quoteItem")
  public String getQuoteItem() {
    return quoteItem;
  }
  public void setQuoteItem(String quoteItem) {
    this.quoteItem = quoteItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteRef quoteRef = (QuoteRef) o;
    return Objects.equals(referredType, quoteRef.referredType) &&
        Objects.equals(href, quoteRef.href) &&
        Objects.equals(id, quoteRef.id) &&
        Objects.equals(quoteItem, quoteRef.quoteItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, href, id, quoteItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRef {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
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
