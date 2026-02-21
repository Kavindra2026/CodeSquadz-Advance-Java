package com.appsquadz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.appsquadz.NonTeachingStaff;
import com.appsquadz.TeachingStaff;

public class Client {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        Staff s = new Staff(101, "pappu");
        
        // Teaching staff entity
        TeachingStaff ts1 = new TeachingStaff(1, "lalu", "10th", "Maths");
        TeachingStaff ts2 = new TeachingStaff(2, "rabari", "5th", "English");

        // Non-Teaching Staff entity
        NonTeachingStaff nts1 = new NonTeachingStaff(3, "meesa", "Accounts");
        NonTeachingStaff nts2 = new NonTeachingStaff(4, "lalubeta", "Office");

        // storing all entities
        entitymanager.persist(s);
        entitymanager.persist(ts1);
        entitymanager.persist(ts2);
        entitymanager.persist(nts1);
        entitymanager.persist(nts2);

        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}