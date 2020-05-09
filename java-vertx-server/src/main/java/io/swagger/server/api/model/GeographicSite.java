package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.FieldedAddress;
import io.swagger.server.api.model.FormattedAddress;
import io.swagger.server.api.model.GeographicLocation;
import io.swagger.server.api.model.ReferencedAddress;
import io.swagger.server.api.model.RelatedParty;
import io.swagger.server.api.model.Status;
import java.util.ArrayList;
import java.util.List;

/**
 * Designated as Service Site in TS. A fixed physical location at which a Product can be installed.  Its location can be described either with geocodes (Lat/Long information) or by association with an Address or Address Reference.  This association may include a Sub-address describing where within that Address or Address Reference, this particular Service Site is located.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class GeographicSite   {
  
  private String schemaLocation = null;
  private String type = null;
  private String additionnalSiteInformation = null;
  private String description = null;
  private FieldedAddress fieldedAddress = null;
  private FormattedAddress formattedAdress = null;
  private GeographicLocation geographicLocation = null;
  private String id = null;
  private ReferencedAddress referencedAddress = null;
  private List<RelatedParty> relatedParty = new ArrayList<>();
  private String siteCompanyName = null;
  private String siteCustomerName = null;
  private String siteName = null;
  private String siteType = null;
  private Status status = null;

  public GeographicSite () {

  }

  public GeographicSite (String schemaLocation, String type, String additionnalSiteInformation, String description, FieldedAddress fieldedAddress, FormattedAddress formattedAdress, GeographicLocation geographicLocation, String id, ReferencedAddress referencedAddress, List<RelatedParty> relatedParty, String siteCompanyName, String siteCustomerName, String siteName, String siteType, Status status) {
    this.schemaLocation = schemaLocation;
    this.type = type;
    this.additionnalSiteInformation = additionnalSiteInformation;
    this.description = description;
    this.fieldedAddress = fieldedAddress;
    this.formattedAdress = formattedAdress;
    this.geographicLocation = geographicLocation;
    this.id = id;
    this.referencedAddress = referencedAddress;
    this.relatedParty = relatedParty;
    this.siteCompanyName = siteCompanyName;
    this.siteCustomerName = siteCustomerName;
    this.siteName = siteName;
    this.siteType = siteType;
    this.status = status;
  }

    
  @JsonProperty("@schemaLocation")
  public String getSchemaLocation() {
    return schemaLocation;
  }
  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

    
  @JsonProperty("@type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("additionnalSiteInformation")
  public String getAdditionnalSiteInformation() {
    return additionnalSiteInformation;
  }
  public void setAdditionnalSiteInformation(String additionnalSiteInformation) {
    this.additionnalSiteInformation = additionnalSiteInformation;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("fieldedAddress")
  public FieldedAddress getFieldedAddress() {
    return fieldedAddress;
  }
  public void setFieldedAddress(FieldedAddress fieldedAddress) {
    this.fieldedAddress = fieldedAddress;
  }

    
  @JsonProperty("formattedAdress")
  public FormattedAddress getFormattedAdress() {
    return formattedAdress;
  }
  public void setFormattedAdress(FormattedAddress formattedAdress) {
    this.formattedAdress = formattedAdress;
  }

    
  @JsonProperty("geographicLocation")
  public GeographicLocation getGeographicLocation() {
    return geographicLocation;
  }
  public void setGeographicLocation(GeographicLocation geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("referencedAddress")
  public ReferencedAddress getReferencedAddress() {
    return referencedAddress;
  }
  public void setReferencedAddress(ReferencedAddress referencedAddress) {
    this.referencedAddress = referencedAddress;
  }

    
  @JsonProperty("relatedParty")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }
  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

    
  @JsonProperty("siteCompanyName")
  public String getSiteCompanyName() {
    return siteCompanyName;
  }
  public void setSiteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
  }

    
  @JsonProperty("siteCustomerName")
  public String getSiteCustomerName() {
    return siteCustomerName;
  }
  public void setSiteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
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
    GeographicSite geographicSite = (GeographicSite) o;
    return Objects.equals(schemaLocation, geographicSite.schemaLocation) &&
        Objects.equals(type, geographicSite.type) &&
        Objects.equals(additionnalSiteInformation, geographicSite.additionnalSiteInformation) &&
        Objects.equals(description, geographicSite.description) &&
        Objects.equals(fieldedAddress, geographicSite.fieldedAddress) &&
        Objects.equals(formattedAdress, geographicSite.formattedAdress) &&
        Objects.equals(geographicLocation, geographicSite.geographicLocation) &&
        Objects.equals(id, geographicSite.id) &&
        Objects.equals(referencedAddress, geographicSite.referencedAddress) &&
        Objects.equals(relatedParty, geographicSite.relatedParty) &&
        Objects.equals(siteCompanyName, geographicSite.siteCompanyName) &&
        Objects.equals(siteCustomerName, geographicSite.siteCustomerName) &&
        Objects.equals(siteName, geographicSite.siteName) &&
        Objects.equals(siteType, geographicSite.siteType) &&
        Objects.equals(status, geographicSite.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type, additionnalSiteInformation, description, fieldedAddress, formattedAdress, geographicLocation, id, referencedAddress, relatedParty, siteCompanyName, siteCustomerName, siteName, siteType, status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
