package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.ProductOrder;
import io.swagger.model.ProductOrderCreate;
import io.swagger.model.ProductOrderSummary;

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
public class ProductOrderApiServiceImpl implements ProductOrderApi {
    /**
     * Create a product order
     *
     * This operation is used to create an order. Depending on the order activity, one can \&quot;INSTALL\&quot;, \&quot;CHANGE\&quot;, or \&quot;DISCONNECT\&quot; an associated product.
     *
     */
    public ProductOrder productOrderCreate(ProductOrderCreate productOrder) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find a list of product order(s)
     *
     * This operation is used to retrieve one or more product orders based upon filter criteria specified on input.
     *
     */
    public List<ProductOrderSummary> productOrderFind(String buyerId, String sellerId, String state, Date buyerRequestedDateGt, Date buyerRequestedDateLt, Date orderDateGt, Date orderDateLt, Date requestedStartDateGt, Date requestedStartDateLt, Date requestedCompletionDateGt, Date requestedCompletionDateLt, Date expectedCompletionDateGt, Date expectedCompletionDateLt, Date completionDateGt, Date completionDateLt, Date orderCancellationDateGt, Date orderCancellationDateLt, String siteName, String siteCompanyName, String siteCustomerName, String projectId, String externalId, String offset, String limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get a product order (by id)
     *
     * This operation is used to retrieve a single product order based upon a specified product order id.
     *
     */
    public ProductOrder productOrderGet(String productOrderId) {
        // TODO: Implement...
        
        return null;
    }
    
}

