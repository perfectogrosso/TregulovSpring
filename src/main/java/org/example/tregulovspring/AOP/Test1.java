package org.example.tregulovspring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Library libraryBean = context.getBean("libraryBean", Library.class);
        libraryBean.getBook();

        context.close();
    }
}
