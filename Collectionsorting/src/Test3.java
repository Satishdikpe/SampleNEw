import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test3 {
public static void main(String[] args) {
	ArrayList<Emp1> al = new ArrayList<Emp1>();
	al.add(new Emp1(114,"Satish"));
	al.add(new Emp1(111,"Dipke"));
	al.add(new Emp1(113,"Manisha"));
	al.add(new Emp1(112,"Alane"));
Collections.sort(al);
for (Emp1 ee : al) {
	System.out.println(ee.eid+"-----"+ee.ename);
}
}
}

