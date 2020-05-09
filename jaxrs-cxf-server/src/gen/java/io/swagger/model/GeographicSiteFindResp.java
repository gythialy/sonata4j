package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.GeographicAddressFindResp;
import io.swagger.model.Status;
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
  * Technical structure to provide site list retrieve in the GET operation
 **/
@ApiModel(description="Technical structure to provide site list retrieve in the GET operation")
public class GeographicSiteFindResp  {
  
  @ApiModelProperty(value = "")
  @Valid
  private GeographicAddressFindResp geographicAddress = null;

  @ApiModelProperty(value = "id of the site. This is coud be used in other API as a place")
 /**
   * id of the site. This is coud be used in other API as a place
  **/
  private String id = null;

  @ApiModelProperty(value = "The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)")
 /**
   * The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)
  **/
  private String siteCompanyName = null;

  @ApiModelProperty(value = "Name of the relatedParty which has role 'Site Contact' in the Site record.")
 /**
   * Name of the relatedParty which has role 'Site Contact' in the Site record.
  **/
  private String siteContactName = null;

  @ApiModelProperty(value = "The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).")
 /**
   * The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
  **/
  private String siteCustomerName = null;

  @ApiModelProperty(value = "A textual description of the Service Site.")
 /**
   * A textual description of the Service Site.
  **/
  private String siteDescription = null;

  @ApiModelProperty(value = "A name commonly used by people to refer to this Service Site.")
 /**
   * A name commonly used by people to refer to this Service Site.
  **/
  private String siteName = null;

  @ApiModelProperty(value = "This defines whether a Service Site is public or private.")
 /**
   * This defines whether a Service Site is public or private.
  **/
  private String siteType = null;

  @ApiModelProperty(value = "")
  @Valid
  private Status status = null;
 /**
   * Get geographicAddress
   * @return geographicAddress
  **/
  @JsonProperty("geographicAddress")
  public GeographicAddressFindResp getGeographicAddress() {
    return geographicAddress;
  }

  public void setGeographicAddress(GeographicAddressFindResp geographicAddress) {
    this.geographicAddress = geographicAddress;
  }

  public GeographicSiteFindResp geographicAddress(GeographicAddressFindResp geographicAddress) {
    this.geographicAddress = geographicAddress;
    return this;
  }

 /**
   * id of the site. This is coud be used in other API as a place
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicSiteFindResp id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)
   * @return siteCompanyName
  **/
  @JsonProperty("siteCompanyName")
  public String getSiteCompanyName() {
    return siteCompanyName;
  }

  public void setSiteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
  }

  public GeographicSiteFindResp siteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
    return this;
  }

 /**
   * Name of the relatedParty which has role &#39;Site Contact&#39; in the Site record.
   * @return siteContactName
  **/
  @JsonProperty("siteContactName")
  public String getSiteContactName() {
    return siteContactName;
  }

  public void setSiteContactName(String siteContactName) {
    this.siteContactName = siteContactName;
  }

  public GeographicSiteFindResp siteContactName(String siteContactName) {
    this.siteContactName = siteContactName;
    return this;
  }

 /**
   * The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
   * @return siteCustomerName
  **/
  @JsonProperty("siteCustomerName")
  public String getSiteCustomerName() {
    return siteCustomerName;
  }

  public void setSiteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
  }

  public GeographicSiteFindResp siteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
    return this;
  }

 /**
   * A textual description of the Service Site.
   * @return siteDescription
  **/
  @JsonProperty("siteDescription")
  public String getSiteDescription() {
    return siteDescription;
  }

  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }

  public GeographicSiteFindResp siteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
    return this;
  }

 /**
   * A name commonly used by people to refer to this Service Site.
   * @return siteName
  **/
  @JsonProperty("siteName")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public GeographicSiteFindResp siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

 /**
   * This defines whether a Service Site is public or private.
   * @return siteType
  **/
  @JsonProperty("siteType")
  public String getSiteType() {
    return siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }

  public GeographicSiteFindResp siteType(String siteType) {
    this.siteType = siteType;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public GeographicSiteFindResp status(Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

