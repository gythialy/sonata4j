package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.Event;
import io.swagger.server.api.model.EventPlus;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface NotificationApi  {
    //notificationProductOrderAttributeValueChangeNotification
    void notificationProductOrderAttributeValueChangeNotification(EventPlus productOrderAttributeValueChange, Handler<AsyncResult<Void>> handler);
    
    //notificationProductOrderCreationNotification
    void notificationProductOrderCreationNotification(Event productOrderCreationNotification, Handler<AsyncResult<Void>> handler);
    
    //notificationProductOrderInformationRequiredNotification
    void notificationProductOrderInformationRequiredNotification(EventPlus productOrderInformationRequired, Handler<AsyncResult<Void>> handler);
    
    //notificationProductOrderStateChangeNotification
    void notificationProductOrderStateChangeNotification(Event productOrderStateChange, Handler<AsyncResult<Void>> handler);
    
    //notificationQuoteAttributeValueChangeNotification
    void notificationQuoteAttributeValueChangeNotification(List<EventPlus> quoteAttributeValueChangeNotification, Handler<AsyncResult<Void>> handler);
    
    //notificationQuoteCreationNotification
    void notificationQuoteCreationNotification(Event quoteCreationNotification, Handler<AsyncResult<Void>> handler);
    
    //notificationQuoteInformationRequiredNotification
    void notificationQuoteInformationRequiredNotification(List<EventPlus> quoteInformationRequiredNotification, Handler<AsyncResult<Void>> handler);
    
    //notificationQuoteStateChangeNotification
    void notificationQuoteStateChangeNotification(Event quoteStateChangeNotification, Handler<AsyncResult<Void>> handler);
    
}
