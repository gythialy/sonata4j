package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicSite;
import io.swagger.server.api.model.GeographicSiteFindResp;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GeographicSiteApi  {
    //geographicSiteFind
    void geographicSiteFind(String status, String siteCompanyName, String siteCustomerName, String siteDescription, String siteType, String siteName, String siteContactName, String geographicAddressId, String geographicAddressStreetNr, String geographicAddressStreetName, String geographicAddressStreetType, String geographicAddressCity, String geographicAddressPostcode, String geographicAddressCountry, Handler<AsyncResult<List<GeographicSiteFindResp>>> handler);
    
    //geographicSiteGet
    void geographicSiteGet(String siteId, Handler<AsyncResult<GeographicSite>> handler);
    
}
