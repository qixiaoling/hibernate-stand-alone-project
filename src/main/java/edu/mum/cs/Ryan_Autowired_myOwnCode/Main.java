package edu.mum.cs.Ryan_Autowired_myOwnCode;

import edu.mum.cs.domain.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Database mySqlDatabase = context.getBean("mySql", MySqlDatabase.class);
    User user = context.getBean("user", User.class);
    System.out.println(user.getDatabase());
//  System.out.println("hi "+ mySqlDatabase.getClass());




}
}
