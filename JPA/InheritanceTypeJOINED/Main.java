package com.appsquad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction t = manager.getTransaction();

        t.begin();

        NonTeachingStaff nts =
                new NonTeachingStaff(1, "Ramesh", "Administration");

        TeachingStaff ts =
                new TeachingStaff(2, "Suresh", "M.Tech", "Java");

        manager.persist(nts);
        manager.persist(ts);

        t.commit();

        manager.close();
        factory.close();

        System.out.println("Staff records persisted successfully");
    }
}
