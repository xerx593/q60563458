package com.stackoverflow.bar;

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
public class ApplicaitonTest {

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
    public void testBAF(@Autowired BAutowiredField baf) {
        Assertions.assertNotNull(baf);
    }

    @Test
    public void testBAC(@Autowired BAutowiredConstructor bac) {
        Assertions.assertNotNull(bac);
    }
}
