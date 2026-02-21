package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTest
{
    public static void main(String[] args)
    {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsqldzjpa");

        EntityManager manager = factory.createEntityManager();

        EntityTransaction t = manager.getTransaction();
        t.begin();

        System.out.println("Hello");

        Customer1 std1 = new Customer1(3024, "rishesh", "gupta");
        Customer1 std2 = new Customer1(3025, "dinesh2", "chawla55");
        Customer1 std3 = new Customer1(4026, "ramesh3", "gupta");
        Customer1 std4 = new Customer1(4027, "dinesh4", "chawla55");

        System.out.println("persisting entities...");
        manager.persist(std1);
        manager.persist(std2);
        manager.persist(std3);
        manager.persist(std4);

        t.commit();
        manager.close();
        factory.close();

        System.out.println("Successfully persisted.");
    }
}
