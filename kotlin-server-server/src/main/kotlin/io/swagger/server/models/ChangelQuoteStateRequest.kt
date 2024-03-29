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
 * Structure used to request quote cancellation/rejection
 * @param externalId External Id of the quote (buyer quote id). If provided seller will check consistence.
 * @param id id of the quote to be cancelled
 * @param quoteChangeStateReason Cancellation reason
 * @param state
 */
data class ChangelQuoteStateRequest(
        /* id of the quote to be cancelled */
        val id: kotlin.String,
        /* Cancellation reason */
        val quoteChangeStateReason: kotlin.String,
        val state: QuoteChangeState,
        /* External Id of the quote (buyer quote id). If provided seller will check consistence. */
        val externalId: kotlin.String? = null
) {

}

