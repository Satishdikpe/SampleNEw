package Vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test2 {
public static void main(String[] args) {
	Vector al = new Vector();
	al.add((new product(111,"Cup",1000)));
	al.add((new product(112,"Tea Powder",750)));
	al.add((new product(113,"Milk",300)));
	al.add((new product(112,"Suger",70)));
Enumeration<product> e = al.elements();
while(e.hasMoreElements())
{
product  p = e.nextElement();
	System.out.println(p.cost+"------"+p.pid+"------"+p.pname);
	}
System.out.println("----------------------------------");
ListIterator<product> itr = al.listIterator();
while(itr.hasNext())
{
product p = (product)itr.next();
System.out.println(p.cost+"------"+p.pid+"------"+p.pname);
}
System.out.println("----------------------------------");
Iterator<product> i = al.iterator();
while(i.hasNext())
{ product p = (product)i.next();
System.out.println(p.cost+"------"+p.pid+"------"+p.pname);

	}
}
}
