package com.stackoverflow.bar;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 *
 * @author xerx
 */
@DependsOn("a")// implicit name
@Component
public class B {

    public B() {
        System.out.println("B initialized.");
    }

    public String bar() {
        return "B.bar";
    }
}
