package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Product;
import io.swagger.model.ProductSummary;

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
public class ProductApiServiceImpl implements ProductApi {
    /**
     * productFind (list) - retrieve product list with summary view
     *
     * The Buyer requests a list of Products from the Seller based on filter criteria.
     *
     */
    public List<ProductSummary> productFind(String buyerId, String status, String productSpecificationId, String productOfferingId, String buyerProductId, String geographicalSiteId, String relatedProductId, String billingAccountId, String productOrderId, Date startDateLt, Date startDateGt, Date lastUpdateDateLt, Date lastUpdateDateGt, String offset, String limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * productGet (by id) - retrieve one product with all information
     *
     * The Buyer requests the details associated with a single Product based on a Seller Product Identifier.
     *
     */
    public Product productGet(String productId) {
        // TODO: Implement...
        
        return null;
    }
    
}

