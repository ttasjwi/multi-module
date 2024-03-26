package com.ttasjwi.demo.multimodule.storage.db.main

import org.springframework.data.jpa.repository.JpaRepository

internal interface UserJpaRepository : JpaRepository<UserEntity, Long>
