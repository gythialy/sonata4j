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
 * Quote Summary view is provided in the response of the GET(LIST) quote. Only a subset of information are provided.
 * @param description Description of the quote
 * @param effectiveQuoteCompletionDate Date when the quoted was Cancelled or Rejected or Accepted
 * @param expectedQuoteCompletionDate This is the date filled by the seller to indicate expected quote completion date.
 * @param externalId ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
 * @param href Hyperlink to access the quote
 * @param id ID attributed by quoting system
 * @param projectId This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with.
 * @param quoteDate Date when the quote was created
 * @param quoteLevel
 * @param requestedQuoteCompletionDate This is the date wished by the requester to have the quote completed (meaning priced)
 * @param state
 */
data class QuoteFind(
        /* This is the date wished by the requester to have the quote completed (meaning priced) */
        val requestedQuoteCompletionDate: java.time.LocalDateTime,
        /* Description of the quote */
        val description: kotlin.String? = null,
        /* Date when the quoted was Cancelled or Rejected or Accepted */
        val effectiveQuoteCompletionDate: java.time.LocalDateTime? = null,
        /* This is the date filled by the seller to indicate expected quote completion date. */
        val expectedQuoteCompletionDate: java.time.LocalDateTime? = null,
        /* ID given by the consumer and only understandable by him (to facilitate his searches afterwards) */
        val externalId: kotlin.String? = null,
        /* Hyperlink to access the quote */
        val href: kotlin.String? = null,
        /* ID attributed by quoting system */
        val id: kotlin.String? = null,
        /* This value MAY be assigned by the Buyer/Seller to identify a project the quoting request is associated with. */
        val projectId: kotlin.String? = null,
        /* Date when the quote was created */
        val quoteDate: java.time.LocalDateTime? = null,
        val quoteLevel: QuoteLevel? = null,
        val state: QuoteStateType? = null
) {

}

