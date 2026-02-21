package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("appsquadzpa");

        EntityManager manager = factory.createEntityManager();
        EntityTransaction t = manager.getTransaction();

        t.begin();

        CreditAccount account = new CreditAccount();
        account.setBalance(10000.0);
        account.setInterestRate(10.0);
        account.setOwner("Ramesh");
        account.setCreditLimit(10000.0);

        System.out.println("Persisting entity...");
        manager.persist(account);

        t.commit();

        manager.close();
        factory.close();

        System.out.println("Successfully persisted.");
    }
}
