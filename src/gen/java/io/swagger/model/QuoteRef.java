package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@ApiModel(description = "Quote used before this order to define pricing terms")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class QuoteRef {

    private String referredType = null;
    private String href = null;
    private String id = null;
    private String quoteItem = null;

    /**
     * Technical attribute to extend the API
     **/

    @ApiModelProperty(value = "Technical attribute to extend the API")
    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }

    /**
     * Hyperlink to access the quote (using MEF quote API)
     **/

    @ApiModelProperty(value = "Hyperlink to access the quote (using MEF quote API)")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API.
     **/

    @ApiModelProperty(required = true, value = "Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API.")
    @JsonProperty("id")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Identifier of the quote item
     **/

    @ApiModelProperty(value = "Identifier of the quote item")
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

