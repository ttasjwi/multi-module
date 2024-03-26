package com.ttasjwi.demo.multimodule

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class MultiModuleApplication

fun main(args: Array<String>) {
    runApplication<MultiModuleApplication>(*args)
}
