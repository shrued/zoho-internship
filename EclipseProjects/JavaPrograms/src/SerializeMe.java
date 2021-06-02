import java.io.*;

class Student implements Serializable {
	 int id;  
	 String name;  
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
}

class SerializeMe {
	public static void main(String[] args) throws ClassNotFoundException {
		Student s1 = new Student(1, "Mike");
		
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


		Student object1 = null;

		// Deserialization
		try
		{
			FileInputStream file = new FileInputStream("file.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1 = (Student)in.readObject();
			
			
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.id);
			System.out.println("b = " + object1.name);
			
			in.close();
			file.close();
		}
		
		catch(IOException ex) {
			System.out.println(ex);
		}

	}
}
