package com.dgmf.atpropertysource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceClient {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppPropertySourceConfig.class
                );

        PropertySourceClass propertySourceClass =
                context.getBean(PropertySourceClass.class);

        System.out.println(propertySourceClass.getHost());
        System.out.println(propertySourceClass.getEmail());
        System.out.println(propertySourceClass.getPassword());
        System.out.println(propertySourceClass.getName());
        System.out.println(propertySourceClass.getDescription());
    }
}
