package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test6 {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
al.add("Satish");
al.add("Dipke");
al.add("Hingoli");
ListIterator<String> ltr = al.listIterator();
ltr.add("Aai Nivas");
while(ltr.hasNext())
{
	String s = ltr.next();
	
if (s.equals("Dipke"))
	ltr.remove();
if(s.equals("Satish"))
ltr.set("SatishKing");
}
System.out.println(al);
}
}