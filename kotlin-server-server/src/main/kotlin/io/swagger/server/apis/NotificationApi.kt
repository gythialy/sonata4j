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
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.application
import io.ktor.routing.post
import io.ktor.routing.route
import io.swagger.server.ApplicationAuthProviders
import io.swagger.server.ApplicationExecutors
import io.swagger.server.HTTP.client
import kotlinx.coroutines.experimental.asCoroutineDispatcher

fun Route.NotificationApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/productOrderNotification/v3/notification/productOrderAttributeValueChangeNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/productOrderNotification/v3/notification/productOrderAttributeValueChangeNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/productOrderNotification/v3/notification/productOrderCreationNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/productOrderNotification/v3/notification/productOrderCreationNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/productOrderNotification/v3/notification/productOrderInformationRequiredNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/productOrderNotification/v3/notification/productOrderInformationRequiredNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/productOrderNotification/v3/notification/productOrderStateChangeNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/productOrderNotification/v3/notification/productOrderStateChangeNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/quoteNotification/v1/quoteNotification/v1/notification/quoteAttributeValueChangeNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/quoteNotification/v1/quoteNotification/v1/notification/quoteAttributeValueChangeNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/quoteNotification/v1/notification/quoteCreationNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/quoteNotification/v1/notification/quoteCreationNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/quoteNotification/v1/quoteNotification/v1/notification/quoteInformationRequiredNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/quoteNotification/v1/quoteNotification/v1/notification/quoteInformationRequiredNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }

    route("/quoteNotification/v1/notification/quoteStateChangeNotification") {
        post {
            val principal = call.authentication.principal<OAuthAccessTokenResponse>()

            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                call.respond(HttpStatusCode.NotImplemented)
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
                    application.environment.log.warn("authentication block for '/quoteNotification/v1/notification/quoteStateChangeNotification' is duplicated in code. " +
                            "Generated endpoints may need to be merged under a 'route' entry.")
                }
            }
}
