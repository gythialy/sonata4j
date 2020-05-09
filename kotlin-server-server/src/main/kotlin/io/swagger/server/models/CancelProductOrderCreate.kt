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
 * @param @schemaLocation Technical attribute to extend this class.
 * @param @type Technical attribute to extend this class.
 * @param cancellationReason An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
 * @param productOrder
 * @param requestedCancellationDate Identifies the date the Seller cancelled the Order.
 */
data class CancelProductOrderCreate(
        val productOrder: ProductOrderRefCancel,
        /* Identifies the date the Seller cancelled the Order. */
        val requestedCancellationDate: java.time.LocalDateTime,
        /* Technical attribute to extend this class. */
        val schemaLocation: kotlin.String? = null,
        /* Technical attribute to extend this class. */
        val type: kotlin.String? = null,
        /* An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation. */
        val cancellationReason: kotlin.String? = null
) {

}

