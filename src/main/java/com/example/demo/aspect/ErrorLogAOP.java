package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect
@Component
public class ErrorLogAOP {
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void pointcut() {
    }

    @Pointcut(value = "@annotation(com.example.demo.annotation.ErrorLog)")
    private void errorLog() {
    }

    @Before(value = "pointcut() && errorLog()")
    public void before(JoinPoint joinPoint) {
        log.debug("before", joinPoint);
    }

    @After(value = "pointcut() && errorLog()")
    public void after(JoinPoint joinPoint) {
        log.debug("after", joinPoint);
    }

    @AfterReturning(pointcut = "pointcut() && errorLog()", returning = "obj")
    public void afterReturn(JoinPoint joinPoint, Object obj) {
        log.debug("afterReturn", joinPoint, obj);
    }

    @AfterThrowing(pointcut = "pointcut() && errorLog()", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
        log.debug(joinPoint.getSignature().toShortString(), ex);
    }
}
