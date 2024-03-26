package com.ttasjwi.demo.multimodule.controller

import com.ttasjwi.demo.multimodule.domain.user.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {

    @PostMapping("/api/users")
    fun addUser(
        @RequestBody request: NewUserRequest
    ) : ResponseEntity<NewUserResponse> {

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(NewUserResponse(userService.add(request.name)))
    }

    @GetMapping("/api/users/{userId}")
    fun getUser(
        @PathVariable userId: Long
    ) : ResponseEntity<UserResponse> {

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(UserResponse.from(userService.read(userId)))
    }
}
