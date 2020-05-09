package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.Hub;
import io.swagger.server.api.model.HubInput;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface HubApi  {
    //productOfferingQualificationManagementHubDelete
    void productOfferingQualificationManagementHubDelete(String hubId, Handler<AsyncResult<Void>> handler);
    
    //productOfferingQualificationManagementHubGet
    void productOfferingQualificationManagementHubGet(Handler<AsyncResult<List<Hub>>> handler);
    
    //productOfferingQualificationManagementHubPost
    void productOfferingQualificationManagementHubPost(HubInput hub, Handler<AsyncResult<Hub>> handler);
    
    //productOrderManagementHubCreate
    void productOrderManagementHubCreate(HubInput hub, Handler<AsyncResult<Hub>> handler);
    
    //productOrderManagementHubDelete
    void productOrderManagementHubDelete(String hubId, Handler<AsyncResult<Void>> handler);
    
    //productOrderManagementHubFind
    void productOrderManagementHubFind(Handler<AsyncResult<List<Hub>>> handler);
    
    //quoteManagementHubCreate
    void quoteManagementHubCreate(HubInput hub, Handler<AsyncResult<Hub>> handler);
    
    //quoteManagementHubDelete
    void quoteManagementHubDelete(String hubId, Handler<AsyncResult<Void>> handler);
    
    //quoteManagementHubFind
    void quoteManagementHubFind(String fields, Handler<AsyncResult<List<Hub>>> handler);
    
}
