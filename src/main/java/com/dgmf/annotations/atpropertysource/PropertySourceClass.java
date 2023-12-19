package com.dgmf.annotations.atpropertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceClass {
    /*@Value("${gmail.host}")
    private String host;
    @Value("${gmail.email}")
    private String email;
    @Value("${gmail.password}")
    private String password;
    @Value("${app.name}")
    private String name;
    @Value("${app.description}")
    private String description;*/
    @Autowired
    private Environment environment;

    public String getHost() {
        return environment.getProperty("hotmail.host");
    }

    public String getEmail() {
        return environment.getProperty("hotmail.email");
    }

    public String getPassword() {
        return environment.getProperty("hotmail.password");
    }

    public String getName() {
        return environment.getProperty("app.name");
    }

    public String getDescription() {
        return environment.getProperty("app.description");
    }
}
