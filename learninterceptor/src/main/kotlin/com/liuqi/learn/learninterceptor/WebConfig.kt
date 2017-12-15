package com.liuqi.learn.learninterceptor

import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@EnableWebMvc
class WebConfig: WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {

    }
}