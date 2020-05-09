package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Event;
import io.swagger.model.EventPlus;
import java.util.List;

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
public class NotificationApiServiceImpl implements NotificationApi {
    /**
     * Product Order attribute value change structure
     *
     * Product Order attribute value change structure description
     *
     */
    public void notificationProductOrderAttributeValueChangeNotification(EventPlus productOrderAttributeValueChange) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Product order creation notification structure
     *
     * Product order creation notification structure description
     *
     */
    public void notificationProductOrderCreationNotification(Event productOrderCreationNotification) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Product Order information required structure
     *
     * Product Order information required structure description
     *
     */
    public void notificationProductOrderInformationRequiredNotification(EventPlus productOrderInformationRequired) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Product order state change structure
     *
     * Product order state change structure description
     *
     */
    public void notificationProductOrderStateChangeNotification(Event productOrderStateChange) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Quote attribute value change notification structure
     *
     * Quote attribute value change notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\&quot;:\&quot;/quote/42/quoteItem/3\&quot; is the item #3 of quote #42 Attribute fieldPath allows to target attribute with value changed.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    public void notificationQuoteAttributeValueChangeNotification(List<EventPlus> quoteAttributeValueChangeNotification) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Quote creation notification structure
     *
     * Quote creation notification structure definition  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    public void notificationQuoteCreationNotification(Event quoteCreationNotification) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Quote information required notification structure
     *
     * Quote information required notification structure description. Attribute resourcePatch allows to target quote but also quoteItem - example: resourcePath\&quot;:\&quot;/quote/42/quoteItem/3\&quot; is the item #3 of quote #42 Attribute fieldPath allows to target missing information: fieldPath\&quot;:\&quot;missing&#x3D;quote.relatedParty.Role.value&amp;party.id&#x3D;46\&quot; means role information is missing for party 46.  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    public void notificationQuoteInformationRequiredNotification(List<EventPlus> quoteInformationRequiredNotification) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Quote state change notification structure
     *
     * Quote state change notification structure description  Specific business errors for current operation will be encapsulated in  HTTP Response 422 Unprocessable entity 
     *
     */
    public void notificationQuoteStateChangeNotification(Event quoteStateChangeNotification) {
        // TODO: Implement...
        
        
    }
    
}

