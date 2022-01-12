package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {
public static void main(String[] args) {
	Vector<String> v = new Vector<String>();
	v.add("Satish");
	v.add("Dipke");
	v.add("Manisha");
	v.add("Alane");
//Enumeration reading : normal version
	Enumeration<String> e = v.elements();
	while(e.hasMoreElements())
	{
	String s =(String)e.nextElement();
	System.out.println(s);
	}
//Enumeration reading : generic 
Enumeration<String> e1 = v.elements();
while(e1.hasMoreElements())
{ String s = e1.nextElement();
System.out.println(s);
	}
}
}
