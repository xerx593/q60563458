package com.stackoverflow.bar;

import com.stackoverflow.foo.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author xerx
 */
@Component
public class BAutowiredField {

    @Autowired
    @SuppressWarnings("unused")
    private A a;

    public BAutowiredField() {
        System.out.println("BAutowiredField initialized.");
    }
}
