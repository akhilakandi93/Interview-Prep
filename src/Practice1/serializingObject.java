package Practice1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student1 implements java.io.Serializable{
	public String name;
	public String addr;
	public transient int SSN;
	public static int c;
	public int number;
}
public class serializingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.name="Akhila";
		s.addr="429 COLUMBUS AVE";
		s.number=101;
		s.c=2;
		s.SSN=15230000;
		//System.out.println(s.SSN);
		try{
			FileOutputStream file =new FileOutputStream("/tmp/file.ser");
			ObjectOutputStream op=new ObjectOutputStream(file);
			op.writeObject(s);
			op.close();
			file.close();
			System.out.println("File has been serialized successfully");
			
		}
		catch(IOException i){
			i.printStackTrace();
		}
	}

}
