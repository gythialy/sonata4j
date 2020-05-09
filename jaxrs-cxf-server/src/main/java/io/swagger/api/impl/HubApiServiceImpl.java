package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Hub;
import io.swagger.model.HubInput;

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
public class HubApiServiceImpl implements HubApi {
    /**
     * hubDelete
     *
     * This operation is used to delete a hub.
     *
     */
    public void productOfferingQualificationManagementHubDelete(String hubId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * hubFind
     *
     * This operation retrieves a set of hubs.
     *
     */
    public List<Hub> productOfferingQualificationManagementHubGet() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * hubCreate
     *
     * A request initiated by the Buyer to instruct the Seller to send notifications of POQ state changes in the event the Seller uses the Deferred Response pattern to respond to a Create Product Offering Qualifica-tion request.
     *
     */
    public Hub productOfferingQualificationManagementHubPost(HubInput hub) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create a Hub
     *
     * Structure used to create a hub (to subscribe to notification)
     *
     */
    public Hub productOrderManagementHubCreate(HubInput hub) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Delete a Hub
     *
     * Delete Hub
     *
     */
    public void productOrderManagementHubDelete(String hubId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Find a list of Hub
     *
     * Find Hub
     *
     */
    public List<Hub> productOrderManagementHubFind() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Register a listener
     *
     * Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics
     *
     */
    public Hub quoteManagementHubCreate(HubInput hub) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Unregister a listener
     *
     * Clears the communication endpoint address that was set by creating the Hub
     *
     */
    public void quoteManagementHubDelete(String hubId) {
        // TODO: Implement...
        
        
    }
    
    /**
     * listHub
     *
     * Retrieve hub(s)
     *
     */
    public List<Hub> quoteManagementHubFind(String fields) {
        // TODO: Implement...
        
        return null;
    }
    
}

