package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.GeographicAddressFindResp;
import io.swagger.server.api.model.Status;

/**
 * Technical structure to provide site list retrieve in the GET operation
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicSiteFindResp   {
  
  private GeographicAddressFindResp geographicAddress = null;
  private String id = null;
  private String siteCompanyName = null;
  private String siteContactName = null;
  private String siteCustomerName = null;
  private String siteDescription = null;
  private String siteName = null;
  private String siteType = null;
  private Status status = null;

  public GeographicSiteFindResp () {

  }

  public GeographicSiteFindResp (GeographicAddressFindResp geographicAddress, String id, String siteCompanyName, String siteContactName, String siteCustomerName, String siteDescription, String siteName, String siteType, Status status) {
    this.geographicAddress = geographicAddress;
    this.id = id;
    this.siteCompanyName = siteCompanyName;
    this.siteContactName = siteContactName;
    this.siteCustomerName = siteCustomerName;
    this.siteDescription = siteDescription;
    this.siteName = siteName;
    this.siteType = siteType;
    this.status = status;
  }

    
  @JsonProperty("geographicAddress")
  public GeographicAddressFindResp getGeographicAddress() {
    return geographicAddress;
  }
  public void setGeographicAddress(GeographicAddressFindResp geographicAddress) {
    this.geographicAddress = geographicAddress;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("siteCompanyName")
  public String getSiteCompanyName() {
    return siteCompanyName;
  }
  public void setSiteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
  }

    
  @JsonProperty("siteContactName")
  public String getSiteContactName() {
    return siteContactName;
  }
  public void setSiteContactName(String siteContactName) {
    this.siteContactName = siteContactName;
  }

    
  @JsonProperty("siteCustomerName")
  public String getSiteCustomerName() {
    return siteCustomerName;
  }
  public void setSiteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
  }

    
  @JsonProperty("siteDescription")
  public String getSiteDescription() {
    return siteDescription;
  }
  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }

    
  @JsonProperty("siteName")
  public String getSiteName() {
    return siteName;
  }
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

    
  @JsonProperty("siteType")
  public String getSiteType() {
    return siteType;
  }
  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }

    
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSiteFindResp geographicSiteFindResp = (GeographicSiteFindResp) o;
    return Objects.equals(geographicAddress, geographicSiteFindResp.geographicAddress) &&
        Objects.equals(id, geographicSiteFindResp.id) &&
        Objects.equals(siteCompanyName, geographicSiteFindResp.siteCompanyName) &&
        Objects.equals(siteContactName, geographicSiteFindResp.siteContactName) &&
        Objects.equals(siteCustomerName, geographicSiteFindResp.siteCustomerName) &&
        Objects.equals(siteDescription, geographicSiteFindResp.siteDescription) &&
        Objects.equals(siteName, geographicSiteFindResp.siteName) &&
        Objects.equals(siteType, geographicSiteFindResp.siteType) &&
        Objects.equals(status, geographicSiteFindResp.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicAddress, id, siteCompanyName, siteContactName, siteCustomerName, siteDescription, siteName, siteType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteFindResp {\n");
    
    sb.append("    geographicAddress: ").append(toIndentedString(geographicAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteCompanyName: ").append(toIndentedString(siteCompanyName)).append("\n");
    sb.append("    siteContactName: ").append(toIndentedString(siteContactName)).append("\n");
    sb.append("    siteCustomerName: ").append(toIndentedString(siteCustomerName)).append("\n");
    sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
