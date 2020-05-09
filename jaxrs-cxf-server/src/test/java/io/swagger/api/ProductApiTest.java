/**
 * MEF LSO Sonata
 *  A set of APIs based on the LSO Reference Architecture for Serviceability (Address Validation, Site Queries, Product Offering Qualification) | Quoting | Product Inventory | Ordering | Trouble-ticketing Billing | Contract & Catalog  
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import java.util.Date;
import io.swagger.model.ErrorRepresentation;
import io.swagger.model.Product;
import io.swagger.model.ProductSummary;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * MEF LSO Sonata
 *
 * <p> A set of APIs based on the LSO Reference Architecture for Serviceability (Address Validation, Site Queries, Product Offering Qualification) | Quoting | Product Inventory | Ordering | Trouble-ticketing Billing | Contract & Catalog  
 *
 * API tests for ProductApi 
 */
public class ProductApiTest {


    private ProductApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://serverRoot/api/mef", ProductApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * productFind (list) - retrieve product list with summary view
     *
     * The Buyer requests a list of Products from the Seller based on filter criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productFindTest() {
        String buyerId = null;
        String status = null;
        String productSpecificationId = null;
        String productOfferingId = null;
        String buyerProductId = null;
        String geographicalSiteId = null;
        String relatedProductId = null;
        String billingAccountId = null;
        String productOrderId = null;
        Date startDateLt = null;
        Date startDateGt = null;
        Date lastUpdateDateLt = null;
        Date lastUpdateDateGt = null;
        String offset = null;
        String limit = null;
        //List<ProductSummary> response = api.productFind(buyerId, status, productSpecificationId, productOfferingId, buyerProductId, geographicalSiteId, relatedProductId, billingAccountId, productOrderId, startDateLt, startDateGt, lastUpdateDateLt, lastUpdateDateGt, offset, limit);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * productGet (by id) - retrieve one product with all information
     *
     * The Buyer requests the details associated with a single Product based on a Seller Product Identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productGetTest() {
        String productId = null;
        //Product response = api.productGet(productId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
