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
 * A party role (not a party) playing a role for this quote or quote Item.
 * @param @referredType Referred type for this party role Technical attribute
 * @param id id of the party role
 * @param relatedParty
 * @param role Role played for this party role. Could be 'buyer’, ‘seller’ for example.
 */
data class RelatedPartyRole(
        val relatedParty: RelatedParty,
        /* Role played for this party role. Could be 'buyer’, ‘seller’ for example. */
        val role: kotlin.String,
        /* Referred type for this party role Technical attribute */
        val referredType: kotlin.String? = null,
        /* id of the party role */
        val id: kotlin.String? = null
) {

}
