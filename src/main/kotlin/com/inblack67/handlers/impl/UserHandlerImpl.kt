package com.inblack67.handlers.impl

import com.inblack67.handlers.UserHandler
import com.inblack67.models.User
import com.inblack67.services.UserService
import javax.inject.Inject

class UserHandlerImpl @Inject constructor(private val service: UserService) : UserHandler {
    override fun createUser(payload: User): Boolean {
        println("inside userhandler create user...")
        return service.createUser(payload)
    }

    override fun getUser(id: Int): User? {
        return service.getUser(id)
    }

}