package edu.mum.cs.Ryan_Solution;


public class IoC {
    public static void main(String[] args) {
        IoC container = new IoC();
        User user = container.new User(container.new MySqlDatabase());
        user.add("This is data from main");

    }
    public class User {

        MySqlDatabase database;

        public User(MySqlDatabase database){
            this.database = database;
        }
        public void add(String dataUserClass){
            database.persist(dataUserClass);
        }
    }
    public class MySqlDatabase {
        public void persist(String data) {
            System.out.println("Mysql has persisted: " + data);
        }
    }
}

