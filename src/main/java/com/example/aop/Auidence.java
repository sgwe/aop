package com.example.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author yangxi
 * @Date 2019/12/13 16:17
 */
@Aspect
@Component
public class Auidence {

    @Pointcut("execution(public * com.example.aop.Performance.perform(..))")
    public void performance() {

    }

    @Before("performance()")
    public void beQuiet() {
        System.out.println("Be Quiet!");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance()")
    public void boo() {
        System.out.println("BOO BOO BOO!");
    }
}
