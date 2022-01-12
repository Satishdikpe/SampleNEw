package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test4 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(10.5);
	a1.add("Dipke");
	a1.add("Satish");
	a1.add(10);
	a1.add(null);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.add(3,"manisha");
	System.out.println(a1);
	a1.remove(2);
	a1.remove("Dipke");
	System.out.println(a1);
	a1.set(2, "Mahabali");
	System.out.println(a1);
	System.out.println(a1.isEmpty());
	a1.clear();
	System.out.println(a1.isEmpty());
}
}
