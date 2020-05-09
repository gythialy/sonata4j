package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductSummary;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductApi  {
    //productFind
    void productFind(String buyerId, String status, String productSpecificationId, String productOfferingId, String buyerProductId, String geographicalSiteId, String relatedProductId, String billingAccountId, String productOrderId, OffsetDateTime startDateLt, OffsetDateTime startDateGt, OffsetDateTime lastUpdateDateLt, OffsetDateTime lastUpdateDateGt, String offset, String limit, Handler<AsyncResult<List<ProductSummary>>> handler);
    
    //productGet
    void productGet(String productId, Handler<AsyncResult<Product>> handler);
    
}
