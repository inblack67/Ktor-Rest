package com.inblack67.services

import com.inblack67.models.User

interface UserService {
    fun createUser(payload: User): Boolean
    fun getUser(id: Int): User?
}