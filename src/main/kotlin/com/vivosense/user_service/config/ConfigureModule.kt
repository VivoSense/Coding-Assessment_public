package com.vivosense.user_service.config

import com.vivosense.user_service.routing.configureAdditionalRouting
import com.vivosense.user_service.routing.configureUserRouting
import io.ktor.server.application.Application

fun Application.configureModule() {
    configureDI()
    configureSerialization()
    configureAdditionalRouting()

}
