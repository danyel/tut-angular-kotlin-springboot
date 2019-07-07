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

    val sexy: ResponseEntity<HelloWorld>
        @GetMapping(path = ["world"]) get() {
            return ResponseEntity(HelloWorld("hello"), HttpStatus.ACCEPTED)
        }
}

class HelloWorld {
    var world: HelloWorld? = null
    var hello: String

    constructor() {
        this.hello = "world"
    }

    constructor(hello: String) : this() {
        this.hello = hello
        this.world = HelloWorld()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HelloWorld

        if (hello != other.hello) return false

        return true
    }

    override fun hashCode(): Int {
        return hello.hashCode()
    }

    override fun toString(): String {
        return "HelloWorld(hello='$hello')"
    }
}
