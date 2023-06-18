package com.inblack67.repos

import com.inblack67.models.User

interface UserRepo {
    fun getUser(id: Int): User?
}