package com.appsquad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DisplayAllStaff {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();

        Query q = manager.createQuery("from Staff");
        List<Staff> list = q.getResultList();

        for (Staff s : list) {
            System.out.println(
                    s.getSid() + "  " + s.getSname()
            );
        }

        manager.close();
        factory.close();
    }
}
