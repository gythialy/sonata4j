package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.ChangeQuoteStateResponse;
import io.swagger.model.ChangelQuoteStateRequest;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Hub;
import io.swagger.model.HubInput;
import io.swagger.model.Quote;
import io.swagger.model.QuoteCreate;
import io.swagger.model.QuoteFind;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class QuoteManagementApiServiceImpl implements QuoteManagementApi {
      public Response quoteCreate(QuoteCreate quote,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteFind(String externalId,String state,String quoteLevel,String projectId,Date quoteDateGt,Date quoteDateLt,Date quoteCompletionDateGt,Date quoteCompletionDateLt,String offset,String limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteGet(String id,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteManagementHubCreate(HubInput hub,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteManagementHubDelete(String hubId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteManagementHubFind(String fields,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response quoteRequestStateChange(ChangelQuoteStateRequest changeQuoteStateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
