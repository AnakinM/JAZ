package com.anikiej.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class MyConfig {
    private final String someProperty;

    public MyConfig(@Value("${some.other.property}") String someProperty) {
        this.someProperty = someProperty;
    }

    @Bean
    public MyPlainJavaObject myPlainJavaObject(@Value("${my.custom.property:some_default}") String valueFromProperties) {
        System.out.println(valueFromProperties);
        return new MyPlainJavaObject();
    }

    @Bean
    @ConditionalOnProperty()
    public List<String> defaultData() {
        return List.of("Hello", "World", "How", "Are", "You");
    }
}
