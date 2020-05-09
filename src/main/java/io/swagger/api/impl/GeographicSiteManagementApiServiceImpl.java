package io.swagger.api.impl;

import io.swagger.api.GeographicSiteManagementApi;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class GeographicSiteManagementApiServiceImpl implements GeographicSiteManagementApi {
    public Response geographicSiteFind(String status, String siteCompanyName, String siteCustomerName, String siteDescription, String siteType, String siteName, String siteContactName, String geographicAddressId, String geographicAddressStreetNr, String geographicAddressStreetName, String geographicAddressStreetType, String geographicAddressCity, String geographicAddressPostcode, String geographicAddressCountry, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response geographicSiteGet(String siteId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
