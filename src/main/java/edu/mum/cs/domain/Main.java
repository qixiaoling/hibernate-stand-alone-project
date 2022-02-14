package edu.mum.cs.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("edu.mum.cs");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        Person p = new Person(null, "Xiaoling", "Qi");
        em.persist(p);

        em.createQuery("from people");
        em.createNativeQuery("select * from mycustomizedperson");
        transaction.commit();
        em.close();
    }
}
