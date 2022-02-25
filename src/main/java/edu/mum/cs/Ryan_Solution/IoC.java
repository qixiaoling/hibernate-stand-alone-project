package edu.mum.cs.Ryan_Solution;

import javax.xml.crypto.Data;

//rely on abstraction rather than concrete implementation
public class IoC {
    public static void main(String[] args) {
        IoC container = new IoC();
        User user = container.new User(container.new OracleDatabase());
        user.add("This is data from main");

    }
    public class User {

        Database database;

        public User(Database database){
            this.database = database;
        }
        public void add(String dataUserClass){
            database.persist(dataUserClass);
        }
    }
    public interface Database{
        void persist (String data);
    }
    public class MySqlDatabase implements Database{
        public void persist(String data) {
            System.out.println("Mysql has persisted: " + data);
        }
    }
    public class OracleDatabase implements Database {
        public void persist(String data) {
            System.out.println("Oracle has persisted: " + data);
        }
    }
}

