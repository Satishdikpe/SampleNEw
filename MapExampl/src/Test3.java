import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test3 {
public static void main(String[] args) {
	LinkedHashMap<Integer, Product> h = new LinkedHashMap<Integer,Product>();
h.put(1,new Product(111,"Shampoo",12.50));
h.put(3,new Product(113,"hair oil",50.50));
h.put(2,new Product(112,"face wash",75.50));
h.put(4,new Product(114,"treemer",124.50));

for (Product p : h.values()) {
	System.out.println(p.pcost+"--"+p.pid+"---"+p.Pname);
}
System.out.println("-----------------------------------------------------");
Set<java.util.Map.Entry<Integer, Product>> s = h.entrySet();
Iterator<java.util.Map.Entry<Integer, Product>> itr = s.iterator();
while(itr.hasNext())
{
java.util.Map.Entry<Integer, Product> ee = itr.next();
Product pp = ee.getValue();
if(pp.pid==111)
	itr.remove();
if(pp.Pname.equals("hair oil"))
	itr.remove();
}
Set<java.util.Map.Entry<Integer, Product>> s1 = h.entrySet();
Iterator<java.util.Map.Entry<Integer, Product>> itr2 = s1.iterator();
for (java.util.Map.Entry<Integer, Product> ee2 : s1) {
	Product p = ee2.getValue();
	System.out.println(p.pcost+"--"+p.pid+"---"+p.Pname);
}
}
}
