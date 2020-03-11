package com.stackoverflow.baz;

import com.stackoverflow.bar.B;
import com.stackoverflow.extraconfig.BConfig;
import com.stackoverflow.foo.A;
import com.stackoverflow.extraconfig.AConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author xerx
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    // if the instantiation of A, B is trivial, then just:
    @Bean("a")
    public A a() {
        return new A();
    }

    @Bean
    @DependsOn("a")
    public B b() {
        return new B();
    }

    // if instantiation is complex, but you have "external config", which you can use.
    // Then this "hack" works/seems to (see ApplicationConmplex*Test, application-complex-*-[.yaml/.properties] is important)
    @Configuration
    @Import(value = {BConfig.class, AConfig.class})
    @Profile("complex-import")
    @SuppressWarnings("unused")// it is!
    static class AlternativeConfig1 {

        @Bean("a")
        public A a(@Autowired A a) {
            return a;
        }

        @Bean
        @DependsOn("a")
        public B b(@Autowired B b) {
            return b;
        }
    }

    //alternatively to external config, you can also rely here on @ComponentScan
    @Configuration
    @ComponentScan(basePackageClasses = {B.class, A.class})
    @Profile("complex-scan")
    @SuppressWarnings("unused")// it is!
    static class AlternativeConfig2 {

        @Bean("a")
        public A a(@Autowired A a) {
            return a;
        }

        @Bean
        @DependsOn("a")
        public B b(@Autowired B b) {
            return b;
        }
    }
}
