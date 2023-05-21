package com.inblack67.dagger.modules

import com.inblack67.service.User
import com.inblack67.service.UserImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserModule {
    @Provides
    fun provideUser(): User {
        return UserImpl()
    }
}