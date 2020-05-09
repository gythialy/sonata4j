package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;
import java.util.List;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteNotificationApiServiceImpl implements QuoteNotificationApi {
      public Response notificationQuoteAttributeValueChangeNotification(List<EventPlus> quoteAttributeValueChangeNotification,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationQuoteCreationNotification(Event quoteCreationNotification,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationQuoteInformationRequiredNotification(List<EventPlus> quoteInformationRequiredNotification,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationQuoteStateChangeNotification(Event quoteStateChangeNotification,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
