package com.vivosense.user_service.config

import com.vivosense.user_service.service.UserService
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun configureDI(): KoinApplication {
    return startKoin {
        modules(
            module {
                single { UserService() }
            }
        )
    }
}
