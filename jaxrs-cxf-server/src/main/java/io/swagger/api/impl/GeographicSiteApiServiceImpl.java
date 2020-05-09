package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicSite;
import io.swagger.model.GeographicSiteFindResp;

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
public class GeographicSiteApiServiceImpl implements GeographicSiteApi {
    /**
     * retrieveGeographicSites
     *
     * The Buyer requests that the Seller provides a list of Service Sites known to the Seller based on a set of Site/Address filter criteria.  For each Service Site returned, the Seller also provides a Service Site Identifier, which uniquely identifies this Service Site within the Seller.
     *
     */
    public List<GeographicSiteFindResp> geographicSiteFind(String status, String siteCompanyName, String siteCustomerName, String siteDescription, String siteType, String siteName, String siteContactName, String geographicAddressId, String geographicAddressStreetNr, String geographicAddressStreetName, String geographicAddressStreetType, String geographicAddressCity, String geographicAddressPostcode, String geographicAddressCountry) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * retrieveSite
     *
     * The Buyer requests the full details for a single Service Site based on a Service Site identifier that was previously provided by the Seller. 
     *
     */
    public GeographicSite geographicSiteGet(String siteId) {
        // TODO: Implement...
        
        return null;
    }
    
}

