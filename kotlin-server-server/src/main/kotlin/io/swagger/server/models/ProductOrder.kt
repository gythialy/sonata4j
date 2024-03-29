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
 * A ProductOrder is a type of business interaction that is used to procure a Product based upon a Product Offering.
 * @param @baseType Technical attribute to extend the API
 * @param @schemaLocation Technical attribute to extend the API
 * @param @type Technical attribute to extend the API
 * @param billingAccount
 * @param buyerRequestDate Buyer order creation date. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
 * @param cancellationDate Identifies the date the Seller canceled the Order
 * @param cancellationReason Indicates reason why buyer requested cancellation
 * @param completionDate The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
 * @param desiredResponses
 * @param expectedCompletionDate Expected delivery date amended by the provider
 * @param expeditePriority Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.
 * @param externalId A number that uniquely identifies an order within the buyer's enterprise.
 * @param href Hyperlink to access the order
 * @param id Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted.
 * @param note
 * @param orderActivity
 * @param orderDate Date when the order was created by seller. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00)
 * @param orderItem
 * @param orderMessage
 * @param orderVersion The version number that the Buyer uses to refer to this particular version of the order
 * @param pricingMethod
 * @param pricingReference The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.
 * @param pricingTerm The length of the contract in months.
 * @param priority An integer that specifies that expedited treatment is to be provided in a specific priority. This field will be ignored if the Expedite/Priority Indicator is False. The valid values and the business/operational rules for this field will be defined by the Seller as part of the contracting or on-boarding process.
 * @param projectId An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together
 * @param relatedBuyerPON Related Buyer Purchase Order Number (RPON)
 * @param relatedParty
 * @param requestedCompletionDate Identifies the buyer's desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
 * @param requestedStartDate The buyer's requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00).
 * @param state
 * @param stateChange
 * @param tspRestorationPriority Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook, The valid values are defined in ATIS OBF document: ATIS-0404001
 */
data class ProductOrder(
        val desiredResponses: DesiredOrderResponses,
        /* A number that uniquely identifies an order within the buyer's enterprise. */
        val externalId: kotlin.String,
        /* Hyperlink to access the order */
        val href: kotlin.String,
        /* Unique (within the ordering domain) identifier for the order that is generated by the seller when the order is initially accepted. */
        val id: kotlin.String,
        val orderActivity: OrderActivity,
        /* Date when the order was created by seller. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00) */
        val orderDate: java.time.LocalDateTime,
        val orderItem: kotlin.Array<OrderItem>,
        /* The version number that the Buyer uses to refer to this particular version of the order */
        val orderVersion: kotlin.String,
        val relatedParty: kotlin.Array<RelatedParty>,
        /* Identifies the buyer's desired due date (requested delivery date). Cannot be requested on cancelled orders.  Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00). */
        val requestedCompletionDate: java.time.LocalDateTime,
        val state: ProductOrderStateType,
        /* Technical attribute to extend the API */
        val baseType: kotlin.String? = null,
        /* Technical attribute to extend the API */
        val schemaLocation: kotlin.String? = null,
        /* Technical attribute to extend the API */
        val type: kotlin.String? = null,
        val billingAccount: BillingAccountRef? = null,
        /* Buyer order creation date. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00) */
        val buyerRequestDate: java.time.LocalDateTime? = null,
        /* Identifies the date the Seller canceled the Order */
        val cancellationDate: java.time.LocalDateTime? = null,
        /* Indicates reason why buyer requested cancellation */
        val cancellationReason: kotlin.String? = null,
        /* The date the order is completed. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00) */
        val completionDate: java.time.LocalDateTime? = null,
        /* Expected delivery date amended by the provider */
        val expectedCompletionDate: java.time.LocalDateTime? = null,
        /* Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer. */
        val expeditePriority: kotlin.Boolean? = null,
        val note: kotlin.Array<Note>? = null,
        val orderMessage: kotlin.Array<OrderMessage>? = null,
        val pricingMethod: PricingMethod? = null,
        /* The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id. */
        val pricingReference: kotlin.String? = null,
        /* The length of the contract in months. */
        val pricingTerm: kotlin.Int? = null,
        /* An integer that specifies that expedited treatment is to be provided in a specific priority. This field will be ignored if the Expedite/Priority Indicator is False. The valid values and the business/operational rules for this field will be defined by the Seller as part of the contracting or on-boarding process. */
        val priority: kotlin.Int? = null,
        /* An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together */
        val projectId: kotlin.String? = null,
        /* Related Buyer Purchase Order Number (RPON) */
        val relatedBuyerPON: kotlin.String? = null,
        /* The buyer's requested date that order processing should start. Format is YYYY-MM-DDThh:mmTZD (e.g. 1997-07-16T19:20+01:00). */
        val requestedStartDate: java.time.LocalDateTime? = null,
        val stateChange: kotlin.Array<StateChange>? = null,
        /* Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook, The valid values are defined in ATIS OBF document: ATIS-0404001 */
        val tspRestorationPriority: kotlin.String? = null
) {

}

