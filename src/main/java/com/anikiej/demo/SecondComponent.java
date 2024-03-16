package com.anikiej.demo;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("Hello from SecondComponent");
        firstComponent.printHello();
    }
}
