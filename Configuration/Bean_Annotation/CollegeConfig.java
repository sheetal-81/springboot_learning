package com.example.demo.Bean_Annotation;

import com.example.demo.Component_Annotation.college;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
    @Bean
    public college collegeBean() {
        return new college();
    }
}
