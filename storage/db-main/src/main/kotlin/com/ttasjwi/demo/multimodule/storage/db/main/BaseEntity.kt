package com.ttasjwi.demo.multimodule.storage.db.main

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @CreationTimestamp
    @Column(updatable = false)
    val createdAt: LocalDateTime? = null

    @UpdateTimestamp
    @Column
    var updatedAt: LocalDateTime? = null
        protected set
}
