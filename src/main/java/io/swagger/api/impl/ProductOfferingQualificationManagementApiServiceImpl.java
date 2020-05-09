package io.swagger.api.impl;

import io.swagger.api.ProductOfferingQualificationManagementApi;
import io.swagger.model.HubInput;
import io.swagger.model.ProductOfferingQualificationCreate;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public class ProductOfferingQualificationManagementApiServiceImpl implements ProductOfferingQualificationManagementApi {
    public Response productOfferingQualificationCreate(ProductOfferingQualificationCreate productOfferingQualification, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOfferingQualificationFind(String state, String projectId, Date requestedResponseDateGt, Date requestedResponseDateLt, String offset, String limit, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOfferingQualificationGet(String productOfferingQualificationId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOfferingQualificationManagementHubDelete(String hubId, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOfferingQualificationManagementHubGet(SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }

    public Response productOfferingQualificationManagementHubPost(HubInput hub, SecurityContext securityContext) {
        // do some magic!
        return Response.ok().build();
    }
}
