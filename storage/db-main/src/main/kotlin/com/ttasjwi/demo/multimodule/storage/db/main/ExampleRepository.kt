package com.ttasjwi.demo.multimodule.storage.db.main

import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository : JpaRepository<ExampleEntity, Long>
