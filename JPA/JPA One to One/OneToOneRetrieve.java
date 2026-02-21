package mypack;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;

public class OneToOneRetrieve {

    public static void main(String[] a) throws Exception {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Query query = em.createQuery("SELECT e FROM Student e");

        List<Student> list = (List<Student>) query.getResultList();

        Iterator i = list.iterator();

        while (i.hasNext()) {

            Student std = (Student) i.next();

            System.out.println(std.getId());
            System.out.println(std.getName());

            System.out.println(std.getDepartment().getId());
            System.out.println(std.getDepartment().getName());
        }

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
