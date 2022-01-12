import java.util.Comparator;
import java.util.TreeSet;

public class Test7 {
public static void main(String[] args) {
	TreeSet<Product> t = new TreeSet<Product>(new MyComp2());
	t.add(new Product(111,"Shampoo",12.50));
	t.add(new Product(112,"hair oil",20.50));
	t.add(new Product(113,"soap",11.50));
	t.add(new Product(114,"face wash",30.50));
	for (Product p : t) {
		System.out.println(p.pid+"---"+p.pname+"----"+p.cost);
		
	}
}
}

class MyComp2 implements Comparator<Product>
{
	@Override
	public int compare(Product P1, Product P2) {
		// TODO Auto-generated method stub
		if(P1.pid==P2.pid)
			return 0;
		if(P1.pid<P2.pid)
			return 1;
		else
			return -1;
	}
}
		 

