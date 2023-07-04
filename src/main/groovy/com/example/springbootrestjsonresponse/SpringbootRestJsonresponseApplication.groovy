package com.example.springbootrestjsonresponse

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringbootRestJsonresponseApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringbootRestJsonresponseApplication, args)
    }

    @GetMapping("/greet")
    private Greeting greet() {
        return new Greeting(1, "Hi");
    }

}
