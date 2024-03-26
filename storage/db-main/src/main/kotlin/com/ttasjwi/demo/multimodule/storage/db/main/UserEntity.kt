package com.ttasjwi.demo.multimodule.storage.db.main

import jakarta.persistence.AttributeOverride
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table


@Entity
@Table(name = "users")
@AttributeOverride(name= "id", column = Column(name = "user_id"))
internal class UserEntity(
    @Column
    var name: String,
) : BaseEntity()
