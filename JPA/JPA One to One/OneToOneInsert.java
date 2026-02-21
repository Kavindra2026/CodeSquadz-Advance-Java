package mypack;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;

public class OneToOneInsert {

    public static void main(String[] a) throws Exception {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student std = new Student();
        Department d = new Department();

        std.setId(9090);
        std.setName("lalu9090");

        d.setId(1020);
        d.setName("cmc1020");

        std.setDepartment(d);

        em.persist(std);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
