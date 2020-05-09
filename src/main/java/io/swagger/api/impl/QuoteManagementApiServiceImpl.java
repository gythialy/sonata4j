package io.swagger.api.impl;

import io.swagger.api.QuoteManagementApi;
import io.swagger.model.ChangelQuoteStateRequest;
import io.swagger.model.HubInput;
import io.swagger.model.QuoteCreate;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class QuoteManagementApiServiceImpl implements QuoteManagementApi {
    public Response quoteCreate(QuoteCreate quote, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteFind(String externalId, String state, String quoteLevel, String projectId, Date quoteDateGt, Date quoteDateLt, Date quoteCompletionDateGt, Date quoteCompletionDateLt, String offset, String limit, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteGet(String id, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteManagementHubCreate(HubInput hub, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteManagementHubDelete(String hubId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteManagementHubFind(String fields, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response quoteRequestStateChange(ChangelQuoteStateRequest changeQuoteStateRequest, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
