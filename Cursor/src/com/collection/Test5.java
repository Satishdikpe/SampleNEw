package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test5 {
public static void main(String[] args) {
ArrayList<Book> al = new ArrayList<Book>();
al.add(new Book(111,"Book1","Dipke"));
al.add(new Book(112,"Book2","Satish"));
al.add(new Book(113,"Book3","Manisha"));
al.add(new Book(114,"Book4","Alane"));
Iterator<Book>itr=al.iterator();
while(itr.hasNext())
	{
	Book s=itr.next();
	if (s.id==111) 
		itr.remove();
		if (s.auther=="Alane") 
			itr.remove();
		
	}
	for (Book bb : al) {
		System.out.println(bb.id+"-------"+bb.name+"-------"+bb.auther);
	}
	}}

