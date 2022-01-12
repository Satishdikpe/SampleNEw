import java.util.Comparator;

import java.util.Set;
import java.util.TreeMap;

public class Test5 {
public static void main(String[] args) {
	TreeMap<Product, Integer> tm = new TreeMap<Product,Integer>(new MyComp1());
tm.put(new Product(111,"Shampoo"), 11);
tm.put(new Product(113,"face wash"), 13);
tm.put(new Product(112,"hair oil"), 12);
tm.put(new Product(114,"Treemer"), 14);
Set<Product> ss = tm.keySet();
for (Product pp : ss) {
	System.out.println(pp.pid+"--"+pp.Pname);
}

}
}
class MyComp1 implements Comparator<Product>
{
	

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return -p1.pid.compareTo(p2.pid);
	}
}