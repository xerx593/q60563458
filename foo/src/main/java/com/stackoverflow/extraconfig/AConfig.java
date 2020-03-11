package com.stackoverflow.extraconfig;

import com.stackoverflow.foo.A;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {
    public A a() {
        //assume complex initilization here.
        return new A();
    }
}
