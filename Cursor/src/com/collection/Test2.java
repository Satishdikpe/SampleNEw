package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
al.add("Satish");
al.add("Dipke");
al.add("Manisha");
al.add("Alane");
//normal version read data
Iterator<String> ir = al.iterator();
while(ir.hasNext())
{
	String s =(String)ir.next();
	System.out.println(s);
	}
//Generic Version read data
Iterator<String> itr = al.iterator();
while(itr.hasNext())
{
	String s = itr.next();
	System.out.println(s);}
}
}
