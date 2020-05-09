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
 * Quote level
 * Values: bUDGETARY,iNDICATIVE,fIRM
 */
enum class QuoteLevel(val value: kotlin.String) {

    bUDGETARY("BUDGETARY"),

    iNDICATIVE("INDICATIVE"),

    fIRM("FIRM");

}

