package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddress;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class GeographicAddressApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(GeographicAddressApiVerticle.class); 
    
    final static String GEOGRAPHICADDRESSGET_SERVICE_ID = "geographicAddressGet";
    
    final GeographicAddressApi service;

    public GeographicAddressApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.GeographicAddressApiImpl");
            service = (GeographicAddressApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GeographicAddressApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for geographicAddressGet
        vertx.eventBus().<JsonObject> consumer(GEOGRAPHICADDRESSGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "geographicAddressGet";
                String geographicAddressIdParam = message.body().getString("GeographicAddressId");
                if(geographicAddressIdParam == null) {
                    manageError(message, new MainApiException(400, "GeographicAddressId is required"), serviceId);
                    return;
                }
                String geographicAddressId = geographicAddressIdParam;
                service.geographicAddressGet(geographicAddressId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "geographicAddressGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("geographicAddressGet", e);
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
