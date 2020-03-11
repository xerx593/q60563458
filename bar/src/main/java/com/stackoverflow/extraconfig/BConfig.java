package com.stackoverflow.extraconfig;

import com.stackoverflow.bar.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfig {

    @Bean
    public B b() {
        //assume complex initilization here.
        return new B();
    }

}
