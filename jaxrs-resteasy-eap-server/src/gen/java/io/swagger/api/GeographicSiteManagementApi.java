package io.swagger.api;

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicSite;
import io.swagger.model.GeographicSiteFindResp;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/geographicSiteManagement")

@Produces({"application/json;charset=utf-8"})
@io.swagger.annotations.Api(description = "the geographicSiteManagement API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:51:53.195Z")
public interface GeographicSiteManagementApi {

    @GET
    @Path("/v3/geographicSite")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "retrieveGeographicSites", notes = "The Buyer requests that the Seller provides a list of Service Sites known to the Seller based on a set of Site/Address filter criteria.  For each Service Site returned, the Seller also provides a Service Site Identifier, which uniquely identifies this Service Site within the Seller.", response = GeographicSiteFindResp.class, responseContainer = "List", authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"GeographicSite",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = GeographicSiteFindResp.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response geographicSiteFind(@QueryParam("status") String status, @QueryParam("siteCompanyName") String siteCompanyName, @QueryParam("siteCustomerName") String siteCustomerName, @QueryParam("siteDescription") String siteDescription, @QueryParam("siteType") String siteType, @QueryParam("siteName") String siteName, @QueryParam("siteContactName") String siteContactName, @QueryParam("geographicAddress.id") String geographicAddressId, @QueryParam("geographicAddress.streetNr") String geographicAddressStreetNr, @QueryParam("geographicAddress.streetName") String geographicAddressStreetName, @QueryParam("geographicAddress.streetType") String geographicAddressStreetType, @QueryParam("geographicAddress.city") String geographicAddressCity, @QueryParam("geographicAddress.postcode") String geographicAddressPostcode, @QueryParam("geographicAddress.country") String geographicAddressCountry, @Context SecurityContext securityContext);

    @GET
    @Path("/v3/geographicSite/{SiteId}")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "retrieveSite", notes = "The Buyer requests the full details for a single Service Site based on a Service Site identifier that was previously provided by the Seller. ", response = GeographicSite.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"GeographicSite",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = GeographicSite.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response geographicSiteGet(@PathParam("SiteId") String siteId, @Context SecurityContext securityContext);
}
