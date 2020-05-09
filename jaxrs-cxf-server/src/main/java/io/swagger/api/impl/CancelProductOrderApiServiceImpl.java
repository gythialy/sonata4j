package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.CancelProductOrder;
import io.swagger.model.CancelProductOrderCreate;
import io.swagger.model.ErrorRepresentation;

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
public class CancelProductOrderApiServiceImpl implements CancelProductOrderApi {
    /**
     * Create product order cancellation request
     *
     * This operation allows buyer to request a product order cancellation request 
     *
     */
    public CancelProductOrder cancelProductOrderCreate(CancelProductOrderCreate cancelProductOrder) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find a lost of product order cancellation request(s)
     *
     * This operation allows buyer to retrieve a list of product order cancellation request
     *
     */
    public List<CancelProductOrder> cancelProductOrderFind(String productOrderId, String productOrderExternalId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get a product order cancellation request (by id)
     *
     * This operation allows buyer to retrieve one product order cancellation request
     *
     */
    public CancelProductOrder cancelProductOrderGet(String cancelProductOrderId) {
        // TODO: Implement...
        
        return null;
    }
    
}

