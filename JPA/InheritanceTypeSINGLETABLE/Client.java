package com.appsquad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.appsquad.NonTeachingStaff;
import com.appsquad.TeachingStaff;

public class Client {

    public static void main(String[] args) {

        EntityManagerFactory emfactory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager entitymanager = emfactory.createEntityManager();

        entitymanager.getTransaction().begin();

        // Teaching staff entity
        TeachingStaff ts1 =
                new TeachingStaff(1, "Lalu", "10th", "Maths");

        TeachingStaff ts2 =
                new TeachingStaff(2, "Rabi", "5th", "English");

        // Non-Teaching staff entity
        NonTeachingStaff nts1 =
                new NonTeachingStaff(3, "Meena", "Accounts");

        NonTeachingStaff nts2 =
                new NonTeachingStaff(4, "Alubeta", "Office");

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
