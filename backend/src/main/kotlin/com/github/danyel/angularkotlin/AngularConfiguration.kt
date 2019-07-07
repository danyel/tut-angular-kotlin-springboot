package com.github.danyel.angularkotlin

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class AngularConfiguration: WebMvcConfigurer{
    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addRedirectViewController("/", "index.html")
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/")
    }
}