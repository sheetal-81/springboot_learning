package com.example.demo.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
            @Autowired
            private Myservice myService;
            @Autowired
            private MyRepository myRepository;
            public void printMessages()
            {
                        System.out.println("\nDependency injection ka output");
                        System.out.println(myService.getServiceMessage());
                        System.out.println(myRepository.getRepositoryMessage());
            }
}
