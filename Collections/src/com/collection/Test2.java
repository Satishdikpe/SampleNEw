package com.collection;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
a1.add(new Emp(111,"satish"));
a1.add(new student(1,"Dipke"));
a1.add("Satish");
a1.add(10);
a1.add(null);
System.out.println(a1.toString());
for (Object aa : a1) {
	if (aa instanceof Emp) {
		Emp e = (Emp)aa;
		System.out.println(e.eid+"----------"+e.ename);
		}
	if (aa instanceof student) {
		student s = (student)aa;
		System.out.println(s.sid+"________"+s.sname);
	}
	if (aa instanceof Integer) {
		System.out.println(aa);
		
	}
	if (aa instanceof String) {
		System.out.println(aa);
		
	}
	if (aa ==null) {
		System.out.println(aa);
	}
}
}
}

