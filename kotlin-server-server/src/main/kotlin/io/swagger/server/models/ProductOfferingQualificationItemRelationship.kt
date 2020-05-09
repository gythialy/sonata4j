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
 * The relationship between product offering qualification items that can be used to validate business rules between POQ Items
 * @param id id of the targeted POQ item
 * @param type
 */
data class ProductOfferingQualificationItemRelationship(
        /* id of the targeted POQ item */
        val id: kotlin.String,
        val type: RelationshipType
) {

}

