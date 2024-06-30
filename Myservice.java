package com.example.demo.dependencyInjection;

import org.springframework.stereotype.Service;

@Service
public class Myservice {
            public String getServiceMessage()
            {
                        return "Hello from Myservice";
            }
}
