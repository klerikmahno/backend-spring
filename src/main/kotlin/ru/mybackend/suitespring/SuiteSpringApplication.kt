package ru.mybackend.suitespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SuiteSpringApplication

fun main(args: Array<String>) {
    runApplication<SuiteSpringApplication>(*args)
}
