import java.io.*;

public class ObjectSerializeAndDeserializeProgramDemo
{
	   public static void main(String [] args) throws ClassNotFoundException
	   {
	      Employee employeeObjet = new Employee();
	      employeeObjet.name = "Shashir Bharadwaj";
	      employeeObjet.address = "Some Address";
	      employeeObjet.number = 101;
	      String path="C:\\Users\\Shashir Bharadwaj\\Desktop\\Serialize.txt";
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream(path);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(employeeObjet);
	         out.close();
	         fileOut.close();
	         System.out.println("Objet serialization completed");
	         
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
	   }
	}