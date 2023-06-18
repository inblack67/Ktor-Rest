package com.inblack67.dagger.modules

import com.inblack67.repos.UserRepo
import com.inblack67.repos.impl.UserRepoImpl
import com.zaxxer.hikari.HikariDataSource
import dagger.Module
import dagger.Provides

@Module
class UserRepoModule {
    @Provides
    fun provideUserRepo(ds: HikariDataSource): UserRepo {
        return UserRepoImpl(ds)
    }
}