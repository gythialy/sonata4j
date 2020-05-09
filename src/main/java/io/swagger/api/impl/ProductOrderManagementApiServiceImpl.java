package io.swagger.api.impl;

import io.swagger.api.ProductOrderManagementApi;
import io.swagger.model.CancelProductOrderCreate;
import io.swagger.model.HubInput;
import io.swagger.model.ProductOrderCreate;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOrderManagementApiServiceImpl implements ProductOrderManagementApi {
    public Response cancelProductOrderCreate(CancelProductOrderCreate cancelProductOrder, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response cancelProductOrderFind(String productOrderId, String productOrderExternalId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response cancelProductOrderGet(String cancelProductOrderId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderCreate(ProductOrderCreate productOrder, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderFind(String buyerId, String sellerId, String state, Date buyerRequestedDateGt, Date buyerRequestedDateLt, Date orderDateGt, Date orderDateLt, Date requestedStartDateGt, Date requestedStartDateLt, Date requestedCompletionDateGt, Date requestedCompletionDateLt, Date expectedCompletionDateGt, Date expectedCompletionDateLt, Date completionDateGt, Date completionDateLt, Date orderCancellationDateGt, Date orderCancellationDateLt, String siteName, String siteCompanyName, String siteCustomerName, String projectId, String externalId, String offset, String limit, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderGet(String productOrderId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderManagementHubCreate(HubInput hub, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderManagementHubDelete(String hubId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOrderManagementHubFind(SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
