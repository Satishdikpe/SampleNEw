import java.util.Comparator;
import java.util.TreeSet;

public class Test6 {
public static void main(String[] args) {
	TreeSet<String> t = new TreeSet<String>(new MyComp());
t.add("Satish");
t.add("Dipke");
t.add("Manisha");
t.add("Alane");
System.out.println(t);

System.out.println("----------------------------------------------------------------");
TreeSet<Integer> t1 = new TreeSet<Integer>(new MynewComp());
t1.add(10);
t1.add(9);
t1.add(8);
t1.add(7);
t1.add(6);
t1.add(5);
t1.add(4);
t1.add(3);
t1.add(2);
t1.add(1);
System.out.println(t1);
}
}
class MynewComp implements Comparator<Integer>
{  @Override
public int compare(Integer i1, Integer i2) {
	// TODO Auto-generated method stub
	return -i1.compareTo(i2);
}

}

class MyComp implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
}


