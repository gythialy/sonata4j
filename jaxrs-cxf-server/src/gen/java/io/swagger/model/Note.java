package io.swagger.model;

import io.swagger.annotations.ApiModel;
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
  * Free form text to clarify or explain the order.
 **/
@ApiModel(description="Free form text to clarify or explain the order.")
public class Note  {
  
  @ApiModelProperty(required = true, value = "The author of the note")
 /**
   * The author of the note
  **/
  private String author = null;

  @ApiModelProperty(required = true, value = "The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).")
 /**
   * The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
  **/
  private Date date = null;

  @ApiModelProperty(required = true, value = "The text of the note")
 /**
   * The text of the note
  **/
  private String text = null;
 /**
   * The author of the note
   * @return author
  **/
  @JsonProperty("author")
  @NotNull
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Note author(String author) {
    this.author = author;
    return this;
  }

 /**
   * The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
   * @return date
  **/
  @JsonProperty("date")
  @NotNull
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Note date(Date date) {
    this.date = date;
    return this;
  }

 /**
   * The text of the note
   * @return text
  **/
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Note text(String text) {
    this.text = text;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

