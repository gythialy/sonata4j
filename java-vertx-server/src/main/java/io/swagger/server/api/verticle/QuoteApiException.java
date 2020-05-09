package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ChangeQuoteStateResponse;
import io.swagger.server.api.model.ChangelQuoteStateRequest;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.Quote;
import io.swagger.server.api.model.QuoteCreate;
import io.swagger.server.api.model.QuoteFind;

public final class QuoteApiException extends MainApiException {
    public QuoteApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final QuoteApiException Quote_quoteCreate_400_Exception = new QuoteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final QuoteApiException Quote_quoteCreate_401_Exception = new QuoteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final QuoteApiException Quote_quoteCreate_403_Exception = new QuoteApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final QuoteApiException Quote_quoteCreate_404_Exception = new QuoteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final QuoteApiException Quote_quoteCreate_405_Exception = new QuoteApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final QuoteApiException Quote_quoteCreate_422_Exception = new QuoteApiException(422, "Unprocessable entity  Functional error       - code: 101 message: A relatedPartyRole for Buyer role must be provided description:     - code: 103 message: A relatedPartyRole is incomplete (must have partyRole.id or role.id+relatedParty) description:     - code: 104 message: A relatedParty is incomplete (must have a party.id or a party.name) description:     - code: 105 message: Qualification Id provided did not exist or expired description:     - code: 106 message: At least a productOffering Id or a product.id or a productSpec.id must be provided in quote item description:     - code: 107 message: inconsistency between  requestedQuoteCompletionDate and expectedFulfillmentStartDate description:     - code: 108 message: Seller requires agreement under which the buyer is requesting but is missing from the request. description:     - code: 109 message: The agreement provided cannot be validated by the seller description:     - code: 110 message: Product requested is not part of the provided agreement description:     - code: 111 message: Mandatory product/item relationship is missing description:");
    public static final QuoteApiException Quote_quoteCreate_500_Exception = new QuoteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final QuoteApiException Quote_quoteCreate_503_Exception = new QuoteApiException(503, "Service Unavailable  ");
    public static final QuoteApiException Quote_quoteFind_400_Exception = new QuoteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final QuoteApiException Quote_quoteFind_401_Exception = new QuoteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final QuoteApiException Quote_quoteFind_403_Exception = new QuoteApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final QuoteApiException Quote_quoteFind_404_Exception = new QuoteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final QuoteApiException Quote_quoteFind_405_Exception = new QuoteApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final QuoteApiException Quote_quoteFind_422_Exception = new QuoteApiException(422, "Unprocessable entity  Functional error       - code: 100 message: Too many records retrieved - please restrict requested parameter value(s) description:");
    public static final QuoteApiException Quote_quoteFind_500_Exception = new QuoteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final QuoteApiException Quote_quoteFind_503_Exception = new QuoteApiException(503, "Service Unavailable  ");
    public static final QuoteApiException Quote_quoteGet_400_Exception = new QuoteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final QuoteApiException Quote_quoteGet_401_Exception = new QuoteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final QuoteApiException Quote_quoteGet_403_Exception = new QuoteApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final QuoteApiException Quote_quoteGet_404_Exception = new QuoteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final QuoteApiException Quote_quoteGet_405_Exception = new QuoteApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final QuoteApiException Quote_quoteGet_422_Exception = new QuoteApiException(422, "Unprocessable entity  Functional error");
    public static final QuoteApiException Quote_quoteGet_500_Exception = new QuoteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final QuoteApiException Quote_quoteGet_503_Exception = new QuoteApiException(503, "Service Unavailable  ");
    public static final QuoteApiException Quote_quoteRequestStateChange_400_Exception = new QuoteApiException(400, "Bad Request  List of supported error codes: - 20: Invalid URL parameter value - 21: Missing body - 22: Invalid body - 23: Missing body field - 24: Invalid body field - 25: Missing header - 26: Invalid header value - 27: Missing query-string parameter - 28: Invalid query-string parameter value");
    public static final QuoteApiException Quote_quoteRequestStateChange_401_Exception = new QuoteApiException(401, "Unauthorized  List of supported error codes: - 40: Missing credentials - 41: Invalid credentials - 42: Expired credentials");
    public static final QuoteApiException Quote_quoteRequestStateChange_403_Exception = new QuoteApiException(403, "Forbidden  List of supported error codes: - 50: Access denied - 51: Forbidden requester - 52: Forbidden user - 53: Too many requests");
    public static final QuoteApiException Quote_quoteRequestStateChange_404_Exception = new QuoteApiException(404, "Not Found  List of supported error codes: - 60: Resource not found");
    public static final QuoteApiException Quote_quoteRequestStateChange_405_Exception = new QuoteApiException(405, "Method Not Allowed  List of supported error codes: - 61: Method not allowed");
    public static final QuoteApiException Quote_quoteRequestStateChange_422_Exception = new QuoteApiException(422, "Unprocessable entity  Functional error       - code: 100 message: Quote current status is incompatible with requested quote state change description:     - code: 101 message: Quote external Id provided did not match description:");
    public static final QuoteApiException Quote_quoteRequestStateChange_500_Exception = new QuoteApiException(500, "Internal Server Error  List of supported error codes: - 1: Internal error");
    public static final QuoteApiException Quote_quoteRequestStateChange_503_Exception = new QuoteApiException(503, "Service Unavailable  ");
    

}