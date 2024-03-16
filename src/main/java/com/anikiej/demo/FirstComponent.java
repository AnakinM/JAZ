package com.anikiej.demo;

import org.springframework.stereotype.Component;


public class FirstComponent {
    public FirstComponent() {
        System.out.println("Hello from FirstComponent");
    }

    public void printHello() {
        System.out.println("Hello from FirstComponent's method printHello()");
    }

    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
