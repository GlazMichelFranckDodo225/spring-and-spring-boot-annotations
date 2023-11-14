package com.dgmf.atpropertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.dgmf.atpropertysource")
// @PropertySource("classpath:mail.properties")
// @PropertySource("classpath:messages.properties")
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:messages.properties")
})
public class AppPropertySourceConfig {

}
