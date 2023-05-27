package com.example.playground

import com.example.playground.config.AppConfig
import com.example.playground.model.CourseService
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


class PlaygroundApplication

fun main(args: Array<String>) {
    val context: ApplicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)
    val a = context.getBean(CourseService::class.java)
    a.list().let {
        println(it)
    }
}

