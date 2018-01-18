package Practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Student implements java.io.Serializable{
	public String name;
	public String addr;
	public transient int SSN;
	public int number;
}

public class deserializingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s=null;
			try{
				FileInputStream file=new FileInputStream("/tmp/file.ser");
				ObjectInputStream ip=new ObjectInputStream(file);
				s=(Student) ip.readObject();
				System.out.println(s.addr+" "+s.name +" "+s.number+" "+s.SSN);
				
			}catch(IOException i){
				i.printStackTrace();
			}catch(ClassNotFoundException c){
				c.printStackTrace();
			}
	}

}
