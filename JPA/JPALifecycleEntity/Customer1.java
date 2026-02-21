package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import java.io.Serializable;

@Entity
public class Customer1 implements Serializable
{
    @Id
    private int id;

    private String lastName;
    private String firstName;

    Customer1(int id, String lastName, String firstName)
    {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Customer1()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int pk)
    {
        id = pk;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @PrePersist
    public void prePersist()
    {
        System.out.println("@PrePersist");
    }

    @PostPersist
    public void postPersist()
    {
        System.out.println("@PostPersist");
    }

    @PostLoad
    public void postLoad()
    {
        System.out.println("@PostLoad");
    }

    @PreUpdate
    public void preUpdate()
    {
        System.out.println("@PreUpdate");
    }

    @PostUpdate
    public void postUpdate()
    {
        System.out.println("@PostUpdate");
    }

    @PreRemove
    public void preRemove()
    {
        System.out.println("@PreRemove");
    }

    @PostRemove
    public void postRemove()
    {
        System.out.println("@PostRemove");
    }
}
