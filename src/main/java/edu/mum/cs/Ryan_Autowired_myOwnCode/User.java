package edu.mum.cs.Ryan_Autowired_myOwnCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Component("user")
public class User {

    private Database database;

    public User() {
    }
    @Autowired
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

}
