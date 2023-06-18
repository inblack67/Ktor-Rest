package com.inblack67.plugins

import com.inblack67.handlers.UserHandler
import com.inblack67.models.User
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.request.*

fun Application.configureRouting(
    userHandler: UserHandler
) {

    val users = mutableListOf<User>()

    routing {
        get("/") {
            call.respondText("Hello oo World!")
        }

        post("/users") {
            val payload = call.receive<User>()
            users.add(payload)
            call.respond("user created")
        }

        get("/users/{id}") {
            val id = call.parameters["id"]?.toIntOrNull() ?: return@get call.respond("id is required")
            val res = userHandler.getUser(id) ?: return@get call.respond("Invalid id")
            call.respond(res)
        }
    }
}