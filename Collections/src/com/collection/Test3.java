package com.collection;

import java.util.ArrayList;

public class Test3 {
public static void main(String[] args) {
	int[] a = {10,20,30};
for (int i : a) {
	System.out.println(i);
}
ArrayList a1 = new ArrayList();
a1.add(new Emp(111,"satish"));
a1.add(new student(1,"Manisha"));
for (Object aa : a1) {
	if (aa instanceof Emp) {
	Emp e = (Emp)aa;
	System.out.println(e.eid+"_________"+e.ename);
	}
	if(aa instanceof student)
	{
	student s =(student)aa;
	System.out.println(s.sid+"_____"+s.sname);
	}
}
Object o = a1.get(1);
for (Object ab : a1) {
	
if (ab instanceof Emp) {
	Emp e = (Emp)ab;
	System.out.println(e.eid+"_________"+e.ename);
	}
	if(ab instanceof student)
	{
	student s =(student)ab;
	System.out.println(s.sid+"_____"+s.sname);
	}
}
//providing type safety to collections using Generic concept
ArrayList<Emp> a2 = new ArrayList<Emp>();
a2.add(new Emp(111,"Satish"));
a2.add(new Emp(222,"Dipke"));
for (Emp e : a2) {
	System.out.println(e.eid+"____"+e.ename);
}
Emp ob = a2.get(1);
System.out.println(ob.eid+"_____"+ob.ename);
}
}
