package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.GeographicSite;
import io.swagger.server.api.model.GeographicSiteFindResp;
import io.swagger.server.api.MainApiException;

public final class GeographicSiteApiException extends MainApiException {
    public GeographicSiteApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_400_Exception = new GeographicSiteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_401_Exception = new GeographicSiteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_404_Exception = new GeographicSiteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_408_Exception = new GeographicSiteApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_422_Exception = new GeographicSiteApiException(422, "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_500_Exception = new GeographicSiteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final GeographicSiteApiException GeographicSite_geographicSiteFind_503_Exception = new GeographicSiteApiException(503, "Service Unavailable  ");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_400_Exception = new GeographicSiteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_401_Exception = new GeographicSiteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_404_Exception = new GeographicSiteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_408_Exception = new GeographicSiteApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_422_Exception = new GeographicSiteApiException(422, "Unprocessable entity  Functional error");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_500_Exception = new GeographicSiteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final GeographicSiteApiException GeographicSite_geographicSiteGet_503_Exception = new GeographicSiteApiException(503, "Service Unavailable  ");
    

}