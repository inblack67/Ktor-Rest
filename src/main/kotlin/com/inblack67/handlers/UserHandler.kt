package com.inblack67.handlers

import com.inblack67.models.User
interface UserHandler {
    fun createUser(payload: User): Boolean
}