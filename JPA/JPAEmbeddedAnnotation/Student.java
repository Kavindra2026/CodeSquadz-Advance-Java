package mypack;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT999")
public class Student
{
    private long studentId;
    private String studentName;
    private Address studentAddress;

    public Student()
    {
    }

    public Student(String studentName, Address studentAddress)
    {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Id
    @GeneratedValue
    @Column(name="STUDENT_ID")
    public long getStudentId()
    {
        return studentId;
    }

    public void setStudentId(long studentId)
    {
        this.studentId = studentId;
    }

    @Column(name="STUDENT_NAME", nullable=false, length=100)
    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    @Embedded
    public Address getStudentAddress()
    {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress)
    {
        this.studentAddress = studentAddress;
    }
}
/*Short Explanation

@Embedded → Address ke columns Student table me add hote hain

Reusable component design milta hai */