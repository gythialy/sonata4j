package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@ApiModel(description = "Free form text to clarify or explain the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class Note {

    private String author = null;
    private Date date = null;
    private String text = null;

    /**
     * The author of the note
     **/

    @ApiModelProperty(required = true, value = "The author of the note")
    @JsonProperty("author")
    @NotNull
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
     **/

    @ApiModelProperty(required = true, value = "The date of the note. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).")
    @JsonProperty("date")
    @NotNull
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * The text of the note
     **/

    @ApiModelProperty(required = true, value = "The text of the note")
    @JsonProperty("text")
    @NotNull
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

