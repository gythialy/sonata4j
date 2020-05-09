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
import io.swagger.server.api.model.ProductOrder;
import io.swagger.server.api.model.ProductOrderCreate;
import io.swagger.server.api.model.ProductOrderSummary;

import java.util.List;
import java.util.Map;

public class ProductOrderApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProductOrderApiVerticle.class); 
    
    final static String PRODUCTORDERCREATE_SERVICE_ID = "productOrderCreate";
    final static String PRODUCTORDERFIND_SERVICE_ID = "productOrderFind";
    final static String PRODUCTORDERGET_SERVICE_ID = "productOrderGet";
    
    final ProductOrderApi service;

    public ProductOrderApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.ProductOrderApiImpl");
            service = (ProductOrderApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductOrderApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for productOrderCreate
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERCREATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderCreate";
                JsonObject productOrderParam = message.body().getJsonObject("ProductOrder");
                if (productOrderParam == null) {
                    manageError(message, new MainApiException(400, "ProductOrder is required"), serviceId);
                    return;
                }
                ProductOrderCreate productOrder = Json.mapper.readValue(productOrderParam.encode(), ProductOrderCreate.class);
                service.productOrderCreate(productOrder, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderCreate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderCreate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOrderFind
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderFind";
                String buyerIdParam = message.body().getString("buyerId");
                String buyerId = (buyerIdParam == null) ? null : buyerIdParam;
                String sellerIdParam = message.body().getString("sellerId");
                String sellerId = (sellerIdParam == null) ? null : sellerIdParam;
                String stateParam = message.body().getString("state");
                String state = (stateParam == null) ? null : stateParam;
                String buyerRequestedDateGtParam = message.body().getString("buyerRequestedDate.gt");
                OffsetDateTime buyerRequestedDateGt = (buyerRequestedDateGtParam == null) ? null : Json.mapper.readValue(buyerRequestedDateGtParam, OffsetDateTime.class);
                String buyerRequestedDateLtParam = message.body().getString("buyerRequestedDate.lt");
                OffsetDateTime buyerRequestedDateLt = (buyerRequestedDateLtParam == null) ? null : Json.mapper.readValue(buyerRequestedDateLtParam, OffsetDateTime.class);
                String orderDateGtParam = message.body().getString("orderDate.gt");
                OffsetDateTime orderDateGt = (orderDateGtParam == null) ? null : Json.mapper.readValue(orderDateGtParam, OffsetDateTime.class);
                String orderDateLtParam = message.body().getString("orderDate.lt");
                OffsetDateTime orderDateLt = (orderDateLtParam == null) ? null : Json.mapper.readValue(orderDateLtParam, OffsetDateTime.class);
                String requestedStartDateGtParam = message.body().getString("requestedStartDate.gt");
                OffsetDateTime requestedStartDateGt = (requestedStartDateGtParam == null) ? null : Json.mapper.readValue(requestedStartDateGtParam, OffsetDateTime.class);
                String requestedStartDateLtParam = message.body().getString("requestedStartDate.lt");
                OffsetDateTime requestedStartDateLt = (requestedStartDateLtParam == null) ? null : Json.mapper.readValue(requestedStartDateLtParam, OffsetDateTime.class);
                String requestedCompletionDateGtParam = message.body().getString("requestedCompletionDate.gt");
                OffsetDateTime requestedCompletionDateGt = (requestedCompletionDateGtParam == null) ? null : Json.mapper.readValue(requestedCompletionDateGtParam, OffsetDateTime.class);
                String requestedCompletionDateLtParam = message.body().getString("requestedCompletionDate.lt");
                OffsetDateTime requestedCompletionDateLt = (requestedCompletionDateLtParam == null) ? null : Json.mapper.readValue(requestedCompletionDateLtParam, OffsetDateTime.class);
                String expectedCompletionDateGtParam = message.body().getString("expectedCompletionDate.gt");
                OffsetDateTime expectedCompletionDateGt = (expectedCompletionDateGtParam == null) ? null : Json.mapper.readValue(expectedCompletionDateGtParam, OffsetDateTime.class);
                String expectedCompletionDateLtParam = message.body().getString("expectedCompletionDate.lt");
                OffsetDateTime expectedCompletionDateLt = (expectedCompletionDateLtParam == null) ? null : Json.mapper.readValue(expectedCompletionDateLtParam, OffsetDateTime.class);
                String completionDateGtParam = message.body().getString("completionDate.gt");
                OffsetDateTime completionDateGt = (completionDateGtParam == null) ? null : Json.mapper.readValue(completionDateGtParam, OffsetDateTime.class);
                String completionDateLtParam = message.body().getString("completionDate.lt");
                OffsetDateTime completionDateLt = (completionDateLtParam == null) ? null : Json.mapper.readValue(completionDateLtParam, OffsetDateTime.class);
                String orderCancellationDateGtParam = message.body().getString("orderCancellationDate.gt");
                OffsetDateTime orderCancellationDateGt = (orderCancellationDateGtParam == null) ? null : Json.mapper.readValue(orderCancellationDateGtParam, OffsetDateTime.class);
                String orderCancellationDateLtParam = message.body().getString("orderCancellationDate.lt");
                OffsetDateTime orderCancellationDateLt = (orderCancellationDateLtParam == null) ? null : Json.mapper.readValue(orderCancellationDateLtParam, OffsetDateTime.class);
                String siteNameParam = message.body().getString("siteName");
                String siteName = (siteNameParam == null) ? null : siteNameParam;
                String siteCompanyNameParam = message.body().getString("siteCompanyName");
                String siteCompanyName = (siteCompanyNameParam == null) ? null : siteCompanyNameParam;
                String siteCustomerNameParam = message.body().getString("siteCustomerName");
                String siteCustomerName = (siteCustomerNameParam == null) ? null : siteCustomerNameParam;
                String projectIdParam = message.body().getString("projectId");
                String projectId = (projectIdParam == null) ? null : projectIdParam;
                String externalIdParam = message.body().getString("externalId");
                String externalId = (externalIdParam == null) ? null : externalIdParam;
                String offsetParam = message.body().getString("offset");
                String offset = (offsetParam == null) ? null : offsetParam;
                String limitParam = message.body().getString("limit");
                String limit = (limitParam == null) ? null : limitParam;
                service.productOrderFind(buyerId, sellerId, state, buyerRequestedDateGt, buyerRequestedDateLt, orderDateGt, orderDateLt, requestedStartDateGt, requestedStartDateLt, requestedCompletionDateGt, requestedCompletionDateLt, expectedCompletionDateGt, expectedCompletionDateLt, completionDateGt, completionDateLt, orderCancellationDateGt, orderCancellationDateLt, siteName, siteCompanyName, siteCustomerName, projectId, externalId, offset, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productOrderGet
        vertx.eventBus().<JsonObject> consumer(PRODUCTORDERGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productOrderGet";
                String productOrderIdParam = message.body().getString("ProductOrderId");
                if(productOrderIdParam == null) {
                    manageError(message, new MainApiException(400, "ProductOrderId is required"), serviceId);
                    return;
                }
                String productOrderId = productOrderIdParam;
                service.productOrderGet(productOrderId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productOrderGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productOrderGet", e);
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
