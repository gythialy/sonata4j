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
 * It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.
 * @param @schemaLocation Technical attribute to extend this class
 * @param @type Technical attribute to extend this class
 * @param buildingName Allows for buildings that have well-known names
 * @param levelNumber Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
 * @param levelType Describes level types within a building
 * @param privateStreetName Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
 * @param privateStreetNumber Private streets numbers internal to a private street
 * @param subUnit
 */
data class GeographicSubAddressRequest(
        /* Technical attribute to extend this class */
        val schemaLocation: kotlin.String? = null,
        /* Technical attribute to extend this class */
        val type: kotlin.String? = null,
        /* Allows for buildings that have well-known names */
        val buildingName: kotlin.String? = null,
        /* Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2 */
        val levelNumber: kotlin.String? = null,
        /* Describes level types within a building */
        val levelType: kotlin.String? = null,
        /* Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office */
        val privateStreetName: kotlin.String? = null,
        /* Private streets numbers internal to a private street */
        val privateStreetNumber: kotlin.String? = null,
        val subUnit: kotlin.Array<SubUnit>? = null
) {

}

