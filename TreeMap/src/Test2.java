import java.util.TreeMap;

public class Test2 {
public static void main(String[] args) {
	TreeMap<String,Integer> ts = new TreeMap<String,Integer>();
	ts.put("Satish",111);
	TreeMap<String,Integer> ts1 = new TreeMap<String,Integer>(ts);
	ts1.put("manisha",112);
	System.out.println(ts1);
	TreeMap<String,Integer> t1 = new TreeMap<String,Integer>();
	t1.put("aaa",11);
	TreeMap<String,Integer> t2 = new TreeMap<String,Integer>();
	t2.put("bbb", 12);
	TreeMap<String,Integer> t3 = new TreeMap<String,Integer>();
	t3.putAll(t1);
	t3.putAll(t2);
	t3.put("ccc", 13);
	System.out.println(t3);
}
}
