package io.swagger.server.api.verticle;

import io.swagger.server.api.model.CancelProductOrder;
import io.swagger.server.api.model.CancelProductOrderCreate;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;

public final class CancelProductOrderApiException extends MainApiException {
    public CancelProductOrderApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_400_Exception = new CancelProductOrderApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_401_Exception = new CancelProductOrderApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_403_Exception = new CancelProductOrderApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_404_Exception = new CancelProductOrderApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_405_Exception = new CancelProductOrderApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_408_Exception = new CancelProductOrderApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_422_Exception = new CancelProductOrderApiException(422, "Unprocessable entity  Functional error       - code: 100 message: externalId must be provided description:     - code: 101 message: externalId does not match productOrderId description:     - code: 102 message: Product order state is not compliant with this request description:");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_500_Exception = new CancelProductOrderApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderCreate_503_Exception = new CancelProductOrderApiException(503, "Service Unavailable  ");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_400_Exception = new CancelProductOrderApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_401_Exception = new CancelProductOrderApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_403_Exception = new CancelProductOrderApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_404_Exception = new CancelProductOrderApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_405_Exception = new CancelProductOrderApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_408_Exception = new CancelProductOrderApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_422_Exception = new CancelProductOrderApiException(422, "Unprocessable entity  Functional error");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_500_Exception = new CancelProductOrderApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderFind_503_Exception = new CancelProductOrderApiException(503, "Service Unavailable  ");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_400_Exception = new CancelProductOrderApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_401_Exception = new CancelProductOrderApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_403_Exception = new CancelProductOrderApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_404_Exception = new CancelProductOrderApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_405_Exception = new CancelProductOrderApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_408_Exception = new CancelProductOrderApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_422_Exception = new CancelProductOrderApiException(422, "Unprocessable entity  Functional error");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_500_Exception = new CancelProductOrderApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final CancelProductOrderApiException CancelProductOrder_cancelProductOrderGet_503_Exception = new CancelProductOrderApiException(503, "Service Unavailable  ");
    

}