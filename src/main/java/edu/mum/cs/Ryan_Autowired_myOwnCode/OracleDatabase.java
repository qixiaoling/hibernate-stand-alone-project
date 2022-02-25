package edu.mum.cs.Ryan_Autowired_myOwnCode;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleDatabase implements Database {
    public void persist (String data){
        System.out.println("Oracle prints data..."+ data);
    }
}
