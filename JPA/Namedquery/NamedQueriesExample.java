package mypack;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQueriesExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appsquadzjpa");
        EntityManager em = emf.createEntityManager();
        try {
            EntityTransaction entr = em.getTransaction();
            entr.begin();
            
            //Query query=em.createNamedQuery("empGetRecords");
            Query query = em.createNamedQuery("empAllRecords");
            
            List list = query.getResultList();
            Iterator<Employee> itr = list.iterator();
            while (itr.hasNext()) {
                Employee emp = itr.next();
                System.out.print("Emp Name: " + emp.getEmpName());
                System.out.print(" Salary: " + emp.getEmpSalary());
                System.out.println();
            }

            //second query
            Query query1 = em.createNamedQuery("empDeleteRecords");
            query1.setParameter(1, 2022);
            int deletedData = query1.executeUpdate();
            System.out.println(deletedData + " record is deleted.");
            
            entr.commit();
        } finally {
            em.close();
        }
    }
}