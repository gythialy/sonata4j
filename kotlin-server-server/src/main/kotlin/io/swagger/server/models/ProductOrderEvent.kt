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
 * ProductOrder structure used for notification
 * @param @baseType
 * @param @schemaLocation
 * @param @type
 * @param completionDate The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
 * @param expectedCompletionDate Expected delivery date amended by the provider
 * @param externalId A number that uniquely identifies an order within the buyer's enterprise.
 * @param id Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted.
 * @param note
 * @param orderItem
 * @param orderMessage
 * @param orderVersion The version number that the Buyer uses to refer to this particular version of the order
 * @param projectId An identifier that is used to group Orders that represent a unit of functionality that is important to a Buyer.  A Project can be used to relate multiple Orders together.
 * @param relatedParty
 * @param requestedCompletionDate Identifies the buyer's desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
 * @param requestedStartDate The buyer's requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
 * @param state
 */
data class ProductOrderEvent(
        /* A number that uniquely identifies an order within the buyer's enterprise. */
        val externalId: kotlin.String,
        /* Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted. */
        val id: kotlin.String,
        val orderItem: kotlin.Array<OrderItemEvent>,
        /* The version number that the Buyer uses to refer to this particular version of the order */
        val orderVersion: kotlin.String,
        val relatedParty: kotlin.Array<RelatedParty>,
        /* Identifies the buyer's desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00). */
        val requestedCompletionDate: java.time.LocalDateTime,
        val state: ProductOrderStateType,
        val baseType: kotlin.String? = null,
        val schemaLocation: kotlin.String? = null,
        val type: kotlin.String? = null,
        /* The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00) */
        val completionDate: java.time.LocalDateTime? = null,
        /* Expected delivery date amended by the provider */
        val expectedCompletionDate: java.time.LocalDateTime? = null,
        val note: kotlin.Array<Note>? = null,
        val orderMessage: kotlin.Array<OrderMessage>? = null,
        /* An identifier that is used to group Orders that represent a unit of functionality that is important to a Buyer.  A Project can be used to relate multiple Orders together. */
        val projectId: kotlin.String? = null,
        /* The buyer's requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00). */
        val requestedStartDate: java.time.LocalDateTime? = null
) {

}
