package com.example.aop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class AopApplicationTests {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        // 从容器中拿到目标对象
        Auidence auidence = (Auidence) applicationContext.getBean("performance");
        auidence.performance();
    }

}
