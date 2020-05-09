package io.swagger.api.impl;

import io.swagger.api.QuoteNotificationApi;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class QuoteNotificationApiServiceImpl implements QuoteNotificationApi {
    public Response notificationQuoteAttributeValueChangeNotification(List<EventPlus> quoteAttributeValueChangeNotification, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response notificationQuoteCreationNotification(Event quoteCreationNotification, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response notificationQuoteInformationRequiredNotification(List<EventPlus> quoteInformationRequiredNotification, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response notificationQuoteStateChangeNotification(Event quoteStateChangeNotification, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
