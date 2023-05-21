package com.inblack67.dagger.components

import com.inblack67.dagger.modules.UserModule
import com.inblack67.service.User
import dagger.Component

@Component(modules = [UserModule::class])
interface UserComponent {
    fun getUserComponent(): User
}