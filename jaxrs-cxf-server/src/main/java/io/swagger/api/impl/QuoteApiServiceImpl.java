package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ChangeQuoteStateResponse;
import io.swagger.model.ChangelQuoteStateRequest;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Quote;
import io.swagger.model.QuoteCreate;
import io.swagger.model.QuoteFind;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * MEF LSO Sonata
 *
 * <p> A set of APIs based on the LSO Reference Architecture for Serviceability (Address Validation, Site Queries, Product Offering Qualification) | Quoting | Product Inventory | Ordering | Trouble-ticketing Billing | Contract & Catalog  
 *
 */
public class QuoteApiServiceImpl implements QuoteApi {
    /**
     * Create a quote
     *
     * This operation is used to create a new quote.
     *
     */
    public Quote quoteCreate(QuoteCreate quote) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * List quotes
     *
     * This operation is used to retrieve quote information using filter criteria.
     *
     */
    public List<QuoteFind> quoteFind(String externalId, String state, String quoteLevel, String projectId, Date quoteDateGt, Date quoteDateLt, Date quoteCompletionDateGt, Date quoteCompletionDateLt, String offset, String limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Retrieve a quote
     *
     * This operation is used to retrieve quote information using the ID.
     *
     */
    public Quote quoteGet(String id) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * request a quote state change
     *
     * Request from buyer to cancel or reject a quote. When seller receive cancel request, seller will shift quote state to CANCELLED (no change on order item state) When seller receive reject request, seller will shift quote state to REJECTED (no change on order item state)
     *
     */
    public ChangeQuoteStateResponse quoteRequestStateChange(ChangelQuoteStateRequest changeQuoteStateRequest) {
        // TODO: Implement...
        
        return null;
    }
    
}

