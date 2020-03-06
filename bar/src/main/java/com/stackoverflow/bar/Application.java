package com.stackoverflow.bar;

import com.stackoverflow.foo.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author xerx
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = {A.class, B.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
