package com.stackoverflow.foo;

import org.springframework.stereotype.Component;

/**
 *
 * @author xerx
 */
@Component(/*"explicit name"*/)
public class A {

    public String foo() {
        return "A.foo";
    }
}
