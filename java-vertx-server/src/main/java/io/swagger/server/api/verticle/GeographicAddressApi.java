package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddress;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GeographicAddressApi  {
    //geographicAddressGet
    void geographicAddressGet(String geographicAddressId, Handler<AsyncResult<GeographicAddress>> handler);
    
}
