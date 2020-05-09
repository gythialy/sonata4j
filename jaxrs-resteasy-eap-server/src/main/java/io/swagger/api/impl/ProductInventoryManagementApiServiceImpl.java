package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Product;
import io.swagger.model.ProductSummary;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public class ProductInventoryManagementApiServiceImpl implements ProductInventoryManagementApi {
      public Response productFind(String buyerId,String status,String productSpecificationId,String productOfferingId,String buyerProductId,String geographicalSiteId,String relatedProductId,String billingAccountId,String productOrderId,Date startDateLt,Date startDateGt,Date lastUpdateDateLt,Date lastUpdateDateGt,String offset,String limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGet(String productId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
