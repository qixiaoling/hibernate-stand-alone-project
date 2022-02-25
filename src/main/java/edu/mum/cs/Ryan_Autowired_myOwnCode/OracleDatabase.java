package edu.mum.cs.Ryan_Autowired_myOwnCode;


public class OracleDatabase implements Database {
    public void persist (String data){
        System.out.println("Oracle prints data...");
    }
}
