import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test2 {
public static void main(String[] args) {
	ArrayList<Emp> al = new ArrayList<Emp>();
	al.add(new Emp(114,"Satish"));
	al.add(new Emp(111,"Dipke"));
	al.add(new Emp(113,"Manisha"));
	al.add(new Emp(112,"Alane"));
Collections.sort(al);
for (Emp ee : al) {
	System.out.println(ee.eid+"-----"+ee.ename);
}
}
}
