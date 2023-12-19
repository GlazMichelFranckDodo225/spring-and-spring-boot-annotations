package com.dgmf.annotations.atpropertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.dgmf.atpropertysource")
// @PropertySource("classpath:mail.properties")
// @PropertySource("classpath:messages.properties")
@PropertySources({ // To provide multiple Properties at once
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:messages.properties")
})
public class AppPropertySourceConfig {

}
