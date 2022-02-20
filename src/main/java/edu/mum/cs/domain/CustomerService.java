package edu.mum.cs.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        System.out.println("customeized constructor");
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("setter...");
        this.customerDao = customerDao;
    }
}
