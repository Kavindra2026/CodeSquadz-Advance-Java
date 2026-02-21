package com.appsquadz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        // Teaching staff entity
        TeachingStaff ts1 = new TeachingStaff(101, "lalu", "10th", "Maths");
        TeachingStaff ts2 = new TeachingStaff(201, "rabari", "5th", "English");

        // Non-Teaching Staff entity
        NonTeachingStaff nts1 = new NonTeachingStaff(30, "meesa", "Accounts");
        NonTeachingStaff nts2 = new NonTeachingStaff(40, "lalubeta", "Office");

        // storing all entities
        entitymanager.persist(ts1);
        entitymanager.persist(ts2);
        entitymanager.persist(nts1);
        entitymanager.persist(nts2);

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}