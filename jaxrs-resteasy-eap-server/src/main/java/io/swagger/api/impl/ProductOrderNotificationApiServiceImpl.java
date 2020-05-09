package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductOrderNotificationApiServiceImpl implements ProductOrderNotificationApi {
      public Response notificationProductOrderAttributeValueChangeNotification(EventPlus productOrderAttributeValueChange,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationProductOrderCreationNotification(Event productOrderCreationNotification,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationProductOrderInformationRequiredNotification(EventPlus productOrderInformationRequired,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response notificationProductOrderStateChangeNotification(Event productOrderStateChange,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
