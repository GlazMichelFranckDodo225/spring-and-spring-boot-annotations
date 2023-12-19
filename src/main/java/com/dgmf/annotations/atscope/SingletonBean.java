package com.dgmf.annotations.atscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Notice that Singleton Scope is the Default Scope, so it can be omitted.
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) // @Scope(value = "singleton")
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean ...");
    }
}
