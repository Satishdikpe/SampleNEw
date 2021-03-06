package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Satish");
	al.add("Dipke");
	al.add("Manisha");
	al.add("Alane");
System.out.println("Before working "+al);
//List Iterator with normal version 
ListIterator<String> Ltr = al.listIterator();
while(Ltr.hasNext())
{
	String s = (String)Ltr.next();
	System.out.println(s);
}

//List Iterator with backword direction 
while(Ltr.hasPrevious())
{
	String s = (String)Ltr.previous();
	System.out.println(s);
}
//List Iterator with generic version
ListIterator<String> Ltr1 = al.listIterator();
while(Ltr1.hasNext())
{
	String s = Ltr1.next();
	System.out.println(s);
	}
while(Ltr1.hasPrevious())
{
	String s = Ltr1.previous();
	System.out.println(s);}
}
}
