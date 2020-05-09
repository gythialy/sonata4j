package io.swagger.api;

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;
import java.util.List;

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
public interface NotificationApi  {

    /**
     * Product Order attribute value change structure
     *
     * Product Order attribute value change structure description
     *
     */
    @POST
    @Path("/productOrderNotification/v3/notification/productOrderAttributeValueChangeNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Product Order attribute value change structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationProductOrderAttributeValueChangeNotification(@Valid EventPlus productOrderAttributeValueChange);

    /**
     * Product order creation notification structure
     *
     * Product order creation notification structure description
     *
     */
    @POST
    @Path("/productOrderNotification/v3/notification/productOrderCreationNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Product order creation notification structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationProductOrderCreationNotification(@Valid Event productOrderCreationNotification);

    /**
     * Product Order information required structure
     *
     * Product Order information required structure description
     *
     */
    @POST
    @Path("/productOrderNotification/v3/notification/productOrderInformationRequiredNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Product Order information required structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationProductOrderInformationRequiredNotification(@Valid EventPlus productOrderInformationRequired);

    /**
     * Product order state change structure
     *
     * Product order state change structure description
     *
     */
    @POST
    @Path("/productOrderNotification/v3/notification/productOrderStateChangeNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Product order state change structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 408, message = "Request Time-out  List of supported error codes: - 63: Request time-out", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationProductOrderStateChangeNotification(@Valid Event productOrderStateChange);

    /**
     * Quote attribute value change notification structure
     *
     * Quote attribute value change notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\&quot;:\&quot;/quote/42/quoteItem/3\&quot; is the item #3 of quote #42 Attribute fieldPath allows to target attribute with value changed.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    @POST
    @Path("/quoteNotification/v1/quoteNotification/v1/notification/quoteAttributeValueChangeNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Quote attribute value change notification structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationQuoteAttributeValueChangeNotification(@Valid List<EventPlus> quoteAttributeValueChangeNotification);

    /**
     * Quote creation notification structure
     *
     * Quote creation notification structure definition  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    @POST
    @Path("/quoteNotification/v1/notification/quoteCreationNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Quote creation notification structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationQuoteCreationNotification(@Valid Event quoteCreationNotification);

    /**
     * Quote information required notification structure
     *
     * Quote information required notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\&quot;:\&quot;/quote/42/quoteItem/3\&quot; is the item #3 of quote #42 Attribute fieldPath allows to target missing information: fieldPath\&quot;:\&quot;missing&#x3D;quote.relatedParty.Role.value&amp;party.id&#x3D;46\&quot; means role information is missing for party 46.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    @POST
    @Path("/quoteNotification/v1/quoteNotification/v1/notification/quoteInformationRequiredNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Quote information required notification structure", tags={ "Notification",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationQuoteInformationRequiredNotification(@Valid List<EventPlus> quoteInformationRequiredNotification);

    /**
     * Quote state change notification structure
     *
     * Quote state change notification structure description  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    @POST
    @Path("/quoteNotification/v1/notification/quoteStateChangeNotification")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Quote state change notification structure", tags={ "Notification" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 400, message = "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value", response = ErrorRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials", response = ErrorRepresentation.class),
        @ApiResponse(code = 403, message = "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests", response = ErrorRepresentation.class),
        @ApiResponse(code = 404, message = "Not Found  List of supported error codes: - 60: Resource not found", response = ErrorRepresentation.class),
        @ApiResponse(code = 405, message = "Method Not Allowed  List of supported error codes: - 61: Method not allowed", response = ErrorRepresentation.class),
        @ApiResponse(code = 422, message = "Unprocessable entity  Functional error", response = ErrorRepresentation.class),
        @ApiResponse(code = 500, message = "Internal Server Error  List of supported error codes: - 1: Internal error", response = ErrorRepresentation.class),
        @ApiResponse(code = 503, message = "Service Unavailable  ", response = ErrorRepresentation.class) })
    public void notificationQuoteStateChangeNotification(@Valid Event quoteStateChangeNotification);
}

