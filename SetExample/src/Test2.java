import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {
public static void main(String[] args) {
	LinkedHashSet<Emp> lhs = new LinkedHashSet<Emp>(); 
lhs.add(new Emp(111,"Satish"));
lhs.add(new Emp(112,"Rambhau"));
lhs.add(new Emp(113,"Dipke"));
Iterator<Emp> i = lhs.iterator();
while(i.hasNext())
{
	Emp ee = i.next();
	if (ee.eid==113)
		i.remove();
	if(ee.ename.equals("Satish"))
		i.remove();
	
	}
for (Emp e : lhs) {
	System.out.println(e.eid+"----"+e.ename);	
}
}
}
