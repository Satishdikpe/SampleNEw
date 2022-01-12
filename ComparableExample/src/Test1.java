import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	LinkedList<Product> ll = new LinkedList<Product>();
	ll.add(new Product(113,"TeaPowder",500));
	ll.add(new Product(112,"Ditergent",40));
	ll.add(new Product(114,"DettolSoap",550));
	ll.add(new Product(111,"Toothpest",352));
Collections.sort(ll);
for (Product pp : ll) {
	System.out.println(pp.pname+"----"+pp.pcost+"----"+pp.pid);
}
}
}
