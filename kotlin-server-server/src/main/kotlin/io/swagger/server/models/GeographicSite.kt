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
 * Designated as Service Site in TS. A fixed physical location at which a Product can be installed.  Its location can be described either with geocodes (Lat/Long information) or by association with an Address or Address Reference.  This association may include a Sub-address describing where within that Address or Address Reference, this particular Service Site is located.
 * @param @schemaLocation Technical attribute to extend this class
 * @param @type Technical attribute to extend this class
 * @param additionnalSiteInformation Additional site information
 * @param description A textual description of the Service Site.
 * @param fieldedAddress
 * @param formattedAdress
 * @param geographicLocation
 * @param id Identifier of the Service Site unique within the Seller.
 * @param referencedAddress
 * @param relatedParty
 * @param siteCompanyName The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner)
 * @param siteCustomerName The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
 * @param siteName A name commonly used by people to refer to this Service Site.
 * @param siteType This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information.
 * @param status
 */
data class GeographicSite(
        /* Technical attribute to extend this class */
        val schemaLocation: kotlin.String? = null,
        /* Technical attribute to extend this class */
        val type: kotlin.String? = null,
        /* Additional site information */
        val additionnalSiteInformation: kotlin.String? = null,
        /* A textual description of the Service Site. */
        val description: kotlin.String? = null,
        val fieldedAddress: FieldedAddress? = null,
        val formattedAdress: FormattedAddress? = null,
        val geographicLocation: GeographicLocation? = null,
        /* Identifier of the Service Site unique within the Seller. */
        val id: kotlin.String? = null,
        val referencedAddress: ReferencedAddress? = null,
        val relatedParty: kotlin.Array<RelatedParty>? = null,
        /* The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner) */
        val siteCompanyName: kotlin.String? = null,
        /* The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building). */
        val siteCustomerName: kotlin.String? = null,
        /* A name commonly used by people to refer to this Service Site. */
        val siteName: kotlin.String? = null,
        /* This defines whether a Service Site is public or private.  “PUBLIC” means that the existence of this Service Site is public information.  A meet-me-room in a hosted data center facility (where all interconnects between parties take place) is an example of a public Service Site.  A shared facility in the basement of a multi-tenant business building where all interconnects between parties take place is another example of a public Service Site.  “PRIVATE” means that the existence of this Service Site is on a need-to-know basis.  A wiring closet set up inside a customer facility just to connect two parties is an example of a private Service Site. For “PRIVATE” sites, the Seller does not return any information regarding the existence of this Service Site unless it has been established that this Buyer is authorized to obtain this information. */
        val siteType: kotlin.String? = null,
        val status: Status? = null
) {

}

