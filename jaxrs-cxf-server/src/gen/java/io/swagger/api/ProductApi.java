package io.swagger.api;

import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Product;
import io.swagger.model.ProductSummary;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * MEF LSO Sonata
 *
 * <p> A set of APIs based on the LSO Reference Architecture for Serviceability (Address Validation, Site Queries, Product Offering Qualification) | Quoting | Product Inventory | Ordering | Trouble-ticketing Billing | Contract & Catalog  
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface ProductApi  {

    /**
     * productFind (list) - retrieve product list with summary view
     *
     * The Buyer requests a list of Products from the Seller based on filter criteria.
     *
     */
    @GET
    @Path("/productInventoryManagement/v3/product")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "productFind (list) - retrieve product list with summary view", tags={ "Product",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductSummary.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:     - code: 103 message: Incomplete request - If place.id is filled, place.type must be filled description:     - code: 104 message: Incomplete request - If place.type is filled, place.id must be filled description:     - code: 105 message: Incomplete request - If partyRole.role is filled, partyRole.relatedPartyId must be filled description:     - code: 106 message: Incomplete request - If partyRole.relatedPartyId is filled, partyRole.role must be filled description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<ProductSummary> productFind(@QueryParam("buyerId") String buyerId, @QueryParam("status") String status, @QueryParam("productSpecificationId") String productSpecificationId, @QueryParam("productOfferingId") String productOfferingId, @QueryParam("buyerProductId") String buyerProductId, @QueryParam("geographicalSiteId") String geographicalSiteId, @QueryParam("relatedProductId") String relatedProductId, @QueryParam("billingAccountId") String billingAccountId, @QueryParam("productOrderId") String productOrderId, @QueryParam("startDate.lt") Date startDateLt, @QueryParam("startDate.gt") Date startDateGt, @QueryParam("lastUpdateDate.lt") Date lastUpdateDateLt, @QueryParam("lastUpdateDate.gt") Date lastUpdateDateGt, @QueryParam("offset") String offset, @QueryParam("limit") String limit);

    /**
     * productGet (by id) - retrieve one product with all information
     *
     * The Buyer requests the details associated with a single Product based on a Seller Product Identifier.
     *
     */
    @GET
    @Path("/productInventoryManagement/v3/product/{ProductId}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "productGet (by id) - retrieve one product with all information", tags={ "Product" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Product.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public Product productGet(@PathParam("ProductId") String productId);
}

