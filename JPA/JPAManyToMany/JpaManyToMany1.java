package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaManyToMany1 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("appsquadjpa");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Genre genre = em.find(Genre.class, new Integer(1));
        System.out.println("---- Finding genre ----");
        System.out.println(genre.getId());
        System.out.println(genre.getName());

        for (Artist artist : genre.getArtists()) {
            System.out.println(artist.getId());
            System.out.println(artist.getName());
        }

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
