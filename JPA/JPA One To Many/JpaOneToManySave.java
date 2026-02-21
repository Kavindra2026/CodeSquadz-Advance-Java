package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class JpaOneToManySave {

    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Artist art = new Artist();
        art.setArtist_id(840);
        art.setArtist_name("akhilesh");

        Albums ab1 = new Albums(9871, "deshdrohi1", 2024);
        Albums ab2 = new Albums(9881, "deshdrohi2", 2023);
        Albums ab3 = new Albums(9891, "deshdrohi3", 2022);

        ArrayList<Albums> al = new ArrayList<Albums>();
        al.add(ab1);
        al.add(ab2);
        al.add(ab3);

        art.setAlbums(al);

        em.persist(art);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
