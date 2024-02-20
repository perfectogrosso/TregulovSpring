package org.example.tregulovspring.AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* org.example.tregulovspring.AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(public void org.example.tregulovspring.AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsFromUniLibraryExceptReturnMagazine(){
//    }
//
//    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineLoggingAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineLoggingAdvice: log #4");
//    }


//    @Pointcut("execution(* org.example.tregulovspring.AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* org.example.tregulovspring.AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }



    @Before("org.example.tregulovspring.AOP.Aspects.Pointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
    }
}
