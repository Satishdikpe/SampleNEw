import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {
public static void main(String[] args) {
	TreeMap<String, Integer> ts = new TreeMap<String,Integer>();
ts.put("Satish", 111);
ts.put("Manisha", 112);
ts.put("Srujan", 113);
System.out.println(ts);

TreeMap<Integer,String> ts1 = new TreeMap<Integer,String>();
ts1.put(112, "Satish");
ts1.put(115, "Manisha");
ts1.put(111, "Srujan");
ts1.put(119, "Dipke");
System.out.println(ts1);
}
}
