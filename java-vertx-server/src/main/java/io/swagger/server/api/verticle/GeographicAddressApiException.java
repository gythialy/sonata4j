package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicAddress;
import io.swagger.server.api.MainApiException;

public final class GeographicAddressApiException extends MainApiException {
    public GeographicAddressApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_400_Exception = new GeographicAddressApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_401_Exception = new GeographicAddressApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_403_Exception = new GeographicAddressApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_404_Exception = new GeographicAddressApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_405_Exception = new GeographicAddressApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_422_Exception = new GeographicAddressApiException(422, "Unprocessable entity  Functional error");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_500_Exception = new GeographicAddressApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final GeographicAddressApiException GeographicAddress_geographicAddressGet_503_Exception = new GeographicAddressApiException(503, "Service Unavailable  ");
    

}