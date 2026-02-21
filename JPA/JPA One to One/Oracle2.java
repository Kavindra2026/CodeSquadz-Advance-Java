package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Oracle2 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        System.out.println("Transaction Started");

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Transaction Completed");
    }
}
