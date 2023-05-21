package com.inblack67.services.impl

import com.inblack67.models.User
import com.inblack67.services.UserService

class UserServiceImpl : UserService {
    override fun createUser(payload: User): Boolean {
        println("service -> createUser")
        return true
    }
}