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
 * An enumeration of valid order item statuses.
 * Values: acknowledged,rejected,inProgress,pending,held,assesssingCancellation,pendingCancellation,cancelled,inProgressPeriodconfigured,failed,completed
 */
enum class ProductOrderItemStateType(val value: kotlin.String) {

    acknowledged("acknowledged"),

    rejected("rejected"),

    inProgress("inProgress"),

    pending("pending"),

    held("held"),

    assesssingCancellation("assesssingCancellation"),

    pendingCancellation("pendingCancellation"),

    cancelled("cancelled"),

    inProgressPeriodconfigured("inProgress.configured"),

    failed("failed"),

    completed("completed");

}

