package io.swagger.api;

import io.swagger.model.CancelProductOrder;
import io.swagger.model.CancelProductOrderCreate;
import io.swagger.model.ErrorRepresentation;

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
public interface CancelProductOrderApi  {

    /**
     * Create product order cancellation request
     *
     * This operation allows buyer to request a product order cancellation request 
     *
     */
    @POST
    @Path("/productOrderManagement/v3/cancelProductOrder")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create product order cancellation request", tags={ "CancelProductOrder",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = CancelProductOrder.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: externalId must be provided description:     - code: 101 message: externalId does not match productOrderId description:     - code: 102 message: Product order state is not compliant with this request description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public CancelProductOrder cancelProductOrderCreate(@Valid CancelProductOrderCreate cancelProductOrder);

    /**
     * Find a lost of product order cancellation request(s)
     *
     * This operation allows buyer to retrieve a list of product order cancellation request
     *
     */
    @GET
    @Path("/productOrderManagement/v3/cancelProductOrder")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Find a lost of product order cancellation request(s)", tags={ "CancelProductOrder",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = CancelProductOrder.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<CancelProductOrder> cancelProductOrderFind(@QueryParam("productOrderId") String productOrderId, @QueryParam("productOrderExternalId") String productOrderExternalId);

    /**
     * Get a product order cancellation request (by id)
     *
     * This operation allows buyer to retrieve one product order cancellation request
     *
     */
    @GET
    @Path("/productOrderManagement/v3/cancelProductOrder/{CancelProductOrderId}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Get a product order cancellation request (by id)", tags={ "CancelProductOrder" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = CancelProductOrder.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public CancelProductOrder cancelProductOrderGet(@PathParam("CancelProductOrderId") String cancelProductOrderId);
}

