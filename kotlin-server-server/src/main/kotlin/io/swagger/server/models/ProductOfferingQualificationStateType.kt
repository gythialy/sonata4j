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
 * These values represent the valid states through which the product offering qualification can transition
 * Values: done,terminatedWithErrorPeriodunableToProvide,terminatedWithErrorPeriodinsufficientInformationProvided,inProgress
 */
enum class ProductOfferingQualificationStateType(val value: kotlin.String) {

    done("done"),

    terminatedWithErrorPeriodunableToProvide("terminatedWithError.unableToProvide"),

    terminatedWithErrorPeriodinsufficientInformationProvided("terminatedWithError.insufficientInformationProvided"),

    inProgress("inProgress");

}

