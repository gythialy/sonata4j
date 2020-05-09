package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicAddress;
import io.swagger.model.GeographicAddressValidation;
import io.swagger.model.GeographicAddressValidationCreate;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/geographicAddressManagement")

@Produces({"application/json;charset=utf-8"})
@io.swagger.annotations.Api(description = "the geographicAddressManagement API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public interface GeographicAddressManagementApi {

    @GET
    @Path("/v3/geographicAddress/{GeographicAddressId}")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "retrieveAddress", notes = "The Buyer requests the full details of a single Address based on an Address identifier that was previously provided by the Seller.", response = GeographicAddress.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"GeographicAddress",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = GeographicAddress.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response geographicAddressGet(@PathParam("GeographicAddressId") String geographicAddressId, @Context SecurityContext securityContext);

    @POST
    @Path("/v3/geographicAddressValidation")
    @Consumes({"application/json;charset=utf-8"})
    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "validate a Geographic Address", notes = "The Buyer sends Address information known to the Buyer to the Seller.  The Seller re-sponds with a list of Addresses known to the Seller that likely match the Address infor-mation sent by the Buyer.  For each Address returned, the Seller generally also provides an Address Identifier, which uniquely identifies this Address within the Seller.", response = GeographicAddressValidation.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"GeographicAddressValidation",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = GeographicAddressValidation.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many addresses match - please re-try with more attribute values restriction description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response geographicAddressValidationCreate(@ApiParam(value = "", required = true) GeographicAddressValidationCreate addressValidationRequest, @Context SecurityContext securityContext);
}
