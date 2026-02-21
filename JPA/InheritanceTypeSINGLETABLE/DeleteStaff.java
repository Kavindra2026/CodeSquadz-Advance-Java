package com.appsquad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStaff {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction t = manager.getTransaction();

        t.begin();

        Staff s = manager.find(Staff.class, 2);
        if (s != null) {
            manager.remove(s);
        }

        t.commit();

        manager.close();
        factory.close();

        System.out.println("Staff record deleted");
    }
}
