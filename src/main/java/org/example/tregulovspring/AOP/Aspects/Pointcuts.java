package org.example.tregulovspring.AOP.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(public * get*())")
    public void allGetMethods(){}
}
