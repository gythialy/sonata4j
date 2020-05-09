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
 * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
 * @param href Reference of the agreement
 * @param id Id of the agreement
 * @param name Name of the agreement
 * @param path A URI/URL providing the path to where an agreement resides.
 */
data class AgreementRef(
        /* Id of the agreement */
        val id: kotlin.String,
        /* Name of the agreement */
        val name: kotlin.String,
        /* A URI/URL providing the path to where an agreement resides. */
        val path: kotlin.String,
        /* Reference of the agreement */
        val href: kotlin.String? = null
) {

}
