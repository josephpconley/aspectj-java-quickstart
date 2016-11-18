package com.josephpconley;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class HelloAspect {

    @Before("execution(* *(..)) && @annotation(HelloAnnotation)")
    public void before(JoinPoint joinPoint){
        System.out.println("Before Hello!");
    }

    @After("execution(* *(..)) && @annotation(HelloAnnotation)")
    public void after(JoinPoint joinPoint){
        System.out.println("After Hello!");
    }
}
