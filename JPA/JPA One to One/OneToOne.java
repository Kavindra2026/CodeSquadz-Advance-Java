package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOne {

    public static void main(String[] a) throws Exception {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Student1 std = em.find(Student1.class, 9090);

        System.out.println(std.getId());
        System.out.println(std.getName());

        System.out.println(std.getDepartment().getId());
        System.out.println(std.getDepartment().getName());

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
