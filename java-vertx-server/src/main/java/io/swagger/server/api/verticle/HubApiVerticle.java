package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.Hub;
import io.swagger.server.api.model.HubInput;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class HubApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(HubApiVerticle.class); 
    
    final static String PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBDELETE_SERVICE_ID = "productOfferingQualificationManagementHubDelete";
    final static String PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBGET_SERVICE_ID = "productOfferingQualificationManagementHubGet";
    final static String PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBPOST_SERVICE_ID = "productOfferingQualificationManagementHubPost";
    final static String PRODUCTORDERMANAGEMENTHUBCREATE_SERVICE_ID = "productOrderManagementHubCreate";
    final static String PRODUCTORDERMANAGEMENTHUBDELETE_SERVICE_ID = "productOrderManagementHubDelete";
    final static String PRODUCTORDERMANAGEMENTHUBFIND_SERVICE_ID = "productOrderManagementHubFind";
    final static String QUOTEMANAGEMENTHUBCREATE_SERVICE_ID = "quoteManagementHubCreate";
    final static String QUOTEMANAGEMENTHUBDELETE_SERVICE_ID = "quoteManagementHubDelete";
    final static String QUOTEMANAGEMENTHUBFIND_SERVICE_ID = "quoteManagementHubFind";
    
    final HubApi service;

    public HubApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.HubApiImpl");
            service = (HubApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("HubApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for productOfferingQualificationManagementHubDelete
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBDELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationManagementHubDelete";
                String hubIdParam = message.body().getString("HubId");
                if(hubIdParam == null) {
                    manageError(message, new MainApiException(400, "HubId is required"), serviceId);
                    return;
                }
                String hubId = hubIdParam;
                service.productOfferingQualificationManagementHubDelete(hubId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationManagementHubDelete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationManagementHubDelete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOfferingQualificationManagementHubGet
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationManagementHubGet";
                service.productOfferingQualificationManagementHubGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationManagementHubGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationManagementHubGet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOfferingQualificationManagementHubPost
        vertx.eventBus().<JsonObject> consumer(PRODUCTOFFERINGQUALIFICATIONMANAGEMENTHUBPOST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOfferingQualificationManagementHubPost";
                JsonObject hubParam = message.body().getJsonObject("Hub");
                if (hubParam == null) {
                    manageError(message, new MainApiException(400, "Hub is required"), serviceId);
                    return;
                }
                HubInput hub = Json.mapper.readValue(hubParam.encode(), HubInput.class);
                service.productOfferingQualificationManagementHubPost(hub, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOfferingQualificationManagementHubPost");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOfferingQualificationManagementHubPost", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOrderManagementHubCreate
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERMANAGEMENTHUBCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderManagementHubCreate";
                JsonObject hubParam = message.body().getJsonObject("Hub");
                if (hubParam == null) {
                    manageError(message, new MainApiException(400, "Hub is required"), serviceId);
                    return;
                }
                HubInput hub = Json.mapper.readValue(hubParam.encode(), HubInput.class);
                service.productOrderManagementHubCreate(hub, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderManagementHubCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderManagementHubCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOrderManagementHubDelete
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERMANAGEMENTHUBDELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderManagementHubDelete";
                String hubIdParam = message.body().getString("HubId");
                if(hubIdParam == null) {
                    manageError(message, new MainApiException(400, "HubId is required"), serviceId);
                    return;
                }
                String hubId = hubIdParam;
                service.productOrderManagementHubDelete(hubId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderManagementHubDelete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderManagementHubDelete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOrderManagementHubFind
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERMANAGEMENTHUBFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderManagementHubFind";
                service.productOrderManagementHubFind(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderManagementHubFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderManagementHubFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteManagementHubCreate
        vertx.eventBus().<JsonObject> consumer(QUOTEMANAGEMENTHUBCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteManagementHubCreate";
                JsonObject hubParam = message.body().getJsonObject("Hub");
                if (hubParam == null) {
                    manageError(message, new MainApiException(400, "Hub is required"), serviceId);
                    return;
                }
                HubInput hub = Json.mapper.readValue(hubParam.encode(), HubInput.class);
                service.quoteManagementHubCreate(hub, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteManagementHubCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteManagementHubCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteManagementHubDelete
        vertx.eventBus().<JsonObject> consumer(QUOTEMANAGEMENTHUBDELETE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteManagementHubDelete";
                String hubIdParam = message.body().getString("HubId");
                if(hubIdParam == null) {
                    manageError(message, new MainApiException(400, "HubId is required"), serviceId);
                    return;
                }
                String hubId = hubIdParam;
                service.quoteManagementHubDelete(hubId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteManagementHubDelete");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteManagementHubDelete", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteManagementHubFind
        vertx.eventBus().<JsonObject> consumer(QUOTEMANAGEMENTHUBFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteManagementHubFind";
                String fieldsParam = message.body().getString("fields");
                String fields = (fieldsParam == null) ? null : fieldsParam;
                service.quoteManagementHubFind(fields, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteManagementHubFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteManagementHubFind", e);
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
