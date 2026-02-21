package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

public class JpaOneToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT a FROM Artist a");

        List<Artist> list =
            (List<Artist>) query.getResultList();

        Iterator i = list.iterator();

        while (i.hasNext()) {

            Artist std = (Artist) i.next();

            System.out.println(std.getArtist_id());
            System.out.println(std.getArtist_name());

            List<Albums> list1 = std.getAlbums();
            Iterator il = list1.iterator();

            while (il.hasNext()) {

                Albums std1 = (Albums) il.next();

                System.out.println(std1.getAlbum_id());
                System.out.println(std1.getAlbum_name());
                System.out.println(std1.getAlbum_year());
            }

            System.out.println("next artist");
        }

        em.close();
        emf.close();
    }
}
