import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectDeSerializeProgramDemo {

	/**
	 * @param args
	 */
	 public static void main(String [] args) throws ClassNotFoundException
	   {
	      Employee employeeObjet = new Employee();
	      String path="C:\\Users\\Shashir Bharadwaj\\Desktop\\Serialize.bin";
	      try
	      {
	         FileInputStream fileIn = new FileInputStream(path);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         employeeObjet = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      System.out.println("Objet Deserialization Details");
	      System.out.println("Name: " + employeeObjet.name);
	      System.out.println("Address: " + employeeObjet.address);
	      System.out.println("Number: " + employeeObjet.number);
	      System.out.println("Salary: "+employeeObjet.salary.salary);
	      System.out.println("Frieds Name: "+employeeObjet.friends.friendName);
	   }
	}