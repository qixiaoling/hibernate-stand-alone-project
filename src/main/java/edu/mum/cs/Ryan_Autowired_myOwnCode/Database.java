package edu.mum.cs.Ryan_Autowired_myOwnCode;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("database")
public interface Database {
    void persist (String data);
}
