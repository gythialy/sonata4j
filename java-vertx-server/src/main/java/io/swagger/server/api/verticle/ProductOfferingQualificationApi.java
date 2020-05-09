package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.ProductOfferingQualification;
import io.swagger.server.api.model.ProductOfferingQualificationCreate;
import io.swagger.server.api.model.ProductOfferingQualificationFind;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductOfferingQualificationApi  {
    //productOfferingQualificationCreate
    void productOfferingQualificationCreate(ProductOfferingQualificationCreate productOfferingQualification, Handler<AsyncResult<ProductOfferingQualification>> handler);
    
    //productOfferingQualificationFind
    void productOfferingQualificationFind(String state, String projectId, OffsetDateTime requestedResponseDateGt, OffsetDateTime requestedResponseDateLt, String offset, String limit, Handler<AsyncResult<List<ProductOfferingQualificationFind>>> handler);
    
    //productOfferingQualificationGet
    void productOfferingQualificationGet(String productOfferingQualificationId, Handler<AsyncResult<ProductOfferingQualification>> handler);
    
}
