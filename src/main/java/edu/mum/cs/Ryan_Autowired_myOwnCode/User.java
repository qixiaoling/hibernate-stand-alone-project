package edu.mum.cs.Ryan_Autowired_myOwnCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("user")
public class User {

    @Autowired
    @Qualifier("oracle")
    private Database database;

    public User() {
    }

    public User(Database database) {
        System.out.println("customized constructor...from User");
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void add (String s){
        database.persist(s);
    }

}
