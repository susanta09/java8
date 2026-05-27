package SerializetionDEmo;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileImageInputStream;

class Dog implements Serializable
{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 6453503765454427129L;
	String name;
	 int i;
	int j;
	String user="ok";
	public Dog(String name, int i, int j) {
		super();
		this.name = name;
		this.i = i;
		this.j = j;
	}
	public Dog() {
		System.out.println("Dog class constructor call");
	}
//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		out.writeObject(name);
//		out.writeInt(i);
//	}
//	@Override
//	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		name=(String)in.readObject();
//		i=in.readInt();	
//	}
	
}
public class Demo1 {
	public static void main(String[] args) throws Exception {
//		Dog d1=new Dog("susanta", 10, 20);
//		FileOutputStream fos=new FileOutputStream("abc.ser");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(d1);
//		System.out.println("sending is successfull");
		System.out.println("Reciving is started");
		Dog d=new Dog();
		System.out.println(d.user);
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.name+"...."+d2.i+"...."+d2.j+"..."+d2.user);
		Dog d1=new Dog();
		System.out.println(d1.user);
	}

}
