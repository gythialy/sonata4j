package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.FieldedAddress;
import io.swagger.model.FormattedAddress;
import io.swagger.model.GeographicLocation;
import io.swagger.model.ReferencedAddress;
import io.swagger.model.RelatedParty;
import io.swagger.model.Status;
import java.util.ArrayList;
import java.util.List;
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
  * Designated as Service Site in TS. A fixed physical location at which a Product can be installed.  Its location can be described either with geocodes (Lat/Long information) or by association with an Address or Address Reference.  This association may include a Sub-address describing where within that Address or Address Reference, this particular Service Site is located.
 **/
@ApiModel(description="Designated as Service Site in TS. A fixed physical location at which a Product can be installed.  Its location can be described either with geocodes (Lat/Long information) or by association with an Address or Address Reference.  This association may include a Sub-address describing where within that Address or Address Reference, this particular Service Site is located.")
public class GeographicSite  {
  
  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String schemaLocation = null;

  @ApiModelProperty(value = "Technical attribute to extend this class")
 /**
   * Technical attribute to extend this class
  **/
  private String type = null;

  @ApiModelProperty(value = "Additional site information")
 /**
   * Additional site information
  **/
  private String additionnalSiteInformation = null;

  @ApiModelProperty(value = "A textual description of the Service Site.")
 /**
   * A textual description of the Service Site.
  **/
  private String description = null;

  @ApiModelProperty(value = "")
  @Valid
  private FieldedAddress fieldedAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private FormattedAddress formattedAdress = null;

  @ApiModelProperty(value = "")
  @Valid
  private GeographicLocation geographicLocation = null;

  @ApiModelProperty(value = "Identifier of the Service Site unique within the Seller.")
 /**
   * Identifier of the Service Site unique within the Seller.
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  @Valid
  private ReferencedAddress referencedAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @ApiModelProperty(value = "The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)")
 /**
   * The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)
  **/
  private String siteCompanyName = null;

  @ApiModelProperty(value = "The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).")
 /**
   * The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
  **/
  private String siteCustomerName = null;

  @ApiModelProperty(value = "A name commonly used by people to refer to this Service Site.")
 /**
   * A name commonly used by people to refer to this Service Site.
  **/
  private String siteName = null;

  @ApiModelProperty(value = "This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.")
 /**
   * This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.
  **/
  private String siteType = null;

  @ApiModelProperty(value = "")
  @Valid
  private Status status = null;
 /**
   * Technical attribute to extend this class
   * @return schemaLocation
  **/
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public GeographicSite schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

 /**
   * Technical attribute to extend this class
   * @return type
  **/
  @JsonProperty("@type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeographicSite type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Additional site information
   * @return additionnalSiteInformation
  **/
  @JsonProperty("additionnalSiteInformation")
  public String getAdditionnalSiteInformation() {
    return additionnalSiteInformation;
  }

  public void setAdditionnalSiteInformation(String additionnalSiteInformation) {
    this.additionnalSiteInformation = additionnalSiteInformation;
  }

  public GeographicSite additionnalSiteInformation(String additionnalSiteInformation) {
    this.additionnalSiteInformation = additionnalSiteInformation;
    return this;
  }

 /**
   * A textual description of the Service Site.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeographicSite description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get fieldedAddress
   * @return fieldedAddress
  **/
  @JsonProperty("fieldedAddress")
  public FieldedAddress getFieldedAddress() {
    return fieldedAddress;
  }

  public void setFieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

  public GeographicSite fieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
    return this;
  }

 /**
   * Get formattedAdress
   * @return formattedAdress
  **/
  @JsonProperty("formattedAdress")
  public FormattedAddress getFormattedAdress() {
    return formattedAdress;
  }

  public void setFormattedAdress(FormattedAddress formattedAdress) {
    this.formattedAdress = formattedAdress;
  }

  public GeographicSite formattedAdress(FormattedAddress formattedAdress) {
    this.formattedAdress = formattedAdress;
    return this;
  }

 /**
   * Get geographicLocation
   * @return geographicLocation
  **/
  @JsonProperty("geographicLocation")
  public GeographicLocation getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(GeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public GeographicSite geographicLocation(GeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
    return this;
  }

 /**
   * Identifier of the Service Site unique within the Seller.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicSite id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get referencedAddress
   * @return referencedAddress
  **/
  @JsonProperty("referencedAddress")
  public ReferencedAddress getReferencedAddress() {
    return referencedAddress;
  }

  public void setReferencedAddress(ReferencedAddress referencedAddress) {
    this.referencedAddress = referencedAddress;
  }

  public GeographicSite referencedAddress(ReferencedAddress referencedAddress) {
    this.referencedAddress = referencedAddress;
    return this;
  }

 /**
   * Get relatedParty
   * @return relatedParty
  **/
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSite relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSite addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
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

  public GeographicSite siteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
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

  public GeographicSite siteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
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

  public GeographicSite siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

 /**
   * This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.
   * @return siteType
  **/
  @JsonProperty("siteType")
  public String getSiteType() {
    return siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }

  public GeographicSite siteType(String siteType) {
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

  public GeographicSite status(Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSite {\n");
    
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionnalSiteInformation: ").append(toIndentedString(additionnalSiteInformation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldedAddress: ").append(toIndentedString(fieldedAddress)).append("\n");
    sb.append("    formattedAdress: ").append(toIndentedString(formattedAdress)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referencedAddress: ").append(toIndentedString(referencedAddress)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    siteCompanyName: ").append(toIndentedString(siteCompanyName)).append("\n");
    sb.append("    siteCustomerName: ").append(toIndentedString(siteCustomerName)).append("\n");
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

