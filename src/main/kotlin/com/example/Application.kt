package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application

@RestController
class DefaultController {
    @GetMapping("/normal")
    fun normal(@RequestParam(required = false) argument: Boolean) = argument

    @GetMapping("/defaultValue")
    fun defaultValue(@RequestParam(required = false) argument: Boolean? = null) = argument
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
