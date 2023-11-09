package com.dgmf.atlazyannotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // Spring Container will create a Bean for this
// Class "on-demand" (at runtime)
public class LazyLoader {
    public LazyLoader() {
        System.out.println("LazyLoader ...");
    }
}
