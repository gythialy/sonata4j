package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicAddressValidation;
import io.swagger.model.GeographicAddressValidationCreate;

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
public class GeographicAddressValidationApiServiceImpl implements GeographicAddressValidationApi {
    /**
     * validate a Geographic Address
     *
     * The Buyer sends Address information known to the Buyer to the Seller.  The Seller re-sponds with a list of Addresses known to the Seller that likely match the Address infor-mation sent by the Buyer.  For each Address returned, the Seller generally also provides an Address Identifier, which uniquely identifies this Address within the Seller.
     *
     */
    public GeographicAddressValidation geographicAddressValidationCreate(GeographicAddressValidationCreate addressValidationRequest) {
        // TODO: Implement...
        
        return null;
    }
    
}

