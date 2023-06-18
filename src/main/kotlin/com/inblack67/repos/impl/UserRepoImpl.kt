package com.inblack67.repos.impl

import com.inblack67.models.User
import com.inblack67.repos.UserRepo
import com.zaxxer.hikari.HikariDataSource
import javax.inject.Inject

class UserRepoImpl @Inject constructor(private val ds: HikariDataSource) : UserRepo {
    override fun getUser(id: Int): User? {
        return ds.connection.use { conn ->
            // todo: read more about sql inject. do not populate vars in the query without "?"
            conn.prepareStatement(
                """
                SELECT * FROM "user" u 
                WHERE u.id = ?
            """.trimIndent()
            ).use { pst ->
                pst.setInt(1, id)
                pst.executeQuery().use { rs ->
                    if (!rs.next()) {
                        null
                    } else {
                        User.getFromRS(rs)
                    }
                }
            }
        }
    }
}