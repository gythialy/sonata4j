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
 * This structure serves as a request for a product offering qualification. A POQ is a grouping of POQ Items formulated into a request made by a Buyer to a Seller
 * @param @schemaLocation Technical attribute to extend this class
 * @param @type When sub-classing, this defines the sub-class entity name
 * @param instantSyncQualification If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response
 * @param productOfferingQualificationItem
 * @param projectId This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with.
 * @param provideAlternative This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available.
 * @param relatedParty
 * @param requestedResponseDate Corresponds to desiredResponseDate - The date a response for the service request is desired.
 */
data class ProductOfferingQualificationCreate(
        val productOfferingQualificationItem: kotlin.Array<ProductOfferingQualificationItemCreate>,
        val relatedParty: kotlin.Array<RelatedParty>,
        /* Technical attribute to extend this class */
        val schemaLocation: kotlin.String? = null,
        /* When sub-classing, this defines the sub-class entity name */
        val type: kotlin.String? = null,
        /* If this flag is set to Yes, Buyer requests to have instant qualification to be provided in operation POST response */
        val instantSyncQualification: kotlin.Boolean? = null,
        /* This value MAY be assigned by the Buyer/Seller to identify a project the qualification request is associated with. */
        val projectId: kotlin.String? = null,
        /* This Boolean allows requester (buyer) to indicate if he is willing to get alternate proposal if requested product not available. */
        val provideAlternative: kotlin.Boolean? = null,
        /* Corresponds to desiredResponseDate - The date a response for the service request is desired. */
        val requestedResponseDate: java.time.LocalDateTime? = null
) {

}

