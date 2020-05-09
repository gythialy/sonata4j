package io.swagger.api;

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Product;
import io.swagger.model.ProductSummary;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@Path("/productInventoryManagement")

@Produces({"application/json;charset=utf-8"})
@io.swagger.annotations.Api(description = "the productInventoryManagement API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-05-09T02:18:19.320Z")
public interface ProductInventoryManagementApi {

    @GET
    @Path("/v3/product")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "productFind (list) - retrieve product list with summary view", notes = "The Buyer requests a list of Products from the Seller based on filter criteria.", response = ProductSummary.class, responseContainer = "List", authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Product",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = ProductSummary.class, responseContainer = "List"),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:     - code: 103 message: Incomplete request - If place.id is filled, place.type must be filled description:     - code: 104 message: Incomplete request - If place.type is filled, place.id must be filled description:     - code: 105 message: Incomplete request - If partyRole.role is filled, partyRole.relatedPartyId must be filled description:     - code: 106 message: Incomplete request - If partyRole.relatedPartyId is filled, partyRole.role must be filled description:", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response productFind(@QueryParam("buyerId") String buyerId, @QueryParam("status") String status, @QueryParam("productSpecificationId") String productSpecificationId, @QueryParam("productOfferingId") String productOfferingId, @QueryParam("buyerProductId") String buyerProductId, @QueryParam("geographicalSiteId") String geographicalSiteId, @QueryParam("relatedProductId") String relatedProductId, @QueryParam("billingAccountId") String billingAccountId, @QueryParam("productOrderId") String productOrderId, @QueryParam("startDate.lt") Date startDateLt, @QueryParam("startDate.gt") Date startDateGt, @QueryParam("lastUpdateDate.lt") Date lastUpdateDateLt, @QueryParam("lastUpdateDate.gt") Date lastUpdateDateGt, @QueryParam("offset") String offset, @QueryParam("limit") String limit, @Context SecurityContext securityContext);

    @GET
    @Path("/v3/product/{ProductId}")

    @Produces({"application/json;charset=utf-8"})
    @io.swagger.annotations.ApiOperation(value = "productGet (by id) - retrieve one product with all information", notes = "The Buyer requests the details associated with a single Product based on a Seller Product Identifier.", response = Product.class, authorizations = {
            @io.swagger.annotations.Authorization(value = "bearer", scopes = {
                    @io.swagger.annotations.AuthorizationScope(scope = "admin", description = "scope of admin customers"),
                    @io.swagger.annotations.AuthorizationScope(scope = "customer", description = "scope of registered customers")
            })
    }, tags = {"Product",})
    @io.swagger.annotations.ApiResponses(value = {
            @io.swagger.annotations.ApiResponse(code = 200, message = "Ok", response = Product.class),

            @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),

            @io.swagger.annotations.ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class)})
    public Response productGet(@PathParam("ProductId") String productId, @Context SecurityContext securityContext);
}
