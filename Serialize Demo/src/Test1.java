import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
class student
{}
class university {}

public class Test1 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	ArrayList<Emp> al = new ArrayList<Emp>();
	ArrayList<student> al1 = new ArrayList<student>();
	ArrayList<university> al2 = new ArrayList<university>();
	al.add(new Emp(111,"Satish"));
	al.add(new Emp(112,"Satish"));
	al.add(new Emp(113,"Satish"));
	FileOutputStream fis = new FileOutputStream("abc.txt");
	ObjectOutputStream ois = new ObjectOutputStream(fis);
	ois.writeObject(al);
	ois.writeObject(al1);
	ois.writeObject(al2);
	System.out.println("Serialization complete");
	
	FileInputStream fil = new FileInputStream("abc.txt");
	ObjectInputStream oil = new ObjectInputStream(fil);
	ArrayList<Emp> nal = (ArrayList<Emp>)oil.readObject();
	ArrayList<student> nal2 = (ArrayList<student>)oil.readObject();
	ArrayList<university> nal3 = (ArrayList<university>)oil.readObject();
	for (Emp e : nal) {
		System.out.println(e.eid+"--"+e.ename);
	}
	for (student e1 : nal2) {
		System.out.println(e1);
	}
	for (university e2 : nal3) {
		System.out.println(e2);
	}
	oil.close();
	
}
}
