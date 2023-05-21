package com.inblack67.dagger.modules

import com.inblack67.services.UserService
import com.inblack67.services.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

@Module
class UserServiceModule {
    @Provides
    fun provideUserService(): UserService {
        return UserServiceImpl()
    }
}