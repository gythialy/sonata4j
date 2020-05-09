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
 * The state of the product in accordance with the product lifecycle.
 * Values: active,suspended,activePendingTerminate,terminated,pendingActive,suspendedPendingTerminate
 */
enum class ProductStatus(val value: kotlin.String) {

    active("active"),

    suspended("suspended"),

    activePendingTerminate("activePendingTerminate"),

    terminated("terminated"),

    pendingActive("pendingActive"),

    suspendedPendingTerminate("suspendedPendingTerminate");

}
