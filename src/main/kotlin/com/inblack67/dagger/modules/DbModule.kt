package com.inblack67.dagger.modules

import com.inblack67.plugins.Db
import com.zaxxer.hikari.HikariDataSource
import dagger.Module
import dagger.Provides

@Module
class DbModule {
    @Provides
    fun provideDb(): HikariDataSource {
        return Db.ds
    }
}