package edu.mum.cs.Ryan_Original_Problem;

public class IoC {
    public static void main(String[] args) {
        IoC container = new IoC();
        User user = container.new User(container.new MySqlDatabase());
        user.add("This is data");

    }
    public class User {
        MySqlDatabase database;

        public User (MySqlDatabase database) {
//            this.database = new MySqlDatabase();
            //1st problem: impossible to test, because we need an actual instance of the database;
            //2nd problem: we cannot switch to another database. It is all hardcoded.
            this.database = database;
            //1st problem solved, now we only need to mock the database to test. but the 2nd problem is still remains
        }

        public void add (String dataUser) {
            database.persist(dataUser);
        }
    }
    public class MySqlDatabase {
        public void persist(String data) {
            System.out.println("Mysql has persisted: " + data);
        }
    }
}
