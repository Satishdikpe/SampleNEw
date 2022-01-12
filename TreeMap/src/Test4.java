import java.util.Comparator;
import java.util.TreeMap;

public class Test4 {
public static void main(String[] args) {
	TreeMap<Integer, String> tm = new TreeMap<Integer,String>(new MyComp());
	tm.put(11, "Satish");
	tm.put(14, "Dipke");
	tm.put(12, "Manisha");
	tm.put(13, "Alane");
	System.out.println(tm);
}
}
class MyComp implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
}