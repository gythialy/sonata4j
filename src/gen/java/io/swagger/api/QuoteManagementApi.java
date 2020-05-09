package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@Path("/quoteManagement")

@Produces({"application/json;charset=utf-8"})
@io.swagger.annotations.Api(description = "the quoteManagement API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public interface QuoteManagementApi {

    @POST
    @Path("/v2/quote")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Create a quote", notes = "This operation is used to create a new quote.", response = Quote.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Quote",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Quote.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 101 message: A relatedPartyRole for Buyer role must be provided description:     - code: 103 message: A relatedPartyRole is incomplete (must have partyRole.id or role.id+relatedParty) description:     - code: 104 message: A relatedParty is incomplete (must have a party.id or a party.name) description:     - code: 105 message: Qualification Id provided did not exist or expired description:     - code: 106 message: At least a productOffering Id or a product.id or a productSpec.id must be provided in quote item description:     - code: 107 message: inconsistency between  requestedQuoteCompletionDate and expectedFulfillmentStartDate description:     - code: 108 message: Seller requires agreement under which the buyer is requesting but is missing from the request. description:     - code: 109 message: The agreement provided cannot be validated by the seller description:     - code: 110 message: Product requested is not part of the provided agreement description:     - code: 111 message: Mandatory product/item relationship is missing description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteCreate(@ApiParam(value = "", required = true) QuoteCreate quote, @Context SecurityContext securityContext);

    @GET
    @Path("/v2/quote")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "List quotes", notes = "This operation is used to retrieve quote information using filter criteria.", response = QuoteFind.class, responseContainer = "List", authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Quote",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = QuoteFind.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteFind(@QueryParam("externalId") String externalId, @QueryParam("state") String state, @QueryParam("quoteLevel") String quoteLevel, @QueryParam("projectId") String projectId, @QueryParam("quoteDate.gt") Date quoteDateGt, @QueryParam("quoteDate.lt") Date quoteDateLt, @QueryParam("quoteCompletionDate.gt") Date quoteCompletionDateGt, @QueryParam("quoteCompletionDate.lt") Date quoteCompletionDateLt, @QueryParam("offset") String offset, @QueryParam("limit") String limit, @Context SecurityContext securityContext);

    @GET
    @Path("/v2/quote/{id}")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Retrieve a quote", notes = "This operation is used to retrieve quote information using the ID.", response = Quote.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Quote",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Quote.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteGet(@PathParam("id") String id, @Context SecurityContext securityContext);

    @POST
    @Path("/v2/hub")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Register a listener", notes = "Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics", response = Hub.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Hub",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Hub.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteManagementHubCreate(@ApiParam(value = "", required = true) HubInput hub, @Context SecurityContext securityContext);

    @DELETE
    @Path("/v2/hub/{HubId}")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Unregister a listener", notes = "Clears the communication endpoint address that was set by creating the Hub", response = Void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Hub",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "No Content", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteManagementHubDelete(@PathParam("HubId") String hubId, @Context SecurityContext securityContext);

    @GET
    @Path("/v2/hub")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "listHub", notes = "Retrieve hub(s)", response = Hub.class, responseContainer = "List", authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Hub",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Hub.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteManagementHubFind(@ApiParam(value = "") @HeaderParam("fields") String fields, @Context SecurityContext securityContext);

    @POST
    @Path("/v2/quote/requestStateChange")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "request a quote state change", notes = "Request from buyer to cancel or reject a quote. When seller receive cancel request, seller will shift quote state to CANCELLED (no change on order item state) When seller receive reject request, seller will shift quote state to REJECTED (no change on order item state)", response = ChangeQuoteStateResponse.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Quote",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ChangeQuoteStateResponse.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Quote current status is incompatible with requested quote state change description:     - code: 101 message: Quote external Id provided did not match description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response quoteRequestStateChange(@ApiParam(value = "", required = true) ChangelQuoteStateRequest changeQuoteStateRequest, @Context SecurityContext securityContext);
}
