package com.ttasjwi.demo.multimodule.storage.db.main

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class ExampleEntity(
    @Column
    val exampleColumn: String,
) : BaseEntity()
