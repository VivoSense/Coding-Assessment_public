package com.vivosense.user_service.routing

import com.vivosense.user_service.models.response.UserResponse
import com.vivosense.user_service.service.UserService
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import org.koin.ktor.ext.inject

fun Application.configureUserRouting() {
    val userService: UserService by inject()

    routing {
        route("/user-service/user") {
            get {
                val response = userService.getUsers().map { UserResponse(it) }
                call.respond(HttpStatusCode.OK, response)
            }
        }
    }
}
