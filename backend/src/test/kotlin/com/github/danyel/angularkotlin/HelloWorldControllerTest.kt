package com.github.danyel.angularkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HelloWorldControllerTest {

    @Autowired
    lateinit var helloWorldController: HelloWorldController

    @Test
    fun hello() {
        val helloResponse = helloWorldController.hello()
        assertThat(helloResponse).isNotNull
        assertThat(helloResponse.statusCode).isEqualTo(HttpStatus.ACCEPTED)
        assertThat(helloResponse.body).isEqualTo(HelloWorld("hello"))

        // the horror
        assertThat(helloWorldController.hello().body?.world?.hello).isEqualTo("world")
    }

    @Test
    fun sexy() {
        val helloResponse = helloWorldController.sexy
        assertThat(helloResponse).isNotNull
        assertThat(helloResponse.statusCode).isEqualTo(HttpStatus.ACCEPTED)
        assertThat(helloResponse.body).isEqualTo(HelloWorld("hello"))

        // the horror
        assertThat(helloWorldController.hello().body?.world?.hello).isEqualTo("world")
    }
}