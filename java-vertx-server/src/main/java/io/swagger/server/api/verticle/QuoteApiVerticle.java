package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.ChangeQuoteStateResponse;
import io.swagger.server.api.model.ChangelQuoteStateRequest;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.Quote;
import io.swagger.server.api.model.QuoteCreate;
import io.swagger.server.api.model.QuoteFind;

import java.util.List;
import java.util.Map;

public class QuoteApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(QuoteApiVerticle.class); 
    
    final static String QUOTECREATE_SERVICE_ID = "quoteCreate";
    final static String QUOTEFIND_SERVICE_ID = "quoteFind";
    final static String QUOTEGET_SERVICE_ID = "quoteGet";
    final static String QUOTEREQUESTSTATECHANGE_SERVICE_ID = "quoteRequestStateChange";
    
    final QuoteApi service;

    public QuoteApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.QuoteApiImpl");
            service = (QuoteApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("QuoteApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for quoteCreate
        vertx.eventBus().<JsonObject> consumer(QUOTECREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteCreate";
                JsonObject quoteParam = message.body().getJsonObject("Quote");
                if (quoteParam == null) {
                    manageError(message, new MainApiException(400, "Quote is required"), serviceId);
                    return;
                }
                QuoteCreate quote = Json.mapper.readValue(quoteParam.encode(), QuoteCreate.class);
                service.quoteCreate(quote, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteFind
        vertx.eventBus().<JsonObject> consumer(QUOTEFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteFind";
                String externalIdParam = message.body().getString("externalId");
                String externalId = (externalIdParam == null) ? null : externalIdParam;
                String stateParam = message.body().getString("state");
                String state = (stateParam == null) ? null : stateParam;
                String quoteLevelParam = message.body().getString("quoteLevel");
                String quoteLevel = (quoteLevelParam == null) ? null : quoteLevelParam;
                String projectIdParam = message.body().getString("projectId");
                String projectId = (projectIdParam == null) ? null : projectIdParam;
                String quoteDateGtParam = message.body().getString("quoteDate.gt");
                OffsetDateTime quoteDateGt = (quoteDateGtParam == null) ? null : Json.mapper.readValue(quoteDateGtParam, OffsetDateTime.class);
                String quoteDateLtParam = message.body().getString("quoteDate.lt");
                OffsetDateTime quoteDateLt = (quoteDateLtParam == null) ? null : Json.mapper.readValue(quoteDateLtParam, OffsetDateTime.class);
                String quoteCompletionDateGtParam = message.body().getString("quoteCompletionDate.gt");
                OffsetDateTime quoteCompletionDateGt = (quoteCompletionDateGtParam == null) ? null : Json.mapper.readValue(quoteCompletionDateGtParam, OffsetDateTime.class);
                String quoteCompletionDateLtParam = message.body().getString("quoteCompletionDate.lt");
                OffsetDateTime quoteCompletionDateLt = (quoteCompletionDateLtParam == null) ? null : Json.mapper.readValue(quoteCompletionDateLtParam, OffsetDateTime.class);
                String offsetParam = message.body().getString("offset");
                String offset = (offsetParam == null) ? null : offsetParam;
                String limitParam = message.body().getString("limit");
                String limit = (limitParam == null) ? null : limitParam;
                service.quoteFind(externalId, state, quoteLevel, projectId, quoteDateGt, quoteDateLt, quoteCompletionDateGt, quoteCompletionDateLt, offset, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteGet
        vertx.eventBus().<JsonObject> consumer(QUOTEGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteGet";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                String id = idParam;
                service.quoteGet(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteGet", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for quoteRequestStateChange
        vertx.eventBus().<JsonObject> consumer(QUOTEREQUESTSTATECHANGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "quoteRequestStateChange";
                JsonObject changeQuoteStateRequestParam = message.body().getJsonObject("changeQuoteStateRequest");
                if (changeQuoteStateRequestParam == null) {
                    manageError(message, new MainApiException(400, "changeQuoteStateRequest is required"), serviceId);
                    return;
                }
                ChangelQuoteStateRequest changeQuoteStateRequest = Json.mapper.readValue(changeQuoteStateRequestParam.encode(), ChangelQuoteStateRequest.class);
                service.quoteRequestStateChange(changeQuoteStateRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "quoteRequestStateChange");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("quoteRequestStateChange", e);
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
