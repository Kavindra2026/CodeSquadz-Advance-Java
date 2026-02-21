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

        Project project = new Project();
        project.setProjectName("TPO");
        project.setProjectStatus(ProjectStatus.INPROGRESS);

        System.out.println("persisting entities...");
        manager.persist(project);

        t.commit();
        manager.close();
        factory.close();

        System.out.println("Successfully persisted.");
    }
}
// Short Explanation

//Enum value INPROGRESS database me store hoti hai

//persist() ke baad transaction commit hone par record insert hota hai