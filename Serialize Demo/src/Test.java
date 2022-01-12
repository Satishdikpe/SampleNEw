import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Test {

	void Serelize() throws IOException
	{
		Emp e = new Emp(111,"Satish");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("Serialization completed");
	}
	void deserialization() throws IOException, ClassNotFoundException
	{
	FileInputStream fis = new FileInputStream("abc.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Emp e = (Emp)ois.readObject();
	System.out.println(e.eid+"---"+e.ename);
	ois.close();
		}
public static void main(String[] args) throws IOException, ClassNotFoundException
{
	Test t = new Test();
	t.Serelize();
	t.deserialization();

}
}

