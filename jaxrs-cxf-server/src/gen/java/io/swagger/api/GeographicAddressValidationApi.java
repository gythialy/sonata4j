package io.swagger.api;

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicAddressValidation;
import io.swagger.model.GeographicAddressValidationCreate;

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
public interface GeographicAddressValidationApi  {

    /**
     * validate a Geographic Address
     *
     * The Buyer sends Address information known to the Buyer to the Seller.  The Seller re-sponds with a list of Addresses known to the Seller that likely match the Address infor-mation sent by the Buyer.  For each Address returned, the Seller generally also provides an Address Identifier, which uniquely identifies this Address within the Seller.
     *
     */
    @POST
    @Path("/geographicAddressManagement/v3/geographicAddressValidation")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "validate a Geographic Address", tags={ "GeographicAddressValidation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = GeographicAddressValidation.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many addresses match - please re-try with more attribute values restriction description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public GeographicAddressValidation geographicAddressValidationCreate(@Valid GeographicAddressValidationCreate addressValidationRequest);
}

