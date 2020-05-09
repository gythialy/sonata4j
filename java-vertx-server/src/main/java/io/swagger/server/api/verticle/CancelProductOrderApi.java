package io.swagger.server.api.verticle;

import io.swagger.server.api.model.CancelProductOrder;
import io.swagger.server.api.model.CancelProductOrderCreate;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CancelProductOrderApi  {
    //cancelProductOrderCreate
    void cancelProductOrderCreate(CancelProductOrderCreate cancelProductOrder, Handler<AsyncResult<CancelProductOrder>> handler);
    
    //cancelProductOrderFind
    void cancelProductOrderFind(String productOrderId, String productOrderExternalId, Handler<AsyncResult<List<CancelProductOrder>>> handler);
    
    //cancelProductOrderGet
    void cancelProductOrderGet(String cancelProductOrderId, Handler<AsyncResult<CancelProductOrder>> handler);
    
}
