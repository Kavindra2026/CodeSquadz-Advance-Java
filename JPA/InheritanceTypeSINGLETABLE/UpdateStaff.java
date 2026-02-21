package com.appsquad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStaff {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction t = manager.getTransaction();

        t.begin();

        Staff s = manager.find(Staff.class, 1);
        if (s != null) {
            s.setSname("UpdatedName");
            manager.merge(s);
        }

        t.commit();

        manager.close();
        factory.close();

        System.out.println("Staff record updated");
    }
}
