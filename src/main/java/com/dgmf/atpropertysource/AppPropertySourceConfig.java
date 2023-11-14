package com.dgmf.atpropertysource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@ComponentScan("com.dgmf.atpropertysource")
public class AppPropertySourceConfig {

}
