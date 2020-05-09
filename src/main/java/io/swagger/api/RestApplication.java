package io.swagger.api;

import io.swagger.api.impl.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(GeographicAddressManagementApiServiceImpl.class);
        resources.add(GeographicSiteManagementApiServiceImpl.class);
        resources.add(ProductInventoryManagementApiServiceImpl.class);
        resources.add(ProductOfferingQualificationManagementApiServiceImpl.class);
        resources.add(ProductOrderManagementApiServiceImpl.class);
        resources.add(ProductOrderNotificationApiServiceImpl.class);
        resources.add(QuoteManagementApiServiceImpl.class);
        resources.add(QuoteNotificationApiServiceImpl.class);

        return resources;
    }


}
