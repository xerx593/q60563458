package com.stackoverflow.baz;

import com.stackoverflow.bar.B;
import com.stackoverflow.foo.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author xerx
 */
@SpringBootTest
class AbstractAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testContextLoads() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    public void testB(@Autowired B b) {
        Assertions.assertNotNull(A.HIDDEN_EFFECT);
        Assertions.assertNotNull(b);
    }

    @Test
    public void testBAF(@Autowired A a) {
        Assertions.assertNotNull(a);
    }
}
