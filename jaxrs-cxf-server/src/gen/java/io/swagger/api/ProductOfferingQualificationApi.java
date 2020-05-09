package io.swagger.api;

import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.ProductOfferingQualification;
import io.swagger.model.ProductOfferingQualificationCreate;
import io.swagger.model.ProductOfferingQualificationFind;

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
public interface ProductOfferingQualificationApi  {

    /**
     * Create a ProductOfferingQualification
     *
     * A request initiated by the Buyer to determine whether the Seller can feasibly deliver a particular Product (or Products) to a specific set of geographic locations specified by a set of Site/Address filter criteria. The Seller also provides estimated time intervals to complete these deliveries. 
     *
     */
    @POST
    @Path("/productOfferingQualificationManagement/v3/productOfferingQualification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create a ProductOfferingQualification", tags={ "ProductOfferingQualification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductOfferingQualification.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: A relatedParty - at productOfferingQualification level - with a role 'Buyer' must be provided (including contact information) description:     - code: 101 message: A least a productOffering OR a productSpecification OR a Product must be provided for a POQItem description:     - code: 102 message: Provided Product Offering Identifier is unknown description:     - code: 103 message: Provided Product Specification Identifier is unknown description:     - code: 104 message: Provided Product Identifier is unknown description:     - code: 105 message: The place information provided are invalid description:     - code: 106 message: A least one date provided is invalid description:     - code: 107 message: Incorrect related party role provided description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public ProductOfferingQualification productOfferingQualificationCreate(@Valid ProductOfferingQualificationCreate productOfferingQualification);

    /**
     * Retrieve a list of ProductOfferingQualifications based on a set of criteria
     *
     * The Buyer requests a list of POQs (in any state) from the Seller based on a set of POQ filter criteria.  For each POQ returned, the Seller also provides a POQ Identifier that uniquely identifies this POQ within the Seller. 
     *
     */
    @GET
    @Path("/productOfferingQualificationManagement/v3/productOfferingQualification")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Retrieve a list of ProductOfferingQualifications based on a set of criteria", tags={ "ProductOfferingQualification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOfferingQualificationFind.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<ProductOfferingQualificationFind> productOfferingQualificationFind(@QueryParam("state") String state, @QueryParam("projectId") String projectId, @QueryParam("requestedResponseDate.gt") Date requestedResponseDateGt, @QueryParam("requestedResponseDate.lt") Date requestedResponseDateLt, @QueryParam("offset") String offset, @QueryParam("limit") String limit);

    /**
     * Get a ProductOfferingQualification based on its id
     *
     * The Buyer requests the full details of a single Product Offering Qualification based on a POQ identifier. 
     *
     */
    @GET
    @Path("/productOfferingQualificationManagement/v3/productOfferingQualification/{ProductOfferingQualificationId}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Get a ProductOfferingQualification based on its id", tags={ "ProductOfferingQualification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = ProductOfferingQualification.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public ProductOfferingQualification productOfferingQualificationGet(@PathParam("ProductOfferingQualificationId") String productOfferingQualificationId);
}

