package com.github.danyel.angularkotlin

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello")
class HelloWorldController {
    @GetMapping
    fun hello(): ResponseEntity<HelloWorld> {
        return ResponseEntity(HelloWorld("hello"), HttpStatus.ACCEPTED)
    }
}

data class HelloWorld(val hello: String)
