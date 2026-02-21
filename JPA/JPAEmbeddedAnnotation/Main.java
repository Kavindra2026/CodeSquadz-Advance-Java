package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main
{
    public static void main(String[] args)
    {
        EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("appsqldzjpa");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction t = manager.getTransaction();

        t.begin();

        Address address =
            new Address("appsquad", "noida", "india", "110085");

        Student student = new Student("lalu", address);

        System.out.println("persisting entities...");
        manager.persist(student);

        t.commit();
        manager.close();
        factory.close();

        System.out.println("Successfully persisted.");
    }
}
/*Short Explanation

Address @Embeddable object hai

Student entity ke andar address embed hota hai

Alag table nahi banti, same table me columns add hote hain */