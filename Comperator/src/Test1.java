import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {
	ArrayList<Emp> al=new ArrayList<Emp>();
al.add(new Emp(111,"Satish"));
al.add(new Emp(113,"Dipke"));
al.add(new Emp(112,"Manisha"));
al.add(new Emp(114,"Alane"));
Collections.sort(al,new EidComp());
	for (Emp ee : al) {
		System.out.println(ee.eid+"-----"+ee.ename);
	}
	
	Collections.sort(al,new EnameComp());
	for (Emp ee : al) {
		System.out.println(ee.eid+"-------"+ee.ename);
	}
	}}
