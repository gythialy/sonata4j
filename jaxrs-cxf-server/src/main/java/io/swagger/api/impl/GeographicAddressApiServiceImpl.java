package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicAddress;

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
public class GeographicAddressApiServiceImpl implements GeographicAddressApi {
    /**
     * retrieveAddress
     *
     * The Buyer requests the full details of a single Address based on an Address identifier that was previously provided by the Seller.
     *
     */
    public GeographicAddress geographicAddressGet(String geographicAddressId) {
        // TODO: Implement...
        
        return null;
    }
    
}

