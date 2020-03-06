package com.stackoverflow.bar;

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

    @Autowired
    private B b;

    @Test
    public void testContextLoads() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    public void testB() {
        Assertions.assertNotNull(b);
        System.out.println(b.bar());
    }
}
