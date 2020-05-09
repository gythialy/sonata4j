package io.swagger.server.api.verticle;

import io.swagger.server.api.model.ChangeQuoteStateResponse;
import io.swagger.server.api.model.ChangelQuoteStateRequest;
import io.swagger.server.api.model.ErrorRepresentation;
import io.swagger.server.api.MainApiException;
import java.time.OffsetDateTime;
import io.swagger.server.api.model.Quote;
import io.swagger.server.api.model.QuoteCreate;
import io.swagger.server.api.model.QuoteFind;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface QuoteApi  {
    //quoteCreate
    void quoteCreate(QuoteCreate quote, Handler<AsyncResult<Quote>> handler);
    
    //quoteFind
    void quoteFind(String externalId, String state, String quoteLevel, String projectId, OffsetDateTime quoteDateGt, OffsetDateTime quoteDateLt, OffsetDateTime quoteCompletionDateGt, OffsetDateTime quoteCompletionDateLt, String offset, String limit, Handler<AsyncResult<List<QuoteFind>>> handler);
    
    //quoteGet
    void quoteGet(String id, Handler<AsyncResult<Quote>> handler);
    
    //quoteRequestStateChange
    void quoteRequestStateChange(ChangelQuoteStateRequest changeQuoteStateRequest, Handler<AsyncResult<ChangeQuoteStateResponse>> handler);
    
}
