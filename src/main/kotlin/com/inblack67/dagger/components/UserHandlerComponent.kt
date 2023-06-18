package com.inblack67.dagger.components

import com.inblack67.dagger.modules.DbModule
import com.inblack67.dagger.modules.UserHandlerModule
import com.inblack67.dagger.modules.UserRepoModule
import com.inblack67.dagger.modules.UserServiceModule
import com.inblack67.handlers.UserHandler
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserHandlerModule::class, UserServiceModule::class, DbModule::class, UserRepoModule::class])
interface UserHandlerComponent {
    fun getUserHandlerComponent(): UserHandler
}