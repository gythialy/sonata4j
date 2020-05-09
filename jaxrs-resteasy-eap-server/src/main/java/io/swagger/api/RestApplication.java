package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.GeographicAddressManagementApiServiceImpl;
import io.swagger.api.impl.GeographicSiteManagementApiServiceImpl;
import io.swagger.api.impl.ProductInventoryManagementApiServiceImpl;
import io.swagger.api.impl.ProductOfferingQualificationManagementApiServiceImpl;
import io.swagger.api.impl.ProductOrderManagementApiServiceImpl;
import io.swagger.api.impl.ProductOrderNotificationApiServiceImpl;
import io.swagger.api.impl.QuoteManagementApiServiceImpl;
import io.swagger.api.impl.QuoteNotificationApiServiceImpl;

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