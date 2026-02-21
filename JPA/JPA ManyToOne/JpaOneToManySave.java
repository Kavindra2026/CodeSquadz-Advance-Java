package mypack;

import javax.persistence.*;

public class JpaOneToManySave {
    public static void main(String[] args) {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("appsquadjpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Artist art = new Artist();
        art.setArtist_id(302);
        art.setArtist_name("pappu");

        Albums ab1 = new Albums(521, "padosan111", 2026, art);
        Albums ab2 = new Albums(522, "sharabiii", 2026, art);
        Albums ab3 = new Albums(523, "ststlll", 2026, art);

        em.persist(ab1);
        em.persist(ab2);
        em.persist(ab3);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
