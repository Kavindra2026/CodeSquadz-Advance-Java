package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaManyToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadjpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Artist genre = em.find(Artist.class, new Integer(1));
        System.out.println("---- Finding genre ----");
        System.out.println(genre.getId());
        System.out.println(genre.getName());

        for (Genre ge : genre.getGenres()) {
            System.out.println(ge.getId());
            System.out.println(ge.getName());
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
