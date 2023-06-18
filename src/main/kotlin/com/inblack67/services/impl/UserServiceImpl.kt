package com.inblack67.services.impl

import com.inblack67.models.User
import com.inblack67.repos.UserRepo
import com.inblack67.services.UserService
import javax.inject.Inject

class UserServiceImpl @Inject constructor(private val repo: UserRepo) : UserService {
    override fun createUser(payload: User): Boolean {
        println("service -> createUser")
        return true
    }

    override fun getUser(id: Int): User? {
        return repo.getUser(id)
    }
}