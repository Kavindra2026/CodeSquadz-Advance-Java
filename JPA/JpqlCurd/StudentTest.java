package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentTest {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager manger = factory.createEntityManager();
        EntityTransaction t = manger.getTransaction();
        t.begin();
        
        Student std1 = new Student(7989, "neeta", "ambani", "neeta@gmail.com");
        Student std2 = new Student(7990, "esha", "ambani", "esha@gmail.com");
        
        System.out.println("persisting entities....");
        manger.persist(std1);
        manger.persist(std2);
        
        t.commit();
        manger.close();
        factory.close();
        System.out.println("Successfully persisted.");
    }
}