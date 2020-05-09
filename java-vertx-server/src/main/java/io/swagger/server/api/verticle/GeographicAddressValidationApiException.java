package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddressValidation;
import io.swagger.server.api.model.GeographicAddressValidationCreate;
import io.swagger.server.api.MainApiException;

public final class GeographicAddressValidationApiException extends MainApiException {
    public GeographicAddressValidationApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_400_Exception = new GeographicAddressValidationApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_401_Exception = new GeographicAddressValidationApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_403_Exception = new GeographicAddressValidationApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_404_Exception = new GeographicAddressValidationApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_405_Exception = new GeographicAddressValidationApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_422_Exception = new GeographicAddressValidationApiException(422, "Unprocessable entity  Functional error       - code: 100 message: Too many addresses match - please re-try with more attribute values restriction description:");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_500_Exception = new GeographicAddressValidationApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final GeographicAddressValidationApiException GeographicAddressValidation_geographicAddressValidationCreate_503_Exception = new GeographicAddressValidationApiException(503, "Service Unavailable  ");
    

}