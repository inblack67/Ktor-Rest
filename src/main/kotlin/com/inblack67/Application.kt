package com.inblack67

import com.inblack67.dagger.components.DaggerUserHandlerComponent
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.inblack67.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    val userHandler = DaggerUserHandlerComponent.create().getUserHandlerComponent()

    configureSerialization()
    configureHTTP()
    configureRouting(
        userHandler = userHandler
    )
}
