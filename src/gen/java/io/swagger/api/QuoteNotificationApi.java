package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@Path("/quoteNotification")

@Produces({"application/json;charset=utf-8"})
@io.swagger.annotations.Api(description = "the quoteNotification API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public interface QuoteNotificationApi {

    @POST
    @Path("/v1/quoteNotification/v1/notification/quoteAttributeValueChangeNotification")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Quote attribute value change notification structure", notes = "Quote attribute value change notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\":\"/quote/42/quoteItem/3\" is the item #3 of quote #42 Attribute fieldPath allows to target attribute with value changed.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity ", response = Void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Notification",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response notificationQuoteAttributeValueChangeNotification(@ApiParam(value = "", required = true) List<EventPlus> quoteAttributeValueChangeNotification, @Context SecurityContext securityContext);

    @POST
    @Path("/v1/notification/quoteCreationNotification")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Quote creation notification structure", notes = "Quote creation notification structure definition  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity ", response = Void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Notification",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response notificationQuoteCreationNotification(@ApiParam(value = "", required = true) Event quoteCreationNotification, @Context SecurityContext securityContext);

    @POST
    @Path("/v1/quoteNotification/v1/notification/quoteInformationRequiredNotification")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Quote information required notification structure", notes = "Quote information required notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\":\"/quote/42/quoteItem/3\" is the item #3 of quote #42 Attribute fieldPath allows to target missing information: fieldPath\":\"missing=quote.relatedParty.Role.value&party.id=46\" means role information is missing for party 46.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity ", response = Void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Notification",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response notificationQuoteInformationRequiredNotification(@ApiParam(value = "", required = true) List<EventPlus> quoteInformationRequiredNotification, @Context SecurityContext securityContext);

    @POST
    @Path("/v1/notification/quoteStateChangeNotification")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "Quote state change notification structure", notes = "Quote state change notification structure description  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity ", response = Void.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Notification",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = Void.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response notificationQuoteStateChangeNotification(@ApiParam(value = "", required = true) Event quoteStateChangeNotification, @Context SecurityContext securityContext);
}
