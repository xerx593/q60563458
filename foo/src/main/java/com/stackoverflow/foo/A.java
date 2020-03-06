package com.stackoverflow.foo;

import org.springframework.stereotype.Component;

/**
 *
 * @author xerx
 */
@Component(/*"explicit name"*/)
public class A {

    public static Object HIDDEN_EFFECT = null;

    public A() {
        System.out.println("A initiliazed.");
        A.HIDDEN_EFFECT = new Object();
    }
}
