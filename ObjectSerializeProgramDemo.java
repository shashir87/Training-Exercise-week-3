import java.io.*;

public class ObjectSerializeProgramDemo
{
	   public static void main(String [] args) throws ClassNotFoundException
	   {
	      Employee employeeObjet = new Employee();
	      employeeObjet.name = "Shashir Bharadwaj";
	      employeeObjet.address = "Some Address";
	      employeeObjet.number = 101;
	      employeeObjet.salary.salary=25000;
	      employeeObjet.friends.friendName="No One";
	      String path="C:\\Users\\Shashir Bharadwaj\\Desktop\\Serialize.bin";
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream(path);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(employeeObjet);
	         out.close();
	         fileOut.close();
	         System.out.println("Objet serialization completed");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	}