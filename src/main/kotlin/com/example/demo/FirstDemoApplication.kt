package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class FirstDemoApplication{
	@GetMapping("/hello")
	fun hello(@RequestParam(value="Name", defaultValue="World")Name:String):String{
		return "Hello, %s".format(Name) + 2
	}
}

fun main(args: Array<String>) {
    runApplication<FirstDemoApplication>(*args)
}