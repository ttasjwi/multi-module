package com.ttasjwi.demo.multimodule.domain.user

import org.springframework.stereotype.Component

@Component
class UserReader(
    private val userRepository: UserRepository
) {

    fun read(id: Long): User {
        return userRepository.read(id) ?: throw NoSuchElementException()
    }
}
