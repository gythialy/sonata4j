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
package io.swagger.server.apis

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.authentication
import io.ktor.auth.oauth
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.get
import io.ktor.locations.oauthAtLocation
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.application
import io.ktor.routing.post
import io.ktor.routing.route
import io.swagger.server.ApplicationAuthProviders
import io.swagger.server.ApplicationExecutors
import io.swagger.server.HTTP.client
import io.swagger.server.Paths
import io.swagger.server.delete
import kotlinx.coroutines.experimental.asCoroutineDispatcher

fun Route.HubApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    delete<Paths.productOfferingQualificationManagementHubDelete> { it: Paths.productOfferingQualificationManagementHubDelete ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.productOfferingQualificationManagementHubDelete>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOfferingQualificationManagement/v3/hub/{HubId}' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    get<Paths.productOfferingQualificationManagementHubGet> { it: Paths.productOfferingQualificationManagementHubGet ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json;charset=utf-8"
            val exampleContentString = """[ {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            }, {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.productOfferingQualificationManagementHubGet>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOfferingQualificationManagement/v3/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/productOfferingQualificationManagement/v3/hub") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                val exampleContentType = "application/json;charset=utf-8"
                val exampleContentString = """{
                  "query" : "query",
                  "callback" : "callback",
                  "id" : "id"
                }"""

                when (exampleContentType) {
                    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                    else -> call.respondText(exampleContentString)
                }
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauth(client, ApplicationExecutors.asCoroutineDispatcher(), { ApplicationAuthProviders["bearer"] }, {
                            // TODO: define a callback url here.
                            "/"
                        })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOfferingQualificationManagement/v3/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/productOrderManagement/v3/hub") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                val exampleContentType = "application/json;charset=utf-8"
                val exampleContentString = """{
                  "query" : "query",
                  "callback" : "callback",
                  "id" : "id"
                }"""

                when (exampleContentType) {
                    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                    else -> call.respondText(exampleContentString)
                }
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauth(client, ApplicationExecutors.asCoroutineDispatcher(), { ApplicationAuthProviders["bearer"] }, {
                            // TODO: define a callback url here.
                            "/"
                        })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOrderManagement/v3/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    delete<Paths.productOrderManagementHubDelete> { it: Paths.productOrderManagementHubDelete ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.productOrderManagementHubDelete>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOrderManagement/v3/hub/{HubId}' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    get<Paths.productOrderManagementHubFind> { it: Paths.productOrderManagementHubFind ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json;charset=utf-8"
            val exampleContentString = """[ {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            }, {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.productOrderManagementHubFind>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/productOrderManagement/v3/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/quoteManagement/v2/hub") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                val exampleContentType = "application/json;charset=utf-8"
                val exampleContentString = """{
                  "query" : "query",
                  "callback" : "callback",
                  "id" : "id"
                }"""

                when (exampleContentType) {
                    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                    else -> call.respondText(exampleContentString)
                }
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauth(client, ApplicationExecutors.asCoroutineDispatcher(), { ApplicationAuthProviders["bearer"] }, {
                            // TODO: define a callback url here.
                            "/"
                        })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/quoteManagement/v2/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    delete<Paths.quoteManagementHubDelete> { it: Paths.quoteManagementHubDelete ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.quoteManagementHubDelete>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/quoteManagement/v2/hub/{HubId}' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    get<Paths.quoteManagementHubFind> { it: Paths.quoteManagementHubFind ->
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()

        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json;charset=utf-8"
            val exampleContentString = """[ {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            }, {
              "query" : "query",
              "callback" : "callback",
              "id" : "id"
            } ]"""

            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
            .apply {
                // TODO: ktor doesn't allow different authentication registrations for endpoints sharing the same path but different methods.
                //       It could be the authentication block is being abused here. Until this is resolved, swallow duplicate exceptions.

                try {
                    authentication {
                        oauthAtLocation<Paths.quoteManagementHubFind>(client, ApplicationExecutors.asCoroutineDispatcher(),
                                providerLookup = { ApplicationAuthProviders["bearer"] },
                                urlProvider = { currentLocation, provider ->
                                    // TODO: define a callback url here.
                                    "/"
                                })
                    }
                } catch (e: io.ktor.application.DuplicateApplicationFeatureException) {
                    application.environment.log.warn("authentication block for '/quoteManagement/v2/hub' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }
}
