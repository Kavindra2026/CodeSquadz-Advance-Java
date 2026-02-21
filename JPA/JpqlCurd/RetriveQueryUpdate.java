package mypack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

public class RetriveQueryUpdate {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager manger = factory.createEntityManager();
        EntityTransaction t = manger.getTransaction();
        t.begin();
        
        Query query = manger.createQuery("UPDATE Student e SET e.firstname = 'Hathi123' WHERE e.id=54211");
        query.executeUpdate();
        
        t.commit();
        manger.close();
        factory.close();
    }
}