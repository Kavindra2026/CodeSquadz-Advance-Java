package mypack;

import javax.persistence.*;
import java.util.*;

public class JpaManyToOne {
    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("appsquadjpa");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT a FROM Albums a");
        List<Albums> list = query.getResultList();

        Iterator<Albums> i = list.iterator();

        while (i.hasNext()) {
            Albums std = i.next();

            System.out.println(std.getAlbum_id());
            System.out.println(std.getAlbum_name());
            System.out.println(std.getAlbum_year());

            Artist e = std.getArtist();
            System.out.println(e.getArtist_id());
            System.out.println(e.getArtist_name());
        }

        em.close();
        emf.close();
    }
}
