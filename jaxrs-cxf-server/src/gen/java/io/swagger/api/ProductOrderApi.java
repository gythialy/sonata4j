package io.swagger.api;

import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.ProductOrder;
import io.swagger.model.ProductOrderCreate;
import io.swagger.model.ProductOrderSummary;

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
public interface ProductOrderApi  {

    /**
     * Create a product order
     *
     * This operation is used to create an order. Depending on the order activity, one can \&quot;INSTALL\&quot;, \&quot;CHANGE\&quot;, or \&quot;DISCONNECT\&quot; an associated product.
     *
     */
    @POST
    @Path("/productOrderManagement/v3/productOrder")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create a product order", tags={ "ProductOrder",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductOrder.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Missing order item (minimum 1) description: At least one order item must be provided    - code: 101 message: Missing Buyer at order level description: One and only one related partyRole with a \"Buyer\" role should be provided at the product order level.    - code: 114 message: Missing Seller at order level description: One and only one related partyRole with a \"Seller\" role should be provided at the product order level.    - code: 102 message: A relatedParty is at the wrong level description: The partyRole provided is not at the correct level - MEF allows to have \"Buyer\", \"Seller\", \"Billing Contact\", \"Order Contact\", \"Implementation Contact\", \"Technical Contact\" roles at product order level and \"UNI Site Contact\", \"UNI Alt Site Contact\", \"ENNI Site Contact\", \"ENNI Alt Site Contact\" at product order item level.    - code: 103 message: Missing Buyer Order Contact at order level description: One and only one related partyRole with a \"Order Contact\" role should be provided at the product order level. Buyer Order Contact name & Telephone number must be provided.    - code: 104 message: Missing Buyer Implementation Contact at order level description: One and only one related partyRole with a \"Implementation Contact\" role should be provided at the product order level. Implementation Contact name & Telephone number must be provided.    - code: 105 message: Missing Buyer Technical contact at order level description: One and only one related partyRole with a \"Technical Contact\" role should be provided at the product order level. Technical Contact name, Telephone number and email address must be provided.    - code: 106 message: Address information must match place type description: If place type is 'Formatted Address' : addrLine1, city, stateOrProvince, postCode and country must be there. If place type is 'Fielded Address' : streetName, streetType, city, stateOrProvince, postCode and country must be there.    - code: 107 message: postCode extension requires postcode value to be filled description: A postCode extension must not be present without a postcode being present    - code: 108 message: Product id is required for all OrderItem Actions other than INSTALL description: If orderItemAction is not INSTALL, orderItem.product.id is mandatory    - code: 109 message: Order Activity must match all OrderItem Actions for INSTALL description: If orderActivity is set to INSTALL, all orderItemAction must be INSTALL    - code: 110 message: Referred quote cannot be used for ordering due to its status description: Quote cannot be used in the order if its status is in CANCELLED, UNABLE TO PROVIDE, REJECTED or EXPIRED state.    - code: 111 message: Billing Account information must not be both at order level and order item level description: Billing Account must not be present both at order header level and order item level.    - code: 112 message: PricingMethod, pricing Reference & pricing term attributes  must not be both at order level and order item level description: Pricing data  must not be present both at order header level and order item level.    - code: 113 message: Referred Serviceability request is expired description: Serviceability information are expired.    - code: 114 message: A reccuring price is mentionned without a charge period. description:     - code: 115 message: Referred Quote is not existing description:     - code: 116 message: Referred ProductOfferingQualification is not existing description:     - code: 117 message: Product /item relationship is missing description:     - code: 118 message: Product Id refered in a relationship is not existing description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public ProductOrder productOrderCreate(@Valid ProductOrderCreate productOrder);

    /**
     * Find a list of product order(s)
     *
     * This operation is used to retrieve one or more product orders based upon filter criteria specified on input.
     *
     */
    @GET
    @Path("/productOrderManagement/v3/productOrder")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Find a list of product order(s)", tags={ "ProductOrder",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOrderSummary.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<ProductOrderSummary> productOrderFind(@QueryParam("buyerId") String buyerId, @QueryParam("sellerId") String sellerId, @QueryParam("state") String state, @QueryParam("buyerRequestedDate.gt") Date buyerRequestedDateGt, @QueryParam("buyerRequestedDate.lt") Date buyerRequestedDateLt, @QueryParam("orderDate.gt") Date orderDateGt, @QueryParam("orderDate.lt") Date orderDateLt, @QueryParam("requestedStartDate.gt") Date requestedStartDateGt, @QueryParam("requestedStartDate.lt") Date requestedStartDateLt, @QueryParam("requestedCompletionDate.gt") Date requestedCompletionDateGt, @QueryParam("requestedCompletionDate.lt") Date requestedCompletionDateLt, @QueryParam("expectedCompletionDate.gt") Date expectedCompletionDateGt, @QueryParam("expectedCompletionDate.lt") Date expectedCompletionDateLt, @QueryParam("completionDate.gt") Date completionDateGt, @QueryParam("completionDate.lt") Date completionDateLt, @QueryParam("orderCancellationDate.gt") Date orderCancellationDateGt, @QueryParam("orderCancellationDate.lt") Date orderCancellationDateLt, @QueryParam("siteName") String siteName, @QueryParam("siteCompanyName") String siteCompanyName, @QueryParam("siteCustomerName") String siteCustomerName, @QueryParam("projectId") String projectId, @QueryParam("externalId") String externalId, @QueryParam("offset") String offset, @QueryParam("limit") String limit);

    /**
     * Get a product order (by id)
     *
     * This operation is used to retrieve a single product order based upon a specified product order id.
     *
     */
    @GET
    @Path("/productOrderManagement/v3/productOrder/{ProductOrderId}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Get a product order (by id)", tags={ "ProductOrder" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOrder.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public ProductOrder productOrderGet(@PathParam("ProductOrderId") String productOrderId);
}

