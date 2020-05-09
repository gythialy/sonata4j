package io.swagger.api;

import io.swagger.model.ChangeQuoteStateResponse;
import io.swagger.model.ChangelQuoteStateRequest;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Quote;
import io.swagger.model.QuoteCreate;
import io.swagger.model.QuoteFind;

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
public interface QuoteApi  {

    /**
     * Create a quote
     *
     * This operation is used to create a new quote.
     *
     */
    @POST
    @Path("/quoteManagement/v2/quote")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create a quote", tags={ "Quote",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = Quote.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 101 message: A relatedPartyRole for Buyer role must be provided description:     - code: 103 message: A relatedPartyRole is incomplete (must have partyRole.id or role.id+relatedParty) description:     - code: 104 message: A relatedParty is incomplete (must have a party.id or a party.name) description:     - code: 105 message: Qualification Id provided did not exist or expired description:     - code: 106 message: At least a productOffering Id or a product.id or a productSpec.id must be provided in quote item description:     - code: 107 message: inconsistency between  requestedQuoteCompletionDate and expectedFulfillmentStartDate description:     - code: 108 message: Seller requires agreement under which the buyer is requesting but is missing from the request. description:     - code: 109 message: The agreement provided cannot be validated by the seller description:     - code: 110 message: Product requested is not part of the provided agreement description:     - code: 111 message: Mandatory product/item relationship is missing description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public Quote quoteCreate(@Valid QuoteCreate quote);

    /**
     * List quotes
     *
     * This operation is used to retrieve quote information using filter criteria.
     *
     */
    @GET
    @Path("/quoteManagement/v2/quote")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "List quotes", tags={ "Quote",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = QuoteFind.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<QuoteFind> quoteFind(@QueryParam("externalId") String externalId, @QueryParam("state") String state, @QueryParam("quoteLevel") String quoteLevel, @QueryParam("projectId") String projectId, @QueryParam("quoteDate.gt") Date quoteDateGt, @QueryParam("quoteDate.lt") Date quoteDateLt, @QueryParam("quoteCompletionDate.gt") Date quoteCompletionDateGt, @QueryParam("quoteCompletionDate.lt") Date quoteCompletionDateLt, @QueryParam("offset") String offset, @QueryParam("limit") String limit);

    /**
     * Retrieve a quote
     *
     * This operation is used to retrieve quote information using the ID.
     *
     */
    @GET
    @Path("/quoteManagement/v2/quote/{id}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Retrieve a quote", tags={ "Quote",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = Quote.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public Quote quoteGet(@PathParam("id") String id);

    /**
     * request a quote state change
     *
     * Request from buyer to cancel or reject a quote. When seller receive cancel request, seller will shift quote state to CANCELLED (no change on order item state) When seller receive reject request, seller will shift quote state to REJECTED (no change on order item state)
     *
     */
    @POST
    @Path("/quoteManagement/v2/quote/requestStateChange")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "request a quote state change", tags={ "Quote" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ChangeQuoteStateResponse.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Quote current status is incompatible with requested quote state change description:     - code: 101 message: Quote external Id provided did not match description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public ChangeQuoteStateResponse quoteRequestStateChange(@Valid ChangelQuoteStateRequest changeQuoteStateRequest);
}

