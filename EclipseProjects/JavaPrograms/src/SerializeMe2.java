import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable{
	int eId;  
	String eName;
	public Employee(int eId, String eName) {  
	  this.eId = eId;  
	  this.eName = eName;  
	}  
	
	public String toString() {
		return eId + eName;
	}
}

class Company implements Serializable {
	 int id;  
	 String name;  
	 ArrayList<Employee> employee;
	 public Company(int id, String name, ArrayList<Employee> employee) {  
	  this.id = id;  
	  this.name = name; 
	  this.employee = employee;
	 }  
}

class SerializeMe2 {
	public static void main(String[] args) throws ClassNotFoundException {

		 ArrayList<Employee> e = new ArrayList<>(); e.add(new Employee(101, "Daryl"));
		 e.add(new Employee(102, "Rick")); e.add(new Employee(103, "Michonne"));
		
		Company s1 = new Company(1, "TWD", e);
		
		// Serialization
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(s1);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		} catch(IOException ex) {
			System.out.println(ex);
		}


		Company object1 = null;

		// Deserialization
		try
		{
			FileInputStream file = new FileInputStream("file.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1 = (Company)in.readObject();
			
			
			System.out.println("Object has been deserialized ");
			System.out.println("id = " + object1.id);
			System.out.println("name = " + object1.name);
			System.out.println("employees = " + object1.employee);
			
			in.close();
			file.close();
		}
		
		catch(IOException ex) {
			System.out.println(ex);
		}

	}
}
