package io.swagger.api;

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicSite;
import io.swagger.model.GeographicSiteFindResp;

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
public interface GeographicSiteApi  {

    /**
     * retrieveGeographicSites
     *
     * The Buyer requests that the Seller provides a list of Service Sites known to the Seller based on a set of Site/Address filter criteria.  For each Service Site returned, the Seller also provides a Service Site Identifier, which uniquely identifies this Service Site within the Seller.
     *
     */
    @GET
    @Path("/geographicSiteManagement/v3/geographicSite")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "retrieveGeographicSites", tags={ "GeographicSite",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = GeographicSiteFindResp.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public List<GeographicSiteFindResp> geographicSiteFind(@QueryParam("status") String status, @QueryParam("siteCompanyName") String siteCompanyName, @QueryParam("siteCustomerName") String siteCustomerName, @QueryParam("siteDescription") String siteDescription, @QueryParam("siteType") String siteType, @QueryParam("siteName") String siteName, @QueryParam("siteContactName") String siteContactName, @QueryParam("geographicAddress.id") String geographicAddressId, @QueryParam("geographicAddress.streetNr") String geographicAddressStreetNr, @QueryParam("geographicAddress.streetName") String geographicAddressStreetName, @QueryParam("geographicAddress.streetType") String geographicAddressStreetType, @QueryParam("geographicAddress.city") String geographicAddressCity, @QueryParam("geographicAddress.postcode") String geographicAddressPostcode, @QueryParam("geographicAddress.country") String geographicAddressCountry);

    /**
     * retrieveSite
     *
     * The Buyer requests the full details for a single Service Site based on a Service Site identifier that was previously provided by the Seller. 
     *
     */
    @GET
    @Path("/geographicSiteManagement/v3/geographicSite/{SiteId}")
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "retrieveSite", tags={ "GeographicSite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = GeographicSite.class),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public GeographicSite geographicSiteGet(@PathParam("SiteId") String siteId);
}

