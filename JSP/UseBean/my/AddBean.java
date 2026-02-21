package my;
import java.sql.*;
public class AddBean
{
private int firstno;
private int secondno;

public void setFirstno(int firstno)
{
this.firstno=firstno;
}
public void setSecondno(int secondno)
{
this.secondno=secondno;
}
public String getFirstno()
{
return firstno;
}
public String getSecondno()
{
return secondno;
}
public int add()
{
return firstno+secondno;
}
}