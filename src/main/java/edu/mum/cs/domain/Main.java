package edu.mum.cs.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        System.out.println("hi "+ customerService.getCustomerDao());
//        Product product = context.getBean("Product", Product.class);
//        System.out.println("hi " + product.getCategory() );
        //Between entities/tables/classes, there is not really a need to do dependency injection
        //because you want juist the hard coded co-relation.
        //Via dependency inject, we want the dependencies to be flexible, like a plug in.
        //Therefore we don't use dependency injection between Produtct and Category.

    }
}
