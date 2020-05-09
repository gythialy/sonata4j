package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.ProductOfferingQualification;
import io.swagger.model.ProductOfferingQualificationCreate;
import io.swagger.model.ProductOfferingQualificationFind;

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
public class ProductOfferingQualificationApiServiceImpl implements ProductOfferingQualificationApi {
    /**
     * Create a ProductOfferingQualification
     *
     * A request initiated by the Buyer to determine whether the Seller can feasibly deliver a particular Product (or Products) to a specific set of geographic locations specified by a set of Site/Address filter criteria. The Seller also provides estimated time intervals to complete these deliveries. 
     *
     */
    public ProductOfferingQualification productOfferingQualificationCreate(ProductOfferingQualificationCreate productOfferingQualification) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Retrieve a list of ProductOfferingQualifications based on a set of criteria
     *
     * The Buyer requests a list of POQs (in any state) from the Seller based on a set of POQ filter criteria.  For each POQ returned, the Seller also provides a POQ Identifier that uniquely identifies this POQ within the Seller. 
     *
     */
    public List<ProductOfferingQualificationFind> productOfferingQualificationFind(String state, String projectId, Date requestedResponseDateGt, Date requestedResponseDateLt, String offset, String limit) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get a ProductOfferingQualification based on its id
     *
     * The Buyer requests the full details of a single Product Offering Qualification based on a POQ identifier. 
     *
     */
    public ProductOfferingQualification productOfferingQualificationGet(String productOfferingQualificationId) {
        // TODO: Implement...
        
        return null;
    }
    
}

