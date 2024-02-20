package org.example.tregulovspring.AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("org.example.tregulovspring.AOP.Aspects.Pointcuts.allGetMethods()")
    public void beforeGetExceptionHandlerAdvice(){
        System.out.println("beforeGetExceptionHandlerAdvice: ловим/обрабатываем исключение при попытке получить " +
                "книгу/журнал");
    }
}
