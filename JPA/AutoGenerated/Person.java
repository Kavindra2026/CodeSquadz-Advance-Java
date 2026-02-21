package mypack;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
@Table(name="Person14")
public class Person implements Serializable
{
    //@Id
    //@GeneratedValue
    //@GeneratedValue(strategy=GenerationType.TABLE)
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    //@GeneratedValue(strategy=GenerationType.AUTO)

    @Id
    @SequenceGenerator(
        name="SEQ_GEN",
        sequenceName="jpaseq70",
        allocationSize=1
    )
    @GeneratedValue(
        strategy=GenerationType.SEQUENCE,
        generator="SEQ_GEN"
    )
    private long id;

    private String name;
    private String surname;

    public Person()
    {
    }

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public String toString()
    {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}
