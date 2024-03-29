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
 * A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.
 * @param describing
 * @param id A unique identifier of the product spec.
 */
data class ProductSpecificationRef(
        /* A unique identifier of the product spec. */
        val id: kotlin.String,
        val describing: Describing? = null
) {

}

