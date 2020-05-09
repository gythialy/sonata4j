package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddressValidation;
import io.swagger.server.api.model.GeographicAddressValidationCreate;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class GeographicAddressValidationApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(GeographicAddressValidationApiVerticle.class); 
    
    final static String GEOGRAPHICADDRESSVALIDATIONCREATE_SERVICE_ID = "geographicAddressValidationCreate";
    
    final GeographicAddressValidationApi service;

    public GeographicAddressValidationApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.GeographicAddressValidationApiImpl");
            service = (GeographicAddressValidationApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("GeographicAddressValidationApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for geographicAddressValidationCreate
        vertx.eventBus().<JsonObject> consumer(GEOGRAPHICADDRESSVALIDATIONCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "geographicAddressValidationCreate";
                JsonObject addressValidationRequestParam = message.body().getJsonObject("addressValidationRequest");
                if (addressValidationRequestParam == null) {
                    manageError(message, new MainApiException(400, "addressValidationRequest is required"), serviceId);
                    return;
                }
                GeographicAddressValidationCreate addressValidationRequest = Json.mapper.readValue(addressValidationRequestParam.encode(), GeographicAddressValidationCreate.class);
                service.geographicAddressValidationCreate(addressValidationRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "geographicAddressValidationCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("geographicAddressValidationCreate", e);
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
