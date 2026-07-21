package com.vivosense.user_service

import com.vivosense.user_service.config.configureModule
import com.vivosense.user_service.utils.EnvVars
import io.ktor.server.engine.applicationEngineEnvironment
import io.ktor.server.engine.*
import io.ktor.server.jetty.*


fun main() {
    embeddedServer(
        factory = Jetty,
        environment = applicationEngineEnvironment {
            connector { port = EnvVars.Application.port }
        }
    ).start(wait = true)
}
