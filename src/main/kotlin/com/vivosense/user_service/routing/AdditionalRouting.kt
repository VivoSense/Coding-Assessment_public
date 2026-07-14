package com.vivosense.user_service.routing

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.configureAdditionalRouting() {
    routing {
        get("/health") { call.respond(HttpStatusCode.OK) }
    }
}