package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test4 {
	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
al.add("Satish");
al.add("Dipke");
al.add("Manisha");
al.add("Alane");
System.out.println("Before working"+al);
ListIterator<String> ltr = al.listIterator();
while(ltr.hasNext())
{ String s = (String)ltr.next();
System.out.println(s);	
if (s=="Alane") {
	ltr.remove();

}
System.out.println(al);
}
	}
}

