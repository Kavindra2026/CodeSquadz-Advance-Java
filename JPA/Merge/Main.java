package mypack;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//After merging in an entity we can change its property and the EntityManager would update the database automatically.

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager manger = factory.createEntityManager();
        EntityTransaction t = manger.getTransaction();
        t.begin();

        Employee emp = new Employee();
        emp.setName("lalu420");
        manger.persist(emp);
        t.commit();
        manger.close();
        factory.close();

        factory = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager manger1 = factory.createEntityManager();
        t = manger1.getTransaction();
        t.begin();

        // emp = manger.find (Employee.class, emp.getId());
        //System.out.println(emp);

        Employee managedEmp = manger1.merge(emp);
        managedEmp.setLastAccessTime(new Date());
        managedEmp.setName("lalu888");

        t.commit();
        manger1.close();
        factory.close();
        System.out.println("Successfully persisted.");
    }
}