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
 * The commercial and technical details of a Product sold by a particular Seller.  A Product Offering defines all of the commercial terms and, through association with a particular Product Specification, defines all the technical attributes and behaviors of the Product. A Product Offering may constrain the allowable set of configurable technical attributes and/or behaviors specified in the associated Product Specification
 * @param id A unique product offering identifier. This identifier is provided by the seller and communicated to the buyer during the on-boarding process.
 */
data class ProductOfferingRef(
        /* A unique product offering identifier. This identifier is provided by the seller and communicated to the buyer during the on-boarding process. */
        val id: kotlin.String
) {

}
