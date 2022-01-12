package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Test8 {
public static void main(String[] args) {
	// conversion of arrays to collections
String [] s = {"AAA","BBB","CCC","DDD"};
ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
al.add("Satish");
al.add("Dipke");
System.out.println(al);
// conversion of collection to array
ArrayList<String> a2 = new ArrayList<String>();
a2.add("Srujan");
a2.add("Dipke");
String[] s1 = new String[a2.size()];
a2.toArray(s1);
for (String ss : s1) {
	System.out.println(ss);
	ArrayList a3 = new ArrayList();
	a3.add("Sattu");
	a3.add(10);
	Object [] o =  a3.toArray();
	for (Object oo : o) {
		System.out.println(oo);
	}
	}
}
}
