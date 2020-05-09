package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.ProductOfferingQualification;
import io.swagger.server.api.model.ProductOfferingQualificationCreate;
import io.swagger.server.api.model.ProductOfferingQualificationFind;

import java.util.List;
import java.util.Map;

public class ProductOfferingQualificationApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProductOfferingQualificationApiVerticle.class); 
    
    final static String PRODUCTOFFERINGQUALIFICATIONCREATE_SERVICE_ID = "productOfferingQualificationCreate";
    final static String PRODUCTOFFERINGQUALIFICATIONFIND_SERVICE_ID = "productOfferingQualificationFind";
    final static String PRODUCTOFFERINGQUALIFICATIONGET_SERVICE_ID = "productOfferingQualificationGet";
    
    final ProductOfferingQualificationApi service;

    public ProductOfferingQualificationApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.ProductOfferingQualificationApiImpl");
            service = (ProductOfferingQualificationApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductOfferingQualificationApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for productOfferingQualificationCreate
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationCreate";
                JsonObject productOfferingQualificationParam = message.body().getJsonObject("ProductOfferingQualification");
                if (productOfferingQualificationParam == null) {
                    manageError(message, new MainApiException(400, "ProductOfferingQualification is required"), serviceId);
                    return;
                }
                ProductOfferingQualificationCreate productOfferingQualification = Json.mapper.readValue(productOfferingQualificationParam.encode(), ProductOfferingQualificationCreate.class);
                service.productOfferingQualificationCreate(productOfferingQualification, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOfferingQualificationFind
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationFind";
                String stateParam = message.body().getString("state");
                String state = (stateParam == null) ? null : stateParam;
                String projectIdParam = message.body().getString("projectId");
                String projectId = (projectIdParam == null) ? null : projectIdParam;
                String requestedResponseDateGtParam = message.body().getString("requestedResponseDate.gt");
                OffsetDateTime requestedResponseDateGt = (requestedResponseDateGtParam == null) ? null : Json.mapper.readValue(requestedResponseDateGtParam, OffsetDateTime.class);
                String requestedResponseDateLtParam = message.body().getString("requestedResponseDate.lt");
                OffsetDateTime requestedResponseDateLt = (requestedResponseDateLtParam == null) ? null : Json.mapper.readValue(requestedResponseDateLtParam, OffsetDateTime.class);
                String offsetParam = message.body().getString("offset");
                String offset = (offsetParam == null) ? null : offsetParam;
                String limitParam = message.body().getString("limit");
                String limit = (limitParam == null) ? null : limitParam;
                service.productOfferingQualificationFind(state, projectId, requestedResponseDateGt, requestedResponseDateLt, offset, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOfferingQualificationGet
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationGet";
                String productOfferingQualificationIdParam = message.body().getString("ProductOfferingQualificationId");
                if(productOfferingQualificationIdParam == null) {
                    manageError(message, new MainApiException(400, "ProductOfferingQualificationId is required"), serviceId);
                    return;
                }
                String productOfferingQualificationId = productOfferingQualificationIdParam;
                service.productOfferingQualificationGet(productOfferingQualificationId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationGet", e);
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
