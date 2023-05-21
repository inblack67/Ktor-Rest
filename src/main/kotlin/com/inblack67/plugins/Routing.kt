package com.inblack67.plugins

import com.inblack67.dagger.components.DaggerUserComponent
import com.inblack67.models.User
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    val users = mutableListOf<User>()

    routing {
        get("/") {
            DaggerUserComponent.create().getUserComponent().someUser()
            call.respondText("Hello oo World!")
        }

        post("/users") {
            val payload = call.receive<User>()
            users.add(payload)
            call.respond("user created")
        }

        get("/users") {
            call.respond(users)
        }
    }
}
