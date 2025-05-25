package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/sample-greeting")
class SampleGreetingController {

    @Get
    fun greeting(): String {
        return "Hello World"
    }
}