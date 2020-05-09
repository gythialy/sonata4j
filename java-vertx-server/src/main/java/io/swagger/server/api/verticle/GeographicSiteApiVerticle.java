package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicSite;
import io.swagger.server.api.model.GeographicSiteFindResp;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class GeographicSiteApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(GeographicSiteApiVerticle.class); 
    
    final static String GEOGRAPHICSITEFIND_SERVICE_ID = "geographicSiteFind";
    final static String GEOGRAPHICSITEGET_SERVICE_ID = "geographicSiteGet";
    
    final GeographicSiteApi service;

    public GeographicSiteApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.GeographicSiteApiImpl");
            service = (GeographicSiteApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GeographicSiteApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for geographicSiteFind
        vertx.eventBus().<JsonObject> consumer(GEOGRAPHICSITEFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "geographicSiteFind";
                String statusParam = message.body().getString("status");
                String status = (statusParam == null) ? null : statusParam;
                String siteCompanyNameParam = message.body().getString("siteCompanyName");
                String siteCompanyName = (siteCompanyNameParam == null) ? null : siteCompanyNameParam;
                String siteCustomerNameParam = message.body().getString("siteCustomerName");
                String siteCustomerName = (siteCustomerNameParam == null) ? null : siteCustomerNameParam;
                String siteDescriptionParam = message.body().getString("siteDescription");
                String siteDescription = (siteDescriptionParam == null) ? null : siteDescriptionParam;
                String siteTypeParam = message.body().getString("siteType");
                String siteType = (siteTypeParam == null) ? null : siteTypeParam;
                String siteNameParam = message.body().getString("siteName");
                String siteName = (siteNameParam == null) ? null : siteNameParam;
                String siteContactNameParam = message.body().getString("siteContactName");
                String siteContactName = (siteContactNameParam == null) ? null : siteContactNameParam;
                String geographicAddressIdParam = message.body().getString("geographicAddress.id");
                String geographicAddressId = (geographicAddressIdParam == null) ? null : geographicAddressIdParam;
                String geographicAddressStreetNrParam = message.body().getString("geographicAddress.streetNr");
                String geographicAddressStreetNr = (geographicAddressStreetNrParam == null) ? null : geographicAddressStreetNrParam;
                String geographicAddressStreetNameParam = message.body().getString("geographicAddress.streetName");
                String geographicAddressStreetName = (geographicAddressStreetNameParam == null) ? null : geographicAddressStreetNameParam;
                String geographicAddressStreetTypeParam = message.body().getString("geographicAddress.streetType");
                String geographicAddressStreetType = (geographicAddressStreetTypeParam == null) ? null : geographicAddressStreetTypeParam;
                String geographicAddressCityParam = message.body().getString("geographicAddress.city");
                String geographicAddressCity = (geographicAddressCityParam == null) ? null : geographicAddressCityParam;
                String geographicAddressPostcodeParam = message.body().getString("geographicAddress.postcode");
                String geographicAddressPostcode = (geographicAddressPostcodeParam == null) ? null : geographicAddressPostcodeParam;
                String geographicAddressCountryParam = message.body().getString("geographicAddress.country");
                String geographicAddressCountry = (geographicAddressCountryParam == null) ? null : geographicAddressCountryParam;
                service.geographicSiteFind(status, siteCompanyName, siteCustomerName, siteDescription, siteType, siteName, siteContactName, geographicAddressId, geographicAddressStreetNr, geographicAddressStreetName, geographicAddressStreetType, geographicAddressCity, geographicAddressPostcode, geographicAddressCountry, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "geographicSiteFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("geographicSiteFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for geographicSiteGet
        vertx.eventBus().<JsonObject> consumer(GEOGRAPHICSITEGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "geographicSiteGet";
                String siteIdParam = message.body().getString("SiteId");
                if(siteIdParam == null) {
                    manageError(message, new MainApiException(400, "SiteId is required"), serviceId);
                    return;
                }
                String siteId = siteIdParam;
                service.geographicSiteGet(siteId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "geographicSiteGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("geographicSiteGet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
