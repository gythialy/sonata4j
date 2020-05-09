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

import io.swagger.model.ErrorRepresentation;
import io.swagger.model.GeographicSite;
import io.swagger.model.GeographicSiteFindResp;
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
 * API tests for GeographicSiteApi 
 */
public class GeographicSiteApiTest {


    private GeographicSiteApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://serverRoot/api/mef", GeographicSiteApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * retrieveGeographicSites
     *
     * The Buyer requests that the Seller provides a list of Service Sites known to the Seller based on a set of Site/Address filter criteria.  For each Service Site returned, the Seller also provides a Service Site Identifier, which uniquely identifies this Service Site within the Seller.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geographicSiteFindTest() {
        String status = null;
        String siteCompanyName = null;
        String siteCustomerName = null;
        String siteDescription = null;
        String siteType = null;
        String siteName = null;
        String siteContactName = null;
        String geographicAddressId = null;
        String geographicAddressStreetNr = null;
        String geographicAddressStreetName = null;
        String geographicAddressStreetType = null;
        String geographicAddressCity = null;
        String geographicAddressPostcode = null;
        String geographicAddressCountry = null;
        //List<GeographicSiteFindResp> response = api.geographicSiteFind(status, siteCompanyName, siteCustomerName, siteDescription, siteType, siteName, siteContactName, geographicAddressId, geographicAddressStreetNr, geographicAddressStreetName, geographicAddressStreetType, geographicAddressCity, geographicAddressPostcode, geographicAddressCountry);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * retrieveSite
     *
     * The Buyer requests the full details for a single Service Site based on a Service Site identifier that was previously provided by the Seller. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void geographicSiteGetTest() {
        String siteId = null;
        //GeographicSite response = api.geographicSiteGet(siteId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}