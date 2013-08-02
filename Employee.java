import java.io.Serializable;

public class Employee implements Serializable
{
   public String name;
   public String address;
   public int number = 10;
   Salary salary=new Salary();
   Friends friends = new Friends();
}