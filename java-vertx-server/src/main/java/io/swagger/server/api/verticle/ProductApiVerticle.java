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
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductSummary;

import java.util.List;
import java.util.Map;

public class ProductApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(ProductApiVerticle.class); 
    
    final static String PRODUCTFIND_SERVICE_ID = "productFind";
    final static String PRODUCTGET_SERVICE_ID = "productGet";
    
    final ProductApi service;

    public ProductApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.ProductApiImpl");
            service = (ProductApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ProductApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for productFind
        vertx.eventBus().<JsonObject> consumer(PRODUCTFIND_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productFind";
                String buyerIdParam = message.body().getString("buyerId");
                String buyerId = (buyerIdParam == null) ? null : buyerIdParam;
                String statusParam = message.body().getString("status");
                String status = (statusParam == null) ? null : statusParam;
                String productSpecificationIdParam = message.body().getString("productSpecificationId");
                String productSpecificationId = (productSpecificationIdParam == null) ? null : productSpecificationIdParam;
                String productOfferingIdParam = message.body().getString("productOfferingId");
                String productOfferingId = (productOfferingIdParam == null) ? null : productOfferingIdParam;
                String buyerProductIdParam = message.body().getString("buyerProductId");
                String buyerProductId = (buyerProductIdParam == null) ? null : buyerProductIdParam;
                String geographicalSiteIdParam = message.body().getString("geographicalSiteId");
                String geographicalSiteId = (geographicalSiteIdParam == null) ? null : geographicalSiteIdParam;
                String relatedProductIdParam = message.body().getString("relatedProductId");
                String relatedProductId = (relatedProductIdParam == null) ? null : relatedProductIdParam;
                String billingAccountIdParam = message.body().getString("billingAccountId");
                String billingAccountId = (billingAccountIdParam == null) ? null : billingAccountIdParam;
                String productOrderIdParam = message.body().getString("productOrderId");
                String productOrderId = (productOrderIdParam == null) ? null : productOrderIdParam;
                String startDateLtParam = message.body().getString("startDate.lt");
                OffsetDateTime startDateLt = (startDateLtParam == null) ? null : Json.mapper.readValue(startDateLtParam, OffsetDateTime.class);
                String startDateGtParam = message.body().getString("startDate.gt");
                OffsetDateTime startDateGt = (startDateGtParam == null) ? null : Json.mapper.readValue(startDateGtParam, OffsetDateTime.class);
                String lastUpdateDateLtParam = message.body().getString("lastUpdateDate.lt");
                OffsetDateTime lastUpdateDateLt = (lastUpdateDateLtParam == null) ? null : Json.mapper.readValue(lastUpdateDateLtParam, OffsetDateTime.class);
                String lastUpdateDateGtParam = message.body().getString("lastUpdateDate.gt");
                OffsetDateTime lastUpdateDateGt = (lastUpdateDateGtParam == null) ? null : Json.mapper.readValue(lastUpdateDateGtParam, OffsetDateTime.class);
                String offsetParam = message.body().getString("offset");
                String offset = (offsetParam == null) ? null : offsetParam;
                String limitParam = message.body().getString("limit");
                String limit = (limitParam == null) ? null : limitParam;
                service.productFind(buyerId, status, productSpecificationId, productOfferingId, buyerProductId, geographicalSiteId, relatedProductId, billingAccountId, productOrderId, startDateLt, startDateGt, lastUpdateDateLt, lastUpdateDateGt, offset, limit, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productFind");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productFind", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for productGet
        vertx.eventBus().<JsonObject> consumer(PRODUCTGET_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "productGet";
                String productIdParam = message.body().getString("ProductId");
                if(productIdParam == null) {
                    manageError(message, new MainApiException(400, "ProductId is required"), serviceId);
                    return;
                }
                String productId = productIdParam;
                service.productGet(productId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "productGet");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("productGet", e);
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
