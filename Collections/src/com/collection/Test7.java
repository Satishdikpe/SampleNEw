package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test7 {
public static void main(String[] args) {
	Emp e1 = new Emp(111,"SAtish");
	Emp e2 = new Emp (222,"Dipke");
	Emp e3 = new Emp(333,"Rambhau");
	Emp e4 = new Emp(444,"Hingoli");
	ArrayList<Emp> Ae = new ArrayList<Emp>();
	Ae.add(e1);
	Ae.add(e2);
	ArrayList<Emp> A2 = new ArrayList<Emp>();
	A2.addAll(Ae);
	A2.add(e3);
	A2.add(e4);
	
	A2.removeAll(Ae); // all Ae collection data will be removed 
	A2.retainAll(Ae);// remove all A2 data except Ae collection 
	

	for (Emp ee : A2) {
		System.out.println(ee.eid+"______"+ee.ename);
	}
	/*
	 * System.out.println(A2.contains(e1)); System.out.println(A2.containsAll(Ae));
	 * 
	 * A2.remove(e1);
	 * 
	 * System.out.println(A2.contains(e1)); System.out.println(A2.containsAll(Ae));
	 */
	
}
}
