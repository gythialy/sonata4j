package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddressValidation;
import io.swagger.server.api.model.GeographicAddressValidationCreate;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GeographicAddressValidationApi  {
    //geographicAddressValidationCreate
    void geographicAddressValidationCreate(GeographicAddressValidationCreate addressValidationRequest, Handler<AsyncResult<GeographicAddressValidation>> handler);
    
}
