import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	h.put(111, "Satish");
	h.put(112, "Dipke");
	h.put(114, "Manisha");
	h.put(113, "Alane");
	h.put(116, "Hingoli");
	h.put(115, "Basmat");
	System.out.println(h);
	Set<Integer> s=h.keySet();
	System.out.println(s);
	Collection<String> s1 =  h.values();
	System.out.println(s1);
	Set<Entry<Integer, String>> s2 = h.entrySet();
	System.out.println(s2);
	for (Entry<Integer, String> e : s2) {
		System.out.println(e.getKey()+"--"+e.getValue());
	}
}
}
