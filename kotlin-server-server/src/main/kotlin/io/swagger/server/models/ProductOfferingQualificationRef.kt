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
 */
package io.swagger.server.models


/**
 * Reference to productOfferingQualification previously done to check requested product serviceability
 * @param @referredType Technical attribute to extend this class
 * @param href Link to the productOfferingQualification
 * @param id Id of the productOfferingQualification
 * @param qualificationItem Id of the item of the productOfferingQualification
 */
data class ProductOfferingQualificationRef(
        /* Id of the productOfferingQualification */
        val id: kotlin.String,
        /* Id of the item of the productOfferingQualification */
        val qualificationItem: kotlin.String,
        /* Technical attribute to extend this class */
        val referredType: kotlin.String? = null,
        /* Link to the productOfferingQualification */
        val href: kotlin.String? = null
) {

}

