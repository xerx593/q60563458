package com.stackoverflow.bar;

import com.stackoverflow.foo.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author xerx
 */
@Component
public class BAutowiredConstructor {

    public BAutowiredConstructor(@Autowired @SuppressWarnings("unused") A a) {
        //do nothing with a!?
        System.out.println("BAutowiredConstructor initilaized.");
    }
}
