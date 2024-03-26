package com.ttasjwi.demo.multimodule.controller

import com.ttasjwi.demo.multimodule.domain.user.User

data class UserResponse(
    val userId: Long,
    val name: String
) {
    companion object {
        fun from(user: User): UserResponse {
            return UserResponse(user.id, user.name)
        }
    }
}
