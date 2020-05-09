package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.model.Hub;
import io.swagger.server.api.model.HubInput;
import io.swagger.server.api.MainApiException;

public final class HubApiException extends MainApiException {
    public HubApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOfferingQualificationManagementHubDelete_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOfferingQualificationManagementHubGet_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOfferingQualificationManagementHubPost_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_productOrderManagementHubCreate_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOrderManagementHubCreate_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOrderManagementHubCreate_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOrderManagementHubCreate_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOrderManagementHubCreate_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_productOrderManagementHubCreate_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOrderManagementHubCreate_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOrderManagementHubCreate_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_productOrderManagementHubCreate_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_productOrderManagementHubDelete_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOrderManagementHubDelete_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOrderManagementHubDelete_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOrderManagementHubDelete_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOrderManagementHubDelete_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_productOrderManagementHubDelete_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOrderManagementHubDelete_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOrderManagementHubDelete_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_productOrderManagementHubDelete_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_productOrderManagementHubFind_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_productOrderManagementHubFind_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_productOrderManagementHubFind_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_productOrderManagementHubFind_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_productOrderManagementHubFind_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_productOrderManagementHubFind_408_Exception = new HubApiException(408, "Request Time-out  List of supported error codes: - 63: Request time-out");
    public static final HubApiException Hub_productOrderManagementHubFind_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_productOrderManagementHubFind_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_productOrderManagementHubFind_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_quoteManagementHubCreate_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_quoteManagementHubCreate_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_quoteManagementHubCreate_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_quoteManagementHubCreate_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_quoteManagementHubCreate_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_quoteManagementHubCreate_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_quoteManagementHubCreate_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_quoteManagementHubCreate_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_quoteManagementHubDelete_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_quoteManagementHubDelete_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_quoteManagementHubDelete_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_quoteManagementHubDelete_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_quoteManagementHubDelete_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_quoteManagementHubDelete_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_quoteManagementHubDelete_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_quoteManagementHubDelete_503_Exception = new HubApiException(503, "Service Unavailable  ");
    public static final HubApiException Hub_quoteManagementHubFind_400_Exception = new HubApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final HubApiException Hub_quoteManagementHubFind_401_Exception = new HubApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final HubApiException Hub_quoteManagementHubFind_403_Exception = new HubApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final HubApiException Hub_quoteManagementHubFind_404_Exception = new HubApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final HubApiException Hub_quoteManagementHubFind_405_Exception = new HubApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final HubApiException Hub_quoteManagementHubFind_422_Exception = new HubApiException(422, "Unprocessable entity  Functional error");
    public static final HubApiException Hub_quoteManagementHubFind_500_Exception = new HubApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final HubApiException Hub_quoteManagementHubFind_503_Exception = new HubApiException(503, "Service Unavailable  ");
    

}