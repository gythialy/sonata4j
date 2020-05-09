package io.swagger.api.impl;

import io.swagger.api.ProductInventoryManagementApi;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductInventoryManagementApiServiceImpl implements ProductInventoryManagementApi {
    public Response productFind(String buyerId, String status, String productSpecificationId, String productOfferingId, String buyerProductId, String geographicalSiteId, String relatedProductId, String billingAccountId, String productOrderId, Date startDateLt, Date startDateGt, Date lastUpdateDateLt, Date lastUpdateDateGt, String offset, String limit, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productGet(String productId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
