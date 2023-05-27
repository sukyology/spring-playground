package com.example.playground.config

import com.example.playground.model.CourseService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    fun getCourseService() = CourseService()
}