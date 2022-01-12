import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test2 {
public static void main(String[] args) {
	LinkedHashMap<Emp, student> lhm = new LinkedHashMap<Emp,student>();
lhm.put(new Emp(111,"Satish"),new student(1,"Dipke"));
lhm.put(new Emp(112,"Manisha"),new student(2,"Alane"));
Set<Emp> s= lhm.keySet();
for (Emp e : s) {
	System.out.println(e.eid+"---"+e.ename);
}
for (Emp ee : lhm.keySet()) {
	System.out.println(ee.eid+"----"+ee.ename);
}
for (student ss : lhm.values()) {
	System.out.println(ss.sid+"---"+ss.sname);
}
Set<java.util.Map.Entry<Emp, student>> s1=lhm.entrySet();
Iterator<java.util.Map.Entry<Emp, student>> itr = s1.iterator();
while(itr.hasNext())
{ java.util.Map.Entry<Emp,student> ee = itr.next();
	Emp e = ee.getKey();
	System.out.println(e.eid+"----"+e.ename);
	student sss = ee.getValue();
	System.out.println(sss.sid+"----"+sss.sname);
}
}
}
