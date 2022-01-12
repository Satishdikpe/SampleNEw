import java.util.SortedMap;
import java.util.TreeMap;

public class Test3 {
public static void main(String[] args) {
	TreeMap<Integer, String> t = new TreeMap<Integer,String>();
	t.put(1, "SAtish");
	t.put(2, "Manisha");
	t.put(4, "Srujan");
	t.put(15, "Dipali");
	t.put(12, "Dipke");
System.out.println(t);
SortedMap<Integer,String> sm = t.subMap(4, 15);
TreeMap<Integer, String> t1 = new TreeMap<Integer,String>(sm);
System.out.println(t1);

SortedMap<Integer, String> sm2 = t.tailMap(10);
TreeMap<Integer,String> t2 = new TreeMap<Integer,String>(sm2);
System.out.println(t2);

SortedMap<Integer, String> sm3 = t.headMap(5);
TreeMap<Integer, String> t3 = new TreeMap<Integer,String>(sm3);
System.out.println(t3);
}
}
