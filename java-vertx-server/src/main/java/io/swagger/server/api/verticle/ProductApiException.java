package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.Product;
import io.swagger.server.api.model.ProductSummary;

public final class ProductApiException extends MainApiException {
    public ProductApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final ProductApiException Product_productFind_400_Exception = new ProductApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final ProductApiException Product_productFind_401_Exception = new ProductApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final ProductApiException Product_productFind_403_Exception = new ProductApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final ProductApiException Product_productFind_404_Exception = new ProductApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final ProductApiException Product_productFind_422_Exception = new ProductApiException(422, "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:     - code: 103 message: Incomplete request - If place.id is filled, place.type must be filled description:     - code: 104 message: Incomplete request - If place.type is filled, place.id must be filled description:     - code: 105 message: Incomplete request - If partyRole.role is filled, partyRole.relatedPartyId must be filled description:     - code: 106 message: Incomplete request - If partyRole.relatedPartyId is filled, partyRole.role must be filled description:");
    public static final ProductApiException Product_productFind_503_Exception = new ProductApiException(503, "Service Unavailable  ");
    public static final ProductApiException Product_productGet_400_Exception = new ProductApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final ProductApiException Product_productGet_401_Exception = new ProductApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final ProductApiException Product_productGet_403_Exception = new ProductApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final ProductApiException Product_productGet_404_Exception = new ProductApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final ProductApiException Product_productGet_422_Exception = new ProductApiException(422, "Unprocessable entity  Functional error");
    public static final ProductApiException Product_productGet_503_Exception = new ProductApiException(503, "Service Unavailable  ");
    

}