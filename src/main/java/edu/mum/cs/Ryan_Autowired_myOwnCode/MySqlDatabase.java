package edu.mum.cs.Ryan_Autowired_myOwnCode;

import edu.mum.cs.Ryan_Solution.IoC;
import org.springframework.stereotype.Component;

@Component("mySql")
public class MySqlDatabase implements Database {
    public void persist (String data) {

        System.out.println("MySql prints data..."+ data);
    }
}
