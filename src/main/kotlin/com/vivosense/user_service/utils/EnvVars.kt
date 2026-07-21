package com.vivosense.user_service.utils

object EnvVars {
    object Application {
        val port: Int
            get() = System.getenv("APPLICATION_PORT").toInt()
    }
}