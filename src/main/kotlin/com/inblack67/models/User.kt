package com.inblack67.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val username: String,
)
