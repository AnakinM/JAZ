package com.anikiej.demo;

import org.springframework.stereotype.Component;


public class SecondComponent {
    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("Hello from SecondComponent");
        firstComponent.printHello();
    }

    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
