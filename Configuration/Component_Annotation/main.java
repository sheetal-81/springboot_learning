package com.example.demo.Component_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.Bean_Annotation.CollegeConfig;

public class main {
    public static void main(String[] args) {
        System.out.println("Main.java file content");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        college college = context.getBean("collegeBean", college.class);
        college.test();
    }
}
