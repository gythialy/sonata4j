package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicSite;
import io.swagger.model.GeographicSiteFindResp;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class GeographicSiteManagementApiServiceImpl implements GeographicSiteManagementApi {
      public Response geographicSiteFind(String status,String siteCompanyName,String siteCustomerName,String siteDescription,String siteType,String siteName,String siteContactName,String geographicAddressId,String geographicAddressStreetNr,String geographicAddressStreetName,String geographicAddressStreetType,String geographicAddressCity,String geographicAddressPostcode,String geographicAddressCountry,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response geographicSiteGet(String siteId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
