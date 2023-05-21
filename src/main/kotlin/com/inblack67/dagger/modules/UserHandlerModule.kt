package com.inblack67.dagger.modules

import com.inblack67.handlers.UserHandler
import com.inblack67.handlers.impl.UserHandlerImpl
import com.inblack67.services.UserService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserHandlerModule {

    @Provides
    fun provideUserHandler(service: UserService): UserHandler {
        return UserHandlerImpl(service)
    }

}