package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is used to request a HUB creation - Used in the POST operation.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HubInput   {
  
  private String callback = null;
  private String query = null;

  public HubInput () {

  }

  public HubInput (String callback, String query) {
    this.callback = callback;
    this.query = query;
  }

    
  @JsonProperty("callback")
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }

    
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HubInput hubInput = (HubInput) o;
    return Objects.equals(callback, hubInput.callback) &&
        Objects.equals(query, hubInput.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callback, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HubInput {\n");
    
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
