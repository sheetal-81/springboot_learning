package com.example.demo.dependencyInjection;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

            public String getRepositoryMessage()
            {
                        return "Hello from MyRepository";
            }
}
