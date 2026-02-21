package com.appsquad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStaff {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();

        Staff s = manager.find(Staff.class, 1);

        if (s != null) {
            System.out.println("Staff ID : " + s.getSid());
            System.out.println("Staff Name : " + s.getSname());
        } else {
            System.out.println("Staff record not found");
        }

        manager.close();
        factory.close();
    }
}
