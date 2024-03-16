package com.anikiej.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppContextComponent {
    public AppContextComponent(ApplicationContext applicationContext) {
        FirstComponent firstComponent = applicationContext.getBean("firstComponent", FirstComponent.class);
        SecondComponent secondComponent = applicationContext.getBean("secondComponent", SecondComponent.class);
        firstComponent.printClassName();
        secondComponent.printClassName();
    }
}
