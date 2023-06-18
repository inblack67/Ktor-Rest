package com.inblack67.plugins

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource

object Db {
    var ds: HikariDataSource

    init {
        val config = HikariConfig().apply {
            jdbcUrl = "jdbc:postgresql://localhost:5430/krest"
            username = "postgres"
            password = "postgres"
            maximumPoolSize = 50 // 50 db connections
            minimumIdle = 15 // 15 idle connections allowed. should always be < maxPoolSize
            idleTimeout = 5000 // 5 seconds
        }
        println("i ran")
        ds = HikariDataSource(config)
    }
}