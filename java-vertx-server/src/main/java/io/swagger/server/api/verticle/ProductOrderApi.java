package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.ProductOrder;
import io.swagger.server.api.model.ProductOrderCreate;
import io.swagger.server.api.model.ProductOrderSummary;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductOrderApi  {
    //productOrderCreate
    void productOrderCreate(ProductOrderCreate productOrder, Handler<AsyncResult<ProductOrder>> handler);
    
    //productOrderFind
    void productOrderFind(String buyerId, String sellerId, String state, OffsetDateTime buyerRequestedDateGt, OffsetDateTime buyerRequestedDateLt, OffsetDateTime orderDateGt, OffsetDateTime orderDateLt, OffsetDateTime requestedStartDateGt, OffsetDateTime requestedStartDateLt, OffsetDateTime requestedCompletionDateGt, OffsetDateTime requestedCompletionDateLt, OffsetDateTime expectedCompletionDateGt, OffsetDateTime expectedCompletionDateLt, OffsetDateTime completionDateGt, OffsetDateTime completionDateLt, OffsetDateTime orderCancellationDateGt, OffsetDateTime orderCancellationDateLt, String siteName, String siteCompanyName, String siteCustomerName, String projectId, String externalId, String offset, String limit, Handler<AsyncResult<List<ProductOrderSummary>>> handler);
    
    //productOrderGet
    void productOrderGet(String productOrderId, Handler<AsyncResult<ProductOrder>> handler);
    
}
