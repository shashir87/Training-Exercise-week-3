import com.thoughtworks.xstream.XStream;

public class XstreamProgramDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee employeeObjet = new Employee();
	      employeeObjet.name = "Shashir Bharadwaj";
	      employeeObjet.address = "Some Address";
	      employeeObjet.number = 101;
	      employeeObjet.salary.salary=25000;
	      employeeObjet.friends.friendName="No One";
	     XStream xstream=new XStream();
	  	 String xStreamObject=xstream.toXML(employeeObjet);

	  	Employee deserializedObject=(Employee)convertObjectTOXML.fromXML(xStreamObject);
	  	 

	}

}
