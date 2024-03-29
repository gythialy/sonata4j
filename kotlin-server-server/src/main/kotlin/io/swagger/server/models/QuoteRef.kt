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
 * Quote used before this order to define pricing terms
 * @param @referredType Technical attribute to extend the API
 * @param href Hyperlink to access the quote (using MEF quote API)
 * @param id Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API.
 * @param quoteItem Identifier of the quote item
 */
data class QuoteRef(
        /* Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API. */
        val id: kotlin.String,
        /* Technical attribute to extend the API */
        val referredType: kotlin.String? = null,
        /* Hyperlink to access the quote (using MEF quote API) */
        val href: kotlin.String? = null,
        /* Identifier of the quote item */
        val quoteItem: kotlin.String? = null
) {

}

