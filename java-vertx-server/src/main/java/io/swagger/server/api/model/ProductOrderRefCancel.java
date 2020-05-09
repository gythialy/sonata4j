package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ProductOrderStateType;

/**
 * A reference to a product order used to perform cancellation request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ProductOrderRefCancel   {
  
  private String referredType = null;
  private String externalId = null;
  private String href = null;
  private String id = null;
  private ProductOrderStateType state = null;
  private String version = null;

  public ProductOrderRefCancel () {

  }

  public ProductOrderRefCancel (String referredType, String externalId, String href, String id, ProductOrderStateType state, String version) {
    this.referredType = referredType;
    this.externalId = externalId;
    this.href = href;
    this.id = id;
    this.state = state;
    this.version = version;
  }

    
  @JsonProperty("@referredType")
  public String getReferredType() {
    return referredType;
  }
  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
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

    
  @JsonProperty("state")
  public ProductOrderStateType getState() {
    return state;
  }
  public void setState(ProductOrderStateType state) {
    this.state = state;
  }

    
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderRefCancel productOrderRefCancel = (ProductOrderRefCancel) o;
    return Objects.equals(referredType, productOrderRefCancel.referredType) &&
        Objects.equals(externalId, productOrderRefCancel.externalId) &&
        Objects.equals(href, productOrderRefCancel.href) &&
        Objects.equals(id, productOrderRefCancel.id) &&
        Objects.equals(state, productOrderRefCancel.state) &&
        Objects.equals(version, productOrderRefCancel.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredType, externalId, href, id, state, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderRefCancel {\n");
    
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
