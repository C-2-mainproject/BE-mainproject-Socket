package com.wolver.mainproject.socket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedOrigins("http://localhost:3000")
                .allowedOrigins("https://ildanenglish.com")
                .exposedHeaders("Set-Cookie")
                .exposedHeaders("cookie")
                .allowedHeaders("*")
                .allowCredentials(true)
                .allowedMethods("POST","GET","OPTIONS","HEAD","PUT","DELETE");
    }
}
