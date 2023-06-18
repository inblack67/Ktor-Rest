package com.inblack67.models

import kotlinx.serialization.Serializable
import java.sql.ResultSet

@Serializable
data class User(
    val id: Int,
    val username: String,
) {

    init {
        require(username.length < 50) { "username cannot be greater than 50" }
    }

    companion object {
        fun getFromRS(rs: ResultSet): User {
            return User(
                id = rs.getInt("id"),
                username = rs.getString("username")
            )
        }
    }
}
