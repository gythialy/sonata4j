package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.CancelProductOrder;
import io.swagger.server.api.model.CancelProductOrderCreate;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CancelProductOrderApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(CancelProductOrderApiVerticle.class); 
    
    final static String CANCELPRODUCTORDERCREATE_SERVICE_ID = "cancelProductOrderCreate";
    final static String CANCELPRODUCTORDERFIND_SERVICE_ID = "cancelProductOrderFind";
    final static String CANCELPRODUCTORDERGET_SERVICE_ID = "cancelProductOrderGet";
    
    final CancelProductOrderApi service;

    public CancelProductOrderApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.CancelProductOrderApiImpl");
            service = (CancelProductOrderApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CancelProductOrderApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for cancelProductOrderCreate
        vertx.eventBus().<JsonObject> consumer(CANCELPRODUCTORDERCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelProductOrderCreate";
                JsonObject cancelProductOrderParam = message.body().getJsonObject("CancelProductOrder");
                if (cancelProductOrderParam == null) {
                    manageError(message, new MainApiException(400, "CancelProductOrder is required"), serviceId);
                    return;
                }
                CancelProductOrderCreate cancelProductOrder = Json.mapper.readValue(cancelProductOrderParam.encode(), CancelProductOrderCreate.class);
                service.cancelProductOrderCreate(cancelProductOrder, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelProductOrderCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelProductOrderCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for cancelProductOrderFind
        vertx.eventBus().<JsonObject> consumer(CANCELPRODUCTORDERFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelProductOrderFind";
                String productOrderIdParam = message.body().getString("productOrderId");
                String productOrderId = (productOrderIdParam == null) ? null : productOrderIdParam;
                String productOrderExternalIdParam = message.body().getString("productOrderExternalId");
                String productOrderExternalId = (productOrderExternalIdParam == null) ? null : productOrderExternalIdParam;
                service.cancelProductOrderFind(productOrderId, productOrderExternalId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelProductOrderFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelProductOrderFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for cancelProductOrderGet
        vertx.eventBus().<JsonObject> consumer(CANCELPRODUCTORDERGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelProductOrderGet";
                String cancelProductOrderIdParam = message.body().getString("CancelProductOrderId");
                if(cancelProductOrderIdParam == null) {
                    manageError(message, new MainApiException(400, "CancelProductOrderId is required"), serviceId);
                    return;
                }
                String cancelProductOrderId = cancelProductOrderIdParam;
                service.cancelProductOrderGet(cancelProductOrderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelProductOrderGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelProductOrderGet", e);
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
