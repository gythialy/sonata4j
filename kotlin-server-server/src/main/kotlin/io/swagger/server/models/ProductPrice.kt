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
 * Price of the product
 * @param @type A technical attribute to extend the class
 * @param description A narrative that explains in detail the semantics of this product price
 * @param name A short descriptive name such as \"Subscription price\"
 * @param price
 * @param priceType
 * @param recurringChargePeriod
 * @param unitOfMeasure Unit of Measure, if price depends on it (like Gb for example)
 */
data class ProductPrice(
        /* A short descriptive name such as \"Subscription price\" */
        val name: kotlin.String,
        /* A technical attribute to extend the class */
        val type: kotlin.String? = null,
        /* A narrative that explains in detail the semantics of this product price */
        val description: kotlin.String? = null,
        val price: Price? = null,
        val priceType: PriceType? = null,
        val recurringChargePeriod: ChargePeriod? = null,
        /* Unit of Measure, if price depends on it (like Gb for example) */
        val unitOfMeasure: kotlin.String? = null
) {

}

