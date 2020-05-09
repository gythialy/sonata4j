package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Free form text to clarify or explain the order.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Note   {
  
  private String author = null;
  private OffsetDateTime date = null;
  private String text = null;

  public Note () {

  }

  public Note (String author, OffsetDateTime date, String text) {
    this.author = author;
    this.date = date;
    this.text = text;
  }

    
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

    
  @JsonProperty("date")
  public OffsetDateTime getDate() {
    return date;
  }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(author, note.author) &&
        Objects.equals(date, note.date) &&
        Objects.equals(text, note.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, date, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
