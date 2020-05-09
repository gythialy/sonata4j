package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.Event;
import io.swagger.server.api.model.EventPlus;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class NotificationApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(NotificationApiVerticle.class); 
    
    final static String NOTIFICATIONPRODUCTORDERATTRIBUTEVALUECHANGENOTIFICATION_SERVICE_ID = "notificationProductOrderAttributeValueChangeNotification";
    final static String NOTIFICATIONPRODUCTORDERCREATIONNOTIFICATION_SERVICE_ID = "notificationProductOrderCreationNotification";
    final static String NOTIFICATIONPRODUCTORDERINFORMATIONREQUIREDNOTIFICATION_SERVICE_ID = "notificationProductOrderInformationRequiredNotification";
    final static String NOTIFICATIONPRODUCTORDERSTATECHANGENOTIFICATION_SERVICE_ID = "notificationProductOrderStateChangeNotification";
    final static String NOTIFICATIONQUOTEATTRIBUTEVALUECHANGENOTIFICATION_SERVICE_ID = "notificationQuoteAttributeValueChangeNotification";
    final static String NOTIFICATIONQUOTECREATIONNOTIFICATION_SERVICE_ID = "notificationQuoteCreationNotification";
    final static String NOTIFICATIONQUOTEINFORMATIONREQUIREDNOTIFICATION_SERVICE_ID = "notificationQuoteInformationRequiredNotification";
    final static String NOTIFICATIONQUOTESTATECHANGENOTIFICATION_SERVICE_ID = "notificationQuoteStateChangeNotification";
    
    final NotificationApi service;

    public NotificationApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.NotificationApiImpl");
            service = (NotificationApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("NotificationApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for notificationProductOrderAttributeValueChangeNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONPRODUCTORDERATTRIBUTEVALUECHANGENOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationProductOrderAttributeValueChangeNotification";
                JsonObject productOrderAttributeValueChangeParam = message.body().getJsonObject("productOrderAttributeValueChange");
                if (productOrderAttributeValueChangeParam == null) {
                    manageError(message, new MainApiException(400, "productOrderAttributeValueChange is required"), serviceId);
                    return;
                }
                EventPlus productOrderAttributeValueChange = Json.mapper.readValue(productOrderAttributeValueChangeParam.encode(), EventPlus.class);
                service.notificationProductOrderAttributeValueChangeNotification(productOrderAttributeValueChange, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationProductOrderAttributeValueChangeNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationProductOrderAttributeValueChangeNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationProductOrderCreationNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONPRODUCTORDERCREATIONNOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationProductOrderCreationNotification";
                JsonObject productOrderCreationNotificationParam = message.body().getJsonObject("productOrderCreationNotification");
                if (productOrderCreationNotificationParam == null) {
                    manageError(message, new MainApiException(400, "productOrderCreationNotification is required"), serviceId);
                    return;
                }
                Event productOrderCreationNotification = Json.mapper.readValue(productOrderCreationNotificationParam.encode(), Event.class);
                service.notificationProductOrderCreationNotification(productOrderCreationNotification, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationProductOrderCreationNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationProductOrderCreationNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationProductOrderInformationRequiredNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONPRODUCTORDERINFORMATIONREQUIREDNOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationProductOrderInformationRequiredNotification";
                JsonObject productOrderInformationRequiredParam = message.body().getJsonObject("productOrderInformationRequired");
                if (productOrderInformationRequiredParam == null) {
                    manageError(message, new MainApiException(400, "productOrderInformationRequired is required"), serviceId);
                    return;
                }
                EventPlus productOrderInformationRequired = Json.mapper.readValue(productOrderInformationRequiredParam.encode(), EventPlus.class);
                service.notificationProductOrderInformationRequiredNotification(productOrderInformationRequired, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationProductOrderInformationRequiredNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationProductOrderInformationRequiredNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationProductOrderStateChangeNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONPRODUCTORDERSTATECHANGENOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationProductOrderStateChangeNotification";
                JsonObject productOrderStateChangeParam = message.body().getJsonObject("productOrderStateChange");
                if (productOrderStateChangeParam == null) {
                    manageError(message, new MainApiException(400, "productOrderStateChange is required"), serviceId);
                    return;
                }
                Event productOrderStateChange = Json.mapper.readValue(productOrderStateChangeParam.encode(), Event.class);
                service.notificationProductOrderStateChangeNotification(productOrderStateChange, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationProductOrderStateChangeNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationProductOrderStateChangeNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationQuoteAttributeValueChangeNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONQUOTEATTRIBUTEVALUECHANGENOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationQuoteAttributeValueChangeNotification";
                JsonArray quoteAttributeValueChangeNotificationParam = message.body().getJsonArray("quoteAttributeValueChangeNotification");
                if(quoteAttributeValueChangeNotificationParam == null) {
                    manageError(message, new MainApiException(400, "quoteAttributeValueChangeNotification is required"), serviceId);
                    return;
                }
                List<EventPlus> quoteAttributeValueChangeNotification = Json.mapper.readValue(quoteAttributeValueChangeNotificationParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, EventPlus.class));
                service.notificationQuoteAttributeValueChangeNotification(quoteAttributeValueChangeNotification, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationQuoteAttributeValueChangeNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationQuoteAttributeValueChangeNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationQuoteCreationNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONQUOTECREATIONNOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationQuoteCreationNotification";
                JsonObject quoteCreationNotificationParam = message.body().getJsonObject("quoteCreationNotification");
                if (quoteCreationNotificationParam == null) {
                    manageError(message, new MainApiException(400, "quoteCreationNotification is required"), serviceId);
                    return;
                }
                Event quoteCreationNotification = Json.mapper.readValue(quoteCreationNotificationParam.encode(), Event.class);
                service.notificationQuoteCreationNotification(quoteCreationNotification, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationQuoteCreationNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationQuoteCreationNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationQuoteInformationRequiredNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONQUOTEINFORMATIONREQUIREDNOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationQuoteInformationRequiredNotification";
                JsonArray quoteInformationRequiredNotificationParam = message.body().getJsonArray("quoteInformationRequiredNotification");
                if(quoteInformationRequiredNotificationParam == null) {
                    manageError(message, new MainApiException(400, "quoteInformationRequiredNotification is required"), serviceId);
                    return;
                }
                List<EventPlus> quoteInformationRequiredNotification = Json.mapper.readValue(quoteInformationRequiredNotificationParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, EventPlus.class));
                service.notificationQuoteInformationRequiredNotification(quoteInformationRequiredNotification, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationQuoteInformationRequiredNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationQuoteInformationRequiredNotification", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for notificationQuoteStateChangeNotification
        vertx.eventBus().<JsonObject> consumer(NOTIFICATIONQUOTESTATECHANGENOTIFICATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "notificationQuoteStateChangeNotification";
                JsonObject quoteStateChangeNotificationParam = message.body().getJsonObject("quoteStateChangeNotification");
                if (quoteStateChangeNotificationParam == null) {
                    manageError(message, new MainApiException(400, "quoteStateChangeNotification is required"), serviceId);
                    return;
                }
                Event quoteStateChangeNotification = Json.mapper.readValue(quoteStateChangeNotificationParam.encode(), Event.class);
                service.notificationQuoteStateChangeNotification(quoteStateChangeNotification, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "notificationQuoteStateChangeNotification");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("notificationQuoteStateChangeNotification", e);
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
