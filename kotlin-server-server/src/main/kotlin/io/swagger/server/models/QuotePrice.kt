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
 * Description of price and discount awarded.
 * @param @type Indicates the base (class) type of the quote price
 * @param description Description of the quote/quote item price.
 * @param name Name of the quote /quote item price
 * @param price
 * @param priceType
 * @param recurringChargePeriod
 */
data class QuotePrice(
        /* Name of the quote /quote item price */
        val name: kotlin.String,
        val price: Price,
        val priceType: PriceType,
        /* Indicates the base (class) type of the quote price */
        val type: kotlin.String? = null,
        /* Description of the quote/quote item price. */
        val description: kotlin.String? = null,
        val recurringChargePeriod: ChargePeriod? = null
) {

}

