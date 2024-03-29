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
 *
 * @param @schemaLocation Target a description file of productOrder extension
 * @param @type Type of productOrder
 * @param action
 * @param billingAccount
 * @param id Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
 * @param product
 * @param state
 */
data class OrderItemEvent(
        val action: ProductActionType,
        /* Identifier of the line item (generally it is a sequence number 01, 02, 03, ...) */
        val id: kotlin.String,
        val state: ProductOrderItemStateType,
        /* Target a description file of productOrder extension */
        val schemaLocation: kotlin.String? = null,
        /* Type of productOrder */
        val type: kotlin.String? = null,
        val billingAccount: BillingAccountRef? = null,
        val product: ProductEvent? = null
) {

}

