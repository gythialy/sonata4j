package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "Using to refer a serviceability request previously done")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QualificationRef {

    private String referredType = null;
    private String href = null;
    private String id = null;
    private String qualificationItem = null;

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
     * Hyperlink to the qualification previously done for this item
     **/

    @ApiModelProperty(value = "Hyperlink to the qualification previously done for this item")
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * id of the qualification previously done for this item
     **/

    @ApiModelProperty(value = "id of the qualification previously done for this item")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * item id of the qualification previously done for this item
     **/

    @ApiModelProperty(value = "item id of the qualification previously done for this item")
    @JsonProperty("qualificationItem")
    public String getQualificationItem() {
        return qualificationItem;
    }

    public void setQualificationItem(String qualificationItem) {
        this.qualificationItem = qualificationItem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualificationRef qualificationRef = (QualificationRef) o;
        return Objects.equals(referredType, qualificationRef.referredType) &&
                Objects.equals(href, qualificationRef.href) &&
                Objects.equals(id, qualificationRef.id) &&
                Objects.equals(qualificationItem, qualificationRef.qualificationItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referredType, href, id, qualificationItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualificationRef {\n");

        sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    qualificationItem: ").append(toIndentedString(qualificationItem)).append("\n");
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

